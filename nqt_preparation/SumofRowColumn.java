package javatpoint;
import java.util.Scanner;
public class SumofRowColumn {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of row:");
        int row=ob.nextInt();
        System.out.println("enter size of column:");
        int col=ob.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("enter elements of an array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        int rowsum,columnsum;
        for(int i=0;i<row;i++){
            rowsum=0;
            for(int j=0;j<col;j++){
               rowsum=rowsum+arr[i][j];
            }
            System.out.println("sum of"+(i+1)+" row is:"+rowsum);
        }
        for(int i=0;i<row;i++){
            columnsum=0;
            for(int j=0;j<col;j++){
              columnsum+=arr[i][j];
            }
            System.out.println("sum of"+(i+1)+" col is:"+columnsum);
        }
        ob.close();
    }
}
