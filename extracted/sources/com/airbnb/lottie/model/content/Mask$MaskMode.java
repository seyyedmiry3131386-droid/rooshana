package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Mask$MaskMode {
    public static final Mask$MaskMode a;
    public static final Mask$MaskMode b;
    public static final Mask$MaskMode c;
    public static final Mask$MaskMode d;
    public static final /* synthetic */ Mask$MaskMode[] e;

    static {
        Mask$MaskMode mask$MaskMode = new Mask$MaskMode("MASK_MODE_ADD", 0);
        a = mask$MaskMode;
        Mask$MaskMode mask$MaskMode2 = new Mask$MaskMode("MASK_MODE_SUBTRACT", 1);
        b = mask$MaskMode2;
        Mask$MaskMode mask$MaskMode3 = new Mask$MaskMode("MASK_MODE_INTERSECT", 2);
        c = mask$MaskMode3;
        Mask$MaskMode mask$MaskMode4 = new Mask$MaskMode("MASK_MODE_NONE", 3);
        d = mask$MaskMode4;
        e = new Mask$MaskMode[]{mask$MaskMode, mask$MaskMode2, mask$MaskMode3, mask$MaskMode4};
    }

    public static Mask$MaskMode valueOf(String str) {
        return (Mask$MaskMode) Enum.valueOf(Mask$MaskMode.class, str);
    }

    public static Mask$MaskMode[] values() {
        return (Mask$MaskMode[]) e.clone();
    }
}
