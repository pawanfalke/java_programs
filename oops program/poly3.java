class demo32{
    void add(int x,int y){
        int z;
        z=x+y;
        System.out.println("int function is called");
        System.out.println("addition is:"+z);
    }
    void add(double x,double y){
        double z;
        z=x+y;
        System.out.println("double function is called");
        System.out.println("addition is:"+z);
    }
}
public class poly3 {
    public static void main(String[] args) {
        demo32 ob=new demo32();
        ob.add(1.4,1.2);
        ob.add(1,2);
    }
}
