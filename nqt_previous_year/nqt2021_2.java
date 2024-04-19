package Previous_year_nqt;

import java.util.Scanner;

public class nqt2021_2 {
    public static void main(String[] args) {
        //a positive integer has been given as an input ,convert decimal value to binary representation
        Scanner ob=new Scanner(System.in);
        System.out.println("enter decimal:");
        int n=ob.nextInt();
        
        if(n<=100){
            int temp=1;
            while (temp<=n) {
                n=n^temp;
                temp=temp<<1;
            }
            System.out.println(n);
        }else{
            System.out.println("wrong input");
        }
      
        ob.close();
    }
}
