package Estore;

import EStore.CheckOut;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOutTest {
    CheckOut checkOut;
    @BeforeEach void setTest(){
        checkOut = new CheckOut();
    }
    @Test public void store(){
        checkOut.store("Rice", 2,2000);
        assertEquals(1,checkOut.getAddedProduct());
    }
    @Test public void subTotal(){
        checkOut.store("Rice",2,2000);
        checkOut.store("Beans",5,200);
        assertEquals(5000, checkOut.subTotal());
    }
    @Test public void discount(){
        checkOut.store("Rice",2,2000);
        checkOut.store("Beans",5,200);
        assertEquals(350, checkOut.discount(7));
    }
    @Test public void vat(){
        checkOut.store("Rice",2,2000);
        checkOut.store("Beans",5,200);
        assertEquals(875, checkOut.vat());
    }
    @Test public void billTotal(){
        checkOut.store("Rice",2,2000);
        checkOut.store("Beans",5,200);
        assertEquals(5525, checkOut.bill_Total());
    }
    @Test public void balance(){
        checkOut.store("Rice",2,2000);
        checkOut.store("Beans",5,200);
        checkOut.balance(2000);
    }
}
