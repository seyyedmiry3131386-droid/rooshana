package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k58 implements Iterator, dx3 {
    public final SnapshotStateSet a;
    public final Iterator b;
    public Object c;
    public Object d;
    public int e;

    public k58(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.a = snapshotStateSet;
        this.b = it;
        this.e = y40.u(snapshotStateSet);
        this.c = this.d;
        this.d = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (y40.u(this.a) != this.e) {
            throw new ConcurrentModificationException();
        }
        this.c = this.d;
        Iterator it = this.b;
        this.d = it.hasNext() ? it.next() : null;
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet snapshotStateSet = this.a;
        if (y40.u(snapshotStateSet) != this.e) {
            throw new ConcurrentModificationException();
        }
        Object obj = this.c;
        if (obj == null) {
            throw new IllegalStateException();
        }
        snapshotStateSet.remove(obj);
        this.c = null;
        this.e = y40.u(snapshotStateSet);
    }
}
