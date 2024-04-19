package Previous_year_nqt;

import java.util.Scanner;

public class nqt2021_5 {
    public static void main(String[] args) {
        int n=5,sum=0,max=0;
        Scanner ob=new Scanner(System.in);
        int [] E=new int[n];
        int [] l=new int[n];
        System.out.println("enter entrys:");
        for (int i = 0; i < n; i++) {
            E[i]=ob.nextInt();
        }
        System.out.println("enter exit:");
        for (int i = 0; i < n; i++) {
            l[i]=ob.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum=sum+E[i]-l[i];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println("maximum number of guests on cruise is: "+max);
        ob.close();
    }
}
