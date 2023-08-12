import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        float a,r;
        System.out.println("enter radius of circle:");
        r=obj.nextFloat();
        a=3.14f*r*r;
        System.out.println("area of circle is:"+a);
    }
}
