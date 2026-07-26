package coil3.compose;

import android.os.Trace;
import androidx.compose.runtime.g;
import coil3.size.Precision;
import coil3.size.Scale;
import defpackage.bt2;
import defpackage.do3;
import defpackage.dp2;
import defpackage.e71;
import defpackage.ey7;
import defpackage.g16;
import defpackage.hv1;
import defpackage.ja1;
import defpackage.js3;
import defpackage.k7;
import defpackage.li1;
import defpackage.m37;
import defpackage.mi1;
import defpackage.mi3;
import defpackage.my7;
import defpackage.ni1;
import defpackage.oi3;
import defpackage.p41;
import defpackage.pi3;
import defpackage.q29;
import defpackage.q41;
import defpackage.rv6;
import defpackage.s08;
import defpackage.tc0;
import defpackage.up1;
import defpackage.w61;
import defpackage.wb5;
import defpackage.wt3;
import defpackage.xw;
import defpackage.y61;
import defpackage.yw;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncImagePainter extends g16 implements m37 {
    public static final k7 u = new k7(21);
    public tc0 h;
    public boolean i;
    public wt3 j;
    public e71 l;
    public a p;
    public xw q;
    public final l r;
    public final l s;
    public final rv6 t;
    public final wb5 f = g.h(null);
    public float g = 1.0f;
    public long k = 9205357640488583168L;
    public dp2 m = u;
    public q41 n = p41.b;
    public int o = 1;

    public AsyncImagePainter(xw xwVar) {
        this.q = xwVar;
        this.r = ja1.b(xwVar);
        l lVarB = ja1.b(yw.a);
        this.s = lVarB;
        this.t = new rv6(lVarB);
    }

    public static final pi3 j(AsyncImagePainter asyncImagePainter, pi3 pi3Var, boolean z) {
        mi3 mi3VarA = pi3.a(pi3Var);
        mi3VarA.d = new do3(pi3Var, asyncImagePainter, false);
        oi3 oi3Var = pi3Var.t;
        if (oi3Var.g == null) {
            mi3VarA.m = my7.a;
        }
        if (oi3Var.h == null) {
            q41 q41Var = asyncImagePainter.n;
            int i = q29.b;
            mi3VarA.n = (js3.i(q41Var, p41.b) || js3.i(q41Var, p41.c)) ? Scale.b : Scale.a;
        }
        if (oi3Var.i == null) {
            mi3VarA.o = Precision.b;
        }
        if (z) {
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
            mi3VarA.g = emptyCoroutineContext;
            mi3VarA.h = emptyCoroutineContext;
            mi3VarA.i = emptyCoroutineContext;
        }
        return mi3VarA.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(coil3.compose.AsyncImagePainter r10, defpackage.zw r11) {
        /*
            kotlinx.coroutines.flow.l r0 = r10.s
            java.lang.Object r1 = r0.getValue()
            zw r1 = (defpackage.zw) r1
            dp2 r2 = r10.m
            java.lang.Object r11 = r2.invoke(r11)
            zw r11 = (defpackage.zw) r11
            r0.o(r11)
            q41 r5 = r10.n
            boolean r0 = r11 instanceof coil3.compose.AsyncImagePainter$State$Success
            r9 = 0
            if (r0 == 0) goto L20
            r0 = r11
            coil3.compose.AsyncImagePainter$State$Success r0 = (coil3.compose.AsyncImagePainter$State$Success) r0
            ib8 r0 = r0.a
            goto L29
        L20:
            boolean r0 = r11 instanceof coil3.compose.AsyncImagePainter$State$Error
            if (r0 == 0) goto L6f
            r0 = r11
            coil3.compose.AsyncImagePainter$State$Error r0 = (coil3.compose.AsyncImagePainter$State$Error) r0
            p32 r0 = r0.a
        L29:
            pi3 r2 = r0.a()
            zn5 r3 = defpackage.si3.a
            java.lang.Object r2 = defpackage.gu9.q(r2, r3)
            ar8 r2 = (defpackage.ar8) r2
            ax r3 = defpackage.ok4.a
            hr8 r2 = r2.a(r3, r0)
            boolean r3 = r2 instanceof defpackage.a81
            if (r3 == 0) goto L6f
            g16 r3 = r1.a()
            boolean r4 = r1 instanceof coil3.compose.AsyncImagePainter$State$Loading
            if (r4 == 0) goto L48
            goto L49
        L48:
            r3 = r9
        L49:
            g16 r4 = r11.a()
            int r6 = defpackage.qx1.d
            a81 r2 = (defpackage.a81) r2
            int r2 = r2.c
            kotlin.time.DurationUnit r6 = kotlin.time.DurationUnit.d
            long r6 = defpackage.wq2.T(r2, r6)
            boolean r2 = r0 instanceof defpackage.ib8
            if (r2 == 0) goto L67
            ib8 r0 = (defpackage.ib8) r0
            boolean r0 = r0.g
            if (r0 != 0) goto L64
            goto L67
        L64:
            r0 = 0
        L65:
            r8 = r0
            goto L69
        L67:
            r0 = 1
            goto L65
        L69:
            coil3.compose.CrossfadePainter r2 = new coil3.compose.CrossfadePainter
            r2.<init>(r3, r4, r5, r6, r8)
            goto L70
        L6f:
            r2 = r9
        L70:
            if (r2 == 0) goto L73
            goto L77
        L73:
            g16 r2 = r11.a()
        L77:
            wb5 r10 = r10.f
            s08 r10 = (defpackage.s08) r10
            r10.setValue(r2)
            g16 r10 = r1.a()
            g16 r0 = r11.a()
            if (r10 == r0) goto La9
            g16 r10 = r1.a()
            boolean r0 = r10 instanceof defpackage.m37
            if (r0 == 0) goto L93
            m37 r10 = (defpackage.m37) r10
            goto L94
        L93:
            r10 = r9
        L94:
            if (r10 == 0) goto L99
            r10.c()
        L99:
            g16 r10 = r11.a()
            boolean r11 = r10 instanceof defpackage.m37
            if (r11 == 0) goto La4
            r9 = r10
            m37 r9 = (defpackage.m37) r9
        La4:
            if (r9 == 0) goto La9
            r9.e()
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter.k(coil3.compose.AsyncImagePainter, zw):void");
    }

    @Override // defpackage.m37
    public final void a() {
        wt3 wt3Var = this.j;
        if (wt3Var != null) {
            wt3Var.g(null);
        }
        this.j = null;
        Object obj = (g16) ((s08) this.f).getValue();
        m37 m37Var = obj instanceof m37 ? (m37) obj : null;
        if (m37Var != null) {
            m37Var.a();
        }
        this.i = false;
    }

    @Override // defpackage.g16
    public final boolean b(float f) {
        this.g = f;
        return true;
    }

    @Override // defpackage.m37
    public final void c() {
        wt3 wt3Var = this.j;
        if (wt3Var != null) {
            wt3Var.g(null);
        }
        this.j = null;
        Object obj = (g16) ((s08) this.f).getValue();
        m37 m37Var = obj instanceof m37 ? (m37) obj : null;
        if (m37Var != null) {
            m37Var.c();
        }
        this.i = false;
    }

    @Override // defpackage.g16
    public final boolean d(tc0 tc0Var) {
        this.h = tc0Var;
        return true;
    }

    @Override // defpackage.m37
    public final void e() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (g16) ((s08) this.f).getValue();
            m37 m37Var = obj instanceof m37 ? (m37) obj : null;
            if (m37Var != null) {
                m37Var.e();
            }
            l();
            this.i = true;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.g16
    public final long h() {
        g16 g16Var = (g16) ((s08) this.f).getValue();
        if (g16Var != null) {
            return g16Var.h();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.g16
    public final void i(hv1 hv1Var) {
        long jD = hv1Var.d();
        if (!ey7.b(this.k, jD)) {
            this.k = jD;
        }
        g16 g16Var = (g16) ((s08) this.f).getValue();
        if (g16Var != null) {
            g16Var.g(hv1Var, hv1Var.d(), this.g, this.h);
        }
    }

    public final void l() {
        xw xwVar = this.q;
        if (xwVar == null) {
            return;
        }
        e71 e71Var = this.l;
        if (e71Var == null) {
            js3.V("scope");
            throw null;
        }
        AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$1 = new AsyncImagePainter$launchJob$1(this, xwVar, null);
        w61 coroutineContext = e71Var.getCoroutineContext();
        int i = q29.b;
        y61 y61Var = (y61) coroutineContext.r0(y61.b);
        li1 li1VarF = (y61Var == null || y61Var.equals(up1.b)) ? bt2.F(e71Var, up1.b, CoroutineStart.d, asyncImagePainter$launchJob$1) : bt2.F(js3.a(new mi1(e71Var.getCoroutineContext())), new ni1(y61Var), CoroutineStart.d, asyncImagePainter$launchJob$1);
        wt3 wt3Var = this.j;
        if (wt3Var != null) {
            wt3Var.g(null);
        }
        this.j = li1VarF;
    }

    public final void m(xw xwVar) {
        if (js3.i(this.q, xwVar)) {
            return;
        }
        this.q = xwVar;
        if (xwVar == null) {
            wt3 wt3Var = this.j;
            if (wt3Var != null) {
                wt3Var.g(null);
            }
            this.j = null;
        } else if (this.i) {
            l();
        }
        if (xwVar != null) {
            l lVar = this.r;
            lVar.getClass();
            lVar.p(null, xwVar);
        }
    }
}
