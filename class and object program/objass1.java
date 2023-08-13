class planets{
    private String name;
    private double distance;
    private double gravity;
    public planets(String name, double distance, double gravity) {
      this.name = name;
      this.distance = distance;
      this.gravity = gravity;
    }
    public String getName() {
      return name;
    }
    public double getDistance() {
      return distance;
    }
    public double getGravity() {
      return gravity;
    }
    
    
}
public class objass1 {
  public static void main(String[] args) {
    planets p1=new planets("earth",153.84,9.807);
    planets p2=new planets("mars",247.83,3.71);
    System.out.println("earth information:");
    System.out.println("name of planet:"+p1.getName());
    System.out.println("distance from sun:"+p1.getDistance());
    System.out.println("planet gravity:"+p1.getGravity());
    System.out.println("mars information:");
    System.out.println("name of planet:"+p2.getName());
    System.out.println("distance from sun:"+p2.getDistance());
    System.out.println("planet gravity:"+p2.getGravity());
}
}