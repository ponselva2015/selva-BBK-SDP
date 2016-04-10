package MasterMindGame;

import java.util.ArrayList;
import java.util.List;

public class GameImpl extends GameAbstractImpl {

    private GameTry gt;
    private CheckGuess cg;
    private int tries;
    private RandomCode rc;

    private int a;
    private List<Playstage>  Playstage;

    public GameImpl(boolean easy) {
       super(easy);

        gt = new GameDisplay();
      
 
        cg = new PlayerGuess(new CheckInput(4));
     
        tries = 12;
        Playstage = new ArrayList<>();

        rc = new RandomCode(4);

        GameStart gs = new GameStart(tries, rc);
        gs.begin();
        Playstage.add(gs);
       
        PlayState playState = new PlayState(tries, cg, gt, rc);
        
        playState.begin();
        Playstage.add(playState);
    
        EndGame eg = new EndGame();
        eg.begin();
        Playstage.add(eg);

    }

    @Override
    public void runGames(){

        Playstage.get(a).begin();

        while(true) {
        	Playstage.get(a).lateststatus();
        	Playstage.get(a).displaytext();


            if(Playstage.get(a).done()) {

            	Playstage.get(a).end();

                a++;
                if(a > Playstage.size()) {
                    a = 0;
                }

                Playstage.get(a).startgame();
            }
        }
    }
} 
