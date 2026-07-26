package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public final class q66 extends n66 {
    public final p66 e;
    public Object f;
    public boolean g;
    public int h;

    /* JADX WARN: Illegal instructions before constructor call */
    public q66(p66 p66Var) {
        Object obj = p66Var.b;
        o56 o56Var = p66Var.d;
        super(obj, o56Var, 1);
        this.e = p66Var;
        this.h = o56Var.e;
    }

    @Override // defpackage.n66, java.util.Iterator
    public final Object next() {
        if (this.e.d.e != this.h) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.f = next;
        this.g = true;
        return next;
    }

    @Override // defpackage.n66, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        Object obj = this.f;
        p66 p66Var = this.e;
        wu8.g(p66Var).remove(obj);
        this.f = null;
        this.g = false;
        this.h = p66Var.d.e;
        this.d--;
    }
}
