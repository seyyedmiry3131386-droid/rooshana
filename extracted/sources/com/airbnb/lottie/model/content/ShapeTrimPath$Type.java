package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ShapeTrimPath$Type {
    public static final ShapeTrimPath$Type a;
    public static final ShapeTrimPath$Type b;
    public static final /* synthetic */ ShapeTrimPath$Type[] c;

    static {
        ShapeTrimPath$Type shapeTrimPath$Type = new ShapeTrimPath$Type("SIMULTANEOUSLY", 0);
        a = shapeTrimPath$Type;
        ShapeTrimPath$Type shapeTrimPath$Type2 = new ShapeTrimPath$Type("INDIVIDUALLY", 1);
        b = shapeTrimPath$Type2;
        c = new ShapeTrimPath$Type[]{shapeTrimPath$Type, shapeTrimPath$Type2};
    }

    public static ShapeTrimPath$Type valueOf(String str) {
        return (ShapeTrimPath$Type) Enum.valueOf(ShapeTrimPath$Type.class, str);
    }

    public static ShapeTrimPath$Type[] values() {
        return (ShapeTrimPath$Type[]) c.clone();
    }
}
