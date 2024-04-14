package javatpoint;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter row and column size:");
        int n=ob.nextInt();
        int m=ob.nextInt();
        int arr[][]=new int[n][m];
        int t[][]=new int[m][n];
        System.out.println("enter the values of matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        System.out.println("your matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               t[j][i]=arr[i][j];
            }
        }
        System.out.println("transpose of matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        ob.close();
    }
}
