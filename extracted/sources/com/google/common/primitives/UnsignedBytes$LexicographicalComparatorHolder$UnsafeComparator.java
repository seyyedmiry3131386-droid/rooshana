package com.google.common.primitives;

import defpackage.wy8;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Comparator;
import sun.misc.Unsafe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator implements Comparator<byte[]> {
    public static final Unsafe b;
    public static final int c;

    /* JADX INFO: Fake field, exist only in values array */
    UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator EF5;
    public static final /* synthetic */ UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[] d = {new UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator("INSTANCE", 0)};
    public static final boolean a = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);

    static {
        Unsafe unsafeB = b();
        b = unsafeB;
        int iArrayBaseOffset = unsafeB.arrayBaseOffset(byte[].class);
        c = iArrayBaseOffset;
        if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafeB.arrayIndexScale(byte[].class) != 1) {
            throw new Error();
        }
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        int i = iMin & (-8);
        int i2 = 0;
        while (i2 < i) {
            Unsafe unsafe = b;
            long j = ((long) c) + ((long) i2);
            long j2 = unsafe.getLong(bArr, j);
            long j3 = unsafe.getLong(bArr2, j);
            if (j2 != j3) {
                if (a) {
                    return Long.compare(j2 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j3);
                }
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & (-8);
                return ((int) ((j2 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j3 >>> iNumberOfTrailingZeros) & 255));
            }
            i2 += 8;
        }
        while (i2 < iMin) {
            int i3 = (bArr[i2] & 255) - (bArr2[i2] & 255);
            if (i3 != 0) {
                return i3;
            }
            i2++;
        }
        return bArr.length - bArr2.length;
    }

    public static Unsafe b() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new wy8());
        }
    }

    public static UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator valueOf(String str) {
        return (UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator) Enum.valueOf(UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator.class, str);
    }

    public static UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[] values() {
        return (UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator[]) d.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
    }
}
