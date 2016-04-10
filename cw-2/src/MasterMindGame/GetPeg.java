package MasterMindGame;

import java.util.Vector;

public class GetPeg {
    private Vector<GetPegType> pegs;

    public GetPeg() {
        pegs = new Vector<>();
    }

    public Vector<GetPegType> getPegs() {

        return pegs;
    }
}