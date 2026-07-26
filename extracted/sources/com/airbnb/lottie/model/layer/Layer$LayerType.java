package com.airbnb.lottie.model.layer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Layer$LayerType {
    public static final Layer$LayerType a;
    public static final Layer$LayerType b;
    public static final Layer$LayerType c;
    public static final /* synthetic */ Layer$LayerType[] d;

    static {
        Layer$LayerType layer$LayerType = new Layer$LayerType("PRE_COMP", 0);
        a = layer$LayerType;
        Layer$LayerType layer$LayerType2 = new Layer$LayerType("SOLID", 1);
        Layer$LayerType layer$LayerType3 = new Layer$LayerType("IMAGE", 2);
        b = layer$LayerType3;
        Layer$LayerType layer$LayerType4 = new Layer$LayerType("NULL", 3);
        Layer$LayerType layer$LayerType5 = new Layer$LayerType("SHAPE", 4);
        Layer$LayerType layer$LayerType6 = new Layer$LayerType("TEXT", 5);
        Layer$LayerType layer$LayerType7 = new Layer$LayerType("UNKNOWN", 6);
        c = layer$LayerType7;
        d = new Layer$LayerType[]{layer$LayerType, layer$LayerType2, layer$LayerType3, layer$LayerType4, layer$LayerType5, layer$LayerType6, layer$LayerType7};
    }

    public static Layer$LayerType valueOf(String str) {
        return (Layer$LayerType) Enum.valueOf(Layer$LayerType.class, str);
    }

    public static Layer$LayerType[] values() {
        return (Layer$LayerType[]) d.clone();
    }
}
