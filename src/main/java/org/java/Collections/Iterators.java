package org.java.Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterators {

    public static void iteratorPractice() {

        /** 2 types of iterator: Iterator and ListIterator
         * Iterator: forward traversal only: hasNext(), next()
         *           supports remove() only
         * ListIterator: both forward and backward traversal: hasNext(), next(), nextIndex(), hasPrevious(), previous(), previousIndex()
         *               supports add(), set() and remove()
         **/

        LinkedList<String> list = new LinkedList<>();
        list.addAll(List.of("Kolkata", "Delhi", "Mumbai", "Bangalore", "Hyderabad", "Chennai"));
        System.out.println("Places are: " + list);

//        itineraryUsingIterator(list);
        listIterator(list);

    }

    public static void itineraryUsingIterator(LinkedList<String> list) {

        String previousPlace = list.getFirst();
        String place;
        java.util.Iterator<String> iterator = list.listIterator(1); // iteration will start from the 2nd item at index 1, to prevent printing "From Kolkata To Kolkata" in first line

        while (iterator.hasNext()) {
            place = iterator.next();
            System.out.println("From " + previousPlace + " to " + place);
            previousPlace = place;
        }
    }

    public static void listIterator(LinkedList<String> list) {

        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String place = iterator.next();
            System.out.println("Place: " + place);
            if (place.equals("Mumbai")) {
//                list.remove(iterator.next());
//                list.add("Vizag");

                /**
                 * above add and remove list methods will give ConcurrentModificationException
                 * bcoz we can't modify list structurally within iterator loop
                 * we can't use list.add() and list.remove()
                 * But we can use list.get() and list.set() since they are not structural modifications.
                 **/

//                list.set(1,"Goa");
//                iterator.remove(); // this will remove "Mumbai" from list
                iterator.add("Vizag"); // this will add "Vizag" after "Mumbai"

            }
        }

        System.out.println("Places are: " + list);

        while (iterator.hasNext()) {
            System.out.println("Place: " + iterator.next());
            // cursor has reached end of list after previous loop, hence hasNext points to null, hence this loop not executed
        }

        while (iterator.hasPrevious()) {
            System.out.println("Index: " + iterator.previousIndex());
            System.out.println("Place: " + iterator.previous());
        }

        ListIterator<String> iterator2 = list.listIterator(3);
        System.out.println("Place at index 2: " + iterator2.previous());

    }

    public static void addNumbersToList() {

        // add numbers to list in ascending order
        LinkedList<Integer> list = new LinkedList<>();
        addToList(list, 5);
        addToList(list, 4);
        addToList(list, 2);
        addToList(list, 8);
        addToList(list, 1);

        System.out.println("List is: "+list);

    }

    public static void addToList(LinkedList<Integer> list, Integer i) {

        if (list.contains(i)) {
            System.out.println("Number already present!");
            return;
        }

        boolean addedFlag = false;

        if (list.isEmpty()) {

            list.add(i);
            addedFlag = true;

        } else {

            for (int j = 0; j < list.size(); j++) {

                if (i < list.get(j)) {
                    list.add(j, i);
                    addedFlag=true;
                    break;
                }
            }

            if (!addedFlag)
                list.add(i);

        }


    }


}
