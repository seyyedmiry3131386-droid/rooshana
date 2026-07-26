package com.google.common.hash;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Funnels$LongFunnel implements Funnel<Long> {
    public static final /* synthetic */ Funnels$LongFunnel[] a = {new Funnels$LongFunnel("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Funnels$LongFunnel EF5;

    public static Funnels$LongFunnel valueOf(String str) {
        return (Funnels$LongFunnel) Enum.valueOf(Funnels$LongFunnel.class, str);
    }

    public static Funnels$LongFunnel[] values() {
        return (Funnels$LongFunnel[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Funnels.longFunnel()";
    }
}
