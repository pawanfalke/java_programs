package javatpoint;

public class pattern3 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=6;i++){
            for(j=1;j<=6;j++){
                if(i==j || i<=j){
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
