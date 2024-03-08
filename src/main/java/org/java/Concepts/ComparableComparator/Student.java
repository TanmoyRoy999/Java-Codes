package org.java.Concepts.ComparableComparator;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {

        /**
         * return value = 0 -> this=student -> no sorting
         * return value > 0 -> this>student -> interchange
         * return value < 0 -> this<student -> no sorting
         */

        return this.id - student.id;  // sort in ascending order of id
//        return student.id - this.id;  // sort in descending order of id
//        return this.name.compareTo(student.name);  // sort in ascending order of name
//        return student.name.compareTo(this.name);  // sort in descending order of name
//        return (this.id + this.age) - (student.id + student.age);  // sort in ascending order of sum of id and age

    }
}
