import java.util.Scanner;
public class p_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String := ");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println();
        System.out.println("The size of " + "the String is " + length);
        System.out.println("Second-Half of the String is := ");
        System.out.println(str.substring(length/2,length));
    }
}


OUTPUT:
Enter a String := 
Dhruv

The size of the String is 5
Second-Half of the String is := 
ruv
