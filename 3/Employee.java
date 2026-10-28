public class Employee extends Person{
    private int empid;
    private int salary;

    Employee(String name,int age,int empid,int salary){
        super(name,age);
        this.empid=empid;
        this.salary=salary;
    }

    void display(){
        super.display();
        System.out.println("empid: "+this.empid);
        System.out.println("salary: "+this.salary);
    }
}
