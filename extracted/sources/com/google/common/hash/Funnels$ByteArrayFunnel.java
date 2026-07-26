package com.google.common.hash;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Funnels$ByteArrayFunnel implements Funnel<byte[]> {
    public static final /* synthetic */ Funnels$ByteArrayFunnel[] a = {new Funnels$ByteArrayFunnel("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Funnels$ByteArrayFunnel EF5;

    public static Funnels$ByteArrayFunnel valueOf(String str) {
        return (Funnels$ByteArrayFunnel) Enum.valueOf(Funnels$ByteArrayFunnel.class, str);
    }

    public static Funnels$ByteArrayFunnel[] values() {
        return (Funnels$ByteArrayFunnel[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Funnels.byteArrayFunnel()";
    }
}
