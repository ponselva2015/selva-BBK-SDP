package MasterMindGame;

//interface to define different methods that should be implemented 
//by the implementing classes...

public interface Playstage {
   public  void begin();
   public void startgame();
   public void end();
   public void lateststatus();
   public void displaytext();
   public boolean done();
}