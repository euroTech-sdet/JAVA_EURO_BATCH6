package days.day59;

public class Test {
    public static void main(String[] args) {
        BigNumber bigNumber = new BigNumber();
        bigNumber.print();
        System.out.println("B.city = " + B.city);
        B.writeB();
        N n = new N();
        n.writeC();
        Toyota toyota=new Toyota();
        toyota.sweepInside();
        toyota.washTheCar();
        Honda honda=new Honda();
        honda.sweepInside();
        honda.washTheCar();
        honda.boostThePower();
        System.out.println("honda.hp = " + honda.hp);
        System.out.println("honda.model = " + honda.model);


    }
}
