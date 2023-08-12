import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        int a,b,max;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        a=ob.nextInt();
        b=ob.nextInt();
        max=a>b?a:b;
        System.out.println("maximum value is:"+max);
    }
}