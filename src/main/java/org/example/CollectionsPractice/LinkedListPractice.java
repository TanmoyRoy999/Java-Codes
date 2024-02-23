package org.example.CollectionsPractice;

import java.util.*;

public class LinkedListPractice {

    public static void linkedListPractice() {

        LinkedList<String> deathNote = new LinkedList<>();
        addElements(deathNote);
        removeElements(deathNote);
        getElements(deathNote);

    }

    public static void addElements(LinkedList<String> list) {

        // list methods
        list.add("Light");
        list.add(0, "Kira");
        list.addFirst("L");
        list.addLast("Misa");
        System.out.println(list);

        // deque methods
        list.offer("Ryuk");  // add at last
        list.offerFirst("Rem"); // add at first
        list.offerLast("Watari"); // add at last
        System.out.println(list);

        // stack methods
        list.push("Shinigami"); // add at first
        System.out.println(list);

    }

    public static void removeElements(LinkedList<String> list) {

        // list methods
        list.remove("Kira");
        list.remove(1);
        String s1 = list.remove(); // first element is removed
        System.out.println(s1 + " is removed");
        System.out.println(list);
        String s2 = list.removeFirst();
        System.out.println(s2 + " is removed");
        String s3 = list.removeLast();
        System.out.println(s3 + " is removed");
        System.out.println(list);

        // deque methods
        String s4 = list.poll(); // first element is removed
        System.out.println(s4 + " is removed");
        String s5 = list.pollFirst(); // first element is removed
        System.out.println(s5 + " is removed");
        String s6 = list.pollLast(); // last element is removed
        System.out.println(s6 + " is removed");
        System.out.println(list);

        // stack methods
        list.push("Light");
        list.push("L");
        list.push("Misa");
        list.push("Ryuk");
        list.push("Rem");
        list.push("Shinigami");
        System.out.println(list);

        list.pop(); // first element is removed
        System.out.println(list);

    }

    public static void getElements(LinkedList<String> list) {

        list.get(4); // linked will decide whether to traverse from head or tail, and choose the shortest distance to the indexx

    }

}
