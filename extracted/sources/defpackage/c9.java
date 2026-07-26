package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.ImmutableList;
import ir.mservices.market.reels.ui.recycler.ReelAdData;
import ir.mservices.market.reels.ui.recycler.a;
import ir.mservices.market.views.MyketTextView;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.viewmodel.b;
import ir.myket.player.viewmodel.e;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c9 implements eb6 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ c9(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final /* synthetic */ void A0(int i, jp4 jp4Var) {
    }

    private final /* synthetic */ void A1(boolean z) {
    }

    private final /* synthetic */ void B0(int i, jp4 jp4Var) {
    }

    private final /* synthetic */ void B1(boolean z) {
    }

    private final /* synthetic */ void C0(int i, jp4 jp4Var) {
    }

    private final /* synthetic */ void C1(boolean z) {
    }

    private final /* synthetic */ void D0(qp4 qp4Var) {
    }

    private final /* synthetic */ void D1(boolean z) {
    }

    private final /* synthetic */ void E0(qp4 qp4Var) {
    }

    private final /* synthetic */ void E1(int i, int i2) {
    }

    private final /* synthetic */ void F0(qp4 qp4Var) {
    }

    private final /* synthetic */ void F1(int i, int i2) {
    }

    private final /* synthetic */ void G(cb6 cb6Var) {
    }

    private final /* synthetic */ void G0(jv4 jv4Var) {
    }

    private final /* synthetic */ void G1(int i, int i2) {
    }

    private final /* synthetic */ void H0(jv4 jv4Var) {
    }

    private final /* synthetic */ void H1(int i, int i2) {
    }

    private final /* synthetic */ void I0(jv4 jv4Var) {
    }

    private final /* synthetic */ void I1(bm8 bm8Var, int i) {
    }

    private final /* synthetic */ void J0(jv4 jv4Var) {
    }

    private final /* synthetic */ void J1(bm8 bm8Var, int i) {
    }

    private final /* synthetic */ void K0(int i, boolean z) {
    }

    private final /* synthetic */ void K1(hp8 hp8Var) {
    }

    private final /* synthetic */ void L(cb6 cb6Var) {
    }

    private final /* synthetic */ void L0(int i, boolean z) {
    }

    private final /* synthetic */ void L1(hp8 hp8Var) {
    }

    private final /* synthetic */ void M0(int i, boolean z) {
    }

    private final /* synthetic */ void M1(hp8 hp8Var) {
    }

    private final /* synthetic */ void N0(ua6 ua6Var) {
    }

    private final /* synthetic */ void N1(rp8 rp8Var) {
    }

    private final /* synthetic */ void O0(ua6 ua6Var) {
    }

    private final /* synthetic */ void O1(rp8 rp8Var) {
    }

    private final /* synthetic */ void P0(ua6 ua6Var) {
    }

    private final /* synthetic */ void P1(rp8 rp8Var) {
    }

    private final /* synthetic */ void Q0(int i) {
    }

    private final /* synthetic */ void Q1(w59 w59Var) {
    }

    private final /* synthetic */ void R0(int i) {
    }

    private final /* synthetic */ void R1(w59 w59Var) {
    }

    private final /* synthetic */ void S0(int i) {
    }

    private final /* synthetic */ void S1(w59 w59Var) {
    }

    private final /* synthetic */ void T0(PlaybackException playbackException) {
    }

    private final /* synthetic */ void T1(float f) {
    }

    private final /* synthetic */ void U(cb6 cb6Var) {
    }

    private final /* synthetic */ void U0(PlaybackException playbackException) {
    }

    private final /* synthetic */ void U1(float f) {
    }

    private final /* synthetic */ void V0(PlaybackException playbackException) {
    }

    private final /* synthetic */ void V1(float f) {
    }

    private final /* synthetic */ void W(m81 m81Var) {
    }

    private final /* synthetic */ void W0(PlaybackException playbackException) {
    }

    private final /* synthetic */ void X(List list) {
    }

    private final /* synthetic */ void X0(int i, boolean z) {
    }

    private final /* synthetic */ void Y(List list) {
    }

    private final /* synthetic */ void Y0(int i, boolean z) {
    }

    private final /* synthetic */ void Z(m81 m81Var) {
    }

    private final /* synthetic */ void Z0(int i, boolean z) {
    }

    private final /* synthetic */ void a0(List list) {
    }

    private final /* synthetic */ void a1(int i, boolean z) {
    }

    private final /* synthetic */ void b0(m81 m81Var) {
    }

    private final /* synthetic */ void b1(qp4 qp4Var) {
    }

    private final /* synthetic */ void c0(List list) {
    }

    private final /* synthetic */ void c1(qp4 qp4Var) {
    }

    private final /* synthetic */ void d0(wl1 wl1Var) {
    }

    private final /* synthetic */ void d1(qp4 qp4Var) {
    }

    private final /* synthetic */ void e0(wl1 wl1Var) {
    }

    private final /* synthetic */ void e1(int i) {
    }

    private final /* synthetic */ void f(ly lyVar) {
    }

    private final /* synthetic */ void f0(wl1 wl1Var) {
    }

    private final /* synthetic */ void f1(int i, fb6 fb6Var, fb6 fb6Var2) {
    }

    private final /* synthetic */ void g(ly lyVar) {
    }

    private final /* synthetic */ void g0(int i, boolean z) {
    }

    private final /* synthetic */ void g1(int i) {
    }

    private final /* synthetic */ void h0(int i, boolean z) {
    }

    private final /* synthetic */ void h1(int i) {
    }

    private final /* synthetic */ void i0(int i, boolean z) {
    }

    private final /* synthetic */ void i1(int i, fb6 fb6Var, fb6 fb6Var2) {
    }

    private final /* synthetic */ void j0(gb6 gb6Var, db6 db6Var) {
    }

    private final /* synthetic */ void j1(int i) {
    }

    private final /* synthetic */ void k(ly lyVar) {
    }

    private final /* synthetic */ void k0(gb6 gb6Var, db6 db6Var) {
    }

    private final /* synthetic */ void k1(int i, fb6 fb6Var, fb6 fb6Var2) {
    }

    private final /* synthetic */ void l0(gb6 gb6Var, db6 db6Var) {
    }

    private final /* synthetic */ void l1() {
    }

    private final /* synthetic */ void m0(gb6 gb6Var, db6 db6Var) {
    }

    private final /* synthetic */ void m1() {
    }

    private final /* synthetic */ void n0(boolean z) {
    }

    private final /* synthetic */ void n1() {
    }

    private final /* synthetic */ void o0(boolean z) {
    }

    private final /* synthetic */ void o1(int i) {
    }

    private final /* synthetic */ void p(int i) {
    }

    private final /* synthetic */ void p0(boolean z) {
    }

    private final /* synthetic */ void p1(int i) {
    }

    private final /* synthetic */ void q0(boolean z) {
    }

    private final /* synthetic */ void q1(int i) {
    }

    private final /* synthetic */ void r0(boolean z) {
    }

    private final /* synthetic */ void r1(long j) {
    }

    private final /* synthetic */ void s(int i) {
    }

    private final /* synthetic */ void s0(boolean z) {
    }

    private final /* synthetic */ void s1(long j) {
    }

    private final /* synthetic */ void t0(boolean z) {
    }

    private final /* synthetic */ void t1(long j) {
    }

    private final /* synthetic */ void u(int i) {
    }

    private final /* synthetic */ void u0(boolean z) {
    }

    private final /* synthetic */ void u1(long j) {
    }

    private final /* synthetic */ void v0(boolean z) {
    }

    private final /* synthetic */ void v1(long j) {
    }

    private final /* synthetic */ void w(int i) {
    }

    private final /* synthetic */ void w0(boolean z) {
    }

    private final /* synthetic */ void w1(long j) {
    }

    private final /* synthetic */ void x0(long j) {
    }

    private final /* synthetic */ void x1(boolean z) {
    }

    private final /* synthetic */ void y0(long j) {
    }

    private final /* synthetic */ void y1(boolean z) {
    }

    private final /* synthetic */ void z0(long j) {
    }

    private final /* synthetic */ void z1(boolean z) {
    }

    @Override // defpackage.eb6
    public final void A(long j) {
        hp8 hp8Var;
        boolean z;
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        he6 he6Var = xq4VarB.s;
                        PlaybackException playbackException = he6Var.a;
                        int i = he6Var.b;
                        aq7 aq7Var = he6Var.c;
                        fb6 fb6Var = he6Var.d;
                        fb6 fb6Var2 = he6Var.e;
                        int i2 = he6Var.f;
                        ua6 ua6Var = he6Var.g;
                        int i3 = he6Var.h;
                        boolean z2 = he6Var.i;
                        bm8 bm8Var = he6Var.j;
                        int i4 = he6Var.k;
                        w59 w59Var = he6Var.l;
                        qp4 qp4Var = he6Var.m;
                        float f = he6Var.n;
                        ly lyVar = he6Var.o;
                        m81 m81Var = he6Var.p;
                        wl1 wl1Var = he6Var.q;
                        int i5 = he6Var.r;
                        boolean z3 = he6Var.s;
                        boolean z4 = he6Var.t;
                        int i6 = he6Var.u;
                        boolean z5 = he6Var.v;
                        boolean z6 = he6Var.w;
                        int i7 = he6Var.x;
                        int i8 = he6Var.y;
                        qp4 qp4Var2 = he6Var.z;
                        long j2 = he6Var.B;
                        long j3 = he6Var.C;
                        rp8 rp8Var = he6Var.D;
                        hp8 hp8Var2 = he6Var.E;
                        try {
                            if (!bm8Var.p()) {
                                hp8Var = hp8Var2;
                                if (aq7Var.a.b >= bm8Var.o()) {
                                    z = false;
                                }
                                vy2.s(z);
                                xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                                xq4VarB.c.a(true, true);
                                xq4VarB.h.i.getClass();
                            } else {
                                hp8Var = hp8Var2;
                            }
                            xq4VarB.h.i.getClass();
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z = true;
                        vy2.s(z);
                        xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                        xq4VarB.c.a(true, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void B(int i, fb6 fb6Var, fb6 fb6Var2) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        xq4VarB.s = xq4VarB.s.e(i, fb6Var, fb6Var2);
                        xq4VarB.c.a(true, true);
                        try {
                            hr4 hr4Var = (hr4) xq4VarB.h.i.e;
                            hr4Var.N(hr4Var.g.t);
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void C(qp4 qp4Var) {
        hp8 hp8Var;
        boolean z;
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        he6 he6Var = xq4VarB.s;
                        PlaybackException playbackException = he6Var.a;
                        int i = he6Var.b;
                        aq7 aq7Var = he6Var.c;
                        fb6 fb6Var = he6Var.d;
                        fb6 fb6Var2 = he6Var.e;
                        int i2 = he6Var.f;
                        ua6 ua6Var = he6Var.g;
                        int i3 = he6Var.h;
                        boolean z2 = he6Var.i;
                        bm8 bm8Var = he6Var.j;
                        int i4 = he6Var.k;
                        w59 w59Var = he6Var.l;
                        qp4 qp4Var2 = he6Var.m;
                        float f = he6Var.n;
                        ly lyVar = he6Var.o;
                        m81 m81Var = he6Var.p;
                        wl1 wl1Var = he6Var.q;
                        int i5 = he6Var.r;
                        boolean z3 = he6Var.s;
                        boolean z4 = he6Var.t;
                        int i6 = he6Var.u;
                        boolean z5 = he6Var.v;
                        boolean z6 = he6Var.w;
                        int i7 = he6Var.x;
                        int i8 = he6Var.y;
                        long j = he6Var.A;
                        long j2 = he6Var.B;
                        long j3 = he6Var.C;
                        rp8 rp8Var = he6Var.D;
                        hp8 hp8Var2 = he6Var.E;
                        try {
                            if (!bm8Var.p()) {
                                hp8Var = hp8Var2;
                                if (aq7Var.a.b >= bm8Var.o()) {
                                    z = false;
                                }
                                vy2.s(z);
                                xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var2, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var, j, j2, j3, rp8Var, hp8Var);
                                xq4VarB.c.a(true, true);
                                xq4VarB.h.i.u();
                            } else {
                                hp8Var = hp8Var2;
                            }
                            xq4VarB.h.i.u();
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z = true;
                        vy2.s(z);
                        xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var2, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var, j, j2, j3, rp8Var, hp8Var);
                        xq4VarB.c.a(true, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void D(qp4 qp4Var) {
        hp8 hp8Var;
        boolean z;
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    he6 he6Var = xq4VarB.s;
                    PlaybackException playbackException = he6Var.a;
                    int i = he6Var.b;
                    aq7 aq7Var = he6Var.c;
                    fb6 fb6Var = he6Var.d;
                    fb6 fb6Var2 = he6Var.e;
                    int i2 = he6Var.f;
                    ua6 ua6Var = he6Var.g;
                    int i3 = he6Var.h;
                    boolean z2 = he6Var.i;
                    bm8 bm8Var = he6Var.j;
                    int i4 = he6Var.k;
                    w59 w59Var = he6Var.l;
                    float f = he6Var.n;
                    ly lyVar = he6Var.o;
                    m81 m81Var = he6Var.p;
                    wl1 wl1Var = he6Var.q;
                    int i5 = he6Var.r;
                    boolean z3 = he6Var.s;
                    boolean z4 = he6Var.t;
                    int i6 = he6Var.u;
                    boolean z5 = he6Var.v;
                    boolean z6 = he6Var.w;
                    int i7 = he6Var.x;
                    int i8 = he6Var.y;
                    qp4 qp4Var2 = he6Var.z;
                    long j = he6Var.A;
                    long j2 = he6Var.B;
                    long j3 = he6Var.C;
                    rp8 rp8Var = he6Var.D;
                    hp8 hp8Var2 = he6Var.E;
                    try {
                        if (!bm8Var.p()) {
                            hp8Var = hp8Var2;
                            if (aq7Var.a.b >= bm8Var.o()) {
                                z = false;
                            }
                            vy2.s(z);
                            xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                            xq4VarB.c.a(true, true);
                            xq4VarB.h.i.q(qp4Var);
                        } else {
                            hp8Var = hp8Var2;
                        }
                        xq4VarB.h.i.q(qp4Var);
                    } catch (RemoteException e) {
                        wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                    z = true;
                    vy2.s(z);
                    xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                    xq4VarB.c.a(true, true);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void E(long j) {
        hp8 hp8Var;
        boolean z;
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        he6 he6Var = xq4VarB.s;
                        PlaybackException playbackException = he6Var.a;
                        int i = he6Var.b;
                        aq7 aq7Var = he6Var.c;
                        fb6 fb6Var = he6Var.d;
                        fb6 fb6Var2 = he6Var.e;
                        int i2 = he6Var.f;
                        ua6 ua6Var = he6Var.g;
                        int i3 = he6Var.h;
                        boolean z2 = he6Var.i;
                        bm8 bm8Var = he6Var.j;
                        int i4 = he6Var.k;
                        w59 w59Var = he6Var.l;
                        qp4 qp4Var = he6Var.m;
                        float f = he6Var.n;
                        ly lyVar = he6Var.o;
                        m81 m81Var = he6Var.p;
                        wl1 wl1Var = he6Var.q;
                        int i5 = he6Var.r;
                        boolean z3 = he6Var.s;
                        boolean z4 = he6Var.t;
                        int i6 = he6Var.u;
                        boolean z5 = he6Var.v;
                        boolean z6 = he6Var.w;
                        int i7 = he6Var.x;
                        int i8 = he6Var.y;
                        qp4 qp4Var2 = he6Var.z;
                        long j2 = he6Var.A;
                        long j3 = he6Var.C;
                        rp8 rp8Var = he6Var.D;
                        hp8 hp8Var2 = he6Var.E;
                        try {
                            if (!bm8Var.p()) {
                                hp8Var = hp8Var2;
                                if (aq7Var.a.b >= bm8Var.o()) {
                                    z = false;
                                }
                                vy2.s(z);
                                xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j2, j, j3, rp8Var, hp8Var);
                                xq4VarB.c.a(true, true);
                                xq4VarB.h.i.getClass();
                            } else {
                                hp8Var = hp8Var2;
                            }
                            xq4VarB.h.i.getClass();
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z = true;
                        vy2.s(z);
                        xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j2, j, j3, rp8Var, hp8Var);
                        xq4VarB.c.a(true, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void F(bm8 bm8Var, int i) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    qg6 qg6Var = (qg6) ((WeakReference) this.c).get();
                    if (qg6Var != null) {
                        xq4VarB.s = xq4VarB.s.k(bm8Var, qg6Var.k0(), i);
                        xq4VarB.c.a(false, true);
                        try {
                            xq4VarB.h.i.t(bm8Var);
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 2:
                e eVar = (e) this.b;
                js3.p(bm8Var, "timeline");
                if (i == 1) {
                    long duration = ((e62) eVar.d).getDuration();
                    Long lValueOf = Long.valueOf(duration);
                    if (duration < 0) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        eVar.e(new pc6(lValueOf.longValue()));
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eb6
    public final void H() {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    vp7 vp7Var = xq4VarB.g.o;
                    ImmutableList immutableListO = vp7Var.O();
                    for (int i = 0; i < immutableListO.size(); i++) {
                        hq4 hq4Var = (hq4) immutableListO.get(i);
                        vp7Var.U(hq4Var);
                        xq4VarB.c(hq4Var, new vj3(28));
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void I(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void J(List list) {
        int i = this.a;
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void K(int i, boolean z) {
        int i2 = this.a;
    }

    @Override // defpackage.eb6
    public final void M(ua6 ua6Var) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        xq4VarB.s = xq4VarB.s.c(ua6Var);
                        xq4VarB.c.a(true, true);
                        try {
                            hr4 hr4Var = (hr4) xq4VarB.h.i.e;
                            hr4Var.N(hr4Var.g.t);
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void N(cb6 cb6Var) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        xq4VarB.f(cb6Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void O(PlaybackException playbackException) {
        int i = this.a;
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void P(jv4 jv4Var) {
        int i = this.a;
    }

    @Override // defpackage.eb6
    public final void Q(wl1 wl1Var) {
        hp8 hp8Var;
        boolean z;
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        he6 he6Var = xq4VarB.s;
                        PlaybackException playbackException = he6Var.a;
                        int i = he6Var.b;
                        aq7 aq7Var = he6Var.c;
                        fb6 fb6Var = he6Var.d;
                        fb6 fb6Var2 = he6Var.e;
                        int i2 = he6Var.f;
                        ua6 ua6Var = he6Var.g;
                        int i3 = he6Var.h;
                        boolean z2 = he6Var.i;
                        bm8 bm8Var = he6Var.j;
                        int i4 = he6Var.k;
                        w59 w59Var = he6Var.l;
                        qp4 qp4Var = he6Var.m;
                        float f = he6Var.n;
                        ly lyVar = he6Var.o;
                        m81 m81Var = he6Var.p;
                        int i5 = he6Var.r;
                        boolean z3 = he6Var.s;
                        boolean z4 = he6Var.t;
                        int i6 = he6Var.u;
                        boolean z5 = he6Var.v;
                        boolean z6 = he6Var.w;
                        int i7 = he6Var.x;
                        int i8 = he6Var.y;
                        qp4 qp4Var2 = he6Var.z;
                        long j = he6Var.A;
                        long j2 = he6Var.B;
                        long j3 = he6Var.C;
                        rp8 rp8Var = he6Var.D;
                        hp8 hp8Var2 = he6Var.E;
                        try {
                            if (!bm8Var.p()) {
                                hp8Var = hp8Var2;
                                if (aq7Var.a.b >= bm8Var.o()) {
                                    z = false;
                                }
                                vy2.s(z);
                                xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                                xq4VarB.c.a(true, true);
                                xq4VarB.h.i.n();
                            } else {
                                hp8Var = hp8Var2;
                            }
                            xq4VarB.h.i.n();
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z = true;
                        vy2.s(z);
                        xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                        xq4VarB.c.a(true, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void R(long j) {
        hp8 hp8Var;
        boolean z;
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        he6 he6Var = xq4VarB.s;
                        PlaybackException playbackException = he6Var.a;
                        int i = he6Var.b;
                        aq7 aq7Var = he6Var.c;
                        fb6 fb6Var = he6Var.d;
                        fb6 fb6Var2 = he6Var.e;
                        int i2 = he6Var.f;
                        ua6 ua6Var = he6Var.g;
                        int i3 = he6Var.h;
                        boolean z2 = he6Var.i;
                        bm8 bm8Var = he6Var.j;
                        int i4 = he6Var.k;
                        w59 w59Var = he6Var.l;
                        qp4 qp4Var = he6Var.m;
                        float f = he6Var.n;
                        ly lyVar = he6Var.o;
                        m81 m81Var = he6Var.p;
                        wl1 wl1Var = he6Var.q;
                        int i5 = he6Var.r;
                        boolean z3 = he6Var.s;
                        boolean z4 = he6Var.t;
                        int i6 = he6Var.u;
                        boolean z5 = he6Var.v;
                        boolean z6 = he6Var.w;
                        int i7 = he6Var.x;
                        int i8 = he6Var.y;
                        qp4 qp4Var2 = he6Var.z;
                        long j2 = he6Var.A;
                        long j3 = he6Var.B;
                        rp8 rp8Var = he6Var.D;
                        hp8 hp8Var2 = he6Var.E;
                        if (!bm8Var.p()) {
                            hp8Var = hp8Var2;
                            if (aq7Var.a.b >= bm8Var.o()) {
                                z = false;
                            }
                            vy2.s(z);
                            xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j2, j3, j, rp8Var, hp8Var);
                            xq4VarB.c.a(true, true);
                        } else {
                            hp8Var = hp8Var2;
                        }
                        z = true;
                        vy2.s(z);
                        xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j2, j3, j, rp8Var, hp8Var);
                        xq4VarB.c.a(true, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void S(PlaybackException playbackException) {
        rp8 rp8Var;
        hp8 hp8Var;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                js3.p(playbackException, "error");
                if (s7.G(((k21) obj).a)) {
                    bVar.e(j9.a);
                    return;
                } else {
                    bVar.e(new l9(true));
                    return;
                }
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB == null) {
                    return;
                }
                xq4VarB.w();
                if (((qg6) ((WeakReference) obj).get()) == null) {
                    return;
                }
                he6 he6Var = xq4VarB.s;
                int i2 = he6Var.b;
                aq7 aq7Var = he6Var.c;
                fb6 fb6Var = he6Var.d;
                fb6 fb6Var2 = he6Var.e;
                int i3 = he6Var.f;
                ua6 ua6Var = he6Var.g;
                int i4 = he6Var.h;
                boolean z = he6Var.i;
                bm8 bm8Var = he6Var.j;
                int i5 = he6Var.k;
                boolean z2 = false;
                w59 w59Var = he6Var.l;
                qp4 qp4Var = he6Var.m;
                float f = he6Var.n;
                ly lyVar = he6Var.o;
                m81 m81Var = he6Var.p;
                wl1 wl1Var = he6Var.q;
                int i6 = he6Var.r;
                boolean z3 = he6Var.s;
                boolean z4 = he6Var.t;
                int i7 = he6Var.u;
                boolean z5 = he6Var.v;
                boolean z6 = he6Var.w;
                int i8 = he6Var.x;
                int i9 = he6Var.y;
                qp4 qp4Var2 = he6Var.z;
                long j = he6Var.A;
                long j2 = he6Var.B;
                long j3 = he6Var.C;
                rp8 rp8Var2 = he6Var.D;
                hp8 hp8Var2 = he6Var.E;
                try {
                    if (!bm8Var.p()) {
                        rp8Var = rp8Var2;
                        hp8Var = hp8Var2;
                        if (aq7Var.a.b < bm8Var.o()) {
                        }
                        vy2.s(z2);
                        xq4VarB.s = new he6(playbackException, i2, aq7Var, fb6Var, fb6Var2, i3, ua6Var, i4, z, w59Var, bm8Var, i5, qp4Var, f, lyVar, m81Var, wl1Var, i6, z3, z4, i7, i8, i9, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                        xq4VarB.c.a(true, true);
                        hr4 hr4Var = (hr4) xq4VarB.h.i.e;
                        hr4Var.N(hr4Var.g.t);
                        return;
                    }
                    rp8Var = rp8Var2;
                    hp8Var = hp8Var2;
                    hr4 hr4Var2 = (hr4) xq4VarB.h.i.e;
                    hr4Var2.N(hr4Var2.g.t);
                    return;
                } catch (RemoteException e) {
                    wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                    return;
                }
                z2 = true;
                vy2.s(z2);
                xq4VarB.s = new he6(playbackException, i2, aq7Var, fb6Var, fb6Var2, i3, ua6Var, i4, z, w59Var, bm8Var, i5, qp4Var, f, lyVar, m81Var, wl1Var, i6, z3, z4, i7, i8, i9, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                xq4VarB.c.a(true, true);
                break;
            case 2:
                e eVar = (e) obj2;
                js3.p(playbackException, "error");
                Context context = ((k21) obj).a;
                if (!s7.G(context) || !(playbackException.getCause() instanceof HttpDataSource$InvalidResponseCodeException)) {
                    if (s7.G(context) && br9.C(2002, 2001, 2000).contains(Integer.valueOf(playbackException.a))) {
                        W1();
                        return;
                    } else {
                        eVar.e(new nb6(true));
                        return;
                    }
                }
                Throwable cause = playbackException.getCause();
                js3.n(cause, "null cannot be cast to non-null type androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException");
                int i10 = ((HttpDataSource$InvalidResponseCodeException) cause).e;
                if (500 <= i10 && i10 < 600) {
                    W1();
                    return;
                } else {
                    if (i10 == 402) {
                        eVar.e(new cc6(600000L));
                        return;
                    }
                    return;
                }
            default:
                js3.p(playbackException, "error");
                g07 g07Var = ((a) obj2).G;
                if (g07Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView = g07Var.I;
                js3.o(myketTextView, "retry");
                myketTextView.setVisibility(0);
                g07Var.C.d(false);
                Group group = g07Var.E;
                js3.o(group, "loadingGroup");
                group.setVisibility(8);
                Group group2 = g07Var.K;
                js3.o(group2, "shimmer");
                group2.setVisibility(8);
                return;
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void T(int i, int i2) {
        int i3 = this.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:11|(6:13|(0)(1:16)|19|26|20|24)(1:17)|18|19|26|20|24) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c2, code lost:
    
        defpackage.wn5.H("MediaSessionImpl", "Exception in using media1 API", r0);
     */
    @Override // defpackage.eb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(boolean r39) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9.V(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void W1() {
        e eVar = (e) this.b;
        pj3 pj3Var = ((PlayerMovieData) eVar.p.getValue()).a.a;
        if (eVar.m + 1 >= ((o) pj3Var).a()) {
            eVar.e(new nb6(true));
            return;
        }
        int i = eVar.m + 1;
        eVar.m = i;
        String str = (String) pj3Var.get(i);
        gb6 gb6Var = eVar.d;
        js3.p(gb6Var, "<this>");
        js3.p(str, "newUrl");
        e62 e62Var = (e62) gb6Var;
        int iM = e62Var.M();
        if (iM != -1) {
            long jD0 = e62Var.d0();
            o80 o80Var = (o80) gb6Var;
            o80Var.T(iM, hs9.z(str));
            o80Var.p0(iM, jD0, false);
            e62Var.c();
        }
        xc6 xc6Var = (xc6) eVar.B.a.getValue();
        xc6Var.getClass();
        xc6Var.d = str;
        f88.G0(str, "hls");
    }

    @Override // defpackage.eb6
    public final void a(w59 w59Var) {
        hp8 hp8Var;
        boolean z;
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    he6 he6Var = xq4VarB.s;
                    PlaybackException playbackException = he6Var.a;
                    int i = he6Var.b;
                    aq7 aq7Var = he6Var.c;
                    fb6 fb6Var = he6Var.d;
                    fb6 fb6Var2 = he6Var.e;
                    int i2 = he6Var.f;
                    ua6 ua6Var = he6Var.g;
                    int i3 = he6Var.h;
                    boolean z2 = he6Var.i;
                    bm8 bm8Var = he6Var.j;
                    int i4 = he6Var.k;
                    qp4 qp4Var = he6Var.m;
                    float f = he6Var.n;
                    ly lyVar = he6Var.o;
                    m81 m81Var = he6Var.p;
                    wl1 wl1Var = he6Var.q;
                    int i5 = he6Var.r;
                    boolean z3 = he6Var.s;
                    boolean z4 = he6Var.t;
                    int i6 = he6Var.u;
                    boolean z5 = he6Var.v;
                    boolean z6 = he6Var.w;
                    int i7 = he6Var.x;
                    int i8 = he6Var.y;
                    qp4 qp4Var2 = he6Var.z;
                    long j = he6Var.A;
                    long j2 = he6Var.B;
                    long j3 = he6Var.C;
                    rp8 rp8Var = he6Var.D;
                    hp8 hp8Var2 = he6Var.E;
                    try {
                        if (!bm8Var.p()) {
                            hp8Var = hp8Var2;
                            if (aq7Var.a.b >= bm8Var.o()) {
                                z = false;
                            }
                            vy2.s(z);
                            xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                            xq4VarB.c.a(true, true);
                            xq4VarB.h.i.getClass();
                        } else {
                            hp8Var = hp8Var2;
                        }
                        xq4VarB.h.i.getClass();
                    } catch (RemoteException e) {
                        wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                    z = true;
                    vy2.s(z);
                    xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                    xq4VarB.c.a(true, true);
                    break;
                }
                break;
        }
    }

    public xq4 b() {
        return (xq4) ((WeakReference) this.b).get();
    }

    @Override // defpackage.eb6
    public final void c(int i) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        he6 he6Var = xq4VarB.s;
                        xq4VarB.s = he6Var.b(he6Var.u, i, he6Var.t);
                        xq4VarB.c.a(true, true);
                        try {
                            hr4 hr4Var = (hr4) xq4VarB.h.i.e;
                            hr4Var.N(hr4Var.g.t);
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void d(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void e(int i) {
        int i2 = this.a;
    }

    @Override // defpackage.eb6
    public final void h(int i) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        xq4VarB.s = xq4VarB.s.f(i);
                        xq4VarB.c.a(true, true);
                        try {
                            xq4VarB.h.i.r(i);
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void i(ly lyVar) {
        hp8 hp8Var;
        boolean z;
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        he6 he6Var = xq4VarB.s;
                        PlaybackException playbackException = he6Var.a;
                        int i = he6Var.b;
                        aq7 aq7Var = he6Var.c;
                        fb6 fb6Var = he6Var.d;
                        fb6 fb6Var2 = he6Var.e;
                        int i2 = he6Var.f;
                        ua6 ua6Var = he6Var.g;
                        int i3 = he6Var.h;
                        boolean z2 = he6Var.i;
                        bm8 bm8Var = he6Var.j;
                        int i4 = he6Var.k;
                        w59 w59Var = he6Var.l;
                        qp4 qp4Var = he6Var.m;
                        float f = he6Var.n;
                        m81 m81Var = he6Var.p;
                        wl1 wl1Var = he6Var.q;
                        int i5 = he6Var.r;
                        boolean z3 = he6Var.s;
                        boolean z4 = he6Var.t;
                        int i6 = he6Var.u;
                        boolean z5 = he6Var.v;
                        boolean z6 = he6Var.w;
                        int i7 = he6Var.x;
                        int i8 = he6Var.y;
                        qp4 qp4Var2 = he6Var.z;
                        long j = he6Var.A;
                        long j2 = he6Var.B;
                        long j3 = he6Var.C;
                        rp8 rp8Var = he6Var.D;
                        hp8 hp8Var2 = he6Var.E;
                        try {
                            if (!bm8Var.p()) {
                                hp8Var = hp8Var2;
                                if (aq7Var.a.b >= bm8Var.o()) {
                                    z = false;
                                }
                                vy2.s(z);
                                xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                                xq4VarB.c.a(true, true);
                                xq4VarB.h.i.l(lyVar);
                            } else {
                                hp8Var = hp8Var2;
                            }
                            xq4VarB.h.i.l(lyVar);
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z = true;
                        vy2.s(z);
                        xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                        xq4VarB.c.a(true, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void j(hp8 hp8Var) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        xq4VarB.s = xq4VarB.s.l(hp8Var);
                        xq4VarB.c.a(true, true);
                        xq4VarB.d(new vj3(26, hp8Var));
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:11|(6:13|(0)(1:16)|19|26|20|24)(1:17)|18|19|26|20|24) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        defpackage.wn5.H("MediaSessionImpl", "Exception in using media1 API", r0);
     */
    @Override // defpackage.eb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(boolean r39) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9.l(boolean):void");
    }

    @Override // defpackage.eb6
    public final void m(int i, boolean z) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        he6 he6Var = xq4VarB.s;
                        xq4VarB.s = he6Var.b(i, he6Var.x, z);
                        xq4VarB.c.a(true, true);
                        try {
                            hr4 hr4Var = (hr4) xq4VarB.h.i.e;
                            hr4Var.N(hr4Var.g.t);
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void n(float f) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    xq4VarB.s = xq4VarB.s.m(f);
                    xq4VarB.c.a(true, true);
                    try {
                        xq4VarB.h.i.getClass();
                    } catch (RemoteException e) {
                        wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                        return;
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void o(int i, jp4 jp4Var) {
        hp8 hp8Var;
        boolean z;
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        he6 he6Var = xq4VarB.s;
                        PlaybackException playbackException = he6Var.a;
                        aq7 aq7Var = he6Var.c;
                        fb6 fb6Var = he6Var.d;
                        fb6 fb6Var2 = he6Var.e;
                        int i2 = he6Var.f;
                        ua6 ua6Var = he6Var.g;
                        int i3 = he6Var.h;
                        boolean z2 = he6Var.i;
                        bm8 bm8Var = he6Var.j;
                        int i4 = he6Var.k;
                        w59 w59Var = he6Var.l;
                        qp4 qp4Var = he6Var.m;
                        float f = he6Var.n;
                        ly lyVar = he6Var.o;
                        m81 m81Var = he6Var.p;
                        wl1 wl1Var = he6Var.q;
                        int i5 = he6Var.r;
                        boolean z3 = he6Var.s;
                        boolean z4 = he6Var.t;
                        int i6 = he6Var.u;
                        boolean z5 = he6Var.v;
                        boolean z6 = he6Var.w;
                        int i7 = he6Var.x;
                        int i8 = he6Var.y;
                        qp4 qp4Var2 = he6Var.z;
                        long j = he6Var.A;
                        long j2 = he6Var.B;
                        long j3 = he6Var.C;
                        rp8 rp8Var = he6Var.D;
                        hp8 hp8Var2 = he6Var.E;
                        try {
                            if (!bm8Var.p()) {
                                hp8Var = hp8Var2;
                                if (aq7Var.a.b >= bm8Var.o()) {
                                    z = false;
                                }
                                vy2.s(z);
                                xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                                xq4VarB.c.a(true, true);
                                xq4VarB.h.i.o(jp4Var);
                            } else {
                                hp8Var = hp8Var2;
                            }
                            xq4VarB.h.i.o(jp4Var);
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        z = true;
                        vy2.s(z);
                        xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                        xq4VarB.c.a(true, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void q(int i) {
        int i2 = this.a;
    }

    @Override // defpackage.eb6
    public final void r(int i) {
        switch (this.a) {
            case 0:
                b bVar = (b) this.b;
                bVar.e(new m9(i != 3));
                if (i == 4) {
                    bVar.e(i9.a);
                    return;
                }
                return;
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB == null) {
                    return;
                }
                xq4VarB.w();
                qg6 qg6Var = (qg6) ((WeakReference) this.c).get();
                if (qg6Var == null) {
                    return;
                }
                xq4VarB.s = xq4VarB.s.d(i, qg6Var.B());
                xq4VarB.c.a(true, true);
                try {
                    op1 op1Var = xq4VarB.h.i;
                    qg6Var.B();
                    hr4 hr4Var = (hr4) op1Var.e;
                    hr4Var.N(hr4Var.g.t);
                    return;
                } catch (RemoteException e) {
                    wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                    return;
                }
            case 2:
                e eVar = (e) this.b;
                eVar.e(new pb6(i == 3));
                eVar.e(new ob6(i != 3));
                if (i == 3) {
                    eVar.e(new nc6(false));
                    return;
                }
                return;
            default:
                a aVar = (a) this.b;
                aVar.getClass();
                if (i == 3) {
                    a.D(aVar);
                } else if (i == 4) {
                    og5 og5Var = aVar.w;
                    View view = aVar.a;
                    js3.o(view, "itemView");
                    og5Var.m(view, aVar, (ReelAdData) this.c);
                }
                if (i != 2) {
                    aVar.G();
                    a.D(aVar);
                    return;
                }
                g07 g07Var = aVar.G;
                if (g07Var == null) {
                    js3.V("binding");
                    throw null;
                }
                Group group = g07Var.E;
                js3.o(group, "loadingGroup");
                group.setVisibility(0);
                g07 g07Var2 = aVar.G;
                if (g07Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView = g07Var2.I;
                js3.o(myketTextView, "retry");
                myketTextView.setVisibility(8);
                g07 g07Var3 = aVar.G;
                if (g07Var3 != null) {
                    g07Var3.C.d(true);
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
        }
    }

    @Override // defpackage.eb6
    public final void t(boolean z) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        xq4VarB.s = xq4VarB.s.h(z);
                        xq4VarB.c.a(true, true);
                        try {
                            xq4VarB.h.i.s(z);
                        } catch (RemoteException e) {
                            wn5.H("MediaSessionImpl", "Exception in using media1 API", e);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void v(m81 m81Var) {
        hp8 hp8Var;
        boolean z;
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        he6 he6Var = xq4VarB.s;
                        PlaybackException playbackException = he6Var.a;
                        int i = he6Var.b;
                        aq7 aq7Var = he6Var.c;
                        fb6 fb6Var = he6Var.d;
                        fb6 fb6Var2 = he6Var.e;
                        int i2 = he6Var.f;
                        ua6 ua6Var = he6Var.g;
                        int i3 = he6Var.h;
                        boolean z2 = he6Var.i;
                        bm8 bm8Var = he6Var.j;
                        int i4 = he6Var.k;
                        w59 w59Var = he6Var.l;
                        qp4 qp4Var = he6Var.m;
                        float f = he6Var.n;
                        ly lyVar = he6Var.o;
                        wl1 wl1Var = he6Var.q;
                        int i5 = he6Var.r;
                        boolean z3 = he6Var.s;
                        boolean z4 = he6Var.t;
                        int i6 = he6Var.u;
                        boolean z5 = he6Var.v;
                        boolean z6 = he6Var.w;
                        int i7 = he6Var.x;
                        int i8 = he6Var.y;
                        qp4 qp4Var2 = he6Var.z;
                        long j = he6Var.A;
                        long j2 = he6Var.B;
                        long j3 = he6Var.C;
                        rp8 rp8Var = he6Var.D;
                        hp8 hp8Var2 = he6Var.E;
                        if (!bm8Var.p()) {
                            hp8Var = hp8Var2;
                            if (aq7Var.a.b >= bm8Var.o()) {
                                z = false;
                            }
                            vy2.s(z);
                            xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                            xq4VarB.c.a(true, true);
                        } else {
                            hp8Var = hp8Var2;
                        }
                        z = true;
                        vy2.s(z);
                        xq4VarB.s = new he6(playbackException, i, aq7Var, fb6Var, fb6Var2, i2, ua6Var, i3, z2, w59Var, bm8Var, i4, qp4Var, f, lyVar, m81Var, wl1Var, i5, z3, z4, i6, i7, i8, z5, z6, qp4Var2, j, j2, j3, rp8Var, hp8Var);
                        xq4VarB.c.a(true, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final void x(rp8 rp8Var) {
        switch (this.a) {
            case 1:
                xq4 xq4VarB = b();
                if (xq4VarB != null) {
                    xq4VarB.w();
                    if (((qg6) ((WeakReference) this.c).get()) != null) {
                        xq4VarB.s = xq4VarB.s.a(rp8Var);
                        xq4VarB.c.a(true, false);
                        xq4VarB.d(new vj3(27, rp8Var));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void y(gb6 gb6Var, db6 db6Var) {
        int i = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    @Override // defpackage.eb6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(int r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9.z(int, boolean):void");
    }

    public c9(xq4 xq4Var, qg6 qg6Var) {
        this.a = 1;
        this.b = new WeakReference(xq4Var);
        this.c = new WeakReference(qg6Var);
    }
}
