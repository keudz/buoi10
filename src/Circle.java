import java.util.Scanner;


public class Circle {


    Circle(){};
    double r;

    public double chuvi (){
        return 2 * Math.PI * r;
    }

    public  double dientich () {
        return  Math.PI * Math.sqrt(r);
    }
    public static void  show (double a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle r = new Circle();
        r.r = 2;



        r.dientich();
        r.chuvi();
        System.out.println("chu vi hinh tron la:");
        Circle.show(r.chuvi());
        System.out.println("dien tich hinh tron la:");
        Circle.show(r.dientich());
    }
}





