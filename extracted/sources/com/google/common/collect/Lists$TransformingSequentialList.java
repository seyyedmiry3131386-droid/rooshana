package com.google.common.collect;

import defpackage.yp2;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
class Lists$TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final List a;
    public final yp2 b;

    public Lists$TransformingSequentialList(yp2 yp2Var, List list) {
        list.getClass();
        this.a = list;
        this.b = yp2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new y0(this, this.a.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
