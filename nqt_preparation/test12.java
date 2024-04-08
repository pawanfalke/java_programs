package pattern_programs;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n,b=0;
        n=ob.nextInt();
        int c=n%10;
        while(n>0){
         b=n%10;
         n=n/10; 
        }
        System.out.println(b);
        System.out.println(c+n);
        ob.close();
    }
}
