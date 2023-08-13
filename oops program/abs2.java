abstract class account42{
    void getCustInfo(){
        System.out.println("get customer information");
    }
    abstract void calculateInterest();
}
class saving extends account42{

    @Override
    void calculateInterest() {
        System.out.println("calculate interest of saving account");
    }

}
class loan extends account42{

    @Override
    void calculateInterest() {
        System.out.println("calculate interest of loan account");
    }
    
}
public class abs2 {
    public static void main(String[] args) {
        account42 ob;
        ob=new saving();
        ob.getCustInfo();
        ob.calculateInterest();
        ob=new loan();
        ob.getCustInfo();
        ob.calculateInterest();
    }
}
