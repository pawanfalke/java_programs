package javatpoint;

import java.util.Scanner;

public class subset {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s1=new String();
        System.out.println("enter your string:");
        s1=ob.next();
        int len=s1.length();
        int x=len*(len+1)/2;
        int temp=0;
        String [] arr=new String[x];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                arr[temp]=s1.substring(i, j+1);
                temp++;
            }
        }
        for (int i = 0; i < x; i++) {
           System.out.println(arr[i]);
        }

        ob.close();
    }
}
