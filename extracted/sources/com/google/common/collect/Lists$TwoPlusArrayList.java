package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
class Lists$TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
    private static final long serialVersionUID = 0;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i == 0 || i == 1) {
            return null;
        }
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        throw null;
    }
}
