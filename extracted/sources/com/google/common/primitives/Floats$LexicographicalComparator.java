package com.google.common.primitives;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Floats$LexicographicalComparator implements Comparator<float[]> {
    public static final /* synthetic */ Floats$LexicographicalComparator[] a = {new Floats$LexicographicalComparator("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Floats$LexicographicalComparator EF5;

    public static Floats$LexicographicalComparator valueOf(String str) {
        return (Floats$LexicographicalComparator) Enum.valueOf(Floats$LexicographicalComparator.class, str);
    }

    public static Floats$LexicographicalComparator[] values() {
        return (Floats$LexicographicalComparator[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        int iMin = Math.min(fArr3.length, fArr4.length);
        for (int i = 0; i < iMin; i++) {
            int iCompare = Float.compare(fArr3[i], fArr4[i]);
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return fArr3.length - fArr4.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Floats.lexicographicalComparator()";
    }
}
