import java.util.ArrayList;

public class collection4 {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<>();
        //add
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add(1,"D");
        ar.add("B");
        ar.add("E");
        System.out.println(ar);
        int x;
        //indexof
        x=ar.indexOf("B");
        System.out.println(x);
        //lastindexof
        x=ar.lastIndexOf("B");
        System.out.println(x);
        ar.remove(4);
        System.out.println(ar);
        //get
        System.out.println(ar.get(4));
    }
}
