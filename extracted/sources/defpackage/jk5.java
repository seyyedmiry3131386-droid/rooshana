package defpackage;

import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class jk5 {
    public ai0 a;
    public boolean b;

    public final void a() {
        ai0 ai0Var = this.a;
        if (ai0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.b) {
            ai0Var.o(this, null);
        }
        if (ai0Var.a) {
            kk5 kk5Var = (kk5) ai0Var.c;
            ts5 ts5Var = (ts5) ai0Var.b;
            kk5Var.getClass();
            if (equals(kk5Var.h) && -1 == kk5Var.g) {
                ek5 ek5VarC = kk5Var.f;
                if (ek5VarC == null) {
                    ek5VarC = kk5Var.c(-1);
                }
                kk5Var.f = null;
                kk5Var.g = 0;
                kk5Var.h = null;
                mk5 mk5Var = mk5.a;
                if (ek5VarC != null) {
                    ek5VarC.d = mk5Var;
                    ek5VarC.d();
                } else if (ts5Var != null) {
                    ((ws5) ts5Var.b).a.run();
                }
                l lVar = kk5Var.a;
                lVar.getClass();
                lVar.p(null, mk5Var);
            }
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
