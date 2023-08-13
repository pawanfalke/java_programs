import java.util.ArrayList;

public class collection3 {
    public static void main(String[] args) {
        ArrayList <String> ar=new ArrayList<>();
        //size
        System.out.println(ar.size());
        //add
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
        System.out.println(ar.size());
        ArrayList <String> ar1=new ArrayList<>();
        ar1.add("E");
        ar1.add("F");
        ar.addAll(ar1);
        System.out.println(ar);
        //contains
        System.out.println(ar.contains("B"));
        System.out.println("x");
        //remove
        System.out.println(ar);
        ar.remove("B");
        System.out.println(ar);
        //removeall
        ar.removeAll(ar1);
        System.out.println(ar);
        //convert collection object into array
        Object[] arr=ar.toArray();
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //clear and isempty
        System.out.println(ar.isEmpty());
        ar.clear();
        System.out.println(ar.isEmpty());
    }
}
