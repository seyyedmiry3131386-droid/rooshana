package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nj3 extends z0 implements pj3 {
    public final v1 a;
    public final int b;
    public final int c;

    public nj3(v1 v1Var, int i, int i2) {
        this.a = v1Var;
        this.b = i;
        tt3.p(i, i2, v1Var.a());
        this.c = i2 - i;
    }

    @Override // defpackage.o
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tt3.n(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.z0, java.util.List
    public final List subList(int i, int i2) {
        tt3.p(i, i2, this.c);
        int i3 = this.b;
        return new nj3(this.a, i + i3, i3 + i2);
    }
}
