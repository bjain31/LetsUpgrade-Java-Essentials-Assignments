package com.employees;

public class Main {

    public static void main(String[] args) {

        Doctor[] d=new Doctor[3];
        for(int i=0;i<3;i++)
        {
            d[i]=new Doctor();
            d[i].getDetails();
            System.out.println("Data at index "+i);
            d[i].displayDetails();
            d[i].display();
        }

        Engineer[] e=new Engineer[3];
        for(int i=0;i<3;i++)
        {
            e[i]=new Engineer();
            e[i].getDetails();
            System.out.println("Data at index "+i);
            e[i].displayDetails();
            e[i].display();
        }

        Pilot[] p=new Pilot[3];
        for(int i=0;i<3;i++)
        {
            p[i]=new Pilot();
            p[i].getDetails();
            System.out.println("Data at index "+i);
            p[i].displayDetails();
            p[i].display();
        }

    }
}
