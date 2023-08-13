class NegativeIdException extends RuntimeException{
    public String tostring(){
        return "id can not ne negative";
        
    }
}
class student41{
    private int id;
    int age;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id<0){
            NegativeIdException ex;
            ex= new NegativeIdException();
            throw ex;
        }
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}

public class excep4 {
    public static void main(String[] args) {
        student41 st=new student41();
        st.setId(100);
        st.setName("pawan");
        System.out.println("id:"+st.getId());
        System.out.println("name:"+st.getName());
    }
}
