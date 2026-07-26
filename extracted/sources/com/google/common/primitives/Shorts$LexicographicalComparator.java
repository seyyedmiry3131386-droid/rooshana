package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Shorts$LexicographicalComparator implements Comparator<short[]> {
    public static final /* synthetic */ Shorts$LexicographicalComparator[] a = {new Shorts$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Shorts$LexicographicalComparator EF5;

    public static Shorts$LexicographicalComparator valueOf(String str) {
        return (Shorts$LexicographicalComparator) Enum.valueOf(Shorts$LexicographicalComparator.class, str);
    }

    public static Shorts$LexicographicalComparator[] values() {
        return (Shorts$LexicographicalComparator[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(short[] sArr, short[] sArr2) {
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int iMin = Math.min(sArr3.length, sArr4.length);
        for (int i = 0; i < iMin; i++) {
            int iCompare = Short.compare(sArr3[i], sArr4[i]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return sArr3.length - sArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Shorts.lexicographicalComparator()";
    }
}
