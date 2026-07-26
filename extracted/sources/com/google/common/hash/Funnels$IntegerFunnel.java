package com.google.common.hash;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Funnels$IntegerFunnel implements Funnel<Integer> {
    public static final /* synthetic */ Funnels$IntegerFunnel[] a = {new Funnels$IntegerFunnel("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Funnels$IntegerFunnel EF5;

    public static Funnels$IntegerFunnel valueOf(String str) {
        return (Funnels$IntegerFunnel) Enum.valueOf(Funnels$IntegerFunnel.class, str);
    }

    public static Funnels$IntegerFunnel[] values() {
        return (Funnels$IntegerFunnel[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Funnels.integerFunnel()";
    }
}
