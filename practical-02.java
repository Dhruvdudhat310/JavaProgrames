import java.util.Scanner;

public class p_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your wait in pound =");
        float pound = sc.nextFloat();
        
        System.out.println("Enetr your hight in inch =");
        float inch = sc.nextFloat();
        
        double BMI = (pound*0.45359237)/((inch*0.0254)*(inch*0.0254));
        System.out.println("BMI = "+BMI);
    }

}


OUTPUT:
Enter your wait in pound =
100
Enetr your hight in inch =
50
BMI = 28.122783185566373
