package com.sun.jna;

import defpackage.rm7;
import defpackage.vh5;
import defpackage.yq2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IntegerType extends Number implements vh5 {
    private static final long serialVersionUID = 1;
    public int a;
    public Number b;
    public long c;

    @Override // defpackage.vh5
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.vh5
    public final Object b(Object obj) {
        long jLongValue = obj == null ? 0L : ((Number) obj).longValue();
        IntegerType integerType = (IntegerType) yq2.r0(getClass());
        integerType.e(jLongValue);
        return integerType;
    }

    @Override // defpackage.vh5
    public final Class c() {
        return this.b.getClass();
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.b.doubleValue();
    }

    public final void e(long j) {
        long j2;
        this.c = j;
        int i = this.a;
        if (i == 1) {
            byte b = (byte) j;
            j2 = b;
            this.b = Byte.valueOf(b);
        } else if (i == 2) {
            short s = (short) j;
            j2 = s;
            this.b = Short.valueOf(s);
        } else if (i == 4) {
            int i2 = (int) j;
            j2 = i2;
            this.b = Integer.valueOf(i2);
        } else {
            if (i != 8) {
                throw new IllegalArgumentException(rm7.n(i, "Unsupported size: "));
            }
            this.b = Long.valueOf(j);
            j2 = j;
        }
        if (i < 8) {
            long j3 = ~((serialVersionUID << (i * 8)) - serialVersionUID);
            if ((j >= 0 || j2 == j) && (j < 0 || (j3 & j) == 0)) {
                return;
            }
            throw new IllegalArgumentException("Argument value 0x" + Long.toHexString(j) + " exceeds native capacity (" + i + " bytes) mask=0x" + Long.toHexString(j3));
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof IntegerType) && this.b.equals(((IntegerType) obj).b);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.b.floatValue();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.c;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
