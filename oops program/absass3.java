abstract class generalbank{
    abstract double getSavingInterestRate();
    abstract double getFixedInterestRate();
}
class icicibank extends generalbank{

    @Override
    double getSavingInterestRate() {
        return 4;
    }

    @Override
    double getFixedInterestRate() {
        return 8.5;
    }

}
class kotmbank extends generalbank{

    @Override
    double getSavingInterestRate() {
        return 6;
    }

    @Override
    double getFixedInterestRate() {
        return 9;
    }
    
}
public class absass3 {
    public static void main(String[] args) {
        generalbank r;
        r=new icicibank();
        System.out.println("icicibank saving interest rate is:"+r.getSavingInterestRate());
        System.out.println("icicibank fixed interest rate is:"+r.getFixedInterestRate());
        r=new kotmbank();
        System.out.println("kotmbank saving interest rate is:"+r.getSavingInterestRate());
        System.out.println("kotmbank fixed interest rate is:"+r.getFixedInterestRate());
        
    }
}
