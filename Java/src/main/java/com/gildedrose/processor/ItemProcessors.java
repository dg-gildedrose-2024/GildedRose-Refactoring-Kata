package com.gildedrose.processor;

import com.gildedrose.Item;

public class ItemProcessors {
    private final Item item;

    public ItemProcessors(Item item) {
        this.item = item;
    }

    public ItemProcessors decrementSellInByOne() {
        item.sellIn--;
        return this;
    }

    public ItemProcessors decrementQualityByValue(int quality) {
        item.quality -= quality;
        return this;
    }

    public ItemProcessors ifSellInIsLowerThanValueThenAlterQuality(int sellInLowerBoundary, int qualtityTransformation) {
        if (item.sellIn < sellInLowerBoundary) {
            item.quality += qualtityTransformation;
        }
        return this;
    }

    public ItemProcessors ifSellInIsLowerThanZeroThenSetQualityToZero() {
        if (item.sellIn < 0) {
            item.quality = 0;
        }
        return this;
    }

    public ItemProcessors ifQualityIsLessThanValueThenAlterQuality(int qualityUpperBoundary, int qualtityTransformation) {
        if (item.quality < qualityUpperBoundary) {
            item.quality += qualtityTransformation;
        }
        return this;
    }

    public ItemProcessors ifQualityIsLessThanZeroThenSetQualityToZero() {
        if (item.quality < 0) {
            item.quality = 0;
        }
        return this;
    }

    public ItemProcessors ifSellInIsLowerThanValueAndAndQualityLessThanFiftyThenIncrementQuality(int sellInLowerBoundary) {
        if (item.sellIn < sellInLowerBoundary && item.quality < 50) {
            item.quality++;
        }
        return this;
    }
}
