package days.day30;

public class GarbageCollector {
    public static void main(String[] args) {
        String student = "Ronaldo";
        String student2 = "Tarik";
        String student3 = "Ronaldo";
        String student4 = new String("Tarik");
        System.out.println(student == student3);
        System.out.println(student2 == student4);
        String lastStudent = student4;
        System.out.println("lastStudent = " + lastStudent);
        System.out.println(lastStudent == student2);
        lastStudent = "Tarik";
        System.out.println(lastStudent == student2);


    }
}
