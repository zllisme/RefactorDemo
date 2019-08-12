package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void updateQuality() {
        switch (name) {
            case "Aged Brie" :
                agedBrieUpdate();
                break;
            case "Backstage passes to a TAFKAL80ETC concert" :
                backstageUpdate();
                break;
            case "Sulfuras, Hand of Ragnaros" :
                sulfurasUpdate();
                break;
            default:
                normalUpdate();
        }
    }

    public void normalUpdate() {
        if(quality > 0) {
            quality = quality - 1;
        }
        sellIn = sellIn - 1;
        if(sellIn < 0) {
            if(quality > 0) {
                quality = quality - 1;
            }
        }
    }

    public void agedBrieUpdate() {
        if (quality < 50) {
            quality = quality + 1;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            if (quality < 50) {
                quality = quality + 1;
            }

        }
    }
    public void backstageUpdate() {
        if (quality < 50) {
            quality = quality + 1;
            if (sellIn < 11) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (this.sellIn < 6) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            quality = quality - quality;
        }
    }

    public void sulfurasUpdate() {

    }
}
