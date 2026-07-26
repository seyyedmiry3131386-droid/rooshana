package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TextRangeUnits {
    public static final TextRangeUnits a;
    public static final TextRangeUnits b;
    public static final /* synthetic */ TextRangeUnits[] c;

    static {
        TextRangeUnits textRangeUnits = new TextRangeUnits("PERCENT", 0);
        a = textRangeUnits;
        TextRangeUnits textRangeUnits2 = new TextRangeUnits("INDEX", 1);
        b = textRangeUnits2;
        c = new TextRangeUnits[]{textRangeUnits, textRangeUnits2};
    }

    public static TextRangeUnits valueOf(String str) {
        return (TextRangeUnits) Enum.valueOf(TextRangeUnits.class, str);
    }

    public static TextRangeUnits[] values() {
        return (TextRangeUnits[]) c.clone();
    }
}
