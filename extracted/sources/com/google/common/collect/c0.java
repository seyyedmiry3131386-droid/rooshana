package com.google.common.collect;

import defpackage.vy2;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Iterator {
    public int a;
    public int b;
    public int c = -1;
    public final /* synthetic */ CompactHashSet d;

    public c0(CompactHashSet compactHashSet) {
        this.d = compactHashSet;
        this.a = compactHashSet.d;
        this.b = compactHashSet.h();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        CompactHashSet compactHashSet = this.d;
        if (compactHashSet.d != this.a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        Object obj = compactHashSet.o()[i];
        this.b = compactHashSet.i(this.b);
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        CompactHashSet compactHashSet = this.d;
        if (compactHashSet.d != this.a) {
            throw new ConcurrentModificationException();
        }
        vy2.q(this.c >= 0);
        this.a += 32;
        compactHashSet.remove(compactHashSet.o()[this.c]);
        this.b = compactHashSet.a(this.b, this.c);
        this.c = -1;
    }
}
