package days.day16;

public class Switch {
    public static void main(String[] args) {
        String books = "Tolstoy's Life";
        String writer = "";
        switch (books) {// byte short integer String char
            case "Miserables":
                writer = "Victor Hugo";
                System.out.println("writer of the miserables is Victor Hugo");
                break;
            case "Anna Karenina":
            case "War and Piece":
            case "Tolstoy's Life":
                writer = "Tolstoy";
                System.out.println("the writer of this book is tolstoy");
                break;
            case "Crime and Punishment":
                writer = "Dostoevski";
                System.out.println("the writer of this book is Dostoevski");
                break;
            default:
                System.out.println("the book that you searched couldnt be found");
        }
        System.out.println("writer = " + writer);


    }
}
