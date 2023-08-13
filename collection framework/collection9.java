import java.util.TreeSet;

public class collection9 {
    public static void main(String[] args) {
        TreeSet<Integer> ob=new TreeSet<>();
        ob.add(7);
        ob.add(25);
        ob.add(9);
        ob.add(35);
        ob.add(2);
        ob.add(5);
        ob.add(1);
        ob.add(45);
        ob.add(25);//not allowed duplicate element
        System.out.println(ob);
    }
}
