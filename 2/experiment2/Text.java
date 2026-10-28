import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println("num1:"+c1.num1+"num2"+c1.num2);

        Calculator c2=new Calculator(4,6);
        System.out.println("num1:"+c2.num1+"num2"+c2.num2);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1:");
        int a=sc.nextInt();
        System.out.println("enter number 2:");
        int b=sc.nextInt();
        c1.add(a,b);

        System.out.println("enter number 1:");
        double c=sc.nextDouble();
        System.out.println("enter number 2:");
        double d=sc.nextDouble();
        c1.add(c,d);
    }

}
