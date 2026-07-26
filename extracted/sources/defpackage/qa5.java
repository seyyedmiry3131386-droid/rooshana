package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class qa5 implements Iterator {
    public final oa5 a;
    public final Iterator b;
    public pa5 c;
    public int d;
    public int e;
    public boolean f;

    public qa5(oa5 oa5Var, Iterator it) {
        this.a = oa5Var;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (this.d == 0) {
            pa5 pa5Var = (pa5) this.b.next();
            this.c = pa5Var;
            int iA = pa5Var.a();
            this.d = iA;
            this.e = iA;
        }
        this.d--;
        this.f = true;
        pa5 pa5Var2 = this.c;
        Objects.requireNonNull(pa5Var2);
        return pa5Var2.b();
    }

    @Override // java.util.Iterator
    public final void remove() {
        vy2.q(this.f);
        if (this.e == 1) {
            this.b.remove();
        } else {
            pa5 pa5Var = this.c;
            Objects.requireNonNull(pa5Var);
            this.a.remove(pa5Var.b());
        }
        this.e--;
        this.f = false;
    }
}
