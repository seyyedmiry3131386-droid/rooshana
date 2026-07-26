package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Longs$LexicographicalComparator implements Comparator<long[]> {
    public static final /* synthetic */ Longs$LexicographicalComparator[] a = {new Longs$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Longs$LexicographicalComparator EF5;

    public static Longs$LexicographicalComparator valueOf(String str) {
        return (Longs$LexicographicalComparator) Enum.valueOf(Longs$LexicographicalComparator.class, str);
    }

    public static Longs$LexicographicalComparator[] values() {
        return (Longs$LexicographicalComparator[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(long[] jArr, long[] jArr2) {
        long[] jArr3 = jArr;
        long[] jArr4 = jArr2;
        int iMin = Math.min(jArr3.length, jArr4.length);
        for (int i = 0; i < iMin; i++) {
            int iCompare = Long.compare(jArr3[i], jArr4[i]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return jArr3.length - jArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Longs.lexicographicalComparator()";
    }
}
