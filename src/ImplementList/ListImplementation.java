package ImplementList;

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
        for (int startingLoop = 0; startingLoop < listHolder.length; startingLoop++) {
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

//    public void allList(int element) {
//        for (int index = 0; index < listHolder.length; index++) {
//            listHolder[index] = element;
//        }
//    }
//    public int getAllList() {
//        return listSize;
//    }
//
//    public void clearAll_Element(int element) {
//        for (int index = 0; index < listHolder.length; index++) {
//            listHolder[index] = element;
//            listSize--;
//        }
//    }
//
//    public int elementCleared() {
//        return listSize;
//    }
//
//    public void set(int element) {
//        for (int secondIndex = 0; secondIndex < listHolder.length; secondIndex++) {
//            listHolder[secondIndex] = element;
//        }
//        listSize++;
//    }
//
//    public int getSet_Element() {
//        return listSize;
//    }
////
//    public int getElement(int index) {
//       return listHolder[index];
//    }
//
//    public int indexOf(int element) {
//        for (int index = 0; index < listHolder.length; index++) {
//            if(element == listHolder[index]){
//                return element;
//            }
//        }
//        return -1;
//    }
//
//    public int equals(int element) {
//        for (int index = 0; index < listHolder.length; index++) {
//            if(listHolder[index] == element){
//                return index;
//            }
//        }
//        return -1;
//    }
}
