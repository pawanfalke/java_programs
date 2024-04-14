package javatpoint;
import java.util.Scanner;
public class Sparsematrix {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of row:");
        int row=ob.nextInt();
        System.out.println("enter size of column:");
        int col=ob.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("enter values:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=ob.nextInt();
            }
        }
        int zerocount=0,numcount=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]==0){
                    zerocount++;
                }
                else{
                    numcount++;
                }
            }
        }
        if(zerocount>numcount){
            System.out.println("it is a sparse matrix");
        }
        else{
            System.out.println("it is not a sparse matrix");
        }
        ob.close();
    }
}
