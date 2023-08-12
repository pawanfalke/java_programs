import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int month;
    System.out.println("enter month number:");
    month=obj.nextInt();
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        System.out.println("31 days");
            break;
        case 2:
        case 4:
        case 6:
        case 9:
        case 11:
        if (month==2) {
            System.out.println("28 days");
        } else {
            System.out.println("30 days");
        }
        default:
            break;
    }
    }
}
