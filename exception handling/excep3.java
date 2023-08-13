import java.util.InputMismatchException;
import java.util.Scanner;

public class excep3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        try {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println("div is"+c);
        } catch (ArithmeticException e) {
            System.out.println("can not divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("enter numbers only");

        }System.out.println("end");
    }
}
