package javatpoint;
import java.util.Scanner;
public class rotateright {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("your array:");
        for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
        }
        int last=arr[n-1];
        for(int j=n-1;j>0;j--){
           arr[j]=arr[j-1];
        }
        arr[0]=last;
        System.out.println("rotated array to right");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
          }
        ob.close();
    }
}
