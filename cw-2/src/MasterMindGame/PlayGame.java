package MasterMindGame;

import java.util.Arrays;
import java.util.Vector;

public class PlayGame {

    private Vector<DispPeg> v1;
    private RandomCode rco;
    private Vector<GetPeg> results;
    private int pegcount;
    private int maxtry;
    private int row;

    public PlayGame(int pcount, int maxtry, RandomCode rc) {
        rco = rc;
  v1 = new Vector<>(pcount * maxtry);

        pegcount = pcount;
        maxtry = maxtry;
        row = 0;

        for (int i = 0; i < maxtry; i++) {
            for (int j = 0; j < pegcount; j++) {
                v1.add(i * pegcount + j, new DispPeg());
            }
        }

        results = new Vector<>(maxtry);
    }

    public DispPeg rownum(int pcount, int maxtry) {
        return v1.elementAt(maxtry * pegcount + pcount);
    }

    private void addPeg(Pegcolour peg, int pcount, int maxtry) {
        v1.elementAt(maxtry * pegcount + pcount).setPeg(peg);
    }

    public int getcount() {
        return pegcount;
    }

    public int getmaxtry() {
        return maxtry;
    }

    public void addpeg(PlayerPeg guess) {
     

        for(Pegcolour peg: guess.getPegs()){
            addPeg(peg, row/pegcount, row/pegcount);
            row++;
        }

        GetPeg newResult = new GetPeg();

        int wc = 0;
        int bc = 0;

        Boolean[] b = new Boolean[guess.getPegs().size()];
        Arrays.fill(b, false);

        for(int j = 0; j < guess.getPegs().size(); j++) {
            Pegcolour secretCodePeg = rco.getPegs().elementAt(j);
            Pegcolour guessPeg = guess.getPegs().elementAt(j);

            if(secretCodePeg.getColour().getClass().equals(guessPeg.getColour().getClass())){
                bc++;
                b[j] = true;
            }
        }

   for(int h = 0; h < bc; h++){
            newResult.getPegs().add(new BlackPeg());
        }

        for(int w = 0; w < wc; w++){
            newResult.getPegs().add(new WhitePeg());
        }

        results.add(newResult);
    }

    public Vector<GetPeg> getResults() {
        return results;
    }
}