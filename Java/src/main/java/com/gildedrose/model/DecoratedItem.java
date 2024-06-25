package com.gildedrose.model;

import com.gildedrose.Item;

public abstract class DecoratedItem extends Item implements ItemDecoration {
    Item item;

    public DecoratedItem(Item item) {
        super(item.name, item.sellIn, item.quality);
        this.item = item;
    }

    @Override
    public void process() {
        System.out.println("Override me!");
    }
}
