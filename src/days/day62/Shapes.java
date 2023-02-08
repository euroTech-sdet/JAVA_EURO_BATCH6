package days.day62;

public class Shapes {

    String name;


    public void area() {
        System.out.println("calculating the area of the shapes");

    }

    public void draw() {
        System.out.println("we are drawing a " + name);// we are drawing a circle
        System.out.println("we are drawing a " + name + " shape");//we are drawing a circle shape
    }

    public void draw(int number) {
        System.out.println("we are drawing a " + name);// we are drawing a circle
        System.out.println("we are drawing a " + name + " shape");//we are drawing a circle shape
        System.out.println("we are drawing " + number + "  shape");//we are drawing 5 shape
        System.out.println("we are drawing " + number +" "+name+ "  shape");//we are drawing 5 shape
    }


}
