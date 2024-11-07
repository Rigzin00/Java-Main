import java.util.Scanner;

class DoublyLinkedList {
    // Node class for doubly linked list
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head = null;  // Head node of the doubly linked list

    // Method to add a node to the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println("Element " + data + " inserted.");
    }

    // Method to delete a node with a given value
    public void delete(int data) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        Node temp = head;
        
        // If the head node itself holds the data to be deleted
        if (temp != null && temp.data == data) {
            head = temp.next; // Change head
            if (head != null) {
                head.prev = null;
            }
            System.out.println("Element " + data + " deleted.");
            return;
        }

        // Search for the node to be deleted
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        // If the data was not found
        if (temp == null) {
            System.out.println("Element " + data + " not found in the list.");
            return;
        }

        // Unlink the node from the list
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        System.out.println("Element " + data + " deleted.");
    }

    // Method to display the contents of the list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, element;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    element = scanner.nextInt();
                    list.insert(element);
                    break;

                case 2:
                    System.out.print("Enter element to delete: ");
                    element = scanner.nextInt();
                    list.delete(element);
                    break;

                case 3:
                    list.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
