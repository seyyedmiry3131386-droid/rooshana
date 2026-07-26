package defpackage;

import android.net.Uri;
import android.os.Looper;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k03 extends x70 {
    public final xe1 h;
    public final pt2 i;
    public final fv j;
    public final vw1 k;
    public final fv l;
    public final boolean m;
    public final int n;
    public final af1 o;
    public final long p;
    public ep4 q;
    public fq8 r;
    public jp4 s;

    static {
        lp4.a("media3.exoplayer.hls");
    }

    public k03(jp4 jp4Var, pt2 pt2Var, xe1 xe1Var, fv fvVar, vw1 vw1Var, fv fvVar2, af1 af1Var, long j, boolean z, int i) {
        this.s = jp4Var;
        this.q = jp4Var.c;
        this.i = pt2Var;
        this.h = xe1Var;
        this.j = fvVar;
        this.k = vw1Var;
        this.l = fvVar2;
        this.o = af1Var;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static e03 t(long j, List list) {
        e03 e03Var = null;
        for (int i = 0; i < list.size(); i++) {
            e03 e03Var2 = (e03) list.get(i);
            long j2 = e03Var2.e;
            if (j2 > j || !e03Var2.l) {
                if (j2 > j) {
                    break;
                }
            } else {
                e03Var = e03Var2;
            }
        }
        return e03Var;
    }

    @Override // defpackage.x70
    public final boolean a(jp4 jp4Var) {
        jp4 jp4VarH = h();
        fp4 fp4Var = jp4VarH.b;
        fp4Var.getClass();
        fp4 fp4Var2 = jp4Var.b;
        return fp4Var2 != null && fp4Var2.a.equals(fp4Var.a) && fp4Var2.e.equals(fp4Var.e) && Objects.equals(fp4Var2.c, fp4Var.c) && jp4VarH.c.equals(jp4Var.c);
    }

    @Override // defpackage.x70
    public final zp4 b(ks4 ks4Var, qc1 qc1Var, long j) {
        pg pgVar = new pg((CopyOnWriteArrayList) this.c.d, 0, ks4Var);
        sw1 sw1Var = new sw1(this.d.c, 0, ks4Var);
        fq8 fq8Var = this.r;
        ee6 ee6Var = this.g;
        vy2.t(ee6Var);
        return new a03(this.h, this.o, this.i, fq8Var, this.k, sw1Var, this.l, pgVar, qc1Var, this.j, this.m, this.n, ee6Var);
    }

    @Override // defpackage.x70
    public final synchronized jp4 h() {
        return this.s;
    }

    @Override // defpackage.x70
    public final void j() throws IOException {
        af1 af1Var = this.o;
        wv8 wv8Var = af1Var.g;
        if (wv8Var != null) {
            IOException iOException = (IOException) wv8Var.d;
            if (iOException != null) {
                throw iOException;
            }
            qa4 qa4Var = (qa4) wv8Var.c;
            if (qa4Var != null) {
                int i = qa4Var.a;
                IOException iOException2 = qa4Var.e;
                if (iOException2 != null && qa4Var.f > i) {
                    throw iOException2;
                }
            }
        }
        Uri uri = af1Var.k;
        if (uri != null) {
            ze1 ze1Var = (ze1) af1Var.d.get(uri);
            wv8 wv8Var2 = ze1Var.b;
            IOException iOException3 = (IOException) wv8Var2.d;
            if (iOException3 != null) {
                throw iOException3;
            }
            qa4 qa4Var2 = (qa4) wv8Var2.c;
            if (qa4Var2 != null) {
                int i2 = qa4Var2.a;
                IOException iOException4 = qa4Var2.e;
                if (iOException4 != null && qa4Var2.f > i2) {
                    throw iOException4;
                }
            }
            IOException iOException5 = ze1Var.j;
            if (iOException5 != null) {
                throw iOException5;
            }
        }
    }

    @Override // defpackage.x70
    public final void l(fq8 fq8Var) {
        this.r = fq8Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        ee6 ee6Var = this.g;
        vy2.t(ee6Var);
        vw1 vw1Var = this.k;
        vw1Var.k(looperMyLooper, ee6Var);
        vw1Var.c();
        pg pgVar = new pg((CopyOnWriteArrayList) this.c.d, 0, (ks4) null);
        fp4 fp4Var = h().b;
        fp4Var.getClass();
        Uri uri = fp4Var.a;
        af1 af1Var = this.o;
        af1Var.getClass();
        af1Var.h = j29.p(null);
        af1Var.f = pgVar;
        af1Var.i = this;
        Map map = Collections.EMPTY_MAP;
        vy2.u(uri, "The uri must be set.");
        m26 m26Var = new m26(((wa1) af1Var.a.b).k(), new db1(uri, 0L, 1, null, map, 0L, -1L, null, 1), af1Var.b.r());
        vy2.s(af1Var.g == null);
        wv8 wv8Var = new wv8("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        af1Var.g = wv8Var;
        wv8Var.S(m26Var, af1Var, af1Var.c.z(m26Var.c));
    }

    @Override // defpackage.x70
    public final void n(zp4 zp4Var) {
        a03 a03Var = (a03) zp4Var;
        a03Var.b.e.remove(a03Var);
        for (x03 x03Var : a03Var.t) {
            if (x03Var.D) {
                for (w03 w03Var : x03Var.v) {
                    w03Var.j();
                    pw1 pw1Var = w03Var.h;
                    if (pw1Var != null) {
                        pw1Var.c(w03Var.e);
                        w03Var.h = null;
                        w03Var.g = null;
                    }
                }
            }
            yz2 yz2Var = x03Var.d;
            ze1 ze1Var = (ze1) yz2Var.g.d.get(yz2Var.e[yz2Var.r.l()]);
            if (ze1Var != null) {
                ze1Var.k = false;
            }
            yz2Var.n = null;
            x03Var.j.K(x03Var);
            x03Var.r.removeCallbacksAndMessages(null);
            x03Var.H = true;
            x03Var.s.clear();
        }
        a03Var.q = null;
    }

    @Override // defpackage.x70
    public final void p() {
        af1 af1Var = this.o;
        af1Var.k = null;
        af1Var.l = null;
        af1Var.j = null;
        af1Var.n = -9223372036854775807L;
        af1Var.g.K(null);
        af1Var.g = null;
        HashMap map = af1Var.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((ze1) it.next()).b.K(null);
        }
        af1Var.h.removeCallbacksAndMessages(null);
        af1Var.h = null;
        map.clear();
        this.k.a();
    }

    @Override // defpackage.x70
    public final synchronized void s(jp4 jp4Var) {
        this.s = jp4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(j03 j03Var) {
        long j;
        ex7 ex7Var;
        long j2;
        long jV;
        long j3;
        boolean z = j03Var.p;
        boolean z2 = j03Var.g;
        ImmutableList immutableList = j03Var.r;
        long j4 = j03Var.u;
        long jV2 = j03Var.e;
        int i = j03Var.d;
        long j5 = j03Var.h;
        long jK0 = z ? j29.k0(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jK0 : -9223372036854775807L;
        af1 af1Var = this.o;
        af1Var.j.getClass();
        cv cvVar = new cv(26);
        long j7 = 0;
        if (af1Var.m) {
            i03 i03Var = j03Var.v;
            long j8 = j5 - af1Var.n;
            boolean z3 = j03Var.o;
            long j9 = z3 ? j8 + j4 : -9223372036854775807L;
            long jV3 = j03Var.p ? j29.V(j29.D(this.p)) - (j5 + j4) : 0L;
            long j10 = this.q.a;
            if (j10 != -9223372036854775807L) {
                jV = j29.V(j10);
            } else {
                if (jV2 != -9223372036854775807L) {
                    j2 = j4 - jV2;
                } else {
                    j2 = i03Var.d;
                    if (j2 == -9223372036854775807L || j03Var.n == -9223372036854775807L) {
                        j2 = i03Var.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * j03Var.m;
                        }
                    }
                }
                jV = j2 + jV3;
            }
            long j11 = j4 + jV3;
            long j12 = j29.j(jV, jV3, j11);
            ep4 ep4Var = h().c;
            boolean z4 = ep4Var.d == -3.4028235E38f && ep4Var.e == -3.4028235E38f && i03Var.c == -9223372036854775807L && i03Var.d == -9223372036854775807L;
            dp4 dp4Var = new dp4();
            dp4Var.a = j29.k0(j12);
            dp4Var.d = z4 ? 1.0f : this.q.d;
            dp4Var.e = z4 ? 1.0f : this.q.e;
            ep4 ep4Var2 = new ep4(dp4Var);
            this.q = ep4Var2;
            if (jV2 == -9223372036854775807L) {
                jV2 = j11 - j29.V(ep4Var2.a);
            }
            if (z2) {
                j7 = jV2;
            } else {
                e03 e03VarT = t(jV2, j03Var.s);
                if (e03VarT != null) {
                    j3 = e03VarT.e;
                } else if (!immutableList.isEmpty()) {
                    g03 g03Var = (g03) immutableList.get(j29.c(immutableList, Long.valueOf(jV2), true));
                    e03 e03VarT2 = t(jV2, g03Var.m);
                    j3 = e03VarT2 != null ? e03VarT2.e : g03Var.e;
                }
                j7 = j3;
            }
            ex7Var = new ex7(j6, jK0, j9, j03Var.u, j8, j7, true, !z3, i == 2 && j03Var.f, cvVar, h(), this.q);
        } else {
            if (jV2 == -9223372036854775807L || immutableList.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jV2 != j4) {
                    jV2 = ((g03) immutableList.get(j29.c(immutableList, Long.valueOf(jV2), true))).e;
                }
                j = jV2;
            }
            long j13 = j03Var.u;
            ex7Var = new ex7(j6, jK0, j13, j13, 0L, j, true, false, true, cvVar, h(), null);
        }
        m(ex7Var);
    }
}
