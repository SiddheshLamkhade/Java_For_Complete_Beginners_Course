package Week2Assigment1.Problem10;

import java.util.Collections;

public class Student implements Comparable<Student> {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Sort by marks
    //  compare to compares two objects
    // it returns 0 , -1, 1
    // it tell which object comes first
    //Comparable
    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks;   // ascending order
    }



    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}
