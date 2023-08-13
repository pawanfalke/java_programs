abstract class compartment{
    abstract void notice();
}
class firstclass extends compartment{

    @Override
    void notice() {
        System.out.println("this is firstclass compartment");
    }

}
class ladies extends compartment{

    @Override
    void notice() {
        System.out.println("this is ladies compartmnet");
    }
    
}
class general extends compartment{

    @Override
    void notice() {
        System.out.println("this is general compartment");
    }
    
}
class luggage extends compartment{

    @Override
    void notice() {
        System.out.println("this is luggage compartment");
    }
    
}
public class absass2 {
    public static void main(String[] args) {
       compartment co=new  firstclass(); 
       compartment co1=new  ladies(); 
       compartment co2=new  general(); 
       compartment co3=new  luggage();
       co.notice();
       co1.notice();
       co2.notice();
       co3.notice(); 
    }
}
