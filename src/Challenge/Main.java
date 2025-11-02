package Challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> groceryList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Grocery List App!");
        boolean quit = false;

        while (!quit) {
            printMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    addItems();
                    break;
                case 2:
                    removeItems();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nAvailable actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited)");
        System.out.println("2 - to remove item(s) (comma delimited)");
    }

    private static void addItems() {
        System.out.print("Enter items to add (comma delimited): ");
        String[] items = scanner.nextLine().split(",");

        for (String item : items) {
            String trimmedItem = item.trim().toLowerCase();
            if (!trimmedItem.isEmpty()) {
                if (groceryList.contains(trimmedItem)) {
                    System.out.println(trimmedItem + " is already in the list.");
                } else {
                    groceryList.add(trimmedItem);
                    System.out.println(trimmedItem + " added.");
                }
            }
        }
        printSortedList();
    }

    private static void removeItems() {
        System.out.print("Enter items to remove (comma delimited): ");
        String[] items = scanner.nextLine().split(",");

        for (String item : items) {
            String trimmedItem = item.trim().toLowerCase();
            if (groceryList.remove(trimmedItem)) {
                System.out.println(trimmedItem + " removed.");
            } else {
                System.out.println(trimmedItem + " not found in the list.");
            }
        }
        printSortedList();
    }

    private static void printSortedList() {
        Collections.sort(groceryList);
        System.out.println("\nCurrent Grocery List:");
        for (String item : groceryList) {
            System.out.println(" - " + item);
        }
    }
}
