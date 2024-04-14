package javatpoint;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int [][] arr=new int[3][3];
        System.out.println("enter values:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        int evencount=0,oddcount=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(arr[i][j]%2==0){
                  evencount++;
               }
               else{
                oddcount++;
               }
            }
        }
        System.out.println("total number of even numbers:"+evencount);
        System.out.println("total number of even numbers:"+oddcount);

        ob.close();
    }
}
