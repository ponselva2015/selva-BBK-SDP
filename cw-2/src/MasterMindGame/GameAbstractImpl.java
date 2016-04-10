package MasterMindGame;

public abstract class GameAbstractImpl implements Game{
    private boolean showCode;

 public GameAbstractImpl(boolean easy) {
        showCode = easy;
    }
}