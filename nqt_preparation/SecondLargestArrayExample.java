package javatpoint;

import java.util.Scanner;

public class SecondLargestArrayExample {

    public static int getSecondLargest(int [] arr,int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[n-2];
    }
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.println("please enter size of an array:");
        int n=ob.nextInt();
        int [] arr=new int[n];
        System.out.println("enter numbers:");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        System.out.println("second largest element is:"+getSecondLargest(arr, n));

    }
}
