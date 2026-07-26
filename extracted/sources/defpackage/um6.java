package defpackage;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.b;
import j$.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class um6 extends x70 {
    public final wa1 h;
    public final ts5 i;
    public final vw1 j;
    public final fv k;
    public final int l;
    public final b m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public fq8 r;
    public jp4 s;

    public um6(jp4 jp4Var, wa1 wa1Var, ts5 ts5Var, vw1 vw1Var, fv fvVar, int i, b bVar) {
        this.s = jp4Var;
        this.h = wa1Var;
        this.i = ts5Var;
        this.j = vw1Var;
        this.k = fvVar;
        this.l = i;
        this.m = bVar;
    }

    @Override // defpackage.x70
    public final boolean a(jp4 jp4Var) {
        fp4 fp4Var = h().b;
        fp4Var.getClass();
        fp4 fp4Var2 = jp4Var.b;
        return fp4Var2 != null && fp4Var2.a.equals(fp4Var.a) && fp4Var2.h == fp4Var.h && Objects.equals(fp4Var2.f, fp4Var.f);
    }

    @Override // defpackage.x70
    public final zp4 b(ks4 ks4Var, qc1 qc1Var, long j) {
        xa1 xa1VarK = this.h.k();
        fq8 fq8Var = this.r;
        if (fq8Var != null) {
            xa1VarK.c(fq8Var);
        }
        fp4 fp4Var = h().b;
        fp4Var.getClass();
        Uri uri = fp4Var.a;
        vy2.t(this.g);
        return new rm6(uri, xa1VarK, new wv8(10, (y72) this.i.b), this.j, new sw1(this.d.c, 0, ks4Var), this.k, new pg((CopyOnWriteArrayList) this.c.d, 0, ks4Var), this, qc1Var, fp4Var.f, this.l, this.m, j29.V(fp4Var.h), null);
    }

    @Override // defpackage.x70
    public final synchronized jp4 h() {
        return this.s;
    }

    @Override // defpackage.x70
    public final void l(fq8 fq8Var) {
        this.r = fq8Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        ee6 ee6Var = this.g;
        vy2.t(ee6Var);
        vw1 vw1Var = this.j;
        vw1Var.k(looperMyLooper, ee6Var);
        vw1Var.c();
        t();
    }

    @Override // defpackage.x70
    public final void n(zp4 zp4Var) {
        rm6 rm6Var = (rm6) zp4Var;
        if (rm6Var.x) {
            for (oc7 oc7Var : rm6Var.u) {
                oc7Var.j();
                pw1 pw1Var = oc7Var.h;
                if (pw1Var != null) {
                    pw1Var.c(oc7Var.e);
                    oc7Var.h = null;
                    oc7Var.g = null;
                }
            }
        }
        rm6Var.m.K(rm6Var);
        rm6Var.r.removeCallbacksAndMessages(null);
        rm6Var.s = null;
        rm6Var.P = true;
    }

    @Override // defpackage.x70
    public final void p() {
        this.j.a();
    }

    @Override // defpackage.x70
    public final synchronized void s(jp4 jp4Var) {
        this.s = jp4Var;
    }

    public final void t() {
        long j = this.o;
        boolean z = this.p;
        boolean z2 = this.q;
        jp4 jp4VarH = h();
        bm8 ex7Var = new ex7(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, jp4VarH, z2 ? jp4VarH.c : null);
        if (this.n) {
            ex7Var = new sm6(ex7Var);
        }
        m(ex7Var);
    }

    public final void u(long j, kl7 kl7Var, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean zE = kl7Var.e();
        if (!this.n && this.o == j && this.p == zE && this.q == z) {
            return;
        }
        this.o = j;
        this.p = zE;
        this.q = z;
        this.n = false;
        t();
    }

    @Override // defpackage.x70
    public final void j() {
    }
}
