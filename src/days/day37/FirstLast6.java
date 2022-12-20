package days.day37;

public class FirstLast6 {
    public static void main(String[] args) {

//        Given an array of ints, return true if 6 appears as either the first or
//        last element in the array. The array will be length 1 or more.
//
//
//        firstLast6([1, 2, 6]) → true
//        firstLast6([6, 1, 2, 3]) → true
//        firstLast6([13, 6, 1, 2, 3]) → false
        int[] numbers = {13, 2, 6, 3};// the first or last element is 6 print true
        if (numbers[0] == 6 || numbers[numbers.length - 1] == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        String[] players = {"Ronaldo", "pogba", "Neymar", "Pele"};
        if (players[0].equals("Ronaldo") || players[players.length - 1].equals("Ronaldo")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        boolean result = players[0].equals("Ronaldo") || players[players.length - 1].equals("Ronaldo");
        if (result) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
