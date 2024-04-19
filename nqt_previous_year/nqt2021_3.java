package Previous_year_nqt;

import java.util.Scanner;

public class nqt2021_3 {
    public static void main(String[] args) {
        //calculation of # and * in string
      
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string contain * and # only:");
        String s1=ob.next();
        int counth=0,counts=0;
        char [] arr=s1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='*'){
                counts++;
            }
            else if(arr[i]=='#'){
                counth++;
            }
        }
        int result=counts-counth;
        System.out.println(result);
        if(result>0){
            System.out.println("number of * is more than #");
        }
        else if(result<0){
            System.out.println("number of # more than *");
        }
        else{
            System.out.println("number of # and * are equal");
        }
        ob.close();

    }
}
