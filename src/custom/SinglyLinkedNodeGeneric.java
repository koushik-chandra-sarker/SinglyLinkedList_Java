package custom;

public class SinglyLinkedNodeGeneric<T> {
    T data;
    SinglyLinkedNodeGeneric<T> next;

    public SinglyLinkedNodeGeneric(T data) {
        this.data = data;
        this.next = null;
    }


}
