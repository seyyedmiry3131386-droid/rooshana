package org.junit.runners;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MethodSorters {
    public static final /* synthetic */ MethodSorters[] a = {new MethodSorters("NAME_ASCENDING", 0), new MethodSorters("JVM", 1), new MethodSorters("DEFAULT", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    MethodSorters EF5;

    public static MethodSorters valueOf(String str) {
        return (MethodSorters) Enum.valueOf(MethodSorters.class, str);
    }

    public static MethodSorters[] values() {
        return (MethodSorters[]) a.clone();
    }
}
