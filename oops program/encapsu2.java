
class room{
    private double height;
    private double width;
    private double breadth;
    public room(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    double volume(){
        double v;
        v=height*width*breadth;
        return v;   
    }
}
public class encapsu2 {
    public static void main(String[] args) {
    room r1=new room(1.1,2.2,3.3);
    System.out.println("volume is"+r1.volume());
}
}