package com.google.common.collect;

import defpackage.dk2;
import defpackage.nt3;
import defpackage.s7;
import defpackage.wn5;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class EvictingQueue<E> extends dk2 implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final /* bridge */ /* synthetic */ Object Y() {
        return null;
    }

    @Override // defpackage.uj2
    public final /* bridge */ /* synthetic */ Collection Y() {
        return null;
    }

    @Override // defpackage.uj2, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        return true;
    }

    @Override // defpackage.uj2, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < 0) {
            return s7.c(this, collection.iterator());
        }
        clear();
        wn5.i("number to skip cannot be negative", size >= 0);
        Iterable nt3Var = new nt3(size, collection);
        return nt3Var instanceof Collection ? addAll((Collection) nt3Var) : s7.c(this, nt3Var.iterator());
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        return true;
    }
}
