package Set_And_Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetAndQueue {
private boolean isEmpty = true;
private String resize = null;
private String [] arrayHolder = new String[5];
    public boolean isEmpty() {
        return isEmpty;
    }

    public void set(int index, String element) {
        for (int count = 0; count < arrayHolder.length; count++) {
            arrayHolder[index] = element;
        }
    }
    public String getSet() {
        return Arrays.toString(arrayHolder);
    }

    public void remove(int index) {
        for (int count = 0; count < arrayHolder.length; count++) {
            if(count == index){
                arrayHolder[index] = resize;
            }
        }
    }
    String [] newArray = new String[arrayHolder.length];
    public void queue(int index) {
        for (int count= 0; count < arrayHolder.length; count++) {
            if(count == index){
                remove(index);
            }
        }
        for (int secondIndex = 0; secondIndex < newArray.length; secondIndex++) {
            newArray[secondIndex] = arrayHolder[secondIndex];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
