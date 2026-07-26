package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class LBlendMode {
    public static final LBlendMode a;
    public static final LBlendMode b;
    public static final /* synthetic */ LBlendMode[] c;

    static {
        LBlendMode lBlendMode = new LBlendMode("NORMAL", 0);
        a = lBlendMode;
        LBlendMode lBlendMode2 = new LBlendMode("MULTIPLY", 1);
        b = lBlendMode2;
        c = new LBlendMode[]{lBlendMode, lBlendMode2, new LBlendMode("SCREEN", 2), new LBlendMode("OVERLAY", 3), new LBlendMode("DARKEN", 4), new LBlendMode("LIGHTEN", 5), new LBlendMode("COLOR_DODGE", 6), new LBlendMode("COLOR_BURN", 7), new LBlendMode("HARD_LIGHT", 8), new LBlendMode("SOFT_LIGHT", 9), new LBlendMode("DIFFERENCE", 10), new LBlendMode("EXCLUSION", 11), new LBlendMode("HUE", 12), new LBlendMode("SATURATION", 13), new LBlendMode("COLOR", 14), new LBlendMode("LUMINOSITY", 15), new LBlendMode("ADD", 16), new LBlendMode("HARD_MIX", 17)};
    }

    public static LBlendMode valueOf(String str) {
        return (LBlendMode) Enum.valueOf(LBlendMode.class, str);
    }

    public static LBlendMode[] values() {
        return (LBlendMode[]) c.clone();
    }
}
