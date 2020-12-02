package sample;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ShoppingCartCalculateDiscount {
    private Item item;
    private int expectedDiscount;
    private static Faker faker = new Faker();

    public ShoppingCartCalculateDiscount(Item item, int expectedDiscount) {
        this.item = item;
        this.expectedDiscount = expectedDiscount;
    }
    @Parameterized.Parameters
    public static Collection items() {
        return Arrays.asList(new Object[][] {
                { new Item(faker.lorem().characters(), 20.0, 5, Item.ItemType.NEW), 0 },
                { new Item(faker.lorem().characters(), 20.0, 10,Item.ItemType.REGULAR), 0 },
                { new Item(faker.lorem().characters(), 20.0, 5, Item.ItemType.SECOND_FREE), 55 },
                { new Item(faker.lorem().characters(), 20.0, 5, Item.ItemType.SALE),  77 },
        });
    }
    @Test
    public void shouldCalculateCorrectDiscount() {
        int receivedDiscount = ShoppingCart.calculateDiscount(this.item, this.expectedDiscount);
        assertEquals(this.expectedDiscount, receivedDiscount);
    }
}