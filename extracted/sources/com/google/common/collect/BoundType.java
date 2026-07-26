package com.google.common.collect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class BoundType {
    public static final BoundType a;
    public static final BoundType b;
    public static final /* synthetic */ BoundType[] c;

    static {
        BoundType boundType = new BoundType("OPEN", 0);
        a = boundType;
        BoundType boundType2 = new BoundType("CLOSED", 1);
        b = boundType2;
        c = new BoundType[]{boundType, boundType2};
    }

    public static BoundType a(boolean z) {
        return z ? b : a;
    }

    public static BoundType valueOf(String str) {
        return (BoundType) Enum.valueOf(BoundType.class, str);
    }

    public static BoundType[] values() {
        return (BoundType[]) c.clone();
    }
}
