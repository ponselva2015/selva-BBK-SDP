
//
/* Using the java.util.Observable and java.util.Observer
classes/interfaces show how one object can be informed of updates to another object.
*/
	import java.util.Observer;
	import java.util.Observable;
	
	public class week3_q7_Observer implements Observer {
	   private week3_q7_Observable obsvalue = null;
	   
	   
	   public week3_q7_Observer(week3_q7_Observable obsvalue) {
	      this.obsvalue = obsvalue;
	   }
	   
	   public void update(Observable obs, Object obj) {
	      if (obs == obsvalue) {
	         System.out.println(obsvalue.getValue());
	      }
	   }
	}
