package days.day52;

import java.util.ArrayList;

public class Eagles {
    // Ali scored 2 goals ---->instance
    // Veli scored 1 goal---->instance
    // Team scored 3 goals---->static
    private int playerScore;  //make fields private  getters
    private static int teamScore;
    private String name;//create constructor
    //static arraylist put the name of the scorers
    static ArrayList<String> nameOfScorers = new ArrayList<>();

    public Eagles(String name) {
        this.name = name;
    }

    public Eagles() {

    }

    public String getName() {
        return this.name;
    }

    public void scoredOne() {
        // increase value of the fields
        //  teamscore  playerscore
        this.playerScore++;
        teamScore++;
        if (!nameOfScorers.contains(name)) {
            nameOfScorers.add(name);
        }
    }

    public void printScore() {
        // Ali scored 2 goals
        // team scored 4 goals
        System.out.println(this.name + " scored " + playerScore + " goals. ");
        System.out.println(" team scored " + teamScore + " goals.");
    }


}
