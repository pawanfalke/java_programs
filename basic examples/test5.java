import java.util.*;
public class test5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your number:");
        a=obj.nextInt();
        b=a%10;
        System.out.println(b);
        c=a/10;
        System.out.println();
        a=b+c;
        System.out.println("add is"+a);
        
    }
}
