package javatpoint;

import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s1=new String();
        String s2=new String();
        System.out.println("enter string s1:");
        s1=ob.next();
        System.out.println("enter string s2:");
        s2=ob.next();
        System.out.println("your Strings:"+s1+" "+s2);
        s1=s1.concat(s2);
        s2=s1.substring(0,(s1.length()-s2.length()));
        s1=s1.substring(s2.length());
        System.out.println("strings after swapping:"+s1+" "+s2);
        ob.close();
    }
}
