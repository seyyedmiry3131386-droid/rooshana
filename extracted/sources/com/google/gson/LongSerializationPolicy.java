package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class LongSerializationPolicy {
    public static final /* synthetic */ LongSerializationPolicy[] a = {new LongSerializationPolicy() { // from class: com.google.gson.LongSerializationPolicy.1
    }, new LongSerializationPolicy() { // from class: com.google.gson.LongSerializationPolicy.2
    }};

    /* JADX INFO: Fake field, exist only in values array */
    LongSerializationPolicy EF2;

    public static LongSerializationPolicy valueOf(String str) {
        return (LongSerializationPolicy) Enum.valueOf(LongSerializationPolicy.class, str);
    }

    public static LongSerializationPolicy[] values() {
        return (LongSerializationPolicy[]) a.clone();
    }
}
