package days.day45;

import java.util.ArrayList;

public class ObjectSample {


    public static void main(String[] args) {
//       Alfa a = new Alfa();
//       Beta b = (Beta)a;
//

        String namee = "Test";

        Object obj = "Test";
        obj = 1;
        obj = true;

        boolean b = (boolean)obj;


        String name = "Talha";
        Integer id = 10001;
        Boolean active = true;

        ArrayList<Object> personal1 = new ArrayList<>();
        personal1.add(name);
        personal1.add(id);
        personal1.add(active);

        boolean flag = (boolean)personal1.get(2);
        System.out.println("personal1.get(2) = " + personal1.get(2));
        System.out.println("flag = " + flag);
    }
}


class Alfa{

}

class Beta{

}
