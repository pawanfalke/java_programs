package javatpoint;

public class Anagram {
    public static void main(String[] args) {
        String str1="Brag";
        String str2="Grab";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char [] arr1=str1.toCharArray();
        char [] arr2=str2.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i]>arr1[j]){
                    char temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
       String s1 =new String(arr1);
        System.out.println(s1);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if(arr2[i]>arr2[j]){
                    char temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        String s2 =new String(arr2);
        System.out.println(s2);
        if(s1.length()!=s2.length()){
          System.out.println("not an anagram");
        }
        else{
            if(s1.equals(s2)){
                System.out.println("it is anagram");
            }
            else{
                System.out.println("not anagram");
            }
        }
    }
}
