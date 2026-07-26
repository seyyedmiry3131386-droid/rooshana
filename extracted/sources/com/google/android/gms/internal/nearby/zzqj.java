package com.google.android.gms.internal.nearby;

import defpackage.sa7;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzqj extends AbstractList implements RandomAccess, Serializable {
    public final int a;
    public final int b;

    public zzqj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer) || this.a >= this.b) {
            return false;
        }
        throw null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqj)) {
            return super.equals(obj);
        }
        zzqj zzqjVar = (zzqj) obj;
        int i = zzqjVar.b - zzqjVar.a;
        int i2 = this.b - this.a;
        if (i != i2) {
            return false;
        }
        if (i2 <= 0) {
            return true;
        }
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        sa7.r(i, this.b - this.a);
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
        if (!(obj instanceof Integer)) {
            return -1;
        }
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
        if (!(obj instanceof Integer) || this.b - 1 < this.a) {
            return -1;
        }
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        sa7.r(i, this.b - this.a);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b - this.a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.b;
        int i4 = this.a;
        sa7.s(i, i2, i3 - i4);
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        return new zzqj(i4 + i, i2 + i4);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        new StringBuilder((this.b - this.a) * 5).append('[');
        throw null;
    }
}
