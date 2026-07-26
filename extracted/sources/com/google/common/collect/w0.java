package com.google.common.collect;

import defpackage.qq7;
import defpackage.z74;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends qq7 {
    public final /* synthetic */ LinkedListMultimap a;

    public w0(LinkedListMultimap linkedListMultimap) {
        this.a = linkedListMultimap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new z74(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return !this.a.a(obj).isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((CompactHashMap) this.a.h).size();
    }
}
