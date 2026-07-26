package androidx.compose.runtime;

import defpackage.e71;
import defpackage.h01;
import defpackage.js3;
import defpackage.m37;
import defpackage.p37;
import defpackage.sm0;
import defpackage.th0;
import defpackage.w61;
import defpackage.wt3;
import defpackage.xt3;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class m implements e71, m37 {
    public static final sm0 e = new sm0(0);
    public final w61 a;
    public final w61 b;
    public final m c = this;
    public volatile w61 d;

    public m(w61 w61Var, w61 w61Var2) {
        this.a = w61Var;
        this.b = w61Var2;
    }

    @Override // defpackage.m37
    public final void a() {
        b();
    }

    public final void b() {
        synchronized (this.c) {
            try {
                w61 w61Var = this.d;
                if (w61Var == null) {
                    this.d = e;
                } else {
                    kotlinx.coroutines.a.c(w61Var, new ForgottenCoroutineScopeException());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m37
    public final void c() {
        b();
    }

    @Override // defpackage.m37
    public final void e() {
    }

    @Override // defpackage.e71
    public final w61 getCoroutineContext() {
        w61 w61VarL0;
        w61 w61Var = this.d;
        if (w61Var == null || w61Var == e) {
            h01 h01Var = (h01) this.a.r0(h01.b);
            w61 p37Var = h01Var != null ? new p37(h01Var, this) : EmptyCoroutineContext.a;
            synchronized (this.c) {
                try {
                    w61 w61Var2 = this.d;
                    if (w61Var2 == null) {
                        w61 w61Var3 = this.a;
                        w61VarL0 = w61Var3.l0(new xt3((wt3) w61Var3.r0(th0.n))).l0(this.b).l0(p37Var);
                    } else if (w61Var2 == e) {
                        w61 w61Var4 = this.a;
                        xt3 xt3Var = new xt3((wt3) w61Var4.r0(th0.n));
                        xt3Var.t(new ForgottenCoroutineScopeException());
                        w61VarL0 = w61Var4.l0(xt3Var).l0(this.b).l0(p37Var);
                    } else {
                        w61VarL0 = w61Var2;
                    }
                    this.d = w61VarL0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            w61Var = w61VarL0;
        }
        js3.m(w61Var);
        return w61Var;
    }
}
