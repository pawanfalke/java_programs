
public class strin {
    public static void main(String[] args) {
        String s1="mark";
        String s2="kate";
        String s3="";
        int x=s1.length();
        if(s1.charAt(x-1)==s2.charAt(0)){
            s3=s1+s2.substring(1);
        }
        else{
            s3=s1+s2;
        }
        System.out.println(s3);

    }
}
