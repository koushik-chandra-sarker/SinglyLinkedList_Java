package custom;

import java.util.Scanner;

public class MainGeneric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = scanner.nextInt();
        String[] data = new String[n];
        System.out.println("N.B: You can enter only numbers.");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the data for node " + (i + 1) + ": ");
            data[i] = scanner.next();
        }
        SinglyLinkedListGeneric<String> list = new SinglyLinkedListGeneric<>();
        list.addAll(data);
        list.printList();
        list.reverse();
        list.printList();
    }
}
