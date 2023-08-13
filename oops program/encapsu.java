class student{
    private String firstname;
     private String lastname;
     private int year;
    public student(String firstname, String lastname, int year) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getYear() {
        return year;
    }
     
}
public class encapsu {
    public static void main(String[] args) {
        student st=new student("pawan","falke",2001);
        System.out.println(st.getFirstname());
        System.out.println(st.getLastname());
        System.out.println(st.getYear());

    }
}
