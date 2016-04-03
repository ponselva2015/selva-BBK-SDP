package sml;

import java.util.ArrayList;

public class Labels {

    private ArrayList<String> labels;
   {
        labels = new ArrayList<>();
    }
public int addLabel(String lab) {
        labels.add(lab);
        return labels.size() - 1;
    }

 public int indexOf(String lab) {
 for (int i = 0; i != labels.size(); i++) {
            if (lab.equals(labels.get(i))) {
                return i;
            }
        }
        return -1;
    }

@Override
    public String toString() {
        StringBuilder r = new StringBuilder("(");

        for (int i = 0; i != labels.size(); i++) {
            if (i == 0) {
                r.append(labels.get(i));
            } else {
                r.append(", ").append(labels.get(i));
            }
        }
        r.append(")");
        return r.toString();
    }

 public void reset() {
        labels.clear();
    }
}