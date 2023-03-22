import java.util.Scanner;

public class p_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer := ");
        int a = sc.nextInt();
        int b = a;
        int div = 2;
        System.out.print("1");
        while (a > 1) {
            if (a % div == 0) {
                System.out.print(", " + div);
                a = a / div;
            }
            else {
                div++;
            }
        }
        System.out.println(".");
    }
}


OUTPUT:
Enter an Integer := 
120
1, 2, 2, 2, 3, 5.
