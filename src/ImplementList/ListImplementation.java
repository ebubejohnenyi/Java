package ImplementList;

import java.util.Arrays;

public class ListImplementation {
    private int listSize;
    private int element;
    private boolean isPresent = true;
    private int [] listHolder;
    private int minus;

    public boolean emptyList() {
        return listSize == 0;
    }

    public void addToList(int index, int element) {
        listHolder = new int[5];
        for (int startingLoop = 0; startingLoop < listHolder.length * 2; startingLoop++) {
            listHolder[index] = element;
        }
        listSize++;
    }
    public int getAdded_Element(){
         return listSize;
    }

    public void removeFromList(int index) {
       listHolder[index] = element;
    }
    public int getElement(int index) {
        return listHolder[index];
    }

    public boolean contains(int element) {
        for (int index = 0; index < listHolder.length; index++) {
            if(listHolder[index] == element){
                return true;
            }
        }
        return false;
    }

    public int clear() {
        for (int index = 0; index < listHolder.length; index++) {
            listHolder[index] = 0;
        }
        return listSize = 0;
    }

    public int size() {
        return listSize;
    }
    public int get(int index, int element) {
        listHolder[index] = element;

        return element;
    }

    public int set(int index, int element) {
        listHolder[index] = element;
        return element;
    }

    public int indexOf(int element) {
        for (int index = 0; index < listHolder.length; index++) {
            if(listHolder[index] == element){
                return index;
            }
        }
        return -1;
    }

    public int lastIndexOf(int element) {
        for (int index = listHolder.length -1; index > 0; index--) {
            if (listHolder[index] == element){
                return index;
            }
        }
        return -1;
    }

//    public int equals(int element) {
//        for (int index = 0; index < listHolder.length; index++) {
//            if(listHolder[index] == element){
//                return index;
//            }
//        }
//        return -1;
//    }
}
