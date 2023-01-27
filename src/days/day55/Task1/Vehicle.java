package days.day55.Task1;

public class Vehicle {

    {
        color= "White";
    }

   static {
        System.out.println("parent Static block");
    }


    String name;
    int weight;
    float length;
    int seats;
    boolean lights;
    String color;
    String city="Oslo";

    public void start(){
        System.out.println(name+" started");

    }
    public void stop(){
        System.out.println(name+" stopped!");

    }
    public void move(){
        System.out.println(name+" is moving");

    }
    public Vehicle (String name){
        this.name=name;
    }

    public Vehicle(){

    }

    public String getName ()
    {
        return name;
    }
    public void setName(String name){
        this.name=name;

    }

}
