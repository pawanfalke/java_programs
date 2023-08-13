abstract class a41{
    void sayHello(){
        System.out.println("hello world");
        System.out.println("normal method");
    }
    abstract void add(int x,int y);
}
class b41 extends a41{

    @Override
    void add(int x, int y) {
        System.out.println(x+y);
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    
}
public class abs {
    public static void main(String[] args) {
        a41 r=new b41();
        r.sayHello();
        r.add(10,20);
    }
}
