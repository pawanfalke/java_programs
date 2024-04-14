package javatpoint;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s1=new String();
        System.out.println("enter string:");
        s1=ob.nextLine();
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("number of characters present is:"+count);
        ob.close();
    }
}
