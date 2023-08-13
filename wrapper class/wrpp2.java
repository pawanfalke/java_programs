public class wrpp2 {
    public static void main(String[] args) {
        //autoboxing
        int x=100;
        Integer ob1=x;
        char ch='A';
        Character ob2=ch;
        //autounboxing
        int y;
        y=ob1.intValue();
        char z;
        z=ob2.charValue();
        System.out.println(y);
        System.out.println(z);
    }
}
