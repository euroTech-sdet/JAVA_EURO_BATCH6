package days.day35;

public class Methods6 {
    public static void main(String[] args) {
        String city = "Life is beatiful Life";
        city.length();// how many characters in the string
        city.charAt(0);//will return character on that index
        city.toLowerCase();//will make all the letters lowercase
        city.toUpperCase();// will maake letters capital
        city.trim();// will remove spaces from the begginning and end
        city.substring(0, 5);// will return string that you want
        city.contains("Leicester");// will check  whether it contains  or not
        city.concat("");// concatenation
        city.startsWith("Os");
        city.endsWith("on");
        city.equals("London");//will check the value --->true or false
        city.replace('o', 'u');//accept char
        city.replaceAll("o","n");// will change some part of the string
        city.indexOf("Life");// will give us index of first letter of the Life
        city.lastIndexOf("Life");
        city.equalsIgnoreCase("LIFE");// will convert capitals to lowercase and will check
        city.isEmpty();//return true if length is 0


    }
}
