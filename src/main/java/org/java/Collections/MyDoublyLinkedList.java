package org.java.Collections;

public class MyDoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    private class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> previous;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node<T> next, Node<T> previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }

    public boolean add(T t) {
        return add(length, t);
    }

    public boolean add(int index, T t) {
        if (index > length || index < 0) {
            System.out.println("Index out of bounds!");
            return false;
        }
        if (index == 0) {
            Node<T> newNode = new Node<>(t, head, null);
            if (newNode.next != null) head.previous = newNode;
            head = newNode;
            if (newNode.next == null) tail = newNode;
            length++;
            return true;
        } else {
            Node<T> prevNode = get(index - 1);
            Node<T> newNode = new Node<>(t, prevNode.next, prevNode);
            prevNode.next = newNode;
            if (newNode.next != null) newNode.next.previous = newNode;
            if (newNode.next == null) tail = newNode;
            length++;
            return true;
        }
    }

    public boolean remove(T t) {

        Node<T> node = head;
        while (node != null) {
            if (node.data.equals(t)) {
                node.previous.next = node.next;
                if (node.next != null) node.next.previous = node.previous;
                if (node.next == null) tail = node.previous;
                length--;
                return true;
            } else node = node.next;
        }
        System.out.println("Element not found! Unable to remove");
        return false;
    }

    public boolean remove(int index) {

        if (index >= length || index < 0) {
            System.out.println("Index out of bounds!");
            return false;
        }
        if (index == 0) {
            head = head.next;
            if (head != null) head.previous = null;
            if (head == null) tail = null;
            length--;
            return true;
        } else {
            Node<T> node = get(index);
            node.previous.next = node.next;
            if (node.next != null) node.next.previous = node.previous;
            if (node.next == null) tail = node.previous;
            length--;
            return true;
        }
    }

    public Node<T> get(int index) {
        if (index >= length || index < 0) {
            System.out.println("Index out of bounds!");
            return null;
        }
        if (index < length / 2) {
            Node<T> node = head;
            for (int i = 0; i < index; i++)
                node = node.next;
            return node;
        } else {
            Node<T> node = tail;
            for (int i = length - 1; i > index; i--)
                node = node.previous;
            return node;
        }
    }

    public boolean set(int index, T t) {
        if (index >= length || index < 0) {
            System.out.println("Index out of bounds!");
            return false;
        }
        get(index).data = t;
        return true;
    }

    public boolean contains(T t) {
        Node<T> node = head;
        while (node != null) {
            if (node.data.equals(t)) return true;
            else node=node.next;
        }
        return false;
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> node = head;
        while (node != null) {
            sb.append(node.data.toString());
            sb.append(", ");
            node = node.next;
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.append("]").toString();
    }
}
