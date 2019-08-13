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
        createItemStrategyByName(name);
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

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void updateQuality() {
        itemStrategy.update(this);
    }

    public void createItemStrategyByName(String name) {
        itemStrategy = ItemStrategyFactory.createItemStrategy(name);
    }

}
