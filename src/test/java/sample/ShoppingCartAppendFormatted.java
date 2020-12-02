package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Stolyar Mykola
 */

public class ShoppingCartAppendFormatted {

    /**
     * Test ShoppingCartAppendFormatted of appendFormatted method, of class ShoppingCart.
     */
    @Test
    public void testAppendFormatted() {
        StringBuilder sb;
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "123451", -1, 5);
        assertEquals(sb.toString(), "12345 ");
    }
}