package javatpoint;

public class rotateleft {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=3;
        System.out.println("original array");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            int first=arr[0];
            int j;
            for(j=0;j<arr.length-1;j++){
                //shift element to left one by one
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.println("rotated array to left");
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
