package com.employees;
import java .util.Scanner;

public class Employees {

    String name,designation;
    int age,salary;

    Scanner sc = new Scanner(System.in);

    public void getDetails(){

        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Enter Designation : ");
        designation = sc.next();
        System.out.print("Enter Salary : ");
        salary = sc.nextInt();

    }

    public void displayDetails(){

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);

    }
}
