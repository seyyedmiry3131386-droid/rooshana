package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Chars$LexicographicalComparator implements Comparator<char[]> {
    public static final /* synthetic */ Chars$LexicographicalComparator[] a = {new Chars$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Chars$LexicographicalComparator EF5;

    public static Chars$LexicographicalComparator valueOf(String str) {
        return (Chars$LexicographicalComparator) Enum.valueOf(Chars$LexicographicalComparator.class, str);
    }

    public static Chars$LexicographicalComparator[] values() {
        return (Chars$LexicographicalComparator[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(char[] cArr, char[] cArr2) {
        char[] cArr3 = cArr;
        char[] cArr4 = cArr2;
        int iMin = Math.min(cArr3.length, cArr4.length);
        for (int i = 0; i < iMin; i++) {
            int iCompare = Character.compare(cArr3[i], cArr4[i]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return cArr3.length - cArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Chars.lexicographicalComparator()";
    }
}
