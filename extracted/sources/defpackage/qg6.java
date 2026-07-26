package defpackage;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qg6 implements gb6 {
    public final ExoPlayer a;

    public qg6(ExoPlayer exoPlayer) {
        this.a = exoPlayer;
    }

    @Override // defpackage.gb6
    public final void A(List list, int i, long j) {
        L0();
        ((e62) this.a).A(list, i, j);
    }

    public final boolean A0() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.k0.g;
    }

    @Override // defpackage.gb6
    public final PlaybackException B() {
        L0();
        return ((e62) this.a).B();
    }

    public final void B0(int i) {
        L0();
        ((e62) ((o80) this.a)).N0(i, i + 1);
    }

    @Override // defpackage.gb6
    public final void C(boolean z) {
        L0();
        ((e62) this.a).C(z);
    }

    public final void C0(int i, int i2, List list) {
        L0();
        ((e62) this.a).R0(i, i2, list);
    }

    @Override // defpackage.gb6
    public final long D() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.w;
    }

    public final void D0(int i) {
        L0();
        ((o80) this.a).p0(i, -9223372036854775807L, false);
    }

    @Override // defpackage.gb6
    public final jp4 E() {
        L0();
        return ((o80) this.a).E();
    }

    public final void E0() {
        int iE;
        L0();
        o80 o80Var = (o80) this.a;
        e62 e62Var = (e62) o80Var;
        bm8 bm8VarS = e62Var.S();
        if (bm8VarS.p()) {
            iE = -1;
        } else {
            int iM = e62Var.M();
            e62Var.c1();
            int i = e62Var.F;
            if (i == 1) {
                i = 0;
            }
            e62Var.c1();
            iE = bm8VarS.e(iM, i, e62Var.G);
        }
        if (iE == -1) {
            o80Var.l0();
        } else if (iE == e62Var.M()) {
            o80Var.p0(e62Var.M(), -9223372036854775807L, true);
        } else {
            o80Var.p0(iE, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.gb6
    public final long F() {
        L0();
        return ((e62) this.a).F();
    }

    public final void F0() {
        L0();
        ((o80) this.a).s0(6);
    }

    @Override // defpackage.gb6
    public final rp8 G() {
        L0();
        return ((e62) this.a).G();
    }

    public final void G0(int i, boolean z) {
        L0();
        ((e62) this.a).c1();
    }

    @Override // defpackage.gb6
    public final boolean H() {
        L0();
        return ((o80) this.a).H();
    }

    public final void H0(boolean z) {
        L0();
        ((e62) this.a).c1();
    }

    @Override // defpackage.gb6
    public final m81 I() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.c0;
    }

    public final void I0(int i) {
        L0();
        ((e62) this.a).c1();
    }

    @Override // defpackage.gb6
    public final void J(jp4 jp4Var) {
        L0();
        ((o80) this.a).J(jp4Var);
    }

    public final void J0(int i, int i2) {
        L0();
        ((e62) this.a).c1();
    }

    @Override // defpackage.gb6
    public final void K() {
        L0();
        ((o80) this.a).K();
    }

    public final void K0(float f) {
        L0();
        ((o80) this.a).t0(f);
    }

    @Override // defpackage.gb6
    public final int L() {
        L0();
        return ((e62) this.a).L();
    }

    public final void L0() {
        vy2.s(Looper.myLooper() == ((e62) this.a).t);
    }

    @Override // defpackage.gb6
    public final int M() {
        L0();
        return ((e62) this.a).M();
    }

    @Override // defpackage.gb6
    public final void N(int i) {
        L0();
        ((e62) this.a).N(i);
    }

    @Override // defpackage.gb6
    public final void O(eb6 eb6Var) {
        L0();
        ((e62) this.a).O(new ck2(this, eb6Var));
    }

    @Override // defpackage.gb6
    public final void P(jp4 jp4Var) {
        L0();
        ((o80) this.a).P(jp4Var);
    }

    @Override // defpackage.gb6
    public final void Q(SurfaceView surfaceView) {
        L0();
        ((e62) this.a).Q(surfaceView);
    }

    @Override // defpackage.gb6
    public final int R() {
        L0();
        return ((e62) this.a).R();
    }

    @Override // defpackage.gb6
    public final bm8 S() {
        L0();
        return ((e62) this.a).S();
    }

    @Override // defpackage.gb6
    public final void T(int i, jp4 jp4Var) {
        L0();
        ((o80) this.a).T(i, jp4Var);
    }

    @Override // defpackage.gb6
    public final boolean U() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.G;
    }

    @Override // defpackage.gb6
    public final hp8 V() {
        L0();
        return ((e62) this.a).V();
    }

    @Override // defpackage.gb6
    public final long W() {
        L0();
        return ((e62) this.a).W();
    }

    @Override // defpackage.gb6
    public final void X() {
        L0();
        ((o80) this.a).X();
    }

    @Override // defpackage.gb6
    public final void Y() {
        L0();
        ((o80) this.a).Y();
    }

    @Override // defpackage.gb6
    public final void Z(TextureView textureView) {
        L0();
        ((e62) this.a).Z(textureView);
    }

    @Override // defpackage.gb6
    public final void a() {
        L0();
        ((e62) this.a).a();
    }

    @Override // defpackage.gb6
    public final void a0() {
        L0();
        ((o80) this.a).a0();
    }

    @Override // defpackage.gb6
    public final void b() {
        L0();
        ((o80) this.a).b();
    }

    @Override // defpackage.gb6
    public final qp4 b0() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.P;
    }

    @Override // defpackage.gb6
    public final void c() {
        L0();
        ((e62) this.a).c();
    }

    @Override // defpackage.gb6
    public final void c0(List list) {
        L0();
        ((e62) this.a).c0(list);
    }

    @Override // defpackage.gb6
    public final void d(ua6 ua6Var) {
        L0();
        ((e62) this.a).d(ua6Var);
    }

    @Override // defpackage.gb6
    public final long d0() {
        L0();
        return ((e62) this.a).d0();
    }

    @Override // defpackage.gb6
    public final int e() {
        L0();
        return ((e62) this.a).e();
    }

    @Override // defpackage.gb6
    public final long e0() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.v;
    }

    @Override // defpackage.gb6
    public final int f() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.F;
    }

    @Override // defpackage.gb6
    public final boolean f0(int i) {
        L0();
        return ((o80) this.a).f0(i);
    }

    @Override // defpackage.gb6
    public final ua6 g() {
        L0();
        return ((e62) this.a).g();
    }

    @Override // defpackage.gb6
    public final Looper g0() {
        return ((e62) this.a).t;
    }

    @Override // defpackage.gb6
    public final long getDuration() {
        L0();
        return ((e62) this.a).getDuration();
    }

    @Override // defpackage.gb6
    public final boolean h() {
        L0();
        return ((e62) this.a).h();
    }

    public final void h0(int i, List list) {
        L0();
        ((e62) this.a).v0(i, list);
    }

    @Override // defpackage.gb6
    public final long i() {
        L0();
        return ((e62) this.a).i();
    }

    public final void i0(List list) {
        L0();
        ((o80) this.a).h0(list);
    }

    @Override // defpackage.gb6
    public final void j(int i, long j) {
        L0();
        ((o80) this.a).p0(i, j, false);
    }

    public final fb6 j0() {
        boolean zF0 = f0(16);
        boolean zF02 = f0(17);
        return new fb6(null, zF02 ? M() : 0, zF0 ? E() : null, null, zF02 ? p() : 0, zF0 ? d0() : 0L, zF0 ? F() : 0L, zF0 ? L() : -1, zF0 ? u() : -1);
    }

    @Override // defpackage.gb6
    public final void k(jp4 jp4Var, long j) {
        L0();
        ((o80) this.a).k(jp4Var, j);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final defpackage.aq7 k0() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg6.k0():aq7");
    }

    @Override // defpackage.gb6
    public final boolean l() {
        L0();
        return ((e62) this.a).l();
    }

    public final void l0() {
        L0();
        ((e62) this.a).c1();
    }

    @Override // defpackage.gb6
    public final void m(boolean z) {
        L0();
        ((e62) this.a).m(z);
    }

    public final void m0(int i) {
        L0();
        ((e62) this.a).c1();
    }

    @Override // defpackage.gb6
    public final void n(eb6 eb6Var) {
        L0();
        ((e62) this.a).m.a(new ck2(this, eb6Var));
    }

    public final ly n0() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.Z;
    }

    @Override // defpackage.gb6
    public final long o() {
        L0();
        return ((o80) this.a).o();
    }

    public final cb6 o0() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.O;
    }

    @Override // defpackage.gb6
    public final int p() {
        L0();
        return ((e62) this.a).p();
    }

    public final long p0() {
        L0();
        return ((e62) this.a).C0();
    }

    @Override // defpackage.gb6
    public final void q(TextureView textureView) {
        L0();
        ((e62) this.a).q(textureView);
    }

    public final jp4 q0() {
        if (f0(16)) {
            return E();
        }
        return null;
    }

    @Override // defpackage.gb6
    public final w59 r() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.i0;
    }

    public final bm8 r0() {
        return f0(17) ? S() : f0(16) ? S().p() ? bm8.a : new pg6(this) : bm8.a;
    }

    @Override // defpackage.gb6
    public final float s() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.a0;
    }

    public final wl1 s0() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.h0;
    }

    @Override // defpackage.gb6
    public final void stop() {
        L0();
        ((e62) this.a).stop();
    }

    @Override // defpackage.gb6
    public final void t() {
        L0();
        ((o80) this.a).t();
    }

    public final int t0() {
        L0();
        ((e62) this.a).c1();
        return 0;
    }

    @Override // defpackage.gb6
    public final int u() {
        L0();
        return ((e62) this.a).u();
    }

    public final qp4 u0() {
        return f0(18) ? b0() : qp4.K;
    }

    @Override // defpackage.gb6
    public final void v(SurfaceView surfaceView) {
        L0();
        ((e62) this.a).v(surfaceView);
    }

    public final qp4 v0() {
        L0();
        e62 e62Var = (e62) this.a;
        e62Var.c1();
        return e62Var.Q;
    }

    @Override // defpackage.gb6
    public final void w(hp8 hp8Var) {
        L0();
        ((e62) this.a).w(hp8Var);
    }

    public final void w0() {
        L0();
        ((e62) this.a).c1();
    }

    @Override // defpackage.gb6
    public final void x(long j) {
        L0();
        ((o80) this.a).q0(5, j);
    }

    public final void x0(int i) {
        L0();
        ((e62) this.a).c1();
    }

    @Override // defpackage.gb6
    public final void y(float f) {
        L0();
        ((e62) this.a).y(f);
    }

    public final boolean y0() {
        L0();
        return ((o80) this.a).n0();
    }

    @Override // defpackage.gb6
    public final void z() {
        L0();
        ((o80) this.a).z();
    }

    public final boolean z0() {
        if (!f0(23)) {
            return false;
        }
        L0();
        ((e62) this.a).c1();
        return false;
    }
}
