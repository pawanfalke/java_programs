package javatpoint;

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of row:");
        int row=ob.nextInt();
        System.out.println("enter size of column:");
        int col=ob.nextInt();
        int [][]arr=new int[row][col];
        System.out.println("enter the values of matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        boolean flag=true;
        if(row!=col){
            System.out.println("matrix should be square matrix");
            flag=false;
        }
        else{
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(i==j && arr[i][j]!=1){
                        flag=false;
                    }
                    else if(i!=j && arr[i][j]!=0){
                        flag=false;
                    }
                }
            }
        }

        if(flag){
            System.out.println("matrix is a identity matrix");
        }
        else{
            System.out.println("matrix is not a identity matrix");
        }
        ob.close();
    }
}
