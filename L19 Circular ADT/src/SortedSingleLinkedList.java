import java.util.List;

public class SortedSingleLinkedList<E extends Comparable<E>> implements SortedList23Y<E> {

    private Node<E> head = null;

    /**
     * Add the element to the list.
     * The list is still sorted after the element is added.
     */
    @Override
    public void add(E element) {
        Node<E> newNode = new Node<E>(element);
        if (head == null || head.element.compareTo(newNode.element) > 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null && current.next.element.compareTo(newNode.element) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    /**
     * Remove the first element in the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed.
     */
    @Override
    public boolean removeFirst() {
        if (head == null) {
            return false;
        } else {
            head = head.next;
            return true;
        }
    }
    /**
     * Remove the last element in the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed.
     */

    @Override
    public boolean removeLast() {
       return false;
    }

    @Override
    public boolean remove(E element) {
        if (head == null) {
            return false;
        } else if (element.equals(head.element)) {
            head = head.next;
            return true;
        } else {
            Node<E> current = head;
            while (current.next != null && !element.equals(current.next.element)) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
                return true;
            }
            return false;
        }
    }

    @Override
    public int size() {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // opg 4
    public int sizeUsingRecursion() {
        return recursiveSize(head);
    }

    private int recursiveSize(Node<E> node) {
        if (node == null) {
            return 0;
        }
        return 1 + recursiveSize(node.next);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> node = head;
        while (node != null) {
            sb.append(node.element);
            if (node.next != null) {
                sb.append(", ");
            }
            node = node.next;
        }
        sb.append("]");
        return sb.toString();
    }



    // -------------------------------------------
    private static class Node<T> {
        private final T element;
        private Node<T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
    }
}
