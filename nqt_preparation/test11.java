package pattern_programs;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int i=0,b;
        while(n>0){
           b=n%10;
           i=i+b;
           n=n/10;
        }
        System.out.println("sum is:"+i);
        ob.close();
    }
}
