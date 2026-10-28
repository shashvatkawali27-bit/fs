import java.util.Scanner;

public class Company{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your empid:");
        int empId = sc.nextInt();
        System.out.println("Enter your salary:");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your department:");
        String dept = sc.nextLine();
        System.out.println("Enter your project:");
        String project = sc.nextLine();

        Manager m2 = new Manager(name, age,empId, salary,dept,project);
        m2.display();


    }
}
