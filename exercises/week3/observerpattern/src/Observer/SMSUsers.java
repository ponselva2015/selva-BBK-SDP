package Observer;

public class SMSUsers implements Observer {
    private Subject sub;
    private String text;
	
	public SMSUsers(Subject sub1, String text1) {
		this.sub = sub1;
		this.text = text1;
	}

    @Override
    public void update(String desc) {
    	System.out.println(text + " getting update: " + desc);
    }

    @Override
    public void subscribe() {
    	sub.subscribeObserver(this);
    }

    @Override
    public void unSubscribe() {
    	sub.unSubscribeObserver(this);
    }
}