package com.google.common.graph;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ElementOrder$Type {
    public static final /* synthetic */ ElementOrder$Type[] a = {new ElementOrder$Type("UNORDERED", 0), new ElementOrder$Type("STABLE", 1), new ElementOrder$Type("INSERTION", 2), new ElementOrder$Type("SORTED", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ElementOrder$Type EF5;

    public static ElementOrder$Type valueOf(String str) {
        return (ElementOrder$Type) Enum.valueOf(ElementOrder$Type.class, str);
    }

    public static ElementOrder$Type[] values() {
        return (ElementOrder$Type[]) a.clone();
    }
}
