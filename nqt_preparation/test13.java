package pattern_programs;

import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int i,a,b;
        a=ob.nextInt();
        ob.close();
        for(i=1;i<=10;i++){
           b=a*i;
           System.out.println(a+"*"+i+"="+b);
        }
    }   
}
