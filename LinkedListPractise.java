import java.util.Scanner;

public class LinkedListPractise {
    static Node head;
    public static void main(String[] args) {
        LinkedListPractise list = new LinkedListPractise();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the linked list:");
            int n = scanner.nextInt();

            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                int element = scanner.nextInt();
                list.createDoublyLL(element);
            }

            System.out.println("The linked list is: ");
            display();
        }
    }

    public void createDoublyLL (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            temp.next.prev = temp;

        }
    }

    public static void display () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Done");
    }
}
