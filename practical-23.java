import java.util.Scanner;

public class p_23 {
    Double Area;
    prac_23(double radius) {
        Area = (Double) (3.14 * radius * radius);
    }

    prac_23(int radius) {
        Area = (Double) (3.14 * radius * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius in Double := ");
        double r1 = sc.nextDouble();
        p_23 p1 = new p_23(r1);
//        System.out.println("Enter Radius in Integer := ");
//        int r2 = sc.nextInt();
//        int r2 = (int)r1;
        p_23 p2 = new p_23((int)r1);
        System.out.println("Area of the circle is := " + p1.Area);
        System.out.println("Area of the circle is := " + p2.Area);
    }
}


OUTPUT:
Enter Radius in Double := 
5
Area of the circle is := 78.5
Area of the circle is := 78.5 
