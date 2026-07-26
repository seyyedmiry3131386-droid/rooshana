package com.google.common.hash;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Funnels$UnencodedCharsFunnel implements Funnel<CharSequence> {
    public static final /* synthetic */ Funnels$UnencodedCharsFunnel[] a = {new Funnels$UnencodedCharsFunnel("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Funnels$UnencodedCharsFunnel EF5;

    public static Funnels$UnencodedCharsFunnel valueOf(String str) {
        return (Funnels$UnencodedCharsFunnel) Enum.valueOf(Funnels$UnencodedCharsFunnel.class, str);
    }

    public static Funnels$UnencodedCharsFunnel[] values() {
        return (Funnels$UnencodedCharsFunnel[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Funnels.unencodedCharsFunnel()";
    }
}
