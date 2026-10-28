public class Manager extends Employee{
    private String dept;
    private String project;

    Manager(String name,int age,int empid,int salary,String dept,String project){
        super(name,age,empid,salary);
        this.dept=dept;
        this.project=project;
    }

    void display(){
        super.display();
        System.out.println("dept: "+this.dept);
        System.out.println("project: "+this.project);
    }
}
