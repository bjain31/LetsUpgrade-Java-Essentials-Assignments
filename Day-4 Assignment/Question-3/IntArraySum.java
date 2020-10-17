package com.intarray;
import java.util.Scanner;

public class IntArraySum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 values: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The sum is: "+sum);
    }
}
