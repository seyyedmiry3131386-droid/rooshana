package com.google.common.collect;

import defpackage.vy2;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ Serializable e;

    public v(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        this.a = 0;
        this.e = abstractMapBasedMultiset;
        this.b = abstractMapBasedMultiset.c.b();
        this.c = -1;
        this.d = abstractMapBasedMultiset.c.d;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (((AbstractMapBasedMultiset) this.e).c.d == this.d) {
                    return this.b >= 0;
                }
                throw new ConcurrentModificationException();
            default:
                return this.c >= 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object objB = b(this.b);
                int i = this.b;
                this.c = i;
                this.b = ((AbstractMapBasedMultiset) this.e).c.i(i);
                return objB;
            default:
                CompactHashMap compactHashMap = (CompactHashMap) this.e;
                if (compactHashMap.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.c;
                this.d = i2;
                Object objA = a(i2);
                this.c = compactHashMap.i(this.c);
                return objA;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) this.e;
                if (abstractMapBasedMultiset.c.d != this.d) {
                    throw new ConcurrentModificationException();
                }
                vy2.q(this.c != -1);
                abstractMapBasedMultiset.d -= (long) abstractMapBasedMultiset.c.m(this.c);
                this.b = abstractMapBasedMultiset.c.j(this.b, this.c);
                this.c = -1;
                this.d = abstractMapBasedMultiset.c.d;
                return;
            default:
                CompactHashMap compactHashMap = (CompactHashMap) this.e;
                if (compactHashMap.e != this.b) {
                    throw new ConcurrentModificationException();
                }
                vy2.q(this.d >= 0);
                this.b += 32;
                compactHashMap.remove(compactHashMap.s()[this.d]);
                this.c = compactHashMap.b(this.c, this.d);
                this.d = -1;
                return;
        }
    }

    public v(CompactHashMap compactHashMap) {
        this.a = 1;
        this.e = compactHashMap;
        this.b = compactHashMap.e;
        this.c = compactHashMap.h();
        this.d = -1;
    }
}
