import java.util.Random;

public class p_12 {
    public static void main(String[] args) {
        Random ra = new Random();
        int num = ra.nextInt(9999);
        int n = 'Z' - 'A' + 1;
        char ch = 0;
        String alpha = "";
        for (int i = 0; i < 3; i++) {
            ch = (char) ('A' + Math.random() * n);
            alpha += ch;
        }
        System.out.println("Number plate is :");
        System.out.println(alpha + num);
    }
}


OUTPUT:
Number plate is :
VJF661
