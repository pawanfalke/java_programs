package javatpoint;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter your string:");
        String s1=ob.next();
        String s2="";
        char [] arr=s1.toCharArray();
        for (int i = arr.length-1; i >=0; i--) {
            s2=s2+arr[i];
        }
        System.out.println("string s2 "+s2);
        if(s1.equals(s2)){
            System.out.println("string is a palindrome");
        }
        else{
            System.out.println("string is not a palindrome");
        }
        ob.close();
    }
}
