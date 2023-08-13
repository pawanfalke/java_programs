class marks{
    private double m1;
    private double m2;
    private double m3;
    public marks(double m1, double m2, double m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public double getM1() {
        return m1;
    }
    public double getM2() {
        return m2;
    }
    public double getM3() {
        return m3;
    }
    double avgMarks(){
        double z;
        z=(m1+m2+m3)/3;
        System.out.println("average mark of the student is:"+z);
        return z;
    }
     double totalMarks(){
        double x;
        x=m1+m2+m3;
        System.out.println("total marks of the student is:"+x);
        return x;
     }
}
class studentin{
    private String name;
    private marks mymarks;
    public studentin(String name, marks mymarks) {
        this.name = name;
        this.mymarks = mymarks;
    }
    public String getName() {
        return name;
    }
    public marks getMymarks() {
        return mymarks;
    }
}

public class objass4 {
    public static void main(String[] args) {
        marks ma=new marks(10.0,20.0,30.0);
        studentin stu=new studentin("abc",ma);
        System.out.println("name of student:"+stu.getName());
        marks ma2=stu.getMymarks();
        System.out.println("marks of the sub1:"+ma2.getM1());
        System.out.println("marks of the sub2:"+ma2.getM2());
        System.out.println("marks of the sub3:"+ma2.getM3());
        ma.avgMarks();
        ma.totalMarks();
        


    }
}
