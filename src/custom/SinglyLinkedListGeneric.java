package custom;

public class SinglyLinkedListGeneric<T> {
    private SinglyLinkedNodeGeneric<T> head = null;
    private SinglyLinkedNodeGeneric<T> tail = null;

    public SinglyLinkedListGeneric() {
    }

    public void add(T data) {
        SinglyLinkedNodeGeneric<T> node = new SinglyLinkedNodeGeneric<T>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    public void addAll(T[] data) {
        for (T d : data) {
            add(d);
        }
    }
    public void reverse() {
        System.out.println("Reversing the list...");
        SinglyLinkedNodeGeneric<T> current = head;
        SinglyLinkedNodeGeneric<T> previous = null;
        SinglyLinkedNodeGeneric<T> next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public void printList() {
        SinglyLinkedNodeGeneric<T> node = head;
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
