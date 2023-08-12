
class demo2{
    int add(int x,int y){
        int z;
        z=x+y;
        return z;
    }
    double area(double r){
        double a1;
        a1=3.14*r*r;
        return a1;
    }
    String sayHello(String name){
        String s1;
        s1="hello"+name;
        return s1;
    }
    void show(){
        System.out.println("this is demo function");
    }
}
public class test7 {
    public static void main(String[] args) {
        demo2 obj=new demo2();
        int z;
        z=obj.add(10,20);
        System.out.println(z);
        double a;
        a=obj.area(1.5);
        System.out.println("area is"+a);
        String p;
        p=obj.sayHello("pawan");
        System.out.println(p);
        obj.show();
    }
}
