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

    @Test
    public void should_return_80_given_a_Sulfuras_item_its_sellIn_is_0_quality_is_80() throws Exception {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, item.getQuality());
        assertEquals(0, item.getSellIn());
    }

    @Test
    public void should_return_21_given_a_Backstage_Passes_item_its_sellIn_is_15_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(21, item.getQuality());
        assertEquals(14, item.getSellIn());
    }

    @Test
    public void should_return_50_given_a_Backstage_Passes_item_its_sellIn_is_15_quality_is_50() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, item.getQuality());
        assertEquals(14, item.getSellIn());
    }

    @Test
    public void should_return_23_given_a_Backstage_Passes_item_its_sellIn_is_5_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(23, item.getQuality());
        assertEquals(4, item.getSellIn());
    }

    @Test
    public void should_return_50_given_a_Backstage_Passes_item_its_sellIn_is_5_quality_is_49() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 2, 49);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, item.getQuality());
        assertEquals(1, item.getSellIn());
    }


    @Test
    public void should_return_22_given_a_Backstage_Passes_item_its_sellIn_is_10_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(22, item.getQuality());
        assertEquals(9, item.getSellIn());
    }

    @Test
    public void should_return_0_given_a_Backstage_Passes_item_its_sellIn_is_0_quality_is_20() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }

    @Test
    public void should_return_50_given_a_Backstage_Passes_item_its_sellIn_is_2_quality_is_60() throws Exception {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 2, 60);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(60, item.getQuality());
        assertEquals(1, item.getSellIn());
    }

    @Test
    public void should_return_5_given_a_Conjured_item_its_sellIn_is_3_quality_is_6() throws Exception {
        Item item = new Item("Conjured Mana Cake", 3, 6);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, item.getQuality());
        assertEquals(2, item.getSellIn());
    }

    @Test
    public void should_return_4_given_a_Conjured_item_its_sellIn_is_0_quality_is_6() throws Exception {
        Item item = new Item("Conjured Mana Cake", 0, 6);
        Item[] items = new Item[] { item };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }


}