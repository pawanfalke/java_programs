abstract class Instrument{
    abstract void play();
}
class piano extends Instrument{

    @Override
    void play() {
        System.out.println("piano is playing tan tan tan.....");
    }
}
class flute extends Instrument{

    @Override
    void play() {
        System.out.println("flute is playing toot toot toot toot......");
    }

}
class guitar extends Instrument{

    @Override
    void play() {
        System.out.println("guitar is playing tin tin tin......");
    }
    
}
public class absass4 {
    public static void main(String[] args) {
        Instrument ob=new piano();
        ob.play();
        
    
}
}
