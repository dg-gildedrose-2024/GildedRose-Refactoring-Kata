package com.gildedrose.model;

import com.gildedrose.Item;
import com.gildedrose.processor.ItemProcessors;

public class ItemConjured extends DecoratedItem {
    public ItemConjured(Item item) {
        super(item);
    }

    @Override
    public void process() {
        new ItemProcessors(item)
            .decrementQualityByValue(2)
            .decrementSellInByOne()
            .ifSellInIsLowerThanValueThenAlterQuality(0, -2)
            .ifQualityIsLessThanZeroThenSetQualityToZero();
    }
}
