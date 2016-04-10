package MasterMindGame;

public class GameDisplay implements GameTry {

    @Override
    public void dispgame(PlayGame mygame) {
        for(int i = 0; i < mygame.getmaxtry(); i++) {
            for(int j = 0; j < mygame.getcount(); j++){
                Pegcolour currentPeg = mygame.rownum(j, i).getPeg();
                if(currentPeg != null) {
                    currentPeg.getColour().showcolour();
               
                }
                else{
                    System.out.print(".");
                }
            }
            if(mygame.getResults().size() > i){
                System.out.print(" Result: ");
                if (mygame.getResults().elementAt(i).getPegs().size() == 0){
                    System.out.print("No pegs");
                }else{
                    int s = mygame.getResults().elementAt(i).getPegs().size();
                    for(int h = 0; h < s; h++){
                        GetPegType currentPeg = mygame.getResults().elementAt(i).getPegs().elementAt(h);
                        currentPeg.showcolour();
                        System.out.print(" ");
                    }
                }
            }
     
        }
    }
}
