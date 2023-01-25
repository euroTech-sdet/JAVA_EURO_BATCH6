package days.day53.animal;

public class Lion extends Cat {
    // Animal -----> Cat----->Lion
    private String color;

    Lion(String name, String color) {
        super(name);
        this.color = color;
    }

    public void makeSound() {
        System.out.println(getName() + " is roaring ");//
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
