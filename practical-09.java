import java.util.Scanner;
public class p_9 {
    static void checkPalindrome(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        if(s.equals(r)) {
            System.out.println(s + " is Palindrome.");
        }
        else {
            System.out.println(s + " is not Palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number or string := ");
        String s = sc.next();
        System.out.println(s);
        checkPalindrome(s);
    }
}


OUTPUT:
Enter Number or string := 
15251
15251
15251 is Palindrome. 
