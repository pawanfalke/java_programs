import java.util.Scanner;
public class test13 {
    public static void main(String[] args) {
        int a;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter yout number:");
        a=obj.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println("number can divide by 5 and 11");
        }
        else{
            System.out.println("number can not divide by 5 and 11");
        }
    }
}
