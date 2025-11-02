package problem3;

import java.util.Hashtable;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the capacity of the library: ");
        int capacity = scan.nextInt();

        Library library = new Library(capacity);

        Book book1 = new Book("Clean Code", "Robert C. Martin", 349);
        Magazine magazine1 = new Magazine("The Daily News", "September", 2015);

        library.add(book1);
        library.add(magazine1);

        boolean stop = false;
        do {
            System.out.println(
                    "Choose one option:\n " +
                    "0- add a Document\n " +
                    "1- Display All Documents\n " +
                    "2- Delete a Document by title\n " +
                    "3- Find Document by numRec\n " +
                    "4- Display Authors of Books\n " +
                    "5- Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 0:
                    {
                       System.out.println("Enter the type (book - dict - magazine - novel - textbook): ");
                       String type = scan.next().toLowerCase();
                       scan.nextLine();
                       boolean added = false;
                       if (type.equals("book")) {
                           System.out.println("Enter the title: ");
                           String title = scan.nextLine();
                           System.out.println("Enter the author: ");
                           String author = scan.nextLine();
                           System.out.println("Enter the nbrPages: ");
                           int nbrPages = scan.nextInt();
                           added = library.add(new Book(title, author, nbrPages));
                       }else if (type.equals("magazine")) {
                           System.out.println("Enter the title: ");
                           String title = scan.nextLine();
                           System.out.println("Enter the month: ");
                           String month = scan.next();
                           System.out.println("Enter the year: ");
                           int year = scan.nextInt();
                           added = library.add(new Magazine(title, month, year));
                       }else if (type.equals("dict")) {
                           System.out.println("Enter the title: ");
                           String title = scan.nextLine();
                           System.out.println("Enter the language: ");
                           String language = scan.next();
                           added = library.add(new Dictionary(title, language));
                       }else if (type.equals("novel")) {
                           System.out.println("Enter the title: ");
                           String title = scan.nextLine();
                           System.out.println("Enter the author: ");
                           String author = scan.nextLine();
                           System.out.println("Enter the nbrPages: ");
                           int nbrPages = scan.nextInt();
                           System.out.println("Enter the price: ");
                           double price = scan.nextDouble();
                           added = library.add(new Novel(title, author, nbrPages, price));
                       }else{
                           System.out.println("Enter the title: ");
                           String title = scan.nextLine();
                           System.out.println("Enter the author: ");
                           String author = scan.nextLine();
                           System.out.println("Enter the nbrPages: ");
                           int nbrPages = scan.nextInt();
                           System.out.println("Enter the level: ");
                           String level = scan.next();
                           added = library.add(new Textbook(title, author, nbrPages, level));
                       }
                       if(added) {
                           System.out.println("Document added successfully!");
                       }else{
                           System.out.println("Document not added! Capacity exceeded!");
                       }
                       break;
                    }
                case 1:
                    {
                        System.out.println("All Documents:");
                        library.displayDocuments();
                        break;
                    }
                case 2:
                    {
                        System.out.println("Enter the title of the document you want to delete:");
                        String title = scan.nextLine();
                        boolean deleted = library.delete(new Document(title));
                        if (deleted) {
                            System.out.println("The document was successfully deleted!");
                        } else {
                            System.out.println("The document was not deleted!");
                        }
                        break;
                    }
                case 3:
                    {
                        System.out.println("Enter the numRec of the document you want to find:");
                        int numRec = scan.nextInt();
                        scan.nextLine();
                        Document doc = library.document(numRec);
                        System.out.println(doc);
                        break;
                    }
                case 4:
                    {
                        System.out.println("Authors :");
                        library.displayAuthors();
                        break;
                    }
                case 5:
                    {
                        stop = true;
                    }
            }

        } while (!stop);
    }
}
