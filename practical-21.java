import java.util.Scanner;

public class p_21 {
    String name;
    int age;
    int salary;
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Person := ");
        name = sc.nextLine();
        System.out.println("Enter Age of := ");
        age = sc.nextInt();
        System.out.println("Enter Salary of := ");
        salary = sc.nextInt();
    }

    public void setData(String name, int age, int salary) {
        System.out.println("Name of Person is := " + name);
        System.out.println("Age of " + name + " is := " + age);
        System.out.println("Salary of " + name + " is := " + salary);
    }

    public static void main(String[] args) {
        p_21 pr = new p_21();
        pr.getData();
        System.out.println();
        System.out.println("=========================================================");
        System.out.println();
        pr.setData(pr.name, pr.age, pr.salary);
    }
}


OUTPUT:
Enter name of Person := 
Dhruv 
Enter Age of := 
19
Enter Salary of := 
100000

=========================================================

Name of Person is := Dhruv
Age of Dhruv is := 19
Salary of Dhruv is := 100000 
