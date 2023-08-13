class student31{
    private int id;
    private String name;
    public student31(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return id+","+name;
        
    }
}
public class poly6 {
    public static void main(String[] args) {
        student31 ob =new student31(100,"pawan");
        System.out.println(ob.toString());
        System.out.println(ob);
    }
}
