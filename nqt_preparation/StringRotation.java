package javatpoint;

public class StringRotation {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="bcdea";
      
        if(s1.length()!=s2.length()){
            System.out.println("second string is not a rotation of first string");
        }
        else{
            s1=s1.concat(s1);
            if(s1.indexOf(s2)!=-1){
                System.out.println("second string is a rotation of first string");
            }
            else{
                System.out.println("second string is not a rotation of first string");
            }
        }
    }
}
