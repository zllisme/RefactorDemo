package gildedRose;

public class ItemStrategyFactory {
    static ItemStrategy createItemStrategy(String name) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrie();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new Backstage();
            case "Sulfuras, Hand of Ragnaros":
                return  new Sulfuras();
            case  "Conjured":
                return new Conjured();
            default:
                return new NormalItem();
        }
    }
}
