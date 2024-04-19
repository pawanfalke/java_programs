package Previous_year_nqt;

import java.util.Scanner;

public class nqt2021_6 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=ob.nextInt();
        int count=0;
        int arr[]=new int[n];
        System.out.println("enter value 0 and 1 only:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=ob.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){

            for (int j = i+1; j < arr.length; j++) {
                 if(arr[j]==1){
                    count++;
                 }
                }
              
            }
        }
        System.out.println("output"+count);
        ob.close();
    }
}
