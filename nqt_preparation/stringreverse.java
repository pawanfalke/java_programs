package javatpoint;

import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string:");
        String str=ob.next();
        char [] arr=str.toCharArray();
        String s2="";
        System.out.println("your string:"+str);
        for (int i = arr.length-1; i>=0; i--) {
            // s2=s2+arr[i];
            s2=s2+str.charAt(i);
        }
        System.out.println("reverse string:"+s2);
        ob.close();
    }
}
