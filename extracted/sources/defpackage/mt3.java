package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class mt3 implements Iterator {
    public boolean a = true;
    public final /* synthetic */ Iterator b;

    public mt3(Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.b.next();
        this.a = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        vy2.q(!this.a);
        this.b.remove();
    }
}
