package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pv2 implements Iterator, dx3 {
    public final cz7 a;
    public final int b;
    public int c;
    public final int d;

    public pv2(cz7 cz7Var, int i, int i2) {
        this.a = cz7Var;
        this.b = i2;
        this.c = i;
        this.d = cz7Var.h;
        if (cz7Var.g) {
            ez7.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        cz7 cz7Var = this.a;
        int i = cz7Var.h;
        int i2 = this.d;
        if (i != i2) {
            ez7.f();
        }
        int i3 = this.c;
        this.c = ez7.a(cz7Var.a, i3) + i3;
        return new dz7(cz7Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
