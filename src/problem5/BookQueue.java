package problem5;

import java.util.LinkedList;

public class BookQueue {
    LinkedList<Book> queue = new LinkedList<Book>();
    public void enqueue(Book book) {
        queue.addLast(book);
    }
    public Book dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }
    public Book peek() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.getFirst();
    }
    public void displayQueue() {
        System.out.println("Queue contents (front to back):");
        for (Book book : queue) {
            System.out.println(book);
        }
    }
}
