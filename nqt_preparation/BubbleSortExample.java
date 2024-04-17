package alogorithm;

import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=ob.nextInt();
        System.out.println("enter your array");
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=ob.nextInt();
        }
        System.out.println("your array:");
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("after sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
         }
        ob.close();
    }
}
