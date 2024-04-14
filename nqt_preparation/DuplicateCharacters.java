package javatpoint;

import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s1=ob.nextLine();
        int count;
        char [] arr=s1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            count=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j] && arr[i]!=' '){
                      count++;
                      arr[j]='0';
                }
               
            }
            if(count>1 && arr[i]!='0'){
                System.out.println(arr[i]);
            }
        }
       
        ob.close();
    }
}
