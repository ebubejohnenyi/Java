package ImplementList;

public class ListImplementation {
    private int listSize;
    private int element;
    private boolean isPresent = true;
    private int [] listHolder;

    public boolean emptyList() {
        return listSize == 0;
    }

    public void addToList(int element) {
        listHolder = new int[5];
        for (int index = 0; index < listHolder.length; index++) {
            listHolder[index] = element;
        }
        listSize++;
    }
    public int getAdded_Element() {
         return listSize;
    }

    public void removeFromList(int element) {
        for (int secondIndex = 0; secondIndex < listHolder.length; secondIndex++) {
            listHolder[secondIndex] = element;
        }
        listSize--;
    }

    public int checkIfRemoved() {
        return listSize;
    }

    public boolean containsInList(int element) {
        for (int number : listHolder) {
            if(number == element){
                return true;
            }
        }
        return false;
    }
    public void allList(int element) {
        for (int index = 0; index < listHolder.length; index++) {
            listHolder[index] = element;
        }
    }
    public int getAllList() {
        return listSize;
    }

    public void clearAll_Element(int element) {
        for (int index = 0; index < listHolder.length; index++) {
            listHolder[index] = element;
            listSize--;
        }
    }

    public int elementCleared() {
        return listSize;
    }

    public void set(int element) {
        for (int secondIndex = 0; secondIndex < listHolder.length; secondIndex++) {
            listHolder[secondIndex] = element;
        }
        listSize++;
    }

    public int getSet_Element() {
        return listSize;
    }
}
