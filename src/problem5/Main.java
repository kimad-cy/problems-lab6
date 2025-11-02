package problem5;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 2008);
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("The Hobbit", "J.R.R Tolkien", 1937);

        BookStack bookStack = new BookStack();
        BookQueue bookQueue = new BookQueue();

        bookStack.push(book3);
        bookStack.push(book2);
        bookStack.push(book1);

        bookQueue.enqueue(book3);
        bookQueue.enqueue(book2);
        bookQueue.enqueue(book1);

        System.out.println("====Stack Test====");
        bookStack.display();
        System.out.println("Popped: " + bookStack.pop());
        System.out.println("Top: " + bookStack.peek());
        bookStack.display();

        System.out.println("====Queue Test====");
        bookQueue.displayQueue();
        System.out.println("Dequeued: " + bookQueue.dequeue());
        System.out.println("Front: " + bookQueue.peek());
        bookQueue.displayQueue();


    }
}
