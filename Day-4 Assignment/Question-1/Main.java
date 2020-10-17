package com.avengers;

public class Main {

    public static void main(String[] args) {

        Avenger[] avenger=new Avenger[5];
        for(int i=0;i<5;i++)
        {
            avenger[i]=new Avenger();
            avenger[i].getDetails();
            System.out.println("Data at index "+i);
            avenger[i].displayDetails();
        }

    }
}

