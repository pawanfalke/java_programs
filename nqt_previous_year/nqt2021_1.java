package Previous_year_nqt;

import java.util.Scanner;

public class nqt2021_1 {
    public static void main(String[] args) {
        // 12th september-2021-slot
        // que=find the minimum sum of all elements of array no two elements are same,if they
        // are same then increment the value by 1

        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=ob.nextInt();
        int[]arr=new int[n];
        System.out.println("enter values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=ob.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i]++;
                }

            }
            sum=sum+arr[i];
            
        }
        System.out.println("sum is"+sum);
        ob.close();
    }
}
