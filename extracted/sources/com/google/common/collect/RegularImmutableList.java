package com.google.common.collect;

import defpackage.wn5;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList e = new RegularImmutableList(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public RegularImmutableList(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] e() {
        return this.c;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int f() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wn5.l(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
