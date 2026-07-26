package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class k66 implements Iterator, dx3 {
    public Object a;
    public final i66 b;
    public Object c;
    public boolean d;
    public int e;
    public int f;

    public k66(Object obj, i66 i66Var) {
        js3.p(i66Var, "builder");
        this.a = obj;
        this.b = i66Var;
        this.c = th0.j;
        this.e = i66Var.d.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h84 next() {
        i66 i66Var = this.b;
        if (i66Var.d.e != this.e) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.a;
        this.c = obj;
        this.d = true;
        this.f++;
        V v = i66Var.d.get(obj);
        if (v != 0) {
            h84 h84Var = (h84) v;
            this.a = h84Var.c;
            return h84Var;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.a + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.b.c();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        Object obj = this.c;
        i66 i66Var = this.b;
        wu8.h(i66Var).remove(obj);
        this.c = null;
        this.d = false;
        this.e = i66Var.d.e;
        this.f--;
    }
}
