package days.day56;

public class FinalKeyword {

    public static final double TAX_RATE = 0.18;

    public static final int TOKEN_ID;

    static {
        TOKEN_ID = getTokenId();
    }

    public static void main(String[] args) {

        System.out.println("Math.PI = " + Math.PI);

    }

    public static int getTokenId(){
        // sent /get some api call to generate unique token
        return 22;
    }
}
