package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y30 implements v72 {
    public final h26 a;
    public final rz5 b;
    public final boolean c;
    public final av d;
    public int e;
    public x72 f;
    public z30 g;
    public long h;
    public er0[] i;
    public long j;
    public er0 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public y30(int i, av avVar) {
        this.d = avVar;
        this.c = (i & 1) == 0;
        this.a = new h26(12);
        this.b = new rz5();
        this.f = new ql3();
        this.i = new er0[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0110  */
    @Override // defpackage.v72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.w72 r23, defpackage.sd2 r24) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y30.d(w72, sd2):int");
    }

    @Override // defpackage.v72
    public final boolean g(w72 w72Var) {
        h26 h26Var = this.a;
        w72Var.q(h26Var.a, 0, 12);
        h26Var.J(0);
        if (h26Var.l() == 1179011410) {
            h26Var.K(4);
            if (h26Var.l() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (er0 er0Var : this.i) {
            if (er0Var.k == 0) {
                er0Var.i = 0;
            } else {
                er0Var.i = er0Var.n[j29.e(er0Var.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        this.e = 0;
        if (this.c) {
            x72Var = new ry(x72Var, this.d);
        }
        this.f = x72Var;
        this.j = -1L;
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
