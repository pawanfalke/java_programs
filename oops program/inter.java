interface a3{
    void add(int x,int y);
    public abstract void sub(int x,int y);
}

class demo12 implements a3{

    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }

    @Override
    public void sub(int x, int y) {
        System.out.println(x-y);
    }
    

}
public class inter {
    public static void main(String[] args) {
        a3 r=new demo12();
        r.add(10,20);
        r.sub(20,10);
    }
}
