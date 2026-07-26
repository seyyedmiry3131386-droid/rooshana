package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class md3 implements t18 {
    public final se3 a;
    public final kk2 b;
    public boolean c;
    public final /* synthetic */ rd3 d;

    public md3(rd3 rd3Var, se3 se3Var) {
        js3.p(se3Var, "url");
        this.d = rd3Var;
        this.a = se3Var;
        this.b = new kk2(((tv6) rd3Var.c.c).a.i());
    }

    public final void b(by2 by2Var) {
        hs5 hs5Var;
        th0 th0Var;
        js3.p(by2Var, "trailers");
        rd3 rd3Var = this.d;
        int i = rd3Var.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + rd3Var.d);
        }
        kk2 kk2Var = this.b;
        dm8 dm8Var = kk2Var.e;
        kk2Var.e = dm8.d;
        dm8Var.a();
        dm8Var.b();
        rd3Var.d = 6;
        if (by2Var.size() <= 0 || (hs5Var = rd3Var.a) == null || (th0Var = hs5Var.j) == null) {
            return;
        }
        me3.b(th0Var, this.a, by2Var);
    }

    @Override // defpackage.t18
    public long f0(gh0 gh0Var, long j) {
        rd3 rd3Var = this.d;
        js3.p(gh0Var, "sink");
        try {
            return ((tv6) rd3Var.c.c).f0(gh0Var, j);
        } catch (IOException e) {
            rd3Var.b.e();
            b(rd3.f);
            throw e;
        }
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.b;
    }
}
