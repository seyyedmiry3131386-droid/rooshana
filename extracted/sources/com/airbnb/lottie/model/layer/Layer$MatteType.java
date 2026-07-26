package com.airbnb.lottie.model.layer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Layer$MatteType {
    public static final Layer$MatteType a;
    public static final Layer$MatteType b;
    public static final /* synthetic */ Layer$MatteType[] c;

    static {
        Layer$MatteType layer$MatteType = new Layer$MatteType("NONE", 0);
        a = layer$MatteType;
        Layer$MatteType layer$MatteType2 = new Layer$MatteType("ADD", 1);
        Layer$MatteType layer$MatteType3 = new Layer$MatteType("INVERT", 2);
        b = layer$MatteType3;
        c = new Layer$MatteType[]{layer$MatteType, layer$MatteType2, layer$MatteType3, new Layer$MatteType("LUMA", 3), new Layer$MatteType("LUMA_INVERTED", 4), new Layer$MatteType("UNKNOWN", 5)};
    }

    public static Layer$MatteType valueOf(String str) {
        return (Layer$MatteType) Enum.valueOf(Layer$MatteType.class, str);
    }

    public static Layer$MatteType[] values() {
        return (Layer$MatteType[]) c.clone();
    }
}
