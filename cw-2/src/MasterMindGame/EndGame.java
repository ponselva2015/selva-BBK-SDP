package MasterMindGame;
//handles the end of the play.Check the player's response 
// if the player likes to play again continue from start or exit the program.

import java.util.Scanner;

public class EndGame implements Playstage {
    @Override
   public void begin() {

   }

    @Override
    public void startgame() {

    }

 //   @Override
    
    public void end() {
   System.out.println("OK.You can try next time.Thanks.");
    System.exit(0);
    }

    @Override
    public void lateststatus() {
        String answer;
        System.out.print("Enter Y for another game or anything else to quit: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
            answer = reader.nextLine().trim();
            if (answer.equals("Y"))
            {
                Game g = Factory.getInstance(Game.class, true);
                g.runGames();
            }else
            {
            	end();
            }
    }  
              
   @Override
    public void displaytext() {

    }

    @Override
    public boolean done(){
        return false;
    }
}