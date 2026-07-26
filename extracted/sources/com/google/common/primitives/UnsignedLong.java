package com.google.common.primitives;

import defpackage.tv8;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {
    public final long a;

    static {
        new UnsignedLong(0L);
        new UnsignedLong(1L);
        new UnsignedLong(-1L);
    }

    public UnsignedLong(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedLong unsignedLong) {
        UnsignedLong unsignedLong2 = unsignedLong;
        unsignedLong2.getClass();
        return Long.compare(this.a ^ Long.MIN_VALUE, unsignedLong2.a ^ Long.MIN_VALUE);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j = this.a;
        return j >= 0 ? j : ((j >>> 1) | (j & 1)) * 2.0d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UnsignedLong) && this.a == ((UnsignedLong) obj).a;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j = this.a;
        return j >= 0 ? j : ((j >>> 1) | (j & 1)) * 2.0f;
    }

    public final int hashCode() {
        return tv8.u(this.a);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.a;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.a;
    }

    public final String toString() {
        long j = this.a;
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 10);
        }
        char[] cArr = new char[64];
        long j2 = (j >>> 1) / ((long) 5);
        long j3 = 10;
        int i = 63;
        cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
        while (j2 > 0) {
            i--;
            cArr[i] = Character.forDigit((int) (j2 % j3), 10);
            j2 /= j3;
        }
        return new String(cArr, i, 64 - i);
    }
}
