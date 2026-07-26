package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cj4 extends jk2 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public cj4(bm8 bm8Var, Object obj, Object obj2) {
        super(bm8Var);
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.jk2, defpackage.bm8
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // defpackage.jk2, defpackage.bm8
    public final yl8 f(int i, yl8 yl8Var, boolean z) {
        this.e.f(i, yl8Var, z);
        if (Objects.equals(yl8Var.b, this.g) && z) {
            yl8Var.b = h;
        }
        return yl8Var;
    }

    @Override // defpackage.jk2, defpackage.bm8
    public final Object l(int i) {
        Object objL = this.e.l(i);
        return Objects.equals(objL, this.g) ? h : objL;
    }

    @Override // defpackage.jk2, defpackage.bm8
    public final am8 m(int i, am8 am8Var, long j) {
        this.e.m(i, am8Var, j);
        if (Objects.equals(am8Var.a, this.f)) {
            am8Var.a = am8.q;
        }
        return am8Var;
    }
}
