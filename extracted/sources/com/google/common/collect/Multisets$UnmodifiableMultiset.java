package com.google.common.collect;

import defpackage.bk2;
import defpackage.oa5;
import defpackage.q18;
import defpackage.s7;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class Multisets$UnmodifiableMultiset<E> extends bk2 implements Serializable {
    private static final long serialVersionUID = 0;
    public final oa5 s;
    public transient Set t;
    public transient Set u;

    public Multisets$UnmodifiableMultiset(q18 q18Var) {
        super(16);
        this.s = q18Var;
    }

    @Override // defpackage.bk2, defpackage.oa5
    public final boolean K(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bk2
    /* JADX INFO: renamed from: Z */
    public oa5 Y() {
        return this.s;
    }

    public Set a0() {
        return DesugarCollections.unmodifiableSet(this.s.b());
    }

    @Override // defpackage.uj2, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.uj2, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.oa5, defpackage.q18
    public Set b() {
        Set set = this.t;
        if (set != null) {
            return set;
        }
        Set setA0 = a0();
        this.t = setA0;
        return setA0;
    }

    @Override // defpackage.uj2, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.oa5
    public final Set entrySet() {
        Set set = this.u;
        if (set != null) {
            return set;
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.s.entrySet());
        this.u = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @Override // defpackage.uj2, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return s7.h0(this.s.iterator());
    }

    @Override // defpackage.bk2, defpackage.oa5
    public final int j1(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.uj2, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.uj2, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.uj2, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bk2, defpackage.oa5
    public final int w0(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bk2, defpackage.oa5
    public final int add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
