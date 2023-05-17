package PlayGround;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(23);
        numbers.add(90);
        numbers.add(546);
        numbers.add(67);
        Collections.sort(numbers);
        System.out.println( "Sorted list is: "+ numbers);
    }
}
