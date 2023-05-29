package ImplementList;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
    private int count;
    private String element;
    private List <String> myList = new ArrayList<>(5);

    public boolean emptyList() {
        return count == 0;
    }

    public void push(String element) {
     myList.add(element);
     myList.add(element);
     count++;
    }
    public int getAdded_Element() {
        return count++;
    }

    public void pop() {
        myList.remove(1);
        myList.remove(1);
        count--;
    }

    public int getPop_fromList() {
        return count--;
    }
}
