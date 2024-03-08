package org.java.Concepts.ComparableComparator;

import java.util.ArrayList;
import java.util.List;

public class ComparableComparator {

    public static void ComparableComparator() {

        List<Student> students = new ArrayList<>();
        students.add(new Student(4, "Tanmoy", 27));
        students.add(new Student(8, "Subrata", 26));
        students.add(new Student(2, "Annesya", 23));
        students.add(new Student(1, "Raviraj", 30));
        System.out.println("Unsorted list: " + students);

//        Collections.sort(students);
//        Collections.sort(students,Comparator.reverseOrder());
//        students.sort(Comparator.naturalOrder());
//        students.sort(Comparator.reverseOrder());
//        System.out.println("Sorted list using comparable: "+students);

//        Collections.sort(students, StudentAgeComparator.instanceOf());
//        Collections.sort(students, StudentAgeComparator.instanceOf().reversed()); // reverse of current comparator logic
//        students.sort(StudentAgeComparator.instanceOf());
        students.sort(StudentAgeComparator.instanceOf().reversed());
//        Collections.sort(students, StudentNameComparator.instanceOf());
        System.out.println("Sorted list using comparator: " + students);

    }

}
