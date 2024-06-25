package com.gildedrose.model;

import com.gildedrose.Item;
import com.gildedrose.processor.ItemProcessors;

public class ItemNormal extends DecoratedItem {
    public ItemNormal(Item item) {
        super(item);
    }

    @Override
    public void process() {
        new ItemProcessors(item)
            .decrementQualityByValue(1)
            .decrementSellInByOne()
            .ifSellInIsLowerThanValueThenAlterQuality(0, -1)
            .ifQualityIsLessThanZeroThenSetQualityToZero();
    }
}
