package pattern_programs;
import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {
        //swapping 2 numbers from user
        //with three variables
        int a,b;
        Scanner ob=new Scanner(System.in);
        a=ob.nextInt();
        b=ob.nextInt();
        ob.close();
        // c=a;
        // a=b;
        // b=c;
        System.out.println(a+" "+b);

        //without 3rd variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);


    }
}
