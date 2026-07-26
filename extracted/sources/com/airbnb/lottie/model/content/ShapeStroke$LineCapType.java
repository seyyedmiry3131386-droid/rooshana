package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ShapeStroke$LineCapType {
    public static final ShapeStroke$LineCapType a;
    public static final /* synthetic */ ShapeStroke$LineCapType[] b;

    static {
        ShapeStroke$LineCapType shapeStroke$LineCapType = new ShapeStroke$LineCapType("BUTT", 0);
        a = shapeStroke$LineCapType;
        b = new ShapeStroke$LineCapType[]{shapeStroke$LineCapType, new ShapeStroke$LineCapType("ROUND", 1), new ShapeStroke$LineCapType("UNKNOWN", 2)};
    }

    public static ShapeStroke$LineCapType valueOf(String str) {
        return (ShapeStroke$LineCapType) Enum.valueOf(ShapeStroke$LineCapType.class, str);
    }

    public static ShapeStroke$LineCapType[] values() {
        return (ShapeStroke$LineCapType[]) b.clone();
    }
}
