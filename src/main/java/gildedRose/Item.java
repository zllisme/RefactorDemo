package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public ItemStrategy itemStrategy;

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
                itemStrategy = new AgedBrie();
                break;
            case "Backstage passes to a TAFKAL80ETC concert" :
                itemStrategy = new Backstage();
                break;
            case "Sulfuras, Hand of Ragnaros" :
                itemStrategy = new Sulfuras();
                break;
            default:
                itemStrategy = new NormalItem();
        }
        itemStrategy.update(this);
    }

}
