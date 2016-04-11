package MasterMindGame;

//handle/initialize  when the play starts.

public class GameStart implements Playstage {

    private int playtimes;
    private RandomCode rc;
    private boolean yes;

    public GameStart(int t, RandomCode code) {
        playtimes = t;
        rc = code;
   
        yes = false;
    }


    @Override
    public void begin() {

    }

    @Override
    public void startgame() {
        yes = true;
    }

    @Override
    public void end() {
        yes = false;
    }

    @Override
    public void lateststatus() {
        rc.generateSecretCode();
        yes = false;
    }

    @Override
    public void displaytext() {
        System.out.println("Welcome to Mastermind.");
        System.out.print("This is a text version of the classic board game Mastermind.\n" +
                "The computer will think of a secret code.\n" +
                "The code consists of 4 colored pegs.\n" +
                "The pegs may be one of six colors: blue, green , orange, purple, red, or yellow.\n" +
                "A color may appear more than once in the code.\n" +
                "\n" +
                "You try to guess what colored pegs are in the code and what order they are in\n" +
                "After making a guess the result will be displayed.\n" +
                "A result consists of a black peg for each peg you have exactly correct (color and position) in your guess.\n" +
                "For each peg in the guess that is the correct color, but is out of position, you get a white peg.\n" +
                "\n" +
                "Only the first letter of the color is displayed. B for Blue, R for Red, and so forth.\n" +
                "When entering guesses you only need to enter the first character of the color as a capital letter.\n" +
                "\n" +
                "You have " + playtimes + " to guess the answer or you lose the game.\n");

        System.out.println();
        System.out.println("Generating secret code ....");
    }

    @Override
    public boolean done() {
        return !yes;
    }
}