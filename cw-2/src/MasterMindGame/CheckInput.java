package MasterMindGame;

//if the user inputs more or less chars display error


public class CheckInput {

    private int strl;

    public CheckInput(int strlen) {
        strl = strlen;
}

    public boolean validate(String input){
        if(strl<input.length() || strl>input.length()|| input.isEmpty()){
            return false;

        }
       return true;
    }
}
