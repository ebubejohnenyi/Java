package GeoPoliticalZone;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NigeriaTest {
    Nigeria[] geoPoliticalZone = Nigeria.values();
    @Test public void state(){
        for (Nigeria state: geoPoliticalZone){
            System.out.println(state + " " + Arrays.toString(state.getState()));
        }
    }

}