package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rm6 implements zp4, x72, pa4, sa4, nc7 {
    public static final Map Q;
    public static final b R;
    public vp7 A;
    public kl7 B;
    public long C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public final Uri a;
    public final xa1 b;
    public final vw1 c;
    public final fv d;
    public final pg e;
    public final sw1 f;
    public final um6 g;
    public final qc1 h;
    public final String i;
    public final long j;
    public final b k;
    public final long l;
    public final wv8 m;
    public final wv8 n;
    public final b11 o;
    public final mm6 p;
    public final mm6 q;
    public final Handler r;
    public yp4 s;
    public nh3 t;
    public oc7[] u;
    public qm6[] v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        Q = DesugarCollections.unmodifiableMap(map);
        rj2 rj2Var = new rj2();
        rj2Var.a = "icy";
        rj2Var.m = tv4.m("application/x-icy");
        R = new b(rj2Var);
    }

    public rm6(Uri uri, xa1 xa1Var, wv8 wv8Var, vw1 vw1Var, sw1 sw1Var, fv fvVar, pg pgVar, um6 um6Var, qc1 qc1Var, String str, int i, b bVar, long j, k37 k37Var) {
        this.a = uri;
        this.b = xa1Var;
        this.c = vw1Var;
        this.f = sw1Var;
        this.d = fvVar;
        this.e = pgVar;
        this.g = um6Var;
        this.h = qc1Var;
        this.i = str;
        this.j = i;
        this.k = bVar;
        this.m = k37Var != null ? new wv8(3, k37Var) : new wv8("ProgressiveMediaPeriod");
        this.n = wv8Var;
        this.l = j;
        this.o = new b11();
        this.p = new mm6(this, 1);
        this.q = new mm6(this, 2);
        this.r = j29.p(null);
        this.v = new qm6[0];
        this.u = new oc7[0];
        this.L = -9223372036854775807L;
        this.E = 1;
    }

    public final void A() {
        long j = this.l;
        if (this.P || this.x || !this.w || this.B == null) {
            return;
        }
        for (oc7 oc7Var : this.u) {
            if (oc7Var.t() == null) {
                return;
            }
        }
        b11 b11Var = this.o;
        synchronized (b11Var) {
            b11Var.b = false;
        }
        int length = this.u.length;
        yo8[] yo8VarArr = new yo8[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            b bVarT = this.u[i].t();
            bVarT.getClass();
            String str = bVarT.n;
            boolean zI = tv4.i(str);
            boolean z = zI || tv4.l(str);
            zArr[i] = z;
            this.y = z | this.y;
            this.z = j != -9223372036854775807L && length == 1 && tv4.j(str);
            nh3 nh3Var = this.t;
            if (nh3Var != null) {
                int i2 = nh3Var.a;
                if (zI || this.v[i].b) {
                    jv4 jv4Var = bVarT.l;
                    jv4 jv4Var2 = jv4Var == null ? new jv4(nh3Var) : jv4Var.a(nh3Var);
                    rj2 rj2VarA = bVarT.a();
                    rj2VarA.k = jv4Var2;
                    bVarT = new b(rj2VarA);
                }
                if (zI && bVarT.h == -1 && bVarT.i == -1 && i2 != -1) {
                    rj2 rj2VarA2 = bVarT.a();
                    rj2VarA2.h = i2;
                    bVarT = new b(rj2VarA2);
                }
            }
            int iL = this.c.l(bVarT);
            rj2 rj2VarA3 = bVarT.a();
            rj2VarA3.N = iL;
            b bVar = new b(rj2VarA3);
            yo8VarArr[i] = new yo8(Integer.toString(i), bVar);
            this.H = bVar.t | this.H;
        }
        this.A = new vp7(new zo8(yo8VarArr), zArr);
        if (this.z && this.C == -9223372036854775807L) {
            this.C = j;
            this.B = new nm6(this, this.B);
        }
        this.g.u(this.C, this.B, this.D);
        this.x = true;
        yp4 yp4Var = this.s;
        yp4Var.getClass();
        yp4Var.d(this);
    }

    public final void B(int i) {
        w();
        vp7 vp7Var = this.A;
        boolean[] zArr = (boolean[]) vp7Var.e;
        if (zArr[i]) {
            return;
        }
        b bVar = ((zo8) vp7Var.b).a(i).d[0];
        pg pgVar = this.e;
        pgVar.e(new ur4(pgVar, new op4(1, tv4.h(bVar.n), bVar, 0, null, j29.k0(this.K), -9223372036854775807L), 5));
        zArr[i] = true;
    }

    public final void C(int i) {
        w();
        if (this.M) {
            if ((!this.y || ((boolean[]) this.A.c)[i]) && !this.u[i].u(false)) {
                this.L = 0L;
                this.M = false;
                this.G = true;
                this.K = 0L;
                this.N = 0;
                for (oc7 oc7Var : this.u) {
                    oc7Var.z(false);
                }
                yp4 yp4Var = this.s;
                yp4Var.getClass();
                yp4Var.l(this);
            }
        }
    }

    public final cp8 D(qm6 qm6Var) {
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            if (qm6Var.equals(this.v[i])) {
                return this.u[i];
            }
        }
        if (this.w) {
            wn5.k0("ProgressiveMediaPeriod", "Extractor added new track (id=" + qm6Var.a + ") after finishing tracks.");
            return new uo1();
        }
        vw1 vw1Var = this.c;
        vw1Var.getClass();
        oc7 oc7Var = new oc7(this.h, vw1Var, this.f);
        oc7Var.f = this;
        int i2 = length + 1;
        qm6[] qm6VarArr = (qm6[]) Arrays.copyOf(this.v, i2);
        qm6VarArr[length] = qm6Var;
        this.v = qm6VarArr;
        oc7[] oc7VarArr = (oc7[]) Arrays.copyOf(this.u, i2);
        oc7VarArr[length] = oc7Var;
        this.u = oc7VarArr;
        return oc7Var;
    }

    public final void E(kl7 kl7Var) {
        this.B = this.t == null ? kl7Var : new x30(-9223372036854775807L);
        this.C = kl7Var.l();
        boolean z = !this.J && kl7Var.l() == -9223372036854775807L;
        this.D = z;
        this.E = z ? 7 : 1;
        if (this.x) {
            this.g.u(this.C, kl7Var, z);
        } else {
            A();
        }
    }

    public final void F() {
        om6 om6Var = new om6(this, this.a, this.b, this.n, this, this.o);
        if (this.x) {
            vy2.s(z());
            long j = this.C;
            if (j != -9223372036854775807L && this.L > j) {
                this.O = true;
                this.L = -9223372036854775807L;
                return;
            }
            kl7 kl7Var = this.B;
            kl7Var.getClass();
            long j2 = kl7Var.j(this.L).a.b;
            long j3 = this.L;
            om6Var.f.a = j2;
            om6Var.i = j3;
            om6Var.h = true;
            om6Var.l = false;
            for (oc7 oc7Var : this.u) {
                oc7Var.t = this.L;
            }
            this.L = -9223372036854775807L;
        }
        this.N = x();
        this.m.S(om6Var, this, this.d.z(this.E));
    }

    public final boolean G() {
        return this.G || z();
    }

    @Override // defpackage.ko7
    public final boolean a() {
        boolean z;
        if (!this.m.E()) {
            return false;
        }
        b11 b11Var = this.o;
        synchronized (b11Var) {
            z = b11Var.b;
        }
        return z;
    }

    @Override // defpackage.sa4
    public final void b() {
        for (oc7 oc7Var : this.u) {
            oc7Var.z(true);
            pw1 pw1Var = oc7Var.h;
            if (pw1Var != null) {
                pw1Var.c(oc7Var.e);
                oc7Var.h = null;
                oc7Var.g = null;
            }
        }
        wv8 wv8Var = this.n;
        v72 v72Var = (v72) wv8Var.c;
        if (v72Var != null) {
            v72Var.a();
            wv8Var.c = null;
        }
        wv8Var.d = null;
    }

    @Override // defpackage.pa4
    public final void c(ra4 ra4Var, long j, long j2, boolean z) {
        om6 om6Var = (om6) ra4Var;
        da4 da4Var = new da4(om6Var.j, om6Var.b.c, j2);
        this.d.getClass();
        this.e.n(da4Var, 1, -1, null, 0, null, om6Var.i, this.C);
        if (z) {
            return;
        }
        for (oc7 oc7Var : this.u) {
            oc7Var.z(false);
        }
        if (this.I > 0) {
            yp4 yp4Var = this.s;
            yp4Var.getClass();
            yp4Var.l(this);
        }
    }

    @Override // defpackage.pa4
    public final void d(ra4 ra4Var, long j, long j2) {
        om6 om6Var = (om6) ra4Var;
        if (this.C == -9223372036854775807L && this.B != null) {
            long jY = y(true);
            long j3 = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.C = j3;
            this.g.u(j3, this.B, this.D);
        }
        da4 da4Var = new da4(om6Var.j, om6Var.b.c, j2);
        this.d.getClass();
        this.e.o(da4Var, 1, -1, null, 0, null, om6Var.i, this.C);
        this.O = true;
        yp4 yp4Var = this.s;
        yp4Var.getClass();
        yp4Var.l(this);
    }

    @Override // defpackage.zp4
    public final long e(p62[] p62VarArr, boolean[] zArr, pc7[] pc7VarArr, boolean[] zArr2, long j) {
        p62 p62Var;
        w();
        vp7 vp7Var = this.A;
        zo8 zo8Var = (zo8) vp7Var.b;
        boolean[] zArr3 = (boolean[]) vp7Var.d;
        int i = this.I;
        int i2 = 0;
        for (int i3 = 0; i3 < p62VarArr.length; i3++) {
            pc7 pc7Var = pc7VarArr[i3];
            if (pc7Var != null && (p62VarArr[i3] == null || !zArr[i3])) {
                int i4 = ((pm6) pc7Var).a;
                vy2.s(zArr3[i4]);
                this.I--;
                zArr3[i4] = false;
                pc7VarArr[i3] = null;
            }
        }
        boolean z = !this.F ? j == 0 || this.z : i != 0;
        for (int i5 = 0; i5 < p62VarArr.length; i5++) {
            if (pc7VarArr[i5] == null && (p62Var = p62VarArr[i5]) != null) {
                vy2.s(p62Var.length() == 1);
                vy2.s(p62Var.i(0) == 0);
                int iB = zo8Var.b(p62Var.c());
                vy2.s(!zArr3[iB]);
                this.I++;
                zArr3[iB] = true;
                this.H = p62Var.m().t | this.H;
                pc7VarArr[i5] = new pm6(this, iB);
                zArr2[i5] = true;
                if (!z) {
                    oc7 oc7Var = this.u[iB];
                    z = (oc7Var.q() == 0 || oc7Var.C(j, true)) ? false : true;
                }
            }
        }
        if (this.I == 0) {
            this.M = false;
            this.G = false;
            this.H = false;
            wv8 wv8Var = this.m;
            if (wv8Var.E()) {
                oc7[] oc7VarArr = this.u;
                int length = oc7VarArr.length;
                while (i2 < length) {
                    oc7VarArr[i2].j();
                    i2++;
                }
                wv8Var.n();
            } else {
                this.O = false;
                for (oc7 oc7Var2 : this.u) {
                    oc7Var2.z(false);
                }
            }
        } else if (z) {
            j = i(j);
            while (i2 < pc7VarArr.length) {
                if (pc7VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.F = true;
        return j;
    }

    @Override // defpackage.ko7
    public final long f() {
        return q();
    }

    @Override // defpackage.zp4
    public final long g(long j, ll7 ll7Var) {
        w();
        if (!this.B.e()) {
            return 0L;
        }
        jl7 jl7VarJ = this.B.j(j);
        return ll7Var.a(j, jl7VarJ.a.a, jl7VarJ.b.a);
    }

    @Override // defpackage.zp4
    public final void h() throws IOException {
        int iZ = this.d.z(this.E);
        wv8 wv8Var = this.m;
        IOException iOException = (IOException) wv8Var.d;
        if (iOException != null) {
            throw iOException;
        }
        qa4 qa4Var = (qa4) wv8Var.c;
        if (qa4Var != null) {
            if (iZ == Integer.MIN_VALUE) {
                iZ = qa4Var.a;
            }
            IOException iOException2 = qa4Var.e;
            if (iOException2 != null && qa4Var.f > iZ) {
                throw iOException2;
            }
        }
        if (this.O && !this.x) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    @Override // defpackage.zp4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long i(long r10) {
        /*
            r9 = this;
            r9.w()
            vp7 r0 = r9.A
            java.lang.Object r0 = r0.c
            boolean[] r0 = (boolean[]) r0
            kl7 r1 = r9.B
            boolean r1 = r1.e()
            if (r1 == 0) goto L12
            goto L14
        L12:
            r10 = 0
        L14:
            r1 = 0
            r9.G = r1
            long r2 = r9.K
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L20
            r2 = r3
            goto L21
        L20:
            r2 = r1
        L21:
            r9.K = r10
            boolean r4 = r9.z()
            if (r4 == 0) goto L2c
            r9.L = r10
            return r10
        L2c:
            int r4 = r9.E
            r5 = 7
            wv8 r6 = r9.m
            if (r4 == r5) goto L73
            boolean r4 = r9.O
            if (r4 != 0) goto L3d
            boolean r4 = r6.E()
            if (r4 == 0) goto L73
        L3d:
            oc7[] r4 = r9.u
            int r4 = r4.length
            r5 = r1
        L41:
            if (r5 >= r4) goto L70
            oc7[] r7 = r9.u
            r7 = r7[r5]
            int r8 = r7.q()
            if (r8 != 0) goto L50
            if (r2 == 0) goto L50
            goto L6d
        L50:
            boolean r8 = r9.z
            if (r8 == 0) goto L5b
            int r8 = r7.q
            boolean r7 = r7.B(r8)
            goto L61
        L5b:
            boolean r8 = r9.O
            boolean r7 = r7.C(r10, r8)
        L61:
            if (r7 != 0) goto L6d
            boolean r7 = r0[r5]
            if (r7 != 0) goto L6b
            boolean r7 = r9.y
            if (r7 != 0) goto L6d
        L6b:
            r3 = r1
            goto L70
        L6d:
            int r5 = r5 + 1
            goto L41
        L70:
            if (r3 == 0) goto L73
            goto La3
        L73:
            r9.M = r1
            r9.L = r10
            r9.O = r1
            r9.H = r1
            boolean r0 = r6.E()
            if (r0 == 0) goto L92
            oc7[] r0 = r9.u
            int r2 = r0.length
        L84:
            if (r1 >= r2) goto L8e
            r3 = r0[r1]
            r3.j()
            int r1 = r1 + 1
            goto L84
        L8e:
            r6.n()
            return r10
        L92:
            r0 = 0
            r6.d = r0
            oc7[] r0 = r9.u
            int r2 = r0.length
            r3 = r1
        L99:
            if (r3 >= r2) goto La3
            r4 = r0[r3]
            r4.z(r1)
            int r3 = r3 + 1
            goto L99
        La3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm6.i(long):long");
    }

    @Override // defpackage.pa4
    public final void j(ra4 ra4Var, long j, long j2, int i) {
        om6 om6Var = (om6) ra4Var;
        this.e.r(i == 0 ? new da4(om6Var.j) : new da4(om6Var.j, om6Var.b.c, j2), 1, -1, null, 0, null, om6Var.i, this.C, i);
    }

    @Override // defpackage.zp4
    public final long k() {
        if (this.H) {
            this.H = false;
            return this.K;
        }
        if (!this.G) {
            return -9223372036854775807L;
        }
        if (!this.O && x() <= this.N) {
            return -9223372036854775807L;
        }
        this.G = false;
        return this.K;
    }

    @Override // defpackage.x72
    public final void l() {
        this.w = true;
        this.r.post(this.p);
    }

    @Override // defpackage.zp4
    public final void m(yp4 yp4Var, long j) {
        this.s = yp4Var;
        b bVar = this.k;
        if (bVar == null) {
            this.o.d();
            F();
        } else {
            o(0, 3).f(bVar);
            E(new nm3(-9223372036854775807L, new long[]{0}, new long[]{0}));
            l();
            this.L = j;
        }
    }

    @Override // defpackage.zp4
    public final zo8 n() {
        w();
        return (zo8) this.A.b;
    }

    @Override // defpackage.x72
    public final cp8 o(int i, int i2) {
        return D(new qm6(i, false));
    }

    @Override // defpackage.ko7
    public final boolean p(bb4 bb4Var) {
        if (this.O) {
            return false;
        }
        wv8 wv8Var = this.m;
        if (((IOException) wv8Var.d) != null || this.M) {
            return false;
        }
        if ((this.x || this.k != null) && this.I == 0) {
            return false;
        }
        boolean zD = this.o.d();
        if (wv8Var.E()) {
            return zD;
        }
        F();
        return true;
    }

    @Override // defpackage.ko7
    public final long q() {
        long jY;
        boolean z;
        w();
        if (this.O || this.I == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.L;
        }
        if (this.y) {
            int length = this.u.length;
            jY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                vp7 vp7Var = this.A;
                if (((boolean[]) vp7Var.c)[i] && ((boolean[]) vp7Var.d)[i]) {
                    oc7 oc7Var = this.u[i];
                    synchronized (oc7Var) {
                        z = oc7Var.w;
                    }
                    if (!z) {
                        jY = Math.min(jY, this.u[i].n());
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.K : jY;
    }

    @Override // defpackage.nc7
    public final void r() {
        this.r.post(this.p);
    }

    @Override // defpackage.zp4
    public final void s(long j, boolean z) throws Throwable {
        if (this.z) {
            return;
        }
        w();
        if (z()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.A.d;
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            this.u[i].i(z, zArr[i], j);
        }
    }

    @Override // defpackage.x72
    public final void t(kl7 kl7Var) {
        this.r.post(new lo4(this, kl7Var, 23));
    }

    @Override // defpackage.pa4
    public final ca4 u(ra4 ra4Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        ca4 ca4Var;
        kl7 kl7Var;
        om6 om6Var = (om6) ra4Var;
        da4 da4Var = new da4(om6Var.j, om6Var.b.c, j2);
        String str = j29.a;
        this.d.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i2 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            ca4Var = wv8.j;
        } else {
            int iX = x();
            int i3 = iX > this.N ? 1 : 0;
            if (this.J || !((kl7Var = this.B) == null || kl7Var.l() == -9223372036854775807L)) {
                this.N = iX;
            } else if (!this.x || G()) {
                this.G = this.x;
                this.K = 0L;
                this.N = 0;
                for (oc7 oc7Var : this.u) {
                    oc7Var.z(false);
                }
                om6Var.f.a = 0L;
                om6Var.i = 0L;
                om6Var.h = true;
                om6Var.l = false;
            } else {
                this.M = true;
                ca4Var = wv8.i;
            }
            ca4Var = new ca4(i3, jMin, false);
        }
        ca4 ca4Var2 = ca4Var;
        int i4 = ca4Var2.a;
        this.e.p(da4Var, 1, -1, null, 0, null, om6Var.i, this.C, iOException, !(i4 == 0 || i4 == 1));
        return ca4Var2;
    }

    public final void w() {
        vy2.s(this.x);
        this.A.getClass();
        this.B.getClass();
    }

    public final int x() {
        int i = 0;
        for (oc7 oc7Var : this.u) {
            i += oc7Var.q + oc7Var.p;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long y(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            oc7[] r3 = r5.u
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            vp7 r3 = r5.A
            r3.getClass()
            java.lang.Object r3 = r3.d
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            oc7[] r3 = r5.u
            r3 = r3[r2]
            long r3 = r3.n()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm6.y(boolean):long");
    }

    public final boolean z() {
        return this.L != -9223372036854775807L;
    }

    @Override // defpackage.ko7
    public final void v(long j) {
    }
}
