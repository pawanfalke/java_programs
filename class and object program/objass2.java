class airlinetickets{
    private String diparture;
    private String arrival;
    private int flightnumber;
    private String seatnumber;
    public airlinetickets(String diparture, String arrival, int flightnumber, String seatnumber) {
        this.diparture = diparture;
        this.arrival = arrival;
        this.flightnumber = flightnumber;
        this.seatnumber = seatnumber;
    }
    public String getDiparture() {
        return diparture;
    }
    public String getArrival() {
        return arrival;
    }
    public int getFlightnumber() {
        return flightnumber;
    }
    public String getSeatnumber() {
        return seatnumber;
    }

}
public class objass2 {
    public static void main(String[] args) {
        airlinetickets at1=new airlinetickets("sambhajinagar","mumbai",100,"12F");
        airlinetickets at2=new airlinetickets("sambhajinagar","kolkatta",101,"12A");
        System.out.println(at1.getDiparture()+" to "+at1.getArrival());
        System.out.println("your flight number:"+at1.getFlightnumber());
        System.out.println("your seat number:"+at1.getSeatnumber());
        System.out.println();
         System.out.println(at2.getDiparture()+" to "+at2.getArrival());
        System.out.println("your flight number:"+at2.getFlightnumber());
        System.out.println("your seat number:"+at2.getSeatnumber());

    }
}
