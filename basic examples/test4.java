import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your 3 digit number:");
        a=obj.nextInt();
        b=a/100;
        c=a%100;
        d=c/10;
        e=c%10;
        f=b+d+e;
        System.out.println("addition is:"+f);
        
    }
}

    

