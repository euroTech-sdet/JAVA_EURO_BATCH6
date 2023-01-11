package days.day45;

public class PassingObjToMethod {

    public static void main(String[] args) {
        Circle c = new Circle(1);

        printAllInfoOfCircle(c);
    }
    public static void printAllInfoOfCircle(Circle circle){
        System.out.println("Area of given circle is " + circle.getArea() +
                " and delimiter of circle is "+ circle.delimiter());
    }
}

class Circle{

    double radios;

    public Circle(double radios) {
        this.radios = radios;
    }

    public double getArea(){
        return 3 * radios * radios;  //Math.PI
    }

    public double delimiter(){
        return 2 * 3 * radios;
    }

}
