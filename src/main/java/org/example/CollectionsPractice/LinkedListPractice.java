package org.example.CollectionsPractice;

import java.util.*;

public class LinkedListPractice {

    public static void linkedListPractice() {

//        LinkedList<String> deathNote = new LinkedList<>();
//        addElements(deathNote);
//        removeElements(deathNote);
//        getElements(deathNote);

//        itineraryOrderN2();
        itineraryOrderN();

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

        // list methods
        System.out.println("Retrieved list element: " + list.get(4)); // linked will decide whether to start traversal from head or tail, whichever is closer to the specified index
        System.out.println("First list element: " + list.getFirst()); // retrieves first element
        System.out.println("Last list element: " + list.getLast()); // retrieves last element

        // deque methods
        System.out.println("Retrieved queue element: " + list.element()); // retrieves first element

        // stack methods
        System.out.println("Retrieved stack element: " + list.peek()); // retrieves first element
        System.out.println("First stack element: " + list.peekFirst()); // retrieves first element
        System.out.println("Last stack element: " + list.peekLast()); // retrieves last element

    }

    public static void itineraryOrderN2() {

        LinkedList<String> list = new LinkedList<>();
        list.addAll(List.of("Kolkata", "Delhi", "Mumbai", "Bangalore", "Hyderabad", "Chennai"));
        System.out.println("Places are: " + list);

        for (int i = 1; i < list.size(); i++) {
            System.out.println("From " + list.get(i - 1) + " to " + list.get(i));
        }
        // indexing on linked list is not efficient on time complexity. Check below function for better efficiency.

    }

    public static void itineraryOrderN() {

        LinkedList<String> list = new LinkedList<>();
        list.addAll(List.of("Kolkata", "Delhi", "Mumbai", "Bangalore", "Hyderabad", "Chennai"));
        System.out.println("Places are: " + list);

        String previousPlace = list.getFirst();
        int iterationsDone = 0;

        for (String place : list) {

            if (iterationsDone != 0)
                System.out.println("From " + previousPlace + " to " + place); // to prevent printing "From Kolkata To Kolkata" in first line

            previousPlace = place;
            iterationsDone++;
        }
        // This is O(N) and better than the previous function with O(N2)

    }

}
