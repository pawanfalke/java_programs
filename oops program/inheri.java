class a{
    void show(){
        System.out.println("in A");
    }
}
class b extends a{
    void disp(){
        System.out.println("in B");
    }
}
public class inheri {
    public static void main(String[] args) {
        b ob=new b();
        ob.show();
        ob.disp();
    }
}
