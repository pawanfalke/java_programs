package pattern_programs;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        int i=1,n;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
        ob.close();
    }
}
