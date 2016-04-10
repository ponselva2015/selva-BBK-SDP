package MasterMindGame;
//For each peg in the guess that is the correct color, but is out of position, you get a white peg.

public class WhitePeg implements GetPegType {
    @Override
    public void showcolour(){
        System.out.print("White");
    }
}