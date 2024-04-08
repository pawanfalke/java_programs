package pattern_programs;

public class test1 {
    public static void main(String[] args) {
        //java program to print right angle triangle star pattern
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
