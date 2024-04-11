package javatpoint;
import java.util.Scanner;
public class duplicateelement {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("please enter size of an array:");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("your array:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                  System.out.println("duplicate numbers:");
                  System.out.println(arr[i]);
                }
            }
        }
        ob.close();
    }
}
