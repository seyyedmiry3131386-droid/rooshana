package defpackage;

import kotlinx.coroutines.sync.a;

/* JADX INFO: loaded from: classes3.dex */
public final class fc5 implements jm7 {
    public final jm7 a;
    public final Object b;
    public final /* synthetic */ a c;

    public fc5(a aVar, jm7 jm7Var, Object obj) {
        this.c = aVar;
        this.a = jm7Var;
        this.b = obj;
    }

    @Override // defpackage.gc9
    public final void a(wl7 wl7Var, int i) {
        this.a.a(wl7Var, i);
    }

    @Override // defpackage.jm7
    public final boolean b(Object obj, Object obj2) {
        boolean zB = this.a.b(obj, obj2);
        if (zB) {
            a.h.set(this.c, this.b);
        }
        return zB;
    }

    @Override // defpackage.jm7
    public final void c(bq1 bq1Var) {
        this.a.c(bq1Var);
    }

    @Override // defpackage.jm7
    public final void e(Object obj) {
        a.h.set(this.c, this.b);
        this.a.e(obj);
    }
}
