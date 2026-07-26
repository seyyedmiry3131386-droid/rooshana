package io.sentry.cache.tape;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Iterator {
    public final i a;
    public final /* synthetic */ e b;

    public d(e eVar, i iVar) {
        this.b = eVar;
        this.a = iVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.c.d((byte[]) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
