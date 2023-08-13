import java.util.ArrayList;
import java.util.ListIterator;

public class collection5 {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<>();
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
        ar.add("E");
        //by using for loop
        System.out.println("by using for loop");
        int i;
        for(i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        System.out.println("by using for each loop");
        for(String s:ar){
            System.out.println(s);
        }
        System.out.println("bu using list iterable object");
       ListIterator <String> it2= ar.listIterator();
       System.out.println("forward......");
       while(it2.hasNext()){
        String s=it2.next();
        System.out.println(s);
       }
       System.out.println("backward.....");
       while(it2.hasPrevious()){
        String s=it2.previous();
        System.out.println(s);
       }
    }
}
