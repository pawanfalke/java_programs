class demo71<T>{
    T i;

    public demo71(T x) {
        i = x;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
public class collection {
   public static void main(String[] args) {
    demo71<Integer> ob=new demo71<>(100);
    demo71<String> ob1=new demo71<>("pawan");
    ob.show();
    ob1.show();
   } 
}
