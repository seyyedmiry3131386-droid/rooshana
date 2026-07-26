package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ShapeStroke$LineJoinType {
    public static final ShapeStroke$LineJoinType a;
    public static final /* synthetic */ ShapeStroke$LineJoinType[] b;

    static {
        ShapeStroke$LineJoinType shapeStroke$LineJoinType = new ShapeStroke$LineJoinType("MITER", 0);
        a = shapeStroke$LineJoinType;
        b = new ShapeStroke$LineJoinType[]{shapeStroke$LineJoinType, new ShapeStroke$LineJoinType("ROUND", 1), new ShapeStroke$LineJoinType("BEVEL", 2)};
    }

    public static ShapeStroke$LineJoinType valueOf(String str) {
        return (ShapeStroke$LineJoinType) Enum.valueOf(ShapeStroke$LineJoinType.class, str);
    }

    public static ShapeStroke$LineJoinType[] values() {
        return (ShapeStroke$LineJoinType[]) b.clone();
    }
}
