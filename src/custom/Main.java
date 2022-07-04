package custom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.inputDataFromUser();
        list.printList();
        list.reverse();
        list.printList();
    }
}
