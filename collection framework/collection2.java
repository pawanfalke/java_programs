class demo72<T,V>{
    T i;
    V j;
    public demo72(T x,V y) {
        i = x;
        j= y;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
        System.out.println(j);
        System.out.println(j.getClass().getName());
    }
}

public class collection2 {
    public static void main(String[] args) {
        demo72<String,Integer> ob=new demo72<>("hello",99);
        ob.show();
    }
}
