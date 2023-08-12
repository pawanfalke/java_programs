import java.util.*;
class circle{
    double radius,area;
    void setradius(double r){
        radius=r;
    }
    void calculateArea(){
        area=3.14*radius*radius;
        System.out.println("area of circle is:"+area);
    }
}
public class test6 {
    public static void main(String[] args) {
        circle obj=new circle();
        obj.setradius(1.0);
        obj.calculateArea();
    }
}
