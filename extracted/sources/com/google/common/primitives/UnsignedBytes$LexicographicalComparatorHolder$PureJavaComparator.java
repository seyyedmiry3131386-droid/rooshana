package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator implements Comparator<byte[]> {
    public static final /* synthetic */ UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[] a = {new UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator EF5;

    public static UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator valueOf(String str) {
        return (UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator) Enum.valueOf(UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator.class, str);
    }

    public static UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[] values() {
        return (UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        int iMin = Math.min(bArr3.length, bArr4.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = (bArr3[i] & 255) - (bArr4[i] & 255);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr3.length - bArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
