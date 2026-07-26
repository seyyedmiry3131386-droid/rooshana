package com.google.common.collect;

import defpackage.b47;
import defpackage.s22;
import defpackage.tt3;
import defpackage.vy2;
import defpackage.wn5;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class EnumMultiset<E extends Enum<E>> extends w implements Serializable {
    private static final long serialVersionUID = 0;
    public transient Class c;
    public transient Enum[] d;
    public transient int[] e;
    public transient int f;
    public transient long g;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Class cls = (Class) object;
        this.c = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.d = enumArr;
        this.e = new int[enumArr.length];
        b47.l(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        b47.y(this, objectOutputStream);
    }

    @Override // defpackage.oa5
    public final int add(int i, Object obj) {
        Enum r9 = (Enum) obj;
        i(r9);
        vy2.m(i, "occurrences");
        if (i == 0) {
            return s0(r9);
        }
        int iOrdinal = r9.ordinal();
        int i2 = this.e[iOrdinal];
        long j = i;
        long j2 = ((long) i2) + j;
        wn5.f(j2, "too many occurrences: %s", j2 <= 2147483647L);
        this.e[iOrdinal] = (int) j2;
        if (i2 == 0) {
            this.f++;
        }
        this.g += j;
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Arrays.fill(this.e, 0);
        this.g = 0L;
        this.f = 0;
    }

    @Override // com.google.common.collect.w
    public final int e() {
        return this.f;
    }

    @Override // com.google.common.collect.w
    public final Iterator f() {
        return new s22(this, 0);
    }

    @Override // com.google.common.collect.w
    public final Iterator h() {
        return new s22(this, 1);
    }

    public final void i(Object obj) {
        obj.getClass();
        if (j(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.c + " but got " + obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return tt3.D(this);
    }

    public final boolean j(Object obj) {
        if (obj instanceof Enum) {
            Enum r5 = (Enum) obj;
            int iOrdinal = r5.ordinal();
            Enum[] enumArr = this.d;
            if (iOrdinal < enumArr.length && enumArr[iOrdinal] == r5) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oa5
    public final int j1(Object obj) {
        Enum r6 = (Enum) obj;
        i(r6);
        vy2.m(0, "count");
        int iOrdinal = r6.ordinal();
        int[] iArr = this.e;
        int i = iArr[iOrdinal];
        iArr[iOrdinal] = 0;
        this.g += (long) (0 - i);
        if (i > 0) {
            this.f--;
        }
        return i;
    }

    @Override // defpackage.oa5
    public final int s0(Object obj) {
        if (obj == null || !j(obj)) {
            return 0;
        }
        return this.e[((Enum) obj).ordinal()];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return com.google.common.primitives.a.f(this.g);
    }

    @Override // defpackage.oa5
    public final int w0(int i, Object obj) {
        if (obj != null && j(obj)) {
            Enum r1 = (Enum) obj;
            vy2.m(i, "occurrences");
            if (i == 0) {
                return s0(obj);
            }
            int iOrdinal = r1.ordinal();
            int[] iArr = this.e;
            int i2 = iArr[iOrdinal];
            if (i2 != 0) {
                if (i2 > i) {
                    iArr[iOrdinal] = i2 - i;
                    this.g -= (long) i;
                    return i2;
                }
                iArr[iOrdinal] = 0;
                this.f--;
                this.g -= (long) i2;
                return i2;
            }
        }
        return 0;
    }
}
