package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Writer$FieldOrder {
    public static final /* synthetic */ Writer$FieldOrder[] a = {new Writer$FieldOrder("ASCENDING", 0), new Writer$FieldOrder("DESCENDING", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Writer$FieldOrder EF5;

    public static Writer$FieldOrder valueOf(String str) {
        return (Writer$FieldOrder) java.lang.Enum.valueOf(Writer$FieldOrder.class, str);
    }

    public static Writer$FieldOrder[] values() {
        return (Writer$FieldOrder[]) a.clone();
    }
}
