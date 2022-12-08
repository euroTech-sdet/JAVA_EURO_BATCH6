package days.day30;

public class Pizza {
    //Flour, yeast, salt, olive oil, sugar, water, meats, cheese, vegetables, pizza sauce
    boolean cheese;
    int slice;
    boolean salty;
    boolean vegatable;

    String size;
//    boolean meat;

    // print ingredients
//eat pizza whenevver you eat pizza decrease the value of slices

    public void printIngredients() {
        if (cheese) {//cheese == true
            System.out.println("your pizza with cheese.");
        }
        if (salty) {
            System.out.println("salty pizza");
        }
        if (vegatable) {
            System.out.println("your pizza is vegatable");
        }

        System.out.println(" your pizza has " + slice + " slices and " + size);
    }
}

class PizzaTest {
    public static void main(String[] args) {
        Pizza vegatablePizza = new Pizza();
        vegatablePizza.vegatable = true;
        vegatablePizza.salty = false;
        vegatablePizza.cheese = true;
        vegatablePizza.slice = 8;
        vegatablePizza.size = "Medium";
        vegatablePizza.printIngredients();
        Pizza pizza2 = new Pizza();
        pizza2.vegatable = false;
        pizza2.salty = true;
        pizza2.cheese = true;
        pizza2.slice = 10;
        pizza2.size = "Large";
        pizza2.printIngredients();

    }
}