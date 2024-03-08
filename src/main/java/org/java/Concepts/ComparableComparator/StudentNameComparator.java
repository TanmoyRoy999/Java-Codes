package org.java.Concepts.ComparableComparator;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    private static StudentNameComparator studentNameComparator;

    public static StudentNameComparator instanceOf() {
        if (studentNameComparator == null)
            studentNameComparator = new StudentNameComparator();

        return studentNameComparator;
    }

    @Override
    public int compare(Student stud1, Student stud2) {
        return stud1.getName().compareTo(stud2.getName());
    }
}
