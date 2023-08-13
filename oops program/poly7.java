class animal32{
    void talk(){
        System.out.println("animal makes sound");
    }
}
class dog1 extends animal32{

    @Override
    void talk() {
        System.out.println("bow bow.....");
        super.talk();
    }

}
class duck1 extends animal32{

    @Override
    void talk() {
        System.out.println("quack quack....");
        super.talk();
    }
    
}
public class poly7 {
    static void show(animal32 r){
        r.talk();
    }
    public static void main(String[] args) {
        animal32 ob=new animal32();
        show(ob);
        dog1 ob1=new dog1();
        show(ob1);
        duck1 ob2=new duck1();
        show(ob2);
    }
}
