package problem4;

import java.util.*;
// These are the results of the comparison
//==========================================================================
//---- Performance Comparison ----
//        ---- Populate both lists ----
//ArrayList - Random insert/delete: 104,372 ms
//LinkedList - Random insert/delete: 1758,581 ms
//ArrayList - Sequential insert/delete (start/end): 154,709 ms
//LinkedList - Sequential insert/delete (start/end): 2,257 ms
//ArrayList - Random access (get): 16,657 ms
//LinkedList - Random access (get): 8271,087 ms
//=============================================================================
//The experiment shows that ArrayList performs much faster than LinkedList
//for random access and random insertions or deletions,
//while LinkedList only outperforms ArrayList in sequential insertions and deletions
//at the beginning or end. This is because an ArrayList uses a contiguous array,
//allowing direct access (O(1)) and efficient block memory operations, but
//requiring shifting elements (O(n)) when inserting or removing from the middle or
//start. In contrast, a LinkedList is a chain of nodes connected by pointers, making
//insertions and deletions at the ends O(1) but causing random access and middle
//operations to be O(n) since it must traverse nodes sequentially.


public class ListPerformanceComparison {

    private static final int SIZE = 100_000;        // total elements
    private static final int OPERATIONS = 10_000;   // random operations to test

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // 2️⃣ Random insertions and deletions
        testRandomInsertDelete(arrayList, "ArrayList");
        testRandomInsertDelete(linkedList, "LinkedList");

        // 3️⃣ Sequential insertions/deletions at beginning and end
        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");

        // 4️⃣ Random access test
        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");
    }

    // ------------------------------------------------------------

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        for (int i = 0; i < OPERATIONS; i++) {
            int index = random.nextInt(list.size());
            list.add(index, -1);
        }
        for (int i = 0; i < OPERATIONS; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();

        // Insertions at beginning and end & Deletions at beginning and end for ArrayList
        if(name.equals("ArrayList")) {
            for (int i = 0; i < OPERATIONS; i++) {
                list.add(0,-1);
                list.add(-1);
                list.remove(0);
                list.remove(SIZE-1);
            }

        }


        // Insertions at beginning and end & Deletions at beginning and end for LinkedList
        if(name.equals("LinkedList")) {
            for (int i = 0; i < OPERATIONS; i++) {
                list.addFirst(-1);
                list.addLast(-1);
                list.removeFirst();
                list.removeLast();
            }

        }


        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        long sum = 0;
        // sum of the all elements in the list
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(random.nextInt(list.size()));
        }
        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
}

