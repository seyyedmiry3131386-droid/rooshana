package com.google.common.collect;

import defpackage.oa5;
import defpackage.pa5;
import defpackage.s7;
import defpackage.sq5;
import defpackage.tt3;
import defpackage.vy2;
import defpackage.wn5;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends AbstractCollection implements oa5 {
    public transient Set a;
    public transient Set b;

    public boolean K(int i, Object obj) {
        vy2.m(i, "oldCount");
        vy2.m(0, "newCount");
        if (s0(obj) != i) {
            return false;
        }
        j1(obj);
        return true;
    }

    public Set a() {
        return new defpackage.o1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        add(1, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof oa5)) {
            if (collection.isEmpty()) {
                return false;
            }
            return s7.c(this, collection.iterator());
        }
        oa5 oa5Var = (oa5) collection;
        if (!(oa5Var instanceof AbstractMapBasedMultiset)) {
            if (oa5Var.isEmpty()) {
                return false;
            }
            for (pa5 pa5Var : oa5Var.entrySet()) {
                add(pa5Var.a(), pa5Var.b());
            }
            return true;
        }
        AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) oa5Var;
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        for (int iB = abstractMapBasedMultiset.c.b(); iB >= 0; iB = abstractMapBasedMultiset.c.i(iB)) {
            sq5 sq5Var = abstractMapBasedMultiset.c;
            wn5.l(iB, sq5Var.c);
            add(abstractMapBasedMultiset.c.d(iB), sq5Var.a[iB]);
        }
        return true;
    }

    @Override // defpackage.oa5, defpackage.q18
    public Set b() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.a = setA;
        return setA;
    }

    public Set c() {
        return new defpackage.p1(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return s0(obj) > 0;
    }

    public abstract int e();

    @Override // defpackage.oa5
    public final Set entrySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setC = c();
        this.b = setC;
        return setC;
    }

    @Override // java.util.Collection, defpackage.oa5
    public final boolean equals(Object obj) {
        return tt3.w(this, obj);
    }

    public abstract Iterator f();

    public abstract Iterator h();

    @Override // java.util.Collection, defpackage.oa5
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return w0(1, obj) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof oa5) {
            collection = ((oa5) collection).b();
        }
        return b().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof oa5) {
            collection = ((oa5) collection).b();
        }
        return b().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
