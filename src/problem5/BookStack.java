package problem5;

import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack() {

    }

    public void push(Book book) {
        if (stack == null) {
            stack = new LinkedList<>();
        }
        stack.add(book);
    }

    public Book pop() {
        if (isEmpty()) {
            return null;
        }
        return stack.removeLast();
    }

    public Book peek() {
        if (isEmpty()) {
            return null;
        }
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        for(int index = stack.size()-1; index >= 0; index--) {
            System.out.println(stack.get(index));
        }

    }
}

