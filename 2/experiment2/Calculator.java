public class Calculator {
    int num1;
    int num2;
    Calculator(){
        this.num1=0;
        this.num2=0;
    }
    Calculator(int n1,int n2){
        this.num1=n1;
        this.num2=n2;
    }

    void add(int i,int j){
        int sum=i+j;
        System.out.println("SUM: "+sum);
    }
    void add(double i,double j){
        double sum=i+j;
        System.out.println("SUM: "+sum);
    }
}
