class student2{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if(id<0){
            throw new RuntimeException("id cant be negative");
        }
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
public class encapsu5 {
    public static void main(String[] args) {
        student2 st=new student2();
        st.setId(100);
        st.setName("pawan");
        int id1;
        id1=st.getId();
        String n;
        n=st.getName();
        System.out.println("id:"+id1);
        System.out.println("name:"+n);
    }
}
