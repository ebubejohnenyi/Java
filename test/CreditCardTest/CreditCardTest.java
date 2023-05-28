package CreditCardTest;

import CreditCard.CreditCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTest {
    CreditCard creditCard = new CreditCard();
    @Test public void check_CardDetails(){
        creditCard.checkDetails("4388576018410707");
        assertEquals("4388576018410707", creditCard.getCardNumber());
    }
    @Test public void checkFor_visaCard(){
        creditCard.isVisa_Card("4388576018410707");
        assertEquals("4", creditCard.get_VisaCard());
    }
    @Test public void checkFor_masterCard(){
        creditCard.isMaster_Card("5388576018410707");
        assertEquals("5", creditCard.get_MasterCard());
    }
    @Test public void checkFor_DiscoverCard(){
        creditCard.isDiscover_Card("6388576018410707");
        assertEquals("6", creditCard.get_DiscoverCard());
    }
    @Test public void checkFor_americanExpressCard(){
        creditCard.isAmerican_ExpressCard("3788576018410707");
        assertEquals("37", creditCard.get_AmericanCard());
    }
    @Test public void checkUser_creditCardLength(){
        creditCard.checkCard_Length("378857601845675574");
        assertEquals(0, creditCard.getLength());
    }
    @Test public void double_EverySecondDigit(){
        creditCard.double_SecondDigit("3788576018410707");
        String expected = "38561400";
        assertEquals(expected, creditCard.getDouble_SecondDigit());
    }
}
