package com.google.common.cache;

import defpackage.r37;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class CacheBuilder$NullListener implements r37 {
    public static final CacheBuilder$NullListener a;
    public static final /* synthetic */ CacheBuilder$NullListener[] b;

    static {
        CacheBuilder$NullListener cacheBuilder$NullListener = new CacheBuilder$NullListener("INSTANCE", 0);
        a = cacheBuilder$NullListener;
        b = new CacheBuilder$NullListener[]{cacheBuilder$NullListener};
    }

    public static CacheBuilder$NullListener valueOf(String str) {
        return (CacheBuilder$NullListener) Enum.valueOf(CacheBuilder$NullListener.class, str);
    }

    public static CacheBuilder$NullListener[] values() {
        return (CacheBuilder$NullListener[]) b.clone();
    }
}
