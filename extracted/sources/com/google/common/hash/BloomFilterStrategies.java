package com.google.common.hash;

import com.google.common.hash.BloomFilter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class BloomFilterStrategies implements BloomFilter.Strategy {
    public static final /* synthetic */ BloomFilterStrategies[] a = {new BloomFilterStrategies() { // from class: com.google.common.hash.BloomFilterStrategies.1
    }, new BloomFilterStrategies() { // from class: com.google.common.hash.BloomFilterStrategies.2
    }};

    /* JADX INFO: Fake field, exist only in values array */
    BloomFilterStrategies EF2;

    public static BloomFilterStrategies valueOf(String str) {
        return (BloomFilterStrategies) Enum.valueOf(BloomFilterStrategies.class, str);
    }

    public static BloomFilterStrategies[] values() {
        return (BloomFilterStrategies[]) a.clone();
    }
}
