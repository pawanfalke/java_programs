class Address{
    private int housenum;
    private String city;
    private String state;
    public Address(int housenum, String city, String state) {
        this.housenum = housenum;
        this.city = city;
        this.state = state;
    }
    public int getHousenum() {
        return housenum;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    
}
class student1{
    private int id;
    private String name;
    private Address homeaddress;
    public student1(int id, String name, Address homeaddress) {
        this.id = id;
        this.name = name;
        this.homeaddress = homeaddress;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Address getHomeaddress() {
        return homeaddress;
    }
    
}
public class encapsu4 {
    public static void main(String[] args) {
        Address ad=new Address(111,"sambhajinagar","mharashtra");
        student1 st=new student1(22,"pawan",ad);
        System.out.println("id:"+st.getId());
        System.out.println("name:"+st.getName());
        Address ad2=st.getHomeaddress();
        System.out.println(ad2.getHousenum());
        System.out.println(ad2.getCity());
        System.out.println(ad2.getState());


    }
}
