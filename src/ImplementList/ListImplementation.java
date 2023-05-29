package ImplementList;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
    private int count;
    private String element;
    private List <String> myList = new ArrayList<>(5);
    private String [] arrayHolder = new String[5];

    public boolean emptyList() {
        return count == 0;
    }

    public void push(String element) {
        myList.add(element);
        count++;
    }
    public int getAdded_Element() {
        return count++;
    }

    public int pop() {
        myList.remove(0);
        return count--;
    }
}
