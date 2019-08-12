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

    @Test
    public void should_return_1_given_an_Aged_Brie_item_its_sellIn_is_2_quality_is_0() throws Exception {
        Item item = new Item("Aged Brie", 2, 0);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, item.getQuality());
        assertEquals(1, item.getSellIn());
    }

    @Test
    public void should_return_50_given_an_Aged_Brie_item_its_sellIn_is_2_quality_is_50() throws Exception {
        Item item = new Item("Aged Brie", 2, 50);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, item.getQuality());
        assertEquals(1, item.getSellIn());
    }
}