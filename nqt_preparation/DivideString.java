package javatpoint;

import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String str=new String();
        System.out.println("enter your string:");
        str=ob.next();
        System.out.println("enter n equal parts:");
        int n=ob.nextInt();
        int len=str.length();
        int numberofchar=len/n;
        String [] equalstr=new String[n];
        int temp=0;
        
        if(len%n!=0){
           System.out.println("string can not be divided into"+n+"equal parts");
        }
        else{
            for (int i = 0; i < len; i=i+numberofchar) {
                String part=str.substring(i,i+numberofchar);
                equalstr[temp]=part;
                temp++;
            }
        }
        for (int i = 0; i < equalstr.length; i++) {
            System.out.println(equalstr[i]);
        }
     
        ob.close();
    }
}
