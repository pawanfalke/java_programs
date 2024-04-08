package pattern_programs;
import java.util.Scanner;
public class test6 {
    public static void main(String[] args) {
        //if-else
        Scanner ob=new Scanner(System.in);
        System.out.println("please enter your age:");
        int age=ob.nextInt();
        if(age>=18){
            System.out.println("you can cast a vote");
        }
        else{
            System.out.println("you can not cast a vote");
        }
        ob.close();
    }
}
