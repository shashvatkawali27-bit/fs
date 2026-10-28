public class Experiment1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="ram";
        s1.uin="251p023";
        s1.cgpa=8.8;

        Student s2=new Student();
        s2.name="ramraj";
        s2.uin="251p063";
        s2.cgpa=8.1;

        Student s3=new Student();
        s3.name="ramkumar";
        s3.uin="251p025";
        s3.cgpa=8;

        s1.display();
        s2.display();
        s3.display();
    }
}

class Student{
    String name;
    String uin;
    double cgpa;

    void display(){
        System.out.println("---------------");
        System.out.println("NAME"+name);
        System.out.println("UIN"+uin);
        System.out.println("CGPA"+cgpa);
    }
    
}