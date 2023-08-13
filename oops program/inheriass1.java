class person1{
    private String name;
    public person1(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }   
}
class student3 extends person1{
    private int id;
    public student3(String name, int id) {
        super(name);
        this.id = id;
    }
    public int getId() {
        return id;
    }   
}
class teacher1 extends person1{
    private double salary;
    private String subject;
    public teacher1(String name, double salary, String subject) {
        super(name);
        this.salary = salary;
        this.subject = subject;
    }
    public double getSalary() {
        return salary;
    }
    public String getSubject() {
        return subject;
    }
}
class collegestudent extends student3{
    private int year;
    private String branch;
    public collegestudent(String name, int id, int year, String branch) {
        super(name, id);
        this.year = year;
        this.branch = branch;
    }
    public int getYear() {
        return year;
    }
    public String getBranch() {
        return branch;
    }
}
public class inheriass1 {
    public static void main(String[] args) {
        teacher1 t1=new teacher1("principle",100000.00,"dc");
        collegestudent s1=new collegestudent("pawan",22,2020,"entc");
        System.out.println("teacher information:");
        System.out.println("teacher name:"+t1.getName());
        System.out.println("teacher salary:"+t1.getSalary());
        System.out.println("subject:"+t1.getSubject());
        System.out.println("student information:");
        System.out.println("id:"+s1.getId());
        System.out.println("student name:"+s1.getName());
        System.out.println("year of joining:"+s1.getYear());
        System.out.println("branch:"+s1.getBranch());
    }
}
