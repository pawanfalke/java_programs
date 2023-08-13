interface a52{
    void add(int x,int y);
}
interface b52{
    void sub(int x,int y);
}
class demo52 implements a52,b52{

    @Override
    public void sub(int x, int y) {
        int z;
        z=x-y;
        System.out.println("sub is:"+z);
    }

    @Override
    public void add(int x, int y) {
        int z;
        z=x+y;
        System.out.println("add is:"+z);
    }
    
}
public class inter52 {
    public static void main(String[] args) {
        a52 r=new demo52();
        r.add(10,90);
        b52 r1=new demo52();
        r1.sub(90,20);
    }
}
