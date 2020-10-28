package week_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question_4_MailPrices_Test {
    
    @Test(timeout=3000)
    public void testCalculateStampPrice() {

        assertEquals("Rectangular, flat letters should cost 49c", 49, Question_4_Mail_Prices.calculateStampPrice(true, true));
        assertEquals("Rectangular, bumpy letters should cost 70c", 70, Question_4_Mail_Prices.calculateStampPrice(true, false));
        assertEquals("Non-rectangular, flat letters should cost 70c", 70, Question_4_Mail_Prices.calculateStampPrice(false, true));
        assertEquals("Non-rectangular, bumpy, letters should cost 70c", 70, Question_4_Mail_Prices.calculateStampPrice(false, false));

    }
    
   
}