import java.util.Scanner;

public class p_22 {
    String name;
    int enroll;
    int marks;
    p_22() {
        this.name = "Dhruv";
        System.out.println(this.name);
        this.enroll = 2101201041;
        //System.out.println(this.enroll);
        this.marks = 488;
        //System.out.println(this.marks);
    }

    p_22(String name, int enroll, int marks) {
        this.name = name;
        //System.out.println(name);
        this.enroll = enroll;
        //System.out.println(enroll);
        this.marks = marks;
        //System.out.println(marks);
    }

    public void display() {
        System.out.println(name);
        System.out.println(enroll);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Update := ");
        System.out.println("Enter Name of Student :=");
        String name = sc.nextLine();
        System.out.println("Enter Enrollment No. :=");
        int enroll = sc.nextInt();
        System.out.println("Enter Total Marks :=");
        int marks = sc.nextInt();
        p_22 p1 = new p_22();
        p_22 p2 = new p_22(name, enroll, marks);
        System.out.println("=======================================");
        System.out.println("Before Updating := ");
        p1.display();
        System.out.println("=======================================");
        System.out.println("After Updating := ");
        p2.display();
    }
}


OUTPUT:
For Update := 
Enter Name of Student :=
DHRUV
Enter Enrollment No. :=
2101201041
Enter Total Marks :=
500
Dhruv
=======================================
Before Updating := 
Dhruv
2101201041
488
=======================================
After Updating := 
DHRUV
2101201041
500
