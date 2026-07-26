package com.google.common.cache;

import defpackage.od9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class CacheBuilder$OneWeigher implements od9 {
    public static final CacheBuilder$OneWeigher a;
    public static final /* synthetic */ CacheBuilder$OneWeigher[] b;

    static {
        CacheBuilder$OneWeigher cacheBuilder$OneWeigher = new CacheBuilder$OneWeigher("INSTANCE", 0);
        a = cacheBuilder$OneWeigher;
        b = new CacheBuilder$OneWeigher[]{cacheBuilder$OneWeigher};
    }

    public static CacheBuilder$OneWeigher valueOf(String str) {
        return (CacheBuilder$OneWeigher) Enum.valueOf(CacheBuilder$OneWeigher.class, str);
    }

    public static CacheBuilder$OneWeigher[] values() {
        return (CacheBuilder$OneWeigher[]) b.clone();
    }
}
