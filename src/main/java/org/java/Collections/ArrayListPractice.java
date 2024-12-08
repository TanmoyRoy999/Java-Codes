package org.java.Collections;

import org.java.POJOs.Person;

import java.util.*;

public class ArrayListPractice {

    public static void arrayListPractice() {

//        List<String> strList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(new String[]{"Ryuk", "Rem"}));

        // add
        strList.add("Tanmoy");
        strList.add("Roy");
        strList.add(1, "Sayantan");
        System.out.println("strList 1: " + strList);

        // replace
        strList.set(1, "Tarun");
        System.out.println("strList 2: " + strList);

        // delete
        strList.remove(1);
        System.out.println("strList 3: " + strList);

        // immutable list using List.of()
//        List<String> immutableList=List.of(new String[]{"Subrata", "Zeeshan"});   // List.of() creates immutable list
        List<String> immutableList = Arrays.asList(new String[]{"Subrata", "Zeeshan"});  // Arrays.asList() creates list backed by the original array
//        immutableList.add("Kakali");    // throws exception
        System.out.println("immutableList: " + immutableList);

        // add multiple elements to list
        strList.addAll(immutableList);
        System.out.println("strList 4: " + strList);

        // mutable list
        List<String> mutableList = new ArrayList<>(List.of(new String[]{"Rohan", "Light"}));  // this is mutable
        mutableList.add("L");
        mutableList.set(1, "Kira");
        System.out.println("mutableList: " + mutableList);

        // get
        System.out.println("Element at index 2: " + strList.get(2));

        // indexOf()
        strList.add("Roy"); // adding duplicate element
        strList.add("Roy"); // adding duplicate element
        System.out.println("strList 5: " + strList);
        System.out.println("First index of Roy: " + strList.indexOf("Roy"));
        System.out.println("Last index of Roy: " + strList.lastIndexOf("Roy"));

        if (strList.contains("Roy"))
            System.out.println("strList contains Roy");

        // remove all occurrences of an element in list
        strList.remove("Roy");  // this will only remove the first occurence
        strList.removeAll(List.of("Roy"));
        System.out.println("strList 6: " + strList);

        // remove all except specified few elements
        strList.retainAll(Arrays.asList(new String[]{"Tanmoy", "Subrata"}));
        System.out.println("strList 7: " + strList);

        // clear all elements
        strList.clear();
        System.out.println("strList is empty: " + strList.isEmpty());

        // sort
        strList = new ArrayList<>(List.of(new String[]{"Light", "Kira", "Misa"}));
        System.out.println("strList 8: " + strList);
        strList.sort(Comparator.naturalOrder());
        System.out.println("strList 9: " + strList);
        strList.sort(Comparator.reverseOrder());
        System.out.println("strList 10: " + strList);

        // list to array
        String[] strArray = strList.toArray(new String[strList.size()]);
        System.out.println(Arrays.toString(strArray));

        // iterator
        Iterator<String> iterator = strList.iterator();
        System.out.println("Through iterator:");
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    public static void arrayListPractice2() {

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("Tanmoy", "27"));
        list1.add(new Person("Taniya", "32"));
        list1.add(new Person("Sayantan", "32"));
        list1.add(new Person("Subrata", "26"));
        System.out.println("list1: " + list1);

//        ArrayList<Person> list2= (ArrayList<Person>) list1.clone();  // shallow clone

        // deep clone
        ArrayList<Person> list2 = new ArrayList<>(list1.size());

        for (Person person : list1) {
            list2.add(person.clone());
        }

        System.out.println("list2: " + list2);

        list2.get(1).setName("Annesya");
        System.out.println("modified list1: " + list1);
        System.out.println("modified list2: " + list2);

    }

    public static void arrayListSort() {


    }

}
