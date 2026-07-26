package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dz7 implements f01, Iterable, dx3 {
    public final cz7 a;
    public final int b;
    public final int c;

    public dz7(cz7 cz7Var, int i, int i2) {
        this.a = cz7Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dz7)) {
            return false;
        }
        dz7 dz7Var = (dz7) obj;
        return dz7Var.b == this.b && dz7Var.c == this.c && js3.i(dz7Var.a, this.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        cz7 cz7Var = this.a;
        if (cz7Var.h != this.c) {
            ez7.f();
        }
        int i = this.b;
        cz7Var.h(i);
        return new pv2(cz7Var, i + 1, cz7Var.a[(i * 5) + 3] + i);
    }
}
