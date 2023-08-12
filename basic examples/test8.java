import java.util.*;
class demo8{
    void show(int []arr1){
        arr1[0]=arr1[0]+1;
        System.out.println(arr1[0]);
    }
}
public class test8 {
    public static void main(String[] args) {
        int arr[]={10,20,30};
        demo8 ob=new demo8();
        ob.show(arr);
        System.out.println(arr[0]);
    }
}
