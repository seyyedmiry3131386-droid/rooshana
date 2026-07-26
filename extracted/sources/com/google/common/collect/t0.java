package com.google.common.collect;

import com.google.common.collect.LinkedHashMultimap;
import defpackage.w74;
import defpackage.wn5;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Iterator {
    public w74 a;
    public LinkedHashMultimap.ValueEntry b;
    public int c;
    public final /* synthetic */ u0 d;

    public t0(u0 u0Var) {
        this.d = u0Var;
        this.a = u0Var.e;
        this.c = u0Var.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        u0 u0Var = this.d;
        if (u0Var.d == this.c) {
            return this.a != u0Var;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        LinkedHashMultimap.ValueEntry valueEntry = (LinkedHashMultimap.ValueEntry) this.a;
        Object obj = valueEntry.b;
        this.b = valueEntry;
        this.a = valueEntry.c();
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        u0 u0Var = this.d;
        if (u0Var.d != this.c) {
            throw new ConcurrentModificationException();
        }
        wn5.s("no calls to next() since the last call to remove()", this.b != null);
        u0Var.remove(this.b.b);
        this.c = u0Var.d;
        this.b = null;
    }
}
