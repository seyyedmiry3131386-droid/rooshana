package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d58 implements Iterator, dx3 {
    public final y08 a;
    public final Iterator b;
    public int c;
    public Map.Entry d;
    public Map.Entry e;
    public final /* synthetic */ int f;

    public d58(y08 y08Var, Iterator it, int i) {
        this.f = i;
        this.a = y08Var;
        this.b = it;
        this.c = y08Var.f().d;
        a();
    }

    public final void a() {
        this.d = this.e;
        Iterator it = this.b;
        this.e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                a();
                if (this.d != null) {
                    return new c58(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.e;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.e;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        y08 y08Var = this.a;
        if (y08Var.f().d != this.c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        y08Var.remove(entry.getKey());
        this.d = null;
        this.c = y08Var.f().d;
    }
}
