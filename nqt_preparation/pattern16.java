package pattern_programs;

public class pattern16 {
    public static void main(String[] args) {
        int temp=1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(temp+" ");
                temp++;
            }
            
            System.out.println();
        }
    }
}
