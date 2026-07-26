package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pg6 extends bm8 {
    public static final Object k = new Object();
    public final jp4 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ep4 i;
    public final long j;

    public pg6(qg6 qg6Var) {
        this.e = qg6Var.E();
        qg6Var.L0();
        this.f = ((o80) qg6Var.a).o0();
        qg6Var.L0();
        this.g = ((o80) qg6Var.a).m0();
        this.h = !qg6Var.S().p() && qg6Var.S().m(qg6Var.M(), new am8(), 0L).k;
        this.i = qg6Var.y0() ? ep4.f : null;
        this.j = j29.V(qg6Var.o());
    }

    @Override // defpackage.bm8
    public final int b(Object obj) {
        return k.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.bm8
    public final yl8 f(int i, yl8 yl8Var, boolean z) {
        yl8Var.getClass();
        bb bbVar = bb.f;
        Object obj = k;
        yl8Var.i(obj, obj, 0, this.j, 0L, bbVar, false);
        yl8Var.f = this.h;
        return yl8Var;
    }

    @Override // defpackage.bm8
    public final int h() {
        return 1;
    }

    @Override // defpackage.bm8
    public final Object l(int i) {
        return k;
    }

    @Override // defpackage.bm8
    public final am8 m(int i, am8 am8Var, long j) {
        am8Var.b(k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.i, 0L, this.j, 0, 0, 0L);
        am8Var.k = this.h;
        return am8Var;
    }

    @Override // defpackage.bm8
    public final int o() {
        return 1;
    }
}
