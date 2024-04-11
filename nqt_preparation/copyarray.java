package javatpoint;

public class copyarray {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2=new int[5];
        arr2=arr1;
        for(int x:arr2){
            System.out.println(x);
        }

    }
}
