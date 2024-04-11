package javatpoint;

public class pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<6;i++){
           
                for (j=2*(6-i); j>=0; j--)         
                {  
                //prints space between two stars      
                System.out.print(" ");   
                }   
                //inner loop for columns  
                for (j=0; j<=i; j++ )   
                {   
                //prints star      
                System.out.print("* ");   
                }   

            System.out.println();
        }
    }
}
