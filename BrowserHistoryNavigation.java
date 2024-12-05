//Comilang, Tayshaun M.
//CITCS 1N-A

package com.mycompany.browserhistorynavigation;
import java.util.Scanner;

class BrowserHistory {

    //Inner class representing a Node in the doubly linked list.
    static class Node {
        String url; // URL of the webpage
        Node prev;  // Pointer to the previous Node
        Node next;  // Pointer to the next Node

        // Constructor for creating a new Node with a given URL.
        Node(String url) {
            this.url = url;
            this.prev = null;
            this.next = null;
        }
    }

    private Node current; // Tracks the current page in the browser history

    /* Visits a new page by creating a new Node and updating the linked list.
       Clears forward history if any exists. */
    public void visitNewPage(String url) {
        Node newNode = new Node(url);
        if (current != null) {
            current.next = newNode; // Link the new Node to the current Node
            newNode.prev = current; // Link the current Node to the new Node
        }
        current = newNode; // Update the current Node to the new page
        System.out.println("Visited: " + url);
    }

    /* Moves to the previous page in the history, if available.
       Displays an appropriate message if no previous page exists. */
    public void goBack() {
        if (current == null || current.prev == null) {
            System.out.println("No previous page to go back to.");
        } else {
            current = current.prev; // Move to the previous Node
            System.out.println("Went back to: " + current.url);
        }
    }

    /* Moves to the next page in the history, if available.
       Displays an appropriate message if no next page exists.*/
    public void goForward() {
        if (current == null || current.next == null) {
            System.out.println("No next page to go forward to.");
        } else {
            current = current.next; // Move to the next Node
            System.out.println("Went forward to: " + current.url);
        }
    }

    /* Displays the URL of the current page.
       If no pages are in the history, notifies the user. */
    public void displayCurrentPage() {
        if (current == null) {
            System.out.println("No page in the history.");
        } else {
            System.out.println("Current page: " + current.url);
        }
    }

    // Clears all forward history by unlinking the next Nodes from the current Node.
    public void clearForwardHistory() {
        if (current != null) {
            current.next = null; // Clear the next reference to remove forward history
        }
        System.out.println("Forward history cleared.");
    }
}

//Main class to provide a menu-based interface for simulating browser history navigation.
public class BrowserHistoryNavigation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrowserHistory browserHistory = new BrowserHistory();

        // Menu-driven loop for user interaction
        while (true) {
            // Display menu options
            System.out.println("\nBrowser History Navigation:");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Clear Forward History");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Handle user choice
            switch (choice) {
                case 1:
                    System.out.print("Enter URL to visit: ");
                    String url = scanner.nextLine();
                    browserHistory.visitNewPage(url); // Add a new page to the history
                    break;
                case 2:
                    browserHistory.goBack(); // Go to the previous page
                    break;
                case 3:
                    browserHistory.goForward(); // Go to the next page
                    break;
                case 4:
                    browserHistory.displayCurrentPage(); // Display the current page
                    break;
                case 5:
                    browserHistory.clearForwardHistory(); // Clear forward history
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close(); // Close the scanner
                    return; // Exit the program
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
