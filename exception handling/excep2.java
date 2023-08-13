import java.util.Scanner;

public class excep2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            c=a/b;
            System.out.println("division is:"+c);
        } catch (ArithmeticException e) {
            System.out.println("can not divide by zero!!!");
        }
        System.out.println("end");

    }
}
