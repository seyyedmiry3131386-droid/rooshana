package defpackage;

import com.google.common.cache.d;

/* JADX INFO: loaded from: classes.dex */
public class cc4 extends ub4 {
    public final Object a;
    public final int b;
    public final c27 c;
    public volatile ec4 d = d.u;

    public cc4(Object obj, int i, c27 c27Var) {
        this.a = obj;
        this.b = i;
        this.c = c27Var;
    }

    @Override // defpackage.ub4, defpackage.c27
    public final c27 a() {
        return this.c;
    }

    @Override // defpackage.ub4, defpackage.c27
    public final ec4 b() {
        return this.d;
    }

    @Override // defpackage.ub4, defpackage.c27
    public final int c() {
        return this.b;
    }

    @Override // defpackage.ub4, defpackage.c27
    public final void f(ec4 ec4Var) {
        this.d = ec4Var;
    }

    @Override // defpackage.ub4, defpackage.c27
    public final Object getKey() {
        return this.a;
    }
}
