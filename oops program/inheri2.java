class A1{
    A1(){
        System.out.println("in a");
    }
}
class B1 extends A1{
    B1(){
        System.out.println("in b");
    }
}
class C1 extends B1{
    C1(){
        System.out.println("in c");
    }
}
public class inheri2 {
    public static void main(String[] args) {
        C1 ob=new C1();
    }
    
}
