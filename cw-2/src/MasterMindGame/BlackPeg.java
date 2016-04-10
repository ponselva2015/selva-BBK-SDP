package MasterMindGame;
//this is a black peg and is the result when correctly guessed...
//A result consists of a black peg for each peg   exactly correct (color and position)
public class BlackPeg implements GetPegType {
    @Override
    public void showcolour(){
        System.out.print("Black");
    }
}