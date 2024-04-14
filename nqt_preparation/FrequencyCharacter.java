package javatpoint;

import java.util.Scanner;

public class FrequencyCharacter {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter your string:");
        String s1=ob.nextLine();
        char [] arr=s1.toCharArray();
        int [] freq=new int[s1.length()];
        
        for (int i = 0; i < s1.length(); i++) {
           freq[i]=1;
            for (int j = i+1; j < s1.length(); j++) {
                if(arr[i]==arr[j] && arr[i]!=' '){
                freq[i]++;
                arr[j]='0';
                }
            }
          
        }
        for (int i = 0; i < freq.length; i++) {
           if(arr[i]!='0' && arr[i]!=' '){
            System.out.println(arr[i]+"="+freq[i]);
           }
        }
        ob.close();
    }
}
