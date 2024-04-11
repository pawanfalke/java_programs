package javatpoint;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int max;
        max=arr[0];
        for(int j=0;j<n;j++){
            if(max<arr[j]){
              max=arr[j] ;
            }
        }
        System.out.println("maximum number is "+max);
        ob.close();
    }
}
