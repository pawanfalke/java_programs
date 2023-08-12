public class test15 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                if(i==1 || i==4 || i+j==5){
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
