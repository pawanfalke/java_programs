package nqt_prep;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        //12321
        Scanner ob=new Scanner(System.in);
        int i,n,sum=0,temp;
        n=ob.nextInt();
        ob.close();
        temp=n;
        while(n>0){
        i=n%10;
        sum=sum*10+i;
        n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrom number");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}
