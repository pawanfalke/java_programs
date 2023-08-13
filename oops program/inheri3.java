
class A2{
    int i;
    A2(){
        i=10;
        System.out.println("in a");
    }
}
class B2 extends A2{
    int j;
    B2(){
        j=20;
        System.out.println("in b");
    }
    void add(){
        System.out.println(i+j);
    }
}
public class inheri3 {
    public static void main(String[] args) {
        B2 ob=new B2();
        ob.add();
    }
}
