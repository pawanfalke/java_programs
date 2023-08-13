import java.util.InputMismatchException;
import java.util.Scanner;

public class excep5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        try {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println("div is:"+c);

        } catch (ArithmeticException|InputMismatchException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("can not divide by zero!!!");
            } else if(e instanceof InputMismatchException) {
                System.out.println("enter numbers only!!!");
            }
        }
        System.out.println("end");
    }
}
