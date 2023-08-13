
import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class collection11 {
    public static void main(String[] args) {
        TreeMap<Integer,String> ob=new TreeMap<>();
        ob.put(4,"aaa1");
        ob.put(3,"aaa2");
        ob.put(2,"aaa3");
        ob.put(1,"aaa4");
        System.out.println(ob);

        Set<Integer> mkeys=ob.keySet();
        System.out.println("all keys");
        for(Integer k:mkeys){
            System.out.println(k);
        }
        System.out.println("all values");
        Collection <String> s1 =ob.values();
        for(String p:s1){
            System.out.println(p);
        }
        System.out.println("all items:");
        Set<Entry<Integer,String>> items=ob.entrySet();
        for(Entry<Integer,String> entry:items){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
