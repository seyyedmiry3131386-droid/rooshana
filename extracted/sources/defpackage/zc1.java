package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zc1 implements q94, co4, fs4, hs4, n31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zc1(int i, long j, Object obj) {
        this.c = obj;
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        eb8 eb8Var = (eb8) this.c;
        o81 o81Var = (o81) obj;
        vy2.t(eb8Var.h);
        byte[] bArrR = gv.r(o81Var.a, o81Var.c);
        h26 h26Var = eb8Var.c;
        h26Var.getClass();
        h26Var.H(bArrR.length, bArrR);
        eb8Var.a.d(bArrR.length, h26Var);
        long j = o81Var.b;
        long j2 = this.b;
        if (j == -9223372036854775807L) {
            vy2.s(eb8Var.h.s == Long.MAX_VALUE);
        } else {
            long j3 = eb8Var.h.s;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        eb8Var.a.a(j2, this.a | 1, bArrR.length, 0, null);
    }

    @Override // defpackage.fs4
    public void b(qg6 qg6Var, hq4 hq4Var) {
        is4 is4Var = (is4) this.c;
        qg6Var.j(is4Var.p0(hq4Var, qg6Var, this.a), this.b);
    }

    @Override // defpackage.co4
    public void c(xf3 xf3Var, int i) {
        go4 go4Var = (go4) this.c;
        xf3Var.H(go4Var.c, i, this.a, this.b);
    }

    @Override // defpackage.hs4
    public Object h(xq4 xq4Var, hq4 hq4Var, int i) {
        List list = (List) this.c;
        int i2 = this.a;
        return xq4Var.r(hq4Var, list, i2 == -1 ? xq4Var.t.M() : i2, i2 == -1 ? xq4Var.t.d0() : this.b);
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        be beVar = (be) this.c;
        ((ce) obj).D(this.a, this.b, beVar);
    }

    public /* synthetic */ zc1(be beVar, int i, long j, long j2) {
        this.c = beVar;
        this.a = i;
        this.b = j;
    }

    public /* synthetic */ zc1(eb8 eb8Var, long j, int i) {
        this.c = eb8Var;
        this.b = j;
        this.a = i;
    }
}
