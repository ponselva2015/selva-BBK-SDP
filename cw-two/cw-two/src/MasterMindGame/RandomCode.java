package MasterMindGame;

import java.util.Random;
import java.util.Vector;


public class RandomCode {
    private Vector<Pegcolour> pegs;
    private int pegCount;

    public RandomCode(int inPegCount) {
        pegs = new Vector<>();

        pegCount = inPegCount;
        generateSecretCode();
    }


    Vector<Pegcolour> getPegs() {
 
        return pegs;
    }

    public void generateSecretCode(){
        pegs.clear();

        Random randomGenerator = new Random();
        for(int i = 0; i < pegCount; i++) {
            int randomcolour = randomGenerator.nextInt(6);

            switch (randomcolour) {
                case 0:
                {
                	System.out.println("blue");
                    pegs.add(new Pegcolour(new BluePeg()));
                    
                }
                break;
                case 1:
                {
                	System.out.println("red");
                    pegs.add(new Pegcolour(new RedPeg()));
                }
                break;
                case 2:
                {
                	System.out.println("green");
                    pegs.add(new Pegcolour(new GreenPeg()));
                }
                break;
                case 3:
                {
                	System.out.println("orange");
                    pegs.add(new Pegcolour(new OrangePeg()));
                }
                break;
                case 4:
                {
                	System.out.println("purple");
                    pegs.add(new Pegcolour(new PurplePeg()));
                }
                break;
                
                case 5:
                {
                	System.out.println("yellow");
                    pegs.add(new Pegcolour(new YellowPeg()));
                }
                break;
            }
        }
    }
}