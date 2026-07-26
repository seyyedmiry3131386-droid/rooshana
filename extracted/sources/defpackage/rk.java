package defpackage;

import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class rk {
    public final mt8 a;
    public final Object b;
    public final long c;
    public final bp2 d;
    public final wb5 e;
    public dl f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final wb5 i = g.h(Boolean.TRUE);

    public rk(Object obj, mt8 mt8Var, dl dlVar, long j, Object obj2, long j2, bp2 bp2Var) {
        this.a = mt8Var;
        this.b = obj2;
        this.c = j2;
        this.d = bp2Var;
        this.e = g.h(obj);
        this.f = tv8.k(dlVar);
        this.g = j;
    }

    public final void a() {
        ((s08) this.i).setValue(Boolean.FALSE);
        this.d.invoke();
    }
}
