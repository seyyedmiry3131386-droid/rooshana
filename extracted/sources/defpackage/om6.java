package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class om6 implements ra4 {
    public final Uri a;
    public final w58 b;
    public final wv8 c;
    public final rm6 d;
    public final b11 e;
    public volatile boolean g;
    public long i;
    public db1 j;
    public cp8 k;
    public boolean l;
    public final /* synthetic */ rm6 m;
    public final sd2 f = new sd2();
    public boolean h = true;

    public om6(rm6 rm6Var, Uri uri, xa1 xa1Var, wv8 wv8Var, rm6 rm6Var2, b11 b11Var) {
        this.m = rm6Var;
        this.a = uri;
        this.b = new w58(xa1Var);
        this.c = wv8Var;
        this.d = rm6Var2;
        this.e = b11Var;
        da4.d.getAndIncrement();
        this.j = c(0L);
    }

    @Override // defpackage.ra4
    public final void a() {
        xa1 lh3Var;
        v72 v72Var;
        int i;
        int iD = 0;
        while (iD == 0 && !this.g) {
            try {
                long j = this.f.a;
                db1 db1VarC = c(j);
                this.j = db1VarC;
                long jB = this.b.b(db1VarC);
                if (this.g) {
                    if (iD != 1 && this.c.w() != -1) {
                        this.f.a = this.c.w();
                    }
                    tv8.i(this.b);
                    return;
                }
                if (jB != -1) {
                    jB += j;
                    rm6 rm6Var = this.m;
                    rm6Var.r.post(new mm6(rm6Var, 0));
                }
                long j2 = jB;
                this.m.t = nh3.d(this.b.a.k());
                w58 w58Var = this.b;
                nh3 nh3Var = this.m.t;
                if (nh3Var == null || (i = nh3Var.f) == -1) {
                    lh3Var = w58Var;
                } else {
                    lh3Var = new lh3(w58Var, i, this);
                    cp8 cp8VarD = this.m.D(new qm6(0, true));
                    this.k = cp8VarD;
                    cp8VarD.f(rm6.R);
                }
                this.c.D(lh3Var, this.a, this.b.a.k(), j, j2, this.d);
                if (this.m.t != null && (v72Var = (v72) this.c.c) != null) {
                    v72 v72VarB = v72Var.b();
                    if (v72VarB instanceof p85) {
                        ((p85) v72VarB).r = true;
                    }
                }
                if (this.h) {
                    wv8 wv8Var = this.c;
                    long j3 = this.i;
                    v72 v72Var2 = (v72) wv8Var.c;
                    v72Var2.getClass();
                    v72Var2.h(j, j3);
                    this.h = false;
                }
                while (iD == 0 && !this.g) {
                    try {
                        this.e.a();
                        wv8 wv8Var2 = this.c;
                        sd2 sd2Var = this.f;
                        v72 v72Var3 = (v72) wv8Var2.c;
                        v72Var3.getClass();
                        oe1 oe1Var = (oe1) wv8Var2.d;
                        oe1Var.getClass();
                        iD = v72Var3.d(oe1Var, sd2Var);
                        long jW = this.c.w();
                        if (jW > this.m.j + j) {
                            b11 b11Var = this.e;
                            synchronized (b11Var) {
                                b11Var.b = false;
                            }
                            rm6 rm6Var2 = this.m;
                            rm6Var2.r.post(rm6Var2.q);
                            j = jW;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iD == 1) {
                    iD = 0;
                } else if (this.c.w() != -1) {
                    this.f.a = this.c.w();
                }
                tv8.i(this.b);
            } catch (Throwable th) {
                if (iD != 1 && this.c.w() != -1) {
                    this.f.a = this.c.w();
                }
                tv8.i(this.b);
                throw th;
            }
        }
    }

    @Override // defpackage.ra4
    public final void b() {
        this.g = true;
    }

    public final db1 c(long j) {
        Map map = Collections.EMPTY_MAP;
        String str = this.m.i;
        Map map2 = rm6.Q;
        Uri uri = this.a;
        vy2.u(uri, "The uri must be set.");
        return new db1(uri, 0L, 1, null, map2, j, -1L, str, 6);
    }
}
