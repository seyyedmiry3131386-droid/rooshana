package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class UnsignedInts$LexicographicalComparator implements Comparator<int[]> {
    public static final /* synthetic */ UnsignedInts$LexicographicalComparator[] a = {new UnsignedInts$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    UnsignedInts$LexicographicalComparator EF5;

    public static UnsignedInts$LexicographicalComparator valueOf(String str) {
        return (UnsignedInts$LexicographicalComparator) Enum.valueOf(UnsignedInts$LexicographicalComparator.class, str);
    }

    public static UnsignedInts$LexicographicalComparator[] values() {
        return (UnsignedInts$LexicographicalComparator[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int iMin = Math.min(iArr3.length, iArr4.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = iArr3[i];
            int i3 = iArr4[i];
            if (i2 != i3) {
                return Integer.compare(i2 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i3);
            }
        }
        return iArr3.length - iArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedInts.lexicographicalComparator()";
    }
}
