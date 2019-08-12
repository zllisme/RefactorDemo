package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case "Aged Brie" :
                    agedBrieUpdate(items[i]);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert" :
                    backstageUpdate(items[i]);
                    break;
                case "Sulfuras, Hand of Ragnaros" :
                    sulfurasUpdate(items[i]);
                    break;
                default:
                    normalUpdate(items[i]);
            }
        }
    }

    public void normalUpdate(Item item) {
        int quality = item.quality;
        if(quality > 0) {
            item.quality = item.quality - 1;
        }
        item.sellIn = item.sellIn - 1;
        if(item.sellIn < 0) {
            if(quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }

    public void agedBrieUpdate(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }

        }
    }
    public void backstageUpdate(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }

            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality;
        }
    }

    public void sulfurasUpdate(Item item) {

    }
}