package pattern_programs;

public class pattern7 {
    public static void main(String[] args) {
        for (int i = 0; i <=3; i++) {
         for (int j = 1; j <=4; j++) {
            if(j<=(4-i)){
                System.out.print(j);
            }
            else{
                System.out.print("*");
            }
         }
         for (int j = 4; j>=1; j--) {
            if(j>=(5-i)){
                System.out.print("*");
            }
            else{
                System.out.print(j);
            }
         }
         System.out.println();   
        }
    }
}
