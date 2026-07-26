package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class os5 implements OnBackAnimationCallback {
    public final /* synthetic */ ps5 a;

    public os5(ps5 ps5Var) {
        this.a = ps5Var;
    }

    public final void onBackCancelled() {
        ps5 ps5Var = this.a;
        ai0 ai0Var = ps5Var.a;
        if (ai0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!ps5Var.b) {
            ai0Var.o(ps5Var, null);
        }
        if (ai0Var.a) {
            kk5 kk5Var = (kk5) ai0Var.c;
            kk5Var.getClass();
            if (ps5Var.equals(kk5Var.h) && -1 == kk5Var.g) {
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
                    ek5VarC.c();
                }
                l lVar = kk5Var.a;
                lVar.getClass();
                lVar.p(null, mk5Var);
            }
        }
        ps5Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        js3.p(backEvent, "backEvent");
        ck5 ck5VarA = r3.a(backEvent);
        ps5 ps5Var = this.a;
        ai0 ai0Var = ps5Var.a;
        if (ai0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (ps5Var.b && ai0Var.a) {
            kk5 kk5Var = (kk5) ai0Var.c;
            kk5Var.getClass();
            if (ps5Var.equals(kk5Var.h) && -1 == kk5Var.g) {
                ek5 ek5VarC = kk5Var.f;
                if (ek5VarC == null) {
                    ek5VarC = kk5Var.c(-1);
                }
                if (ek5VarC != null) {
                    ek5VarC.d = new nk5(ck5VarA, -1);
                    ek5VarC.e(ck5VarA);
                }
                l lVar = kk5Var.a;
                nk5 nk5Var = new nk5(ck5VarA, -1);
                lVar.getClass();
                lVar.p(null, nk5Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        js3.p(backEvent, "backEvent");
        ck5 ck5VarA = r3.a(backEvent);
        ps5 ps5Var = this.a;
        ai0 ai0Var = ps5Var.a;
        if (ai0Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (ps5Var.b) {
            return;
        }
        ai0Var.o(ps5Var, ck5VarA);
        ps5Var.b = true;
    }
}
