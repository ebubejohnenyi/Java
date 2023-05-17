package ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    PetrolPurchase fillingStation = new PetrolPurchase();
    @Test
    public void doesPetrolPurchaseExist(){
        assertNotNull(fillingStation);
    }
    @Test
    public void purchaseAmount(){
        fillingStation.purchaseAmount(2,210.10, 0.05);
        assertEquals(420.15, fillingStation.getPurchaseAmount());
    }
}
