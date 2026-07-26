package com.google.common.primitives;

/* JADX INFO: loaded from: classes.dex */
public final class UnsignedInteger extends Number implements Comparable<UnsignedInteger> {
    public final int a;

    static {
        new UnsignedInteger(0);
        new UnsignedInteger(1);
        new UnsignedInteger(-1);
    }

    public UnsignedInteger(int i) {
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(UnsignedInteger unsignedInteger) {
        UnsignedInteger unsignedInteger2 = unsignedInteger;
        unsignedInteger2.getClass();
        return Integer.compare(this.a ^ Integer.MIN_VALUE, unsignedInteger2.a ^ Integer.MIN_VALUE);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UnsignedInteger) && this.a == ((UnsignedInteger) obj).a;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return longValue();
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.a;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return ((long) this.a) & 4294967295L;
    }

    public final String toString() {
        return Long.toString(((long) this.a) & 4294967295L, 10);
    }
}
