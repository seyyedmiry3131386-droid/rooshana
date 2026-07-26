package defpackage;

import ir.mservices.market.movie.data.webapi.CommonDataKt;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class fs5 implements dl0 {
    public final k57 a;
    public final Object b;
    public final Object[] c;
    public final cl0 d;
    public final l51 e;
    public volatile boolean f;
    public xv6 g;
    public Throwable h;
    public boolean i;

    public fs5(k57 k57Var, Object obj, Object[] objArr, cl0 cl0Var, l51 l51Var) {
        this.a = k57Var;
        this.b = obj;
        this.c = objArr;
        this.d = cl0Var;
        this.e = l51Var;
    }

    public final xv6 a() {
        se3 se3VarB;
        k57 k57Var = this.a;
        m91[] m91VarArr = k57Var.k;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length != m91VarArr.length) {
            throw new IllegalArgumentException(dw1.k(m91VarArr.length, ")", rm7.r(length, "Argument count (", ") doesn't match expected count (")));
        }
        e57 e57Var = new e57(k57Var.d, k57Var.c, k57Var.e, k57Var.f, k57Var.g, k57Var.h, k57Var.i, k57Var.j);
        if (k57Var.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            m91VarArr[i].g(e57Var, objArr[i]);
        }
        re3 re3Var = e57Var.d;
        if (re3Var != null) {
            se3VarB = re3Var.b();
        } else {
            String str = e57Var.c;
            se3 se3Var = e57Var.b;
            se3Var.getClass();
            js3.p(str, CommonDataKt.AD_LINK);
            re3 re3VarG = se3Var.g(str);
            se3VarB = re3VarG != null ? re3VarG.b() : null;
            if (se3VarB == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + se3Var + ", Relative: " + e57Var.c);
            }
        }
        b57 d57Var = e57Var.k;
        if (d57Var == null) {
            nc2 nc2Var = e57Var.j;
            if (nc2Var != null) {
                d57Var = new pj2((ArrayList) nc2Var.b, (ArrayList) nc2Var.c);
            } else {
                pa2 pa2Var = e57Var.i;
                if (pa2Var != null) {
                    ArrayList arrayList2 = (ArrayList) pa2Var.d;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    d57Var = new ka5((ByteString) pa2Var.c, (dt4) pa2Var.b, ih9.j(arrayList2));
                } else if (e57Var.h) {
                    int i2 = b57.a;
                    d57Var = ol3.i(0, null, new byte[0]);
                }
            }
        }
        dt4 dt4Var = e57Var.g;
        ay2 ay2Var = e57Var.f;
        if (dt4Var != null) {
            if (d57Var != null) {
                d57Var = new d57(d57Var, dt4Var);
            } else {
                ay2Var.a("Content-Type", dt4Var.a);
            }
        }
        rb4 rb4Var = e57Var.e;
        rb4Var.getClass();
        rb4Var.b = se3VarB;
        rb4Var.C(ay2Var.e());
        rb4Var.F(e57Var.a, d57Var);
        rb4Var.f = ((b47) rb4Var.f).i(g27.a(xs3.class), new xs3(k57Var.a, this.b, k57Var.b, arrayList));
        return ((hs5) this.d).b(new w47(rb4Var));
    }

    public final xv6 b() throws IOException {
        xv6 xv6Var = this.g;
        if (xv6Var != null) {
            return xv6Var;
        }
        Throwable th = this.h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            xv6 xv6VarA = a();
            this.g = xv6VarA;
            return xv6VarA;
        } catch (IOException | Error | RuntimeException e) {
            rq4.P(e);
            this.h = e;
            throw e;
        }
    }

    @Override // defpackage.dl0
    public final synchronized w47 b1() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().b;
    }

    public final h77 c(g77 g77Var) throws IOException {
        j77 j77Var = g77Var.g;
        f77 f77VarD = g77Var.d();
        f77VarD.g = new es5(j77Var.g(), j77Var.d());
        g77 g77VarA = f77VarD.a();
        boolean z = g77VarA.q;
        int i = g77VarA.d;
        if (i < 200 || i >= 300) {
            try {
                gh0 gh0Var = new gh0();
                j77Var.d1().e0(gh0Var);
                dt4 dt4VarG = j77Var.g();
                long jD = j77Var.d();
                i77 i77Var = j77.a;
                i77 i77Var2 = new i77(dt4VarG, jD, gh0Var);
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new h77(g77VarA, null, i77Var2);
            } finally {
                j77Var.close();
            }
        }
        if (i == 204 || i == 205) {
            if (z) {
                return new h77(g77VarA, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        ds5 ds5Var = new ds5(j77Var);
        try {
            Object objI = this.e.i(ds5Var);
            if (z) {
                return new h77(g77VarA, objI, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = ds5Var.d;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // defpackage.dl0
    public final void cancel() {
        xv6 xv6Var;
        this.f = true;
        synchronized (this) {
            xv6Var = this.g;
        }
        if (xv6Var != null) {
            xv6Var.cancel();
        }
    }

    @Override // defpackage.dl0
    public final dl0 clone() {
        return new fs5(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.dl0
    public final void l0(il0 il0Var) {
        xv6 xv6Var;
        Throwable th;
        synchronized (this) {
            try {
                if (this.i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.i = true;
                xv6Var = this.g;
                th = this.h;
                if (xv6Var == null && th == null) {
                    try {
                        xv6 xv6VarA = a();
                        this.g = xv6VarA;
                        xv6Var = xv6VarA;
                    } catch (Throwable th2) {
                        th = th2;
                        rq4.P(th);
                        this.h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            il0Var.o(this, th);
            return;
        }
        if (this.f) {
            xv6Var.cancel();
        }
        xv6Var.c(new nc2(24, this, il0Var, false));
    }

    @Override // defpackage.dl0
    public final boolean r0() {
        boolean z = true;
        if (this.f) {
            return true;
        }
        synchronized (this) {
            try {
                xv6 xv6Var = this.g;
                if (xv6Var == null || !xv6Var.q) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m26clone() {
        return new fs5(this.a, this.b, this.c, this.d, this.e);
    }
}
