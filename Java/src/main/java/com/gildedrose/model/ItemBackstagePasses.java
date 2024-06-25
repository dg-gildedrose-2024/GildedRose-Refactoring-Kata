package com.gildedrose.model;

import com.gildedrose.Item;
import com.gildedrose.processor.ItemProcessors;

public class ItemBackstagePasses extends DecoratedItem {
    public ItemBackstagePasses(Item item) {
        super(item);
    }

    @Override
    public void process() {
        new ItemProcessors(item)
            .ifQualityIsLessThanValueThenAlterQuality(50, 1)
            .ifSellInIsLowerThanValueAndAndQualityLessThanFiftyThenIncrementQuality(11)
            .ifSellInIsLowerThanValueAndAndQualityLessThanFiftyThenIncrementQuality(6)
            .decrementSellInByOne()
            .ifSellInIsLowerThanZeroThenSetQualityToZero()
        ;
    }
}
