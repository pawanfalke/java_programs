import java.util.Scanner;

public class excep7 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        try {
            a=sc.nextInt();
            b=sc.nextInt();
            if(b==0){
                ArithmeticException ex;
                ex=new ArithmeticException();
                throw ex;
            }
            c=a/b;
            System.out.println("div is"+c);
        } catch (ArithmeticException e) {
            System.out.println("can not divide by 0");
        }
        System.out.println("end");
    }
}
