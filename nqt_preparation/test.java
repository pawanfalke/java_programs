package pattern_programs;

import java.util.Scanner;

public class test {
   public static void main(String[] args) {
     // write a program to take two digit number and print addition of its digit by separating it
     int x,y,z;
     Scanner obj=new Scanner(System.in);
     System.out.println("enter 2 digit number");
      x=obj.nextInt();
      obj.close();
      y=x/10;
      z=x%10;
      x=y+z;
      System.out.println(x);
     
   }
}


