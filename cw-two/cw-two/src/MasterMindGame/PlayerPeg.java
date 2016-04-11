package MasterMindGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PlayerPeg {
    private Vector<Pegcolour> pegList;

    public PlayerPeg(Vector<Pegcolour> pegs) {
        pegList = pegs;

    }

    public Vector<Pegcolour> getPegs() {
        return pegList;
    }
}