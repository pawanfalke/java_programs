class animal2{
    void talk(){
        System.out.println("animal makes sound!!!");
    }
}
class dog extends animal2{
    void talk(){
        System.out.println("bow bow....");
    }
}
class duck extends animal2{
    void talk(){
        System.out.println("quack quack...");
    }
}
public class poly5 {
    public static void main(String[] args) {
        dog ob=new dog();
        ob.talk();
        duck ob2=new duck();
        ob2.talk();
    }
}
