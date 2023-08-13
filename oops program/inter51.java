interface a51{
    void add(int x,int y);
}
interface b51 extends a51{
    void sub(int x,int y);
}
class demo51 implements b51{

    @Override
    public void add(int x, int y) {
        int z;
        z=x+y;
        System.out.println("addition is:"+z);
    }

    @Override
    public void sub(int x, int y) {
        int z;
        z=x-y;
        System.out.println("subtraction is:"+z);
    }
    
}
public class inter51 {
    public static void main(String[] args) {
        b51 r=new demo51();
        r.add(10,20);
        r.sub(20,10);
    }
}
