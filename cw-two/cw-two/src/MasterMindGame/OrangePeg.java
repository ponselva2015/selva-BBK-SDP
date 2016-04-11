package MasterMindGame;

//The pegs may be one of six colors: blue, green , orange, purple, red, or yellow.
//this is orange peg

public class OrangePeg implements Colour{
    @Override
    public void showcolour(){
        System.out.print("O");
    }
}