package org.java.Concepts.ComparableComparator;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    private static StudentAgeComparator studentAgeComparator;

    public static StudentAgeComparator instanceOf() {
        if (studentAgeComparator == null)
            studentAgeComparator = new StudentAgeComparator();

        return studentAgeComparator;
    }

    @Override
    public int compare(Student stud1, Student stud2) {
        return stud1.getAge() - stud2.getAge();  // ascending order of age
//        return stud2.getAge() - stud1.getAge();  // descending order of age
    }
}
