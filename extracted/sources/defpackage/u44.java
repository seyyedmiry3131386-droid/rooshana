package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.media3.common.PlaybackException;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.LegacyPlayerControlView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u44 implements eb6, kl8, View.OnClickListener {
    public final /* synthetic */ LegacyPlayerControlView a;

    public u44(LegacyPlayerControlView legacyPlayerControlView) {
        this.a = legacyPlayerControlView;
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

    @Override // defpackage.kl8
    public final void b(DefaultTimeBar defaultTimeBar, long j) {
        LegacyPlayerControlView legacyPlayerControlView = this.a;
        legacyPlayerControlView.L = true;
        TextView textView = legacyPlayerControlView.m;
        if (textView != null) {
            textView.setText(j29.G(legacyPlayerControlView.o, legacyPlayerControlView.p, j));
        }
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

    @Override // defpackage.kl8
    public final void f(DefaultTimeBar defaultTimeBar, long j, boolean z) {
        gb6 gb6Var;
        LegacyPlayerControlView legacyPlayerControlView = this.a;
        int iM = 0;
        legacyPlayerControlView.L = false;
        if (z || (gb6Var = legacyPlayerControlView.G) == null) {
            return;
        }
        bm8 bm8VarS = gb6Var.S();
        if (legacyPlayerControlView.K && !bm8VarS.p()) {
            int iO = bm8VarS.o();
            while (true) {
                long jK0 = j29.k0(bm8VarS.m(iM, legacyPlayerControlView.r, 0L).m);
                if (j < jK0) {
                    break;
                }
                if (iM == iO - 1) {
                    j = jK0;
                    break;
                } else {
                    j -= jK0;
                    iM++;
                }
            }
        } else {
            iM = gb6Var.M();
        }
        gb6Var.j(iM, j);
        legacyPlayerControlView.g();
    }

    @Override // defpackage.kl8
    public final void g(DefaultTimeBar defaultTimeBar, long j) {
        LegacyPlayerControlView legacyPlayerControlView = this.a;
        TextView textView = legacyPlayerControlView.m;
        if (textView != null) {
            textView.setText(j29.G(legacyPlayerControlView.o, legacyPlayerControlView.p, j));
        }
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LegacyPlayerControlView legacyPlayerControlView = this.a;
        gb6 gb6Var = legacyPlayerControlView.G;
        if (gb6Var == null) {
            return;
        }
        if (legacyPlayerControlView.d == view) {
            gb6Var.X();
            return;
        }
        if (legacyPlayerControlView.c == view) {
            gb6Var.z();
            return;
        }
        if (legacyPlayerControlView.g == view) {
            if (gb6Var.e() != 4) {
                gb6Var.Y();
                return;
            }
            return;
        }
        if (legacyPlayerControlView.h == view) {
            gb6Var.a0();
            return;
        }
        if (legacyPlayerControlView.e == view) {
            j29.M(gb6Var);
            return;
        }
        if (legacyPlayerControlView.f == view) {
            j29.L(gb6Var);
        } else if (legacyPlayerControlView.i == view) {
            gb6Var.N(b47.g(gb6Var.f(), legacyPlayerControlView.O));
        } else if (legacyPlayerControlView.j == view) {
            gb6Var.m(!gb6Var.U());
        }
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
        vd2 vd2Var = db6Var.a;
        boolean zA = vd2Var.a(4, 5);
        LegacyPlayerControlView legacyPlayerControlView = this.a;
        if (zA) {
            int i = LegacyPlayerControlView.B0;
            legacyPlayerControlView.f();
        }
        if (vd2Var.a(4, 5, 7)) {
            int i2 = LegacyPlayerControlView.B0;
            legacyPlayerControlView.g();
        }
        if (vd2Var.a.get(8)) {
            int i3 = LegacyPlayerControlView.B0;
            legacyPlayerControlView.h();
        }
        if (vd2Var.a.get(9)) {
            int i4 = LegacyPlayerControlView.B0;
            legacyPlayerControlView.i();
        }
        if (vd2Var.a(8, 9, 11, 0, 13)) {
            int i5 = LegacyPlayerControlView.B0;
            legacyPlayerControlView.e();
        }
        if (vd2Var.a(11, 0)) {
            int i6 = LegacyPlayerControlView.B0;
            legacyPlayerControlView.j();
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void z(int i, boolean z) {
    }
}
