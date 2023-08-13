class account{
    private int id;
    private int balance;
    public account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public int getBalance() {
        return balance;
    }
}
    class customer{
        private String firstname;
        private String lastname;
        private account acc;
        public customer(String firstname, String lastname, account acc) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.acc = acc;
        }
        public String getFirstname() {
            return firstname;
        }
        public String getLastname() {
            return lastname;
        }
        public account getAcc() {
            return acc;
        }
        
    }
public class encapsu3 {
    public static void main(String[] args) {
        account acc1=new account(22,1000);
        customer c1=new customer("pawan","falke",acc1);
        System.out.println("first name:"+c1.getFirstname());
        System.out.println("last name:"+c1.getLastname());
        account acc2=c1.getAcc();
        System.out.println("id:"+acc2.getId());
        System.out.println("balance:"+acc2.getBalance());
    }
}
