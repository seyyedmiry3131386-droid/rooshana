package com.google.common.collect;

import defpackage.tv8;
import j$.util.Objects;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    public transient int[] f;
    public transient int[] g;
    public transient int h;
    public transient int i;

    @Override // com.google.common.collect.CompactHashSet
    public final int a(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int c() {
        int iC = super.c();
        this.f = new int[iC];
        this.g = new int[iC];
        return iC;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (n()) {
            return;
        }
        this.h = -2;
        this.i = -2;
        int[] iArr = this.f;
        if (iArr != null && this.g != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.g, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    public final LinkedHashSet e() {
        LinkedHashSet linkedHashSetE = super.e();
        this.f = null;
        this.g = null;
        return linkedHashSetE;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int h() {
        return this.h;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final int i(int i) {
        Objects.requireNonNull(this.g);
        return r0[i] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void j(int i) {
        super.j(i);
        this.h = -2;
        this.i = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void l(Object obj, int i, int i2, int i3) {
        super.l(obj, i, i2, i3);
        s(this.i, i);
        s(i, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void m(int i, int i2) {
        int size = size() - 1;
        super.m(i, i2);
        Objects.requireNonNull(this.f);
        s(r4[i] - 1, i(i));
        if (i < size) {
            Objects.requireNonNull(this.f);
            s(r4[size] - 1, i);
            s(i, i(size));
        }
        int[] iArr = this.f;
        Objects.requireNonNull(iArr);
        iArr[size] = 0;
        int[] iArr2 = this.g;
        Objects.requireNonNull(iArr2);
        iArr2[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet
    public final void q(int i) {
        super.q(i);
        int[] iArr = this.f;
        Objects.requireNonNull(iArr);
        this.f = Arrays.copyOf(iArr, i);
        int[] iArr2 = this.g;
        Objects.requireNonNull(iArr2);
        this.g = Arrays.copyOf(iArr2, i);
    }

    public final void s(int i, int i2) {
        if (i == -2) {
            this.h = i2;
        } else {
            int[] iArr = this.g;
            Objects.requireNonNull(iArr);
            iArr[i] = i2 + 1;
        }
        if (i2 == -2) {
            this.i = i;
            return;
        }
        int[] iArr2 = this.f;
        Objects.requireNonNull(iArr2);
        iArr2[i2] = i + 1;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        tv8.m(this, objArr);
        return objArr;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return tv8.D(this, objArr);
    }
}
