package MasterMindGame;

public class PlayState implements Playstage{

    private GameTry gt;
    private CheckGuess cg;
    private PlayGame mygame;
    private int try1;
    private int try2;
    private boolean yes;

    public PlayState(int maxtries, CheckGuess cg1, GameTry gt1, RandomCode rc) {
        gt = gt1;
        cg = cg1;

        mygame = new PlayGame(4,12, rc);
        try1 = maxtries;
        try2 = maxtries;
    }

    @Override
    public void begin() {
    }

    @Override
    public void startgame() {
        try2 = try1;
        yes = true;
    }

    @Override
    public void end() {

    }

    @Override
    public void lateststatus() {
        System.out.println("You have " + try2 + " guesses left");
        System.out.println("");
        System.out.println("What is your next guess?\n" +
                "Type in the characters for your guess and press enter.");
        PlayerPeg playpeg = cg.correctpeg();
       mygame.addpeg(playpeg);
       gt.dispgame(mygame);
        System.out.println("");

        if(winorloss()){
            System.out.println("You solved the puzzle! Good job.");
            yes = false;
        }

        try2--;

        if(try2 == 0){
            System.out.println("You did not solve the puzzle. Too bad.");
            yes = false;
        }

    }

    @Override
    public void displaytext() {
    }

    @Override
    public boolean done()
    {
        return !yes;
    }

    private boolean winorloss() {
        GetPeg latestResult = mygame.getResults().lastElement();

        if(latestResult.getPegs().size() < mygame.getcount()){
            return false;
        }

        for(GetPegType resultPeg: latestResult.getPegs()){
            if(!(resultPeg instanceof BlackPeg)){
                return false;
            }
        }

        return true;
    }
}