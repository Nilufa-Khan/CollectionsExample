package data.example;

import java.util.Scanner;

public class Student {

    private String name;
    private int roll;
    private double marks;

    public Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    public String toString(){
        return "name = " + name + " , roll = " + roll + " , marks = " + marks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        //declaring array objects
        Student[] std = new Student[size];
        // initializing array
        for (int i = 0; i < std.length ; i++) {
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter roll");
            int roll = sc.nextInt();
            System.out.println("Enter marks");
            double marks = sc.nextDouble();

            std[i] = new Student(name,roll,marks);
        }
        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i]);
        }
    }

}
