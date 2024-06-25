package com.gildedrose;

import com.gildedrose.model.*;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            DecoratedItem decoratedItem = switch (item.name.toUpperCase()) {
                case String s when s.startsWith("AGED BRIE") -> new ItemAgedBrie(item);
                case String s when s.startsWith("SULFURAS") -> new ItemSulfuras(item);
                case String s when s.startsWith("BACKSTAGE PASSES") -> new ItemBackstagePasses(item);
                case String s when s.startsWith("CONJURED") -> new ItemConjured(item);
                default -> new ItemNormal(item);
            };

            decoratedItem.process();
        }
    }
}
