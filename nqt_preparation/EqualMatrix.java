package javatpoint;

public class EqualMatrix {
    public static void main(String[] args) {
        int [][] arr1={{1,2,3},{1,2,3},{1,2,3}};
        int [][] arr2={{1,2,3},{1,2,3},{1,2,3}};
        int row1,row2,col1,col2;
        boolean flag=true;
        row1=arr1.length;
        col1=arr1[0].length;
        row2=arr2.length;
        col2=arr2[0].length;
        if(row1!=row2 || col1!=col2){
           System.out.println("matrices are not equal");
        }else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(arr1[i][j]!=arr2[i][j]){
                        flag=false;
                        break;
                    }
                }
            }
        }
        if(flag){
            System.out.println("matrices are  equal");
        }
        else{
            System.out.println("matrices are not equal");
        }
    }
}
