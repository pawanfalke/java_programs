package javatpoint;

import java.util.Scanner;

public class MatrixAdditionExample {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int n=ob.nextInt();
        System.out.println("enter number of columns");
        int m=ob.nextInt();
        int [][] arr3=new int[n][m];
        int [][] arr1=new int[n][m];
        System.out.println("enter input of array1:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=ob.nextInt();
            }
        }
        int [][] arr2=new int[n][m];
        System.out.println("enter input of array 2:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=ob.nextInt();
            }
        }
        System.out.println("your array 1:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("your array 2:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("addition of arrays is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        ob.close();
    }
}
