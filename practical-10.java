import java.util.Scanner;

public class p_10 {
    public static void pattern(String s) {
        for (int i=0; i<s.length(); i++) {
            for(int j=s.length()-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String := ");
        String s = sc.nextLine();
        pattern(s);
    }
}


OUTPUT:
Enter a String := 
steram
      s 
     s t 
    s t e 
   s t e r 
  s t e r a 
 s t e r a m 
