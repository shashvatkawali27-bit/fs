public class Recangle {
    int lenght;
    int width;
    Recangle(){
        this.lenght=0;
        this.width=0;
    }
    Recangle(int n1,int n2){
        this.lenght=n1;
        this.width=n2;
    }

    void area(int i,int j){
        int sum=i*j;
        System.out.println("area: "+sum);
    }
    void area(double i,double j){
        double sum=i*j;
        System.out.println("area: "+sum);

}
}
