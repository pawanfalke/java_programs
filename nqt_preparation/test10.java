package pattern_programs;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        int n=ob.nextInt();
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        ob.close();
    }
}
