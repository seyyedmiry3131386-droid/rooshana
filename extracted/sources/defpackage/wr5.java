package defpackage;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wr5 implements v72 {
    public x72 a;
    public q68 b;
    public boolean c;

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    public final boolean c(w72 w72Var) {
        boolean zN;
        zr5 zr5Var = new zr5();
        if (zr5Var.a(w72Var, true) && (zr5Var.a & 2) == 2) {
            int iMin = Math.min(zr5Var.e, 8);
            h26 h26Var = new h26(iMin);
            w72Var.q(h26Var.a, 0, iMin);
            h26Var.J(0);
            if (h26Var.a() >= 5 && h26Var.x() == 127 && h26Var.z() == 1179402563) {
                this.b = new td2();
                return true;
            }
            h26Var.J(0);
            try {
                zN = c67.n(1, h26Var, true);
            } catch (ParserException unused) {
                zN = false;
            }
            if (zN) {
                this.b = new jb9();
            } else {
                h26Var.J(0);
                if (vv5.e(h26Var, vv5.o)) {
                    this.b = new vv5();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    @Override // defpackage.v72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.w72 r21, defpackage.sd2 r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr5.d(w72, sd2):int");
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        try {
            return c(w72Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        q68 q68Var = this.b;
        if (q68Var != null) {
            yr5 yr5Var = q68Var.a;
            zr5 zr5Var = yr5Var.a;
            zr5Var.a = 0;
            zr5Var.b = 0L;
            zr5Var.c = 0;
            zr5Var.d = 0;
            zr5Var.e = 0;
            yr5Var.b.G(0);
            yr5Var.c = -1;
            yr5Var.e = false;
            if (j == 0) {
                q68Var.d(!q68Var.l);
                return;
            }
            if (q68Var.h != 0) {
                long j3 = (((long) q68Var.i) * j2) / 1000000;
                q68Var.e = j3;
                as5 as5Var = q68Var.d;
                String str = j29.a;
                as5Var.t(j3);
                q68Var.h = 2;
            }
        }
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.a = x72Var;
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
