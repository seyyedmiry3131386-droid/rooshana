package com.google.common.primitives;

import defpackage.mr1;
import defpackage.wn5;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
class Doubles$DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    public final int a;
    public final int b;

    public Doubles$DoubleArrayAsList(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Double)) {
            return false;
        }
        int i = mr1.p;
        if (this.a >= this.b) {
            return false;
        }
        throw null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Doubles$DoubleArrayAsList)) {
            return super.equals(obj);
        }
        int size = size();
        if (((Doubles$DoubleArrayAsList) obj).size() != size) {
            return false;
        }
        if (size <= 0) {
            return true;
        }
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        wn5.l(i, size());
        throw null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        if (this.a >= this.b) {
            return 1;
        }
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        int i = mr1.p;
        if (this.a >= this.b) {
            return -1;
        }
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        int i = mr1.p;
        if (this.b - 1 < this.a) {
            return -1;
        }
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        wn5.l(i, size());
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b - this.a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        wn5.o(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.a;
        return new Doubles$DoubleArrayAsList(i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        new StringBuilder(size() * 12).append('[');
        throw null;
    }
}
