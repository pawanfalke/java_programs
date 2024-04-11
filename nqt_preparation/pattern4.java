package javatpoint;

public class pattern4 {
    public static void main(String[] args) {
       int i,j;
       for(i=1;i<=8;i++){
        for(j=1;j<=i;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
       } 
       for(i=8;i>0;i--){
        for(j=1;j<=i;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
       }
    }
}
