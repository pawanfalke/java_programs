package javatpoint;

import java.util.Scanner;

public class reversenum {
   public static void main(String[] args) {
      Scanner ob=new Scanner(System.in);
      int n=ob.nextInt();
      int sum=0,b;
      while(n>0){
         b=n%10;
        sum=sum*10+b;
        n=n/10;
      }
      System.out.println("your reverse number is"+sum);
      ob.close();
   }   
}
