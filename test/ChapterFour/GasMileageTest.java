package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMileageTest {
    GasMileage milesPerGallon = new GasMileage(23,2);
    @Test
    public void milesTrip(){
        milesPerGallon.milesTrip(23);
        assertEquals(23, milesPerGallon.getMilesTrip());
    }
    @Test
    public void gallonUsed(){
        milesPerGallon.gallonTrip(2);
        assertEquals(2, milesPerGallon.getGallonUsed());
    }
    @Test
    public void milesPerGallon(){
        milesPerGallon.milesPerGallonTrip(23,2);
        assertEquals(11.5, milesPerGallon.getCombineTotal());
    }
}
