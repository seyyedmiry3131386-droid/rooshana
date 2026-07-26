package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ReflectionAccessFilter$FilterResult {
    public static final /* synthetic */ ReflectionAccessFilter$FilterResult[] a = {new ReflectionAccessFilter$FilterResult("ALLOW", 0), new ReflectionAccessFilter$FilterResult("INDECISIVE", 1), new ReflectionAccessFilter$FilterResult("BLOCK_INACCESSIBLE", 2), new ReflectionAccessFilter$FilterResult("BLOCK_ALL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ReflectionAccessFilter$FilterResult EF5;

    public static ReflectionAccessFilter$FilterResult valueOf(String str) {
        return (ReflectionAccessFilter$FilterResult) Enum.valueOf(ReflectionAccessFilter$FilterResult.class, str);
    }

    public static ReflectionAccessFilter$FilterResult[] values() {
        return (ReflectionAccessFilter$FilterResult[]) a.clone();
    }
}
