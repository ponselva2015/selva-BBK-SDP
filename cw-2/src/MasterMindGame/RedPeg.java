package MasterMindGame;

//The pegs may be one of six colors: blue, green , orange, purple, red, or yellow.
//this is red peg

public class RedPeg implements Colour{
    @Override
    public void showcolour(){
        System.out.print("R");
    }
}