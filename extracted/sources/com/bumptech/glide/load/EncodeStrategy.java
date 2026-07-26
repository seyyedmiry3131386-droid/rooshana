package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeStrategy {
    public static final EncodeStrategy a;
    public static final EncodeStrategy b;
    public static final EncodeStrategy c;
    public static final /* synthetic */ EncodeStrategy[] d;

    static {
        EncodeStrategy encodeStrategy = new EncodeStrategy("SOURCE", 0);
        a = encodeStrategy;
        EncodeStrategy encodeStrategy2 = new EncodeStrategy("TRANSFORMED", 1);
        b = encodeStrategy2;
        EncodeStrategy encodeStrategy3 = new EncodeStrategy("NONE", 2);
        c = encodeStrategy3;
        d = new EncodeStrategy[]{encodeStrategy, encodeStrategy2, encodeStrategy3};
    }

    public static EncodeStrategy valueOf(String str) {
        return (EncodeStrategy) Enum.valueOf(EncodeStrategy.class, str);
    }

    public static EncodeStrategy[] values() {
        return (EncodeStrategy[]) d.clone();
    }
}
