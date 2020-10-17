package com.employeedet;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        String name;
        int dob,mob,yob,msal,asal;
        int years,months,days;
        double empage,tamt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name");
        name = sc.nextLine();
        System.out.println("Enter date of birth");
        dob = sc.nextInt();
        System.out.println("Enter month of birth");
        mob = sc.nextInt();
        System.out.println("Enter year of birth");
        yob = sc.nextInt();
        System.out.println("Enter monthly salary");
        msal = sc.nextInt();
        asal = msal*12;
        if(asal>=500000){
            tamt = 0.2*asal;
        }
        else if(asal<500000 && asal>=400000){
            tamt = 0.15*asal;
        }
        else if(asal<400000 && asal>=300000){
            tamt = 0.1*asal;
        }
        else if(asal<300000 && asal>=200000){
            tamt = 0.05*asal;
        }
        else{
            tamt= 0;
        }
        LocalDate bdate = LocalDate.of(yob, mob, dob);
        LocalDate now = LocalDate.now();
        Period p = Period.between(bdate, now);
        years= p.getYears();
        months= p.getMonths();
        days= p.getDays();
        empage = years+(months*0.083)+(days*0.0027);
        int age = (int) empage;
        EmployeeDet e = new EmployeeDet();
        e.display(name,asal,tamt,age);
        System.out.println("The employee is "+years+ "years, "+months+ "months and "+days+ "days old");
    }
}
