package MasterMindGame;
//This is thr main class for starting the game.
public class MastermindDriver {

    public static void main(String[] args) {
        Game g = Factory.getInstance(Game.class, true);
  g.runGames();

    }
}