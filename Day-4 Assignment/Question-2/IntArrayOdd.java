package com.intarray;

public class IntArrayOdd {

    public static void main(String[] args) {
         int[] arr = new int[]{1,2,3,4,5};
        System.out.println("The odd numbers are: ");
         for(int i=0;i<5;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
