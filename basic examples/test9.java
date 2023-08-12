import java.util.*;
class demo1{
    int i,j;
    void set(int x,int y){
        i=x;
        j=y;
    }
    void add(){
        int k;
        k=i+j;
        System.out.println("addition is"+k);
    }
}
public class test9 {
    public static void main(String[] args) {
        demo1 t1=new demo1();
        t1.set(10,20);
        demo1 t2=new demo1();
        t2.set(30, 20);
        t1.add();
        t2.add();
        
        
    }
}
