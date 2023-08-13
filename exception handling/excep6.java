import java.util.Scanner;

public class excep6 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        try {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
            System.out.println("div is:"+c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        System.out.println("end");
    }
}
