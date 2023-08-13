interface b11{
    default void show(){
        System.out.println("in interface a");
    }
    static void disp(){
        System.out.println("static method");
    }
    void add(int x,int y);
}
class demo11 implements b11{

    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }
    public void show(){
        System.out.println("in demo");
    }
}
public class inter2 {
    public static void main(String[] args) {
        demo11 r=new demo11();
        r.add(10,20);
        r.show();
        b11.disp();
    }
}
