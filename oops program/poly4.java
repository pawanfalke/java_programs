class demo33{
    void area(int l,int b){
        int a;
        a=l*b;
        System.out.println("area of rectangle is:"+a);
    }
    void area(double r){
        double a1;
        a1=3.14*r*r;
        System.out.println("area of circle is:"+a1);
    }
}
public class poly4 {
    public static void main(String[] args) {
           demo33 ob=new demo33();
           ob.area(1.1);
           ob.area(10,20);
    }
}
