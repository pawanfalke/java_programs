class demo31{
    void sayHello(String name){
        System.out.println("hello"+name);
    }
    void sayHello(){
        System.out.println("hello world");
    }
}
public class poly2 {
    public static void main(String[] args) {
        demo31 ob=new demo31();
        ob.sayHello();
        ob.sayHello("pawan");
    }
}
