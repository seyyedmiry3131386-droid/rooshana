package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;

/* JADX INFO: loaded from: classes.dex */
public final class ie6 implements eb6 {
    public final qp2 a;
    public final om0 b;
    public final AtomicBoolean c;

    public ie6(qp2 qp2Var, om0 om0Var) {
        js3.p(qp2Var, "onEvents");
        this.a = qp2Var;
        this.b = om0Var;
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void A(long j) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void B(int i, fb6 fb6Var, fb6 fb6Var2) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void C(qp4 qp4Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void D(qp4 qp4Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void E(long j) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void F(bm8 bm8Var, int i) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void I(boolean z) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void J(List list) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void K(int i, boolean z) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void M(ua6 ua6Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void N(cb6 cb6Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void O(PlaybackException playbackException) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void P(jv4 jv4Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void Q(wl1 wl1Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void R(long j) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void S(PlaybackException playbackException) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void T(int i, int i2) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void V(boolean z) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void a(w59 w59Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void d(boolean z) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void e(int i) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void i(ly lyVar) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void j(hp8 hp8Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void l(boolean z) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void m(int i, boolean z) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void n(float f) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void o(int i, jp4 jp4Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void q(int i) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void r(int i) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void v(m81 m81Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void x(rp8 rp8Var) {
    }

    @Override // defpackage.eb6
    public final void y(gb6 gb6Var, db6 db6Var) {
        AtomicBoolean atomicBoolean = this.c;
        js3.p(gb6Var, "player");
        try {
            if (atomicBoolean.get()) {
                return;
            }
            this.a.invoke(gb6Var, db6Var);
        } catch (Throwable th) {
            atomicBoolean.set(true);
            this.b.resumeWith(b.a(th));
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void z(int i, boolean z) {
    }
}
