package gildedRose;

import org.junit.Test;

import static java.util.Collections.singletonList;
import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_0_when_call_updateQuality_given_normal_item_sellin_10_quality_0() {
        Item item = new Item("normal", 10, 0);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(0, item.getQuality());
        assertEquals(9, item.getSellIn());
    }

    @Test
    public void should_return_19_when_call_updateQuality_given_normal_item_sellin_10_quality_20() {
        Item item = new Item("normal", 10, 20);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(19, item.getQuality());
        assertEquals(9, item.getSellIn());
    }


    @Test
    public void should_return_18_when_call_updateQuality_given_normal_item_sellin_0_quality_20() {
        Item item = new Item("normal", 0, 20);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(18, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }
}