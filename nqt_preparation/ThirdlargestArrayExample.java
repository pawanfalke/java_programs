package javatpoint;

import java.util.Scanner;

public class ThirdlargestArrayExample {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("please enter size of an array:");
        int n=ob.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
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
        System.out.println("third largest element of an array is:"+arr[n-3]);
        ob.close();
    }
}
