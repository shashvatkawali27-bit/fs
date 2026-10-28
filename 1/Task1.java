public class Task1 {
        public static void main(String[] args) {
        User s1=new User();
        s1.name="ram";
        s1.accountNo=34547673;
        s1.balance=82345.8;

        User s2=new User();
        s2.name="ramraj";
        s2.accountNo=75352527;
        s2.balance=8324.1;

        User s3=new User();
        s3.name="ramkumar";
        s3.accountNo=572768879;
        s3.balance=800000;

        s1.display();
        s2.display();
        s3.display();
        }
}


class User{
    String name;
    int accountNo;
    double balance;

    void display(){
        System.out.println("---------------");
        System.out.println("NAME: "+name);
        System.out.println("ACCOUNT NO: "+accountNo);
        System.out.println("BALANCE: "+balance);
    }
    
}