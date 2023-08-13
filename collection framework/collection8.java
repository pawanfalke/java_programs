import java.util.ArrayDeque;
import java.util.Deque;

public class collection8 {
    public static void main(String[] args) {
        Deque<Integer> ob=new ArrayDeque<>();
        ob.addLast(10);
        ob.addLast(20);
        ob.addLast(30);
        ob.addLast(40);
        System.out.println(ob);
        System.out.println(ob.getFirst());
        System.out.println(ob.getLast());
        System.out.println(ob.pollLast());
        System.out.println(ob);

    }
}
