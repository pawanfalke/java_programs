import java.util.Scanner;

public class wrpp4 {
    public static void main(String[] args) {
        String s1="Hello World123";
        char [] arr=s1.toCharArray();
        int noc=0,nos=0,nod=0;
        for(char c:arr){
            if(Character.isUpperCase(c)){
                noc++;
            }
            else if(Character.isLowerCase(c)){
                nos++;
            }
            else if(Character.isDigit(c)){
                nod++;
            }
        }
        System.out.println("number of capital letters is:"+noc);
        System.out.println("number of small letters is:"+nos);
        System.out.println("number of digits is:"+nod);
    }
}
