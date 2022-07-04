package custom;

import java.util.List;
import java.util.Scanner;

public class SinglyLinkedList {
    SinglyLinkedNode head = null;
    SinglyLinkedNode tail = null;

    public void inputDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = scanner.nextInt();
        Integer[] data = new Integer[n];
        System.out.println("N.B: You can enter only numbers.");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the data for node " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }
        addAll(data);
    }
    public void add(Integer data) {
        SinglyLinkedNode node = new SinglyLinkedNode(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    public void addAll(Integer[] data) {
        for (Integer d : data) {
            add(d);
        }
    }
    public void reverse() {
        System.out.println("Reversing the list...");
        SinglyLinkedNode current = head;
        SinglyLinkedNode previous = null;
        SinglyLinkedNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public void printList() {
        SinglyLinkedNode node = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

}
