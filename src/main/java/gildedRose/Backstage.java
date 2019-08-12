package gildedRose;

public class Backstage implements ItemStrategy {
    @Override
    public void update(Item item) {
        int quality = item.quality;
        int sellIn = item.sellIn;
        if (quality < 50) {
            quality = quality + 1;
            if (sellIn < 11) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (sellIn < 6) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            quality = quality - quality;
        }
        item.quality = quality;
        item.sellIn = sellIn;

    }
}
