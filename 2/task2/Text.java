import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Recangle c1=new Recangle();
        System.out.println("lenght:"+c1.lenght+"width:"+c1.width);

        Recangle c2=new Recangle(4,6);
        System.out.println("lenght:"+c2.lenght+"width:"+c2.width);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter length:");
        int a=sc.nextInt();
        System.out.println("enter width:");
        int b=sc.nextInt();
        c1.area(a,b);

        System.out.println("enter length:");
        double c=sc.nextDouble();
        System.out.println("enter width:");
        double d=sc.nextDouble();
        c1.area(c,d);
    }

}
