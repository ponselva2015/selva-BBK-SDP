package MasterMindGame;

//get the player input and validate and add  the peg to pegList

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;


public class PlayerGuess implements CheckGuess {

    private CheckInput ci;

    public PlayerGuess(CheckInput ci1) {
        this.ci = ci1;
    }

    @Override
    public PlayerPeg correctpeg() {
         String str1 = "";
        try {
            boolean ok = false;
            while(ok == false){
                System.out.print("Enter the guess:");
                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

                 str1 = bufferRead.readLine();
                
                if(ci.validate(str1) == true){
                    ok = true;
                }
                else{
                    System.out.println("Incorrect number of characters!");
                }
            }

        }
        catch (IOException e) {
            System.out.println(e.toString());
        }

        System.out.println("");
        return pegstr(str1);
    }


    public PlayerPeg pegstr(String input){
        Vector<Pegcolour> pegList = new Vector<>();

        for(char ch: input.toCharArray()){
            switch(ch){
                case 'B':{
                    pegList.add(new Pegcolour(new BluePeg()));
                }
                break;

                case 'G':{
                    pegList.add(new Pegcolour(new GreenPeg()));
                }
                break;

                case 'O':{
                    pegList.add(new Pegcolour(new OrangePeg()));
                }
                break;

                case 'P':{
                    pegList.add(new Pegcolour(new PurplePeg()));
                }
                break;

                case 'R':{
                    pegList.add(new Pegcolour(new RedPeg()));
                }
                break;

                case 'Y':{
                    pegList.add(new Pegcolour(new YellowPeg()));
                }
                break;
            }
        }

        return new PlayerPeg(pegList);

    }
}