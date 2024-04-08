package nqt_prep;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial is:"+fact);
        ob.close();
    }
}
