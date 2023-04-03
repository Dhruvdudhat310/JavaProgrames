import java.util.Scanner;

public class p_16 {
    public static void reverse(int[] arr) {
        int i = 0, temp;
        while (i <= arr.length / 2) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter at Position " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        reverse(arr);
        System.out.println("After reversing numbers in an Array :");
        for (int i = 0; i < 10; i++) {
            System.out.println("Value at Position " + (i + 1) + " : " + arr[i]);
        }
    }
}


OUTPUT:
Enter at Position 1 : 1
Enter at Position 2 : 2
Enter at Position 3 : 3
Enter at Position 4 : 4
Enter at Position 5 : 5
Enter at Position 6 : 6
Enter at Position 7 : 7
Enter at Position 8 : 8
Enter at Position 9 : 9
Enter at Position 10 : 10
After reversing numbers in an Array :
Value at Position 1 : 10
Value at Position 2 : 9
Value at Position 3 : 8
Value at Position 4 : 7
Value at Position 5 : 5
Value at Position 6 : 6
Value at Position 7 : 4
Value at Position 8 : 3
Value at Position 9 : 2
Value at Position 10 : 1 
