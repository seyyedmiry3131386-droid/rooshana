package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class GradientType {
    public static final GradientType a;
    public static final GradientType b;
    public static final /* synthetic */ GradientType[] c;

    static {
        GradientType gradientType = new GradientType("LINEAR", 0);
        a = gradientType;
        GradientType gradientType2 = new GradientType("RADIAL", 1);
        b = gradientType2;
        c = new GradientType[]{gradientType, gradientType2};
    }

    public static GradientType valueOf(String str) {
        return (GradientType) Enum.valueOf(GradientType.class, str);
    }

    public static GradientType[] values() {
        return (GradientType[]) c.clone();
    }
}
