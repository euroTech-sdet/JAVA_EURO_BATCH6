package days.day53.draw;

public class DrawTest {
    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.drawingShape();

        // create a circle class in the draw package
        // inherit Draw class from circle class
        // by using circle object invoke the drawingShape method
        Circle circle=new Circle();
        circle.drawingShape();// we are drawing a circle
        Triangle triangle=new Triangle();
        triangle.drawingShape();
        circle.printName();
    }
}
