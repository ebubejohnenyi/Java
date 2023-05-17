package ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarApplicationTest{
    Car bmw = new Car("BMW X3", "2021", 20_000);
    Car benz = new Car("Mercedes Benz", "2020", 30_000);
@Test
    public void calculateForBmwDiscount(){
    bmw.calculateForBmwDiscount(0.05);
    assertEquals(1000, bmw.getBmwDiscount());
}
@Test
    public void bmwPrice(){
    // Given i have the car and the price is 20,000
    assertEquals(20000, bmw.getActualPrice());
    // When discount is 5% (0.05) of 20,000 = 1000
    bmw.calculateForBmwDiscount(0.05);
    // Assert my car price is now 19,000
    assertEquals(19000,bmw.getActualPrice());
}
@Test
    public void calculateForMercedesDiscount(){
    benz.calculateForBenzDiscount(0.07);
    assertEquals(2100, benz.getBenzDiscount());
}

@Test
    public void mercedesBenzPrice(){
    // Given i have benz and the price is 30,000
    assertEquals(30000, benz.getActualPrice());
    // When 7% (0.07) is applied to the price of the benz
    benz.calculateForBenzDiscount(0.07);
    // Assert the discount price to the Benz Price
    assertEquals(27900, benz.getActualPrice());
}

}