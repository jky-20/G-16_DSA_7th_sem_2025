package Lec_39_August_27_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class student implements Comparable<student>{
    String name;
    int roll;
    int marks;

    public student(String name, int roll, int marks) {
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }
    public int compareTo(student other){
        // increasing order
        // return Integer.compare(this.marks, other.marks);

        // decreasing order
        return Integer.compare(other.marks, this.marks);
    }
}

public class functional_Interfaces {
    public static void main(String[] args) {
        
        student s1 = new student("Ayush Garg", 1423, 34);
        student s2 = new student("Gursewak", 1600, 12);
        student s3 = new student("Jai", 1234, 80);

        List<student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list);
    }
}
