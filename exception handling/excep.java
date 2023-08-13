import java.util.Scanner;

public class excep {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
        System.out.println("division is:"+c);
    }
}
