package MyLinkedList;

import java.util.Arrays;

public class MyLinkedList<T> {
    private Node head;
    private int size;

    public MyLinkedList() {

    }

    public MyLinkedList(MyLinkedList<? extends T> list) throws IllegalAccessException {
        this();
        addAll(list);
    }

    public void add(T value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node node = head;

            while (node.getNext() != null) {
                node = node.getNext();
            }

            node.setNext(new Node(value));
        }

        size++;
    }

    public T get(int index) throws IllegalAccessException {
        int currentIndex = 0;
        Node node = head;

        while (node != null) {
            if (currentIndex == index) {
                return (T) node.getValue();
            } else {
                node = node.getNext();
                currentIndex++;
            }
        }

        throw new IllegalAccessException();
    }

    public void remove(int index) {
        int currentIndex = 0;
        Node node = head;

        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        while (node != null) {
            if (currentIndex == index - 1) {
                node.setNext(node.getNext().getNext());
                size--;
                return;
            } else {
                node = node.getNext();
                currentIndex++;
            }
        }
    }

    public int size() {
        return size;
    }

    public void addAll(MyLinkedList<?> list) throws IllegalAccessException {

        Node node = null;
        int index = 0;

        if (head == null) {
            head = new Node(list.get(0));
            node = head;
            index++;
            size++;
        } else {
            node = head;
        }
        while (list.size != index) {
            while (node.getNext() != null) {
                node = node.getNext();
            }

            node.setNext(new Node(list.get(index)));
            index++;
            size++;
        }
    }

    public String toString() {
        Object[] result = new Object[size];

        int index = 0;
        Node node = head;

        while (node != null) {
            result[index] = node.getValue();
            node = node.getNext();
            index++;
        }

        return Arrays.toString(result);
    }

    private static class Node<T> {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
