package org.java.Collections;

public class MySinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private class Node<T> {
        private T data;
        private Node<T> next;
//        Node<T> previous;

        private Node(T data) {
            this.data = data;
        }

        private Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
//            this.previous = previous;
        }
    }

    public boolean add(T t) {
        return add(length, t);
    }

    public boolean add(int index, T t) {

        if (index > this.length || index < 0) {
            System.out.println("Index is out of bounds!");
            return false;

        } else if (index == 0) {
            Node<T> newNode = new Node<>(t, head);
            head = newNode;
            if (newNode.next == null)
                tail = newNode;
            length++;
            return true;

        } else {
            Node<T> nodeAtPreviousIndex = get(index - 1);
            Node<T> newNode = new Node<>(t, nodeAtPreviousIndex.next);
            nodeAtPreviousIndex.next = newNode;
            if (newNode.next == null)
                tail = newNode;
            length++;
            return true;
        }
    }

    public boolean remove(T t) {

        if (isEmpty()) {
            System.out.println("List is empty, element not found for removal!");
            return false;
        }
        if (head.data.equals(t)) {
            head = head.next;
            if (head == null) tail = null;
            length--;
            return true;
        } else {
            Node<T> prevNode = head;
            Node<T> node = head.next;
            while (node != null) {
                if (node.data.equals(t)) {
                    prevNode.next = node.next;
                    if (node.next == null) tail = prevNode;
                    length--;
                    return true;
                } else {
                    prevNode = node;
                    node = node.next;
                }
            }
            System.out.println("Element not found!");
            return false;
        }
    }

    public boolean remove(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Index out of bounds!");
            return false;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
            length--;
            return true;
        } else {
            Node<T> prevNode = head;
            Node<T> node = head.next;
            for (int i=1;i<index;i++){
                prevNode=node;
                node=node.next;
            }
            prevNode.next=node.next;
            if (node.next==null) tail=prevNode;
            length--;
            return true;
        }
    }

    public Node<T> get(int index) {
        if (index >= this.length || index < 0) {
            System.out.println("Index is out of bounds!");
            return null;
        } else {
            Node<T> node = head;
            for (int i = 0; i < index; i++)
                node = node.next;
            return node;
        }
    }

    public boolean set(int index, T t) {
        if (index < 0 || index >= length) {
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
            else node = node.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return this.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> temp = head;
        while (temp != null) {
            sb.append(temp.data.toString());
            sb.append(", ");
            temp = temp.next;
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }
}
