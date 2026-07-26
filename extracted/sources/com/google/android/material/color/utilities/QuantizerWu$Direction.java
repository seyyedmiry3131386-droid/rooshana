package com.google.android.material.color.utilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class QuantizerWu$Direction {
    public static final /* synthetic */ QuantizerWu$Direction[] a = {new QuantizerWu$Direction("RED", 0), new QuantizerWu$Direction("GREEN", 1), new QuantizerWu$Direction("BLUE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    QuantizerWu$Direction EF5;

    public static QuantizerWu$Direction valueOf(String str) {
        return (QuantizerWu$Direction) Enum.valueOf(QuantizerWu$Direction.class, str);
    }

    public static QuantizerWu$Direction[] values() {
        return (QuantizerWu$Direction[]) a.clone();
    }
}
