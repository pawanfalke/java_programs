package pattern_programs;

import java.util.Scanner;
public class test7 {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        Scanner ob=new Scanner(System.in);
        System.out.println("please enter 3 digit number");
        a=ob.nextInt();
        b=a/10;
        c=a%10;
        d=b/10;
        e=b%10;
        f=c*c*c+d*d*d+e*e*e;
       if(a==f){
        System.out.println("armstrong number");
       }
       else{
        System.out.println("not armstrong number");
       }
        ob.close();
    }
}
