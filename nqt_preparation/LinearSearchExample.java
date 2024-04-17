package alogorithm;

import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
       Scanner ob=new Scanner(System.in);
       System.out.println("enter element to search:");
       int n=ob.nextInt();
       for (int i = 0; i < arr.length; i++) {
          if(arr[i]==n){
            System.out.println("index of element"+i);
          }
       }
       ob.close();
    }
}
