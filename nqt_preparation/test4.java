package pattern_programs;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //addition program
        int x,y,z;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        x=ob.nextInt();
        y=ob.nextInt();
        ob.close();
        z=x+y;
        System.out.println("addition is:"+z);
    }
}
