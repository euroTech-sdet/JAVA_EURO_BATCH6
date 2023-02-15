package days.day67;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps1 {
    public static void main(String[] args) {
        //key values

        //   key    values
        //  String Integer
        // ronaldo 7
        //messi  10

        // Ali  865
        //Ayse 800
        //  String    String
        // country   capitals

        //  String     List
        // Country   cities
//               Key   Value
        HashMap<String, Integer> playersNumbers = new HashMap<>();
        playersNumbers.put("Ronaldo", 7);
        playersNumbers.put("Messi", 10);
        playersNumbers.put("Rivaldo", 15);
        playersNumbers.put("Hakan", 9);

        System.out.println("playersNumbers.get(\"Rivaldo\") = " + playersNumbers.get("Rivaldo"));
        System.out.println("playersNumbers.get(\"Hakan\") = " + playersNumbers.get("Hakan"));

        System.out.println("playersNumbers = " + playersNumbers);

        playersNumbers.put("Messi", 20);

        System.out.println("playersNumbers = " + playersNumbers);

        playersNumbers.put("Rivaldo", 20);

        System.out.println("playersNumbers = " + playersNumbers);

        Set<String> players = playersNumbers.keySet();

        for (String name : playersNumbers.keySet()) {
            System.out.println("name = " + name);
        }

        for (Integer number : playersNumbers.values()) {
            System.out.println("number = " + number);
        }
        System.out.println("playersNumbers.get(\"Messi\") = " + playersNumbers.get("Messi"));

        System.out.println("playersNumbers = " + playersNumbers);

        playersNumbers.remove("Rivaldo");

        System.out.println("playersNumbers = " + playersNumbers);

//        playersNumbers.clear();

        System.out.println("playersNumbers = " + playersNumbers);

        System.out.println("playersNumbers.containsKey(\"Hakan\") = " + playersNumbers.containsKey("Hakan"));
        System.out.println("playersNumbers.containsKey(\"Rivaldo\") = " + playersNumbers.containsKey("Rivaldo"));

        playersNumbers.putIfAbsent("Ronaldo", 5);

        System.out.println("playersNumbers = " + playersNumbers);
        playersNumbers.put("Messi", 4);
        System.out.println("playersNumbers = " + playersNumbers);

        printMaps(playersNumbers);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Veli", 50);
        map2.putAll(playersNumbers);
        System.out.println("map2 = " + map2);

    }

    public static void printMaps(Map<String, Integer> maps) {

        System.out.println("maps = " + maps);
    }


}
