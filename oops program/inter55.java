interface a55{
    default void show(){
        System.out.println("default method of interface is called");
    }
    static void disp(){
        System.out.println("static method of interface is called");
    }
    void add(int x,int y);
}
class demo55 implements a55{

    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }
    
}
public class inter55 {
    public static void main(String[] args) {
        a55 r=new demo55();
        r.show();
        r.add(2,9);
        a55.disp();
    }
}
