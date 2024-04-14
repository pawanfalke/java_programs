package javatpoint;

import java.util.Scanner;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter row size:");
        int row=ob.nextInt();
        System.out.println("enter col size:");
        int col=ob.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("enter array elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        System.out.println("your array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("upper triangular matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i>j){
                    System.out.print("0 ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
        ob.close();
    }
}
