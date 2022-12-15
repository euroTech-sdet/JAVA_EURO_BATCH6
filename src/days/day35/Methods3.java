package days.day35;

public class Methods3 {
    public static void main(String[] args) {
        String club = "Atletico Madrid,Madrid Real Madrid";
        //             01234567890
        System.out.println("club.contains(\"Roma\") = " + club.contains("Roma"));
        System.out.println("club.contains(\"Madrid\") = " + club.contains("Madrid"));
        System.out.println(club.contains("madrid"));
        System.out.println("club.indexOf(\"Madrid\") = " + club.indexOf("Madrid"));
        System.out.println("club.lastIndexOf(\"Madrid\") = " + club.lastIndexOf("Madrid"));
        System.out.println("club.lastIndexOf(\"Madrid\",10) = " + club.indexOf("Madrid", 10));
        int middleIndex = (club.indexOf("Madrid") + 1);
        System.out.println(club.indexOf("Madrid", middleIndex));
        System.out.println(club.replace("Madrid", "Roma"));
        System.out.println("club = " + club);
        System.out.println("club.replaceAll(\"Madrid\",\"Oslo\") = " + club.replaceAll("Madrid", "Oslo"));
        String afterReplace = club.replaceAll("Madrid", "Munich");
        System.out.println("afterReplace = " + afterReplace);
        System.out.println("club = " + club);
        String city = "Bremen";
        city = "Roma";
        String city2 = "Roma";
        System.out.println("city.equals(\"Roma\") = " + city.equals("Roma"));
        System.out.println("city.equals(\"ROma\") = " + city.equals("ROma"));
        System.out.println("city.equalsIgnoreCase(\"roma\") = " + city.equalsIgnoreCase("ROma"));



    }
}
