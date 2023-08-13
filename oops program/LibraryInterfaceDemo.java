interface LibraryUser{
   public void registerAccount();
   public void requestBook();
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;
    
    
    public KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }
    
    public int getAge() {
        return age;
    }

    public String getBookType() {
        return bookType;
    }

    @Override
    public void registerAccount() {
       if(age<12){
        System.out.println("You have successfully registerd under a kids Account");
       }
       else{
        System.out.println("Sorry,Age must be less than 12 to register as a kid");
       }
    }
    @Override
    public void requestBook() {
       if(bookType=="kids"){
        System.out.println("Book issued successfully,please return the book within 10 days");
       }
       else{
        System.out.println("Oops,you are allowed to take only kids books");
       }
    }

}
class AdultUsers implements LibraryUser{
    int age;
    String bookType;

    
    public AdultUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }
    

    public int getAge() {
        return age;
    }


    public String getBookType() {
        return bookType;
    }


    @Override
    public void registerAccount() {
       if(age>12){
        System.out.println("You have successfully registerd under an Addult Account");
       }
       else{
        System.out.println("Sorry,Age must be greater than 12 to register as a kid");
       }
    }

    @Override
    public void requestBook() {
         if(bookType=="Fiction"){
        System.out.println("Book issued successfully,please return the book within 7 days");
       }
       else{
        System.out.println("Oops,you are allowed to take only adult Fiction books");
       }
    }
}
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        LibraryUser l=new KidUsers(11,"kids");
        LibraryUser l1=new KidUsers(18,"Fiction");
        LibraryUser l2=new AdultUsers(5,"kids");
        LibraryUser l3=new AdultUsers(23,"Fiction");

         l.registerAccount();
         System.out.println();
         l.requestBook();
         System.out.println();
         l1.registerAccount();
         System.out.println();
         l1.requestBook();
         System.out.println();
         l2.registerAccount();
         System.out.println();
         l2.requestBook();
         System.out.println();
         l3.registerAccount();
         System.out.println();
         l3.requestBook();
         



    }
}
