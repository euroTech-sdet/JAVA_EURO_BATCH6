package days.day62;

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
        Circle circle = new Circle();
        circle.area();
        Shapes shapes = new Shapes();
        shapes.area();
        Shapes shapes1 = new Circle();
        shapes1.area();
        Shapes shapes2 = new Triangle();
        shapes2.area();
        System.out.println("shapes1.name = " + shapes1.name);
        System.out.println("circle.name = " + circle.name);
        circle.name = "Circle";
        triangle.name = "triangle";
        circle.draw();
        triangle.draw();
        circle.draw(10);
        shapes1.draw();
        shapes1.name = "Big circle";
        shapes1.draw(5);
        shapes2.name = "Triangle";
        shapes2.draw(50);
        Shapes shapes3 = (Shapes) new Triangle();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        ArrayList<Shapes> listOfShapes = new ArrayList<>();
        listOfShapes.add(shapes);
        System.out.println("shapes.getClass() = " + shapes.getClass());
        System.out.println("shapes1.getClass().getName() = " + shapes1.getClass().getName());
        boolean shapeInstShapes = shapes1 instanceof Shapes;
        System.out.println("shapeInstShapes = " + shapeInstShapes);
        listOfShapes.add(circle);
        listOfShapes.add(triangle);


    }


}
