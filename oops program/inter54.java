interface a54{
    default void show(){
        System.out.println("in interface A");
    }
    void add(int x,int y);
}
class demo54 implements a54{

    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }
    
}
public class inter54 {
    public static void main(String[] args) {
        a54 r=new demo54();
        r.show();
        r.add(3,3);
    }
}
