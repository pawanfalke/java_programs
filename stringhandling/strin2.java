import java.util.Scanner;

public class strin2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.next();
        byte []arr=s1.getBytes();
        String s2="";
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=48 && arr[i]<=57){
                s2=""+s1.charAt(i);
                int x=Integer.parseInt(s2);
                sum=sum+x;
            }
        }
        System.out.println(sum);
    }
}
