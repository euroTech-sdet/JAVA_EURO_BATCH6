package days.day62;

public class Triangle extends Shapes {


    public void area() {
        System.out.println("Triangle is ½ * base * height");
    }

    public void draw(int num) {
        System.out.println(num + this.name);
    }
}
