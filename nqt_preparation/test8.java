package pattern_programs;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println("divisible by 5 and 11");
        }
        else{
            System.out.println("can not divisible by 5 and 11");
        }
        ob.close();
    }
}
