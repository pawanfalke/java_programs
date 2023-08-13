public class excep8 {
    static void div1(int x,int y){
        try {
            int z;
            z=x/y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("can not divide by zero");
        }
        finally{
            System.out.println("always executed");
        }
    }
    static void div2(int x,int y){
        try{
            int z;
            z=x/y;
            return;
        }
        finally{
            System.out.println("before return");
        }
    }
    public static void main(String[] args) {
        div1(10,2);
        div2(10,5);
    }
}
