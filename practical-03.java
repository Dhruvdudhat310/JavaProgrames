import java.util.Scanner;

public class p_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value in meters =");
        double meter = sc.nextFloat();
        double feet = meter* 3.28084;
        
        System.out.println("Meters = "+meter);
        System.out.println("Feet   = "+feet);
    }

}
