package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wz0 implements ps4, tw1 {
    public final Object a;
    public pg b;
    public sw1 c;
    public final /* synthetic */ yz0 d;

    public wz0(yz0 yz0Var, Object obj) {
        this.d = yz0Var;
        this.b = new pg((CopyOnWriteArrayList) yz0Var.c.d, 0, (ks4) null);
        this.c = new sw1(yz0Var.d.c, 0, null);
        this.a = obj;
    }

    @Override // defpackage.tw1
    public final void G(int i, ks4 ks4Var) {
        if (a(i, ks4Var)) {
            this.c.a();
        }
    }

    @Override // defpackage.tw1
    public final void L(int i, ks4 ks4Var) {
        if (a(i, ks4Var)) {
            this.c.e();
        }
    }

    @Override // defpackage.ps4
    public final void U(int i, ks4 ks4Var, da4 da4Var, op4 op4Var, int i2) {
        if (a(i, ks4Var)) {
            pg pgVar = this.b;
            op4 op4VarC = c(op4Var, ks4Var);
            pgVar.getClass();
            pgVar.e(new xc1(pgVar, da4Var, op4VarC, i2));
        }
    }

    public final boolean a(int i, ks4 ks4Var) {
        ks4 ks4VarT;
        Object obj = this.a;
        yz0 yz0Var = this.d;
        if (ks4Var != null) {
            ks4VarT = yz0Var.t(obj, ks4Var);
            if (ks4VarT == null) {
                return false;
            }
        } else {
            ks4VarT = null;
        }
        int iV = yz0Var.v(i, obj);
        pg pgVar = this.b;
        if (pgVar.b != iV || !Objects.equals((ks4) pgVar.c, ks4VarT)) {
            this.b = new pg((CopyOnWriteArrayList) yz0Var.c.d, iV, ks4VarT);
        }
        sw1 sw1Var = this.c;
        if (sw1Var.a == iV && Objects.equals(sw1Var.b, ks4VarT)) {
            return true;
        }
        this.c = new sw1(yz0Var.d.c, iV, ks4VarT);
        return true;
    }

    @Override // defpackage.tw1
    public final void b(int i, ks4 ks4Var, Exception exc) {
        if (a(i, ks4Var)) {
            this.c.d(exc);
        }
    }

    public final op4 c(op4 op4Var, ks4 ks4Var) {
        long j = op4Var.f;
        yz0 yz0Var = this.d;
        Object obj = this.a;
        long jU = yz0Var.u(j, obj);
        long j2 = op4Var.g;
        long jU2 = yz0Var.u(j2, obj);
        return (jU == j && jU2 == j2) ? op4Var : new op4(op4Var.a, op4Var.b, op4Var.c, op4Var.d, op4Var.e, jU, jU2);
    }

    @Override // defpackage.ps4
    public final void f(int i, ks4 ks4Var, op4 op4Var) {
        if (a(i, ks4Var)) {
            pg pgVar = this.b;
            op4 op4VarC = c(op4Var, ks4Var);
            pgVar.getClass();
            pgVar.e(new ur4(pgVar, op4VarC, 5));
        }
    }

    @Override // defpackage.ps4
    public final void g(int i, ks4 ks4Var, op4 op4Var) {
        if (a(i, ks4Var)) {
            pg pgVar = this.b;
            op4 op4VarC = c(op4Var, ks4Var);
            ks4 ks4Var2 = (ks4) pgVar.c;
            ks4Var2.getClass();
            pgVar.e(new tg1(pgVar, ks4Var2, op4VarC, 9));
        }
    }

    @Override // defpackage.tw1
    public final void k(int i, ks4 ks4Var, int i2) {
        if (a(i, ks4Var)) {
            this.c.c(i2);
        }
    }

    @Override // defpackage.ps4
    public final void p(int i, ks4 ks4Var, da4 da4Var, op4 op4Var) {
        if (a(i, ks4Var)) {
            pg pgVar = this.b;
            op4 op4VarC = c(op4Var, ks4Var);
            pgVar.getClass();
            pgVar.e(new ms4(pgVar, da4Var, op4VarC, 1));
        }
    }

    @Override // defpackage.ps4
    public final void s(int i, ks4 ks4Var, da4 da4Var, op4 op4Var) {
        if (a(i, ks4Var)) {
            pg pgVar = this.b;
            op4 op4VarC = c(op4Var, ks4Var);
            pgVar.getClass();
            pgVar.e(new ms4(pgVar, da4Var, op4VarC, 0));
        }
    }

    @Override // defpackage.ps4
    public final void u(int i, ks4 ks4Var, da4 da4Var, op4 op4Var, IOException iOException, boolean z) {
        if (a(i, ks4Var)) {
            pg pgVar = this.b;
            op4 op4VarC = c(op4Var, ks4Var);
            pgVar.getClass();
            pgVar.e(new ns4(pgVar, da4Var, op4VarC, iOException, z));
        }
    }

    @Override // defpackage.tw1
    public final void w(int i, ks4 ks4Var) {
        if (a(i, ks4Var)) {
            this.c.b();
        }
    }
}
