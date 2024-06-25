package com.gildedrose.model;

import com.gildedrose.Item;
import com.gildedrose.processor.ItemProcessors;

public class ItemAgedBrie extends DecoratedItem {
    public ItemAgedBrie(Item item) {
        super(item);
    }

    @Override
    public void process() {
        new ItemProcessors(item)
            .ifQualityIsLessThanValueThenAlterQuality(50, 1)
            .decrementSellInByOne()
            .ifSellInIsLowerThanValueAndAndQualityLessThanFiftyThenIncrementQuality(0);
    }
}
