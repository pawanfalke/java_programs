class animal33{
    void eat(){
        System.out.println("animal eat food");
    }
    void sleep(){
        System.out.println("animals can sleep");
    }
}
class bird2 extends animal33{

    @Override
    void eat() {
        System.out.println("bird eat grains....");
        super.eat();
    }

    @Override
    void sleep() {
        System.out.println("birds sleep in nest");
        super.sleep();
    }
    void fly(){
        System.out.println("birds fly in sky....");
    }
    
}
public class poly8 {
    static void show(animal33 r){
        r.eat();
        r.sleep();
    }
    public static void main(String[] args) {
        animal33 ob1=new animal33();
        show(ob1);
        bird2 ob2=new bird2();
        show(ob2);
        ob2.fly(); 
    }
}
