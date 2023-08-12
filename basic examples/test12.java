import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        int a,b,max,c;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter 3 numbers:");
        a=ob.nextInt();
        b=ob.nextInt();
        c=ob.nextInt();
        max=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("maximum value is:"+max);
    }
}
    
