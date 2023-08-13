class person{
    private String name;

    public person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
class employee extends person{
    private double salary;
    private int year;
    private String insnum;
    public employee(String name, double salary, int year, String insnum) {
        super(name);
        this.salary = salary;
        this.year = year;
        this.insnum = insnum;
    }
    public double getSalary() {
        return salary;
    }
    public int getYear() {
        return year;
    }
    public String getInsnum() {
        return insnum;
    }
    

}
public class inheri4 {
    public static void main(String[] args) {
        employee ob=new employee("pawan",30000.00,2022,"22");
        System.out.println("name:"+ob.getName());
        System.out.println("salary:"+ob.getSalary());
        System.out.println("year:"+ob.getYear());
        System.out.println("insurance number"+ob.getInsnum());
    }
}
