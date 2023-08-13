class Box{
    private double height;
    private double width;
    private double breadth;
    public Box(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    double getVolume(){
        double volume;
        volume=height*width*breadth;
        System.out.println("volume is:"+volume);
        return volume;
    }
    double getSurfacearea(){
        double surfacearea;
        surfacearea=2*height*breadth+2*breadth*width+2*width*height;
        System.out.println("surfacearea is:"+surfacearea);
        return surfacearea;
    }
}
public class objass3 {
    public static void main(String[] args) {
        Box bo=new Box(1.1,2.2,3.3);
        bo.getVolume();
        bo.getSurfacearea();
    }
}
