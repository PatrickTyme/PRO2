package list23ystudent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/** A single-linked nodes based implementation of the List ADT. */
public class SingleLinkedList23Y<E> implements List23Y<E> {
    private Node<E> head = null;
    private int size = 0;

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        if (head == null) {
            head = new Node<>(e);
            size++;
            return;
        }

        Node<E> node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<>(e);
        size++;
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        if (head == null) {
            return false;
        }
        if (head.element.equals(e)) {
            head = head.next;
            size--;
            return true;
        }
        Node<E> node = head;
        while (node.next != null) {
            if (node.next.element.equals(e)) {
                node.next = node.next.next;
                size--;
                return true;
            }
            node = node.next;
        }
        return false;
    }
    //        while (node.next != null && !node.next.element.equals(e)) {
//            node = node.next;
//        }
//        if (node.next != null) {
//            node.next = node.next.next;
//            size--;
//            return true;

    /**
     * Return true, if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        Node<E> node = head;
        while (node != null) {
            if (node.element.equals(e)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Return the size of this list.
     */
    public int size() {
        return size;
    }

    /**
     * Return true, if this list is empty.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.element;
    }

    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */
    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if (index == 0) {
            Node<E> node = new Node<>(e);
            node.next = head;
            head = node;
            size++;
        } else {
            Node<E> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node<E> newNode = new Node<>(e);
            newNode.next = node.next;
            node.next = newNode;
            size++;
        }
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        if (index == 0) {
            E e = head.element;
            head = head.next;
            size--;
            return e;
        } else {
            Node<E> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            E e = node.next.element;
            node.next = node.next.next;
            size--;
            return e;
        }
    }

    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        Node<E> node = head;
        int index = 0;
        while (node != null) {
            if (node.element.equals(e)) {
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }

    /**
     * Return an iterator over this list.
     * Note: While the list is traversed by this iterator,
     * adding or removing an element is not allowed.
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private Node<E> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public E next() {
                if (!this.hasNext()) throw new NoSuchElementException();

                E e = node.element;
                node = node.next;
                return e;
            }
        };
    }

    //-------------------------------------------

    private static class Node<T> {
        private final T element;
        private Node<T> next;

        public Node(T t) {
            this.element = t;
            this.next = null;
        }
    }

    //-------------------------------------------

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
}
