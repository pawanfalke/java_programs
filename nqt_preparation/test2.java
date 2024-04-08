package pattern_programs;

public class test2 {
    public static void main(String[] args) {
        //java program to print left triangle star pattern
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
             if(i+j==6 || i+j>6){
                System.out.print("*");
             }
             else{
                System.out.print(" ");
             }
            }
             System.out.println();
        }
           
        }
    }

