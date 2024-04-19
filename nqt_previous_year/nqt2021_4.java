package Previous_year_nqt;

import java.util.Scanner;

public class nqt2021_4 {
    public static void main(String[] args) {
        //sorting of array

        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=ob.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=ob.nextInt();
        }
        System.out.println("your array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
       
        ob.close();
    }
}
