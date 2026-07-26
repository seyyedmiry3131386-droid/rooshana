package com.google.common.collect;

import defpackage.a84;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends AbstractSequentialList {
    public final /* synthetic */ Object a;
    public final /* synthetic */ LinkedListMultimap b;

    public v0(LinkedListMultimap linkedListMultimap, Object obj) {
        this.a = obj;
        this.b = linkedListMultimap;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new x0(this.b, this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        a84 a84Var = (a84) ((CompactHashMap) this.b.h).get(this.a);
        if (a84Var == null) {
            return 0;
        }
        return a84Var.c;
    }
}
