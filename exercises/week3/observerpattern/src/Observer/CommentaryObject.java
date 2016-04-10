package Observer;

import java.util.List;

public class CommentaryObject implements Subject, Commentary {
    private List<Observer> users;
    private String msg1;
    private String desc;
    private boolean newmsg = false;
	
	public CommentaryObject(List<Observer> users, String title) {
		this.users = users;
		this.msg1 = title;
	}

    @Override
    public void subscribeObserver(Observer observer) {
    	users.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
    	users.remove(observer);
    }

    @Override
    public void notifyObservers() {
    	for (Observer ob : users) {
    		ob.update(desc);
    	}
    	newmsg = false;
    }

    @Override
    public String subjectDetails() {
        return msg1;
    }
    @Override
    public void setDesc(String desc) {
    	if (!desc.equals(this.desc)) {
    		newmsg = true;
    		this.desc = desc;
    		notifyObservers();
    	}
    }
}