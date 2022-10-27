package days.day8;

public class Casting {
    public static void main(String[] args) {
        int a = 100;
        a = (int) 10.9;// explicitly
        System.out.println("a = " + a);
        double d = 105;// implicitly casting
        byte b = 127;
        b = (byte) 500;
        System.out.println("b = " + b);
        short s = (short) 40000;
        System.out.println("s = " + s);
        //      byte short int long
        //      float double
        char c = 98;
        System.out.println("c = " + c);
        c = 'A';// c=65
        System.out.println("c = " + c);
        c = 65;
        System.out.println("c = " + c);
        // narrowing      double --float--long--int--short---byte
        // memory          64        32    64    32   16      8 bit
        double d1 = 189.123456789;
        long l2 = (long) d1;// narrowing so explicitly i need to cast
        int i2 = (int) d1;
        float f2 = 12345.12345f;
        long l5 = (long) f2;//explicitly i need to cast
        System.out.println("l2 = data type is long " + l2);// this variable type is long
        System.out.println("l5 = " + l5);
        System.out.println("d1 = data type is double " + d1);// data type mis double
        // widening  byte --> short--> int--> long ---> float--->double  no need to cast explicitly
        short s1 = 12345;
        float f6 = s1;// i assigned a integer to float




    }
}
