package javatpoint;

import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of an array:");
        int n=ob.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("original array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        System.out.println();
        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        ob.close();
    }
}
