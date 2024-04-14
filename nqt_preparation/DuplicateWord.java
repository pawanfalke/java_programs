package javatpoint;

import java.util.Scanner;

public class DuplicateWord {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string:");
        String s1=ob.nextLine();
        s1=s1.toLowerCase();
        String [] words=s1.split(" ");
        int count;
        for (int i = 0; i < words.length; i++) {
            count=1;
            for (int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])){
                 count++;
                 words[j]="0";
                }
            }
            if(count>1 && words[i]!="0"){
               System.out.println(words[i]);
            }
        }
        ob.close();
    }
}
