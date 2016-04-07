//author selva kuppusamy
//
/* Using the java.util.Observable and java.util.Observer
classes/interfaces show how one object can be informed of updates to another object.
*/

import java.util.Observable;

public class week3_q7_Observable extends Observable {
   private int i = 0;
   
   public week3_q7_Observable(int i) {
      this.i = i;
   }
   
   public void setValue(int i) {
      this.i = i;
      setChanged();
      notifyObservers();
   }
   
   public int getValue() {
      return i;
   }
}
