package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.PlaybackException;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cd6 implements eb6, kl8, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ PlayerControlView a;

    public cd6(PlayerControlView playerControlView) {
        this.a = playerControlView;
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
        PlayerControlView playerControlView = this.a;
        playerControlView.S0 = true;
        TextView textView = playerControlView.J;
        if (textView != null) {
            textView.setText(j29.G(playerControlView.L, playerControlView.M, j));
        }
        playerControlView.a.f();
        gb6 gb6Var = playerControlView.M0;
        if (gb6Var == null || !playerControlView.U0) {
            return;
        }
        if (playerControlView.i(gb6Var)) {
            try {
                Method method = playerControlView.e;
                method.getClass();
                method.invoke(playerControlView.M0, Boolean.TRUE);
                return;
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        if (playerControlView.h(playerControlView.M0)) {
            try {
                Method method2 = playerControlView.h;
                method2.getClass();
                method2.invoke(playerControlView.M0, Boolean.TRUE);
                return;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
        gb6 gb6Var2 = playerControlView.M0;
        gb6Var2.getClass();
        sb.append(gb6Var2.getClass());
        wn5.k0("PlayerControlView", sb.toString());
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
        PlayerControlView playerControlView = this.a;
        playerControlView.S0 = false;
        gb6 gb6Var = playerControlView.M0;
        if (gb6Var != null) {
            if (!z) {
                PlayerControlView.a(playerControlView, gb6Var, j);
            }
            if (playerControlView.i(playerControlView.M0)) {
                try {
                    Method method = playerControlView.e;
                    method.getClass();
                    method.invoke(playerControlView.M0, Boolean.FALSE);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } else if (playerControlView.h(playerControlView.M0)) {
                try {
                    Method method2 = playerControlView.h;
                    method2.getClass();
                    method2.invoke(playerControlView.M0, Boolean.FALSE);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        playerControlView.a.g();
    }

    @Override // defpackage.kl8
    public final void g(DefaultTimeBar defaultTimeBar, long j) {
        PlayerControlView playerControlView = this.a;
        TextView textView = playerControlView.J;
        if (textView != null) {
            textView.setText(j29.G(playerControlView.L, playerControlView.M, j));
        }
        if (playerControlView.k(playerControlView.M0)) {
            PlayerControlView.a(playerControlView, playerControlView.M0, j);
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
        PlayerControlView playerControlView = this.a;
        gb6 gb6Var = playerControlView.M0;
        if (gb6Var == null) {
            return;
        }
        playerControlView.a.g();
        if (playerControlView.t == view) {
            if (gb6Var.f0(9)) {
                gb6Var.X();
                return;
            }
            return;
        }
        if (playerControlView.s == view) {
            if (gb6Var.f0(7)) {
                gb6Var.z();
                return;
            }
            return;
        }
        if (playerControlView.v == view) {
            if (gb6Var.e() == 4 || !gb6Var.f0(12)) {
                return;
            }
            gb6Var.Y();
            return;
        }
        if (playerControlView.w == view) {
            if (gb6Var.f0(11)) {
                gb6Var.a0();
                return;
            }
            return;
        }
        if (playerControlView.u == view) {
            j29.N(gb6Var, playerControlView.Q0);
            return;
        }
        if (playerControlView.z == view) {
            if (gb6Var.f0(15)) {
                gb6Var.N(b47.g(gb6Var.f(), playerControlView.W0));
                return;
            }
            return;
        }
        if (playerControlView.A == view) {
            if (gb6Var.f0(14)) {
                gb6Var.m(!gb6Var.U());
                return;
            }
            return;
        }
        if (playerControlView.F == view) {
            playerControlView.a.f();
            playerControlView.e(playerControlView.l, playerControlView.F);
            return;
        }
        if (playerControlView.G == view) {
            playerControlView.a.f();
            playerControlView.e(playerControlView.m, playerControlView.G);
        } else if (playerControlView.H == view) {
            playerControlView.a.f();
            playerControlView.e(playerControlView.o, playerControlView.H);
        } else if (playerControlView.C == view) {
            playerControlView.a.f();
            playerControlView.e(playerControlView.n, playerControlView.C);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        PlayerControlView playerControlView = this.a;
        if (playerControlView.c1) {
            playerControlView.a.g();
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
        boolean zA = vd2Var.a(4, 5, 13);
        PlayerControlView playerControlView = this.a;
        if (zA) {
            float[] fArr = PlayerControlView.d1;
            playerControlView.r();
        }
        if (vd2Var.a(4, 5, 7, 13)) {
            float[] fArr2 = PlayerControlView.d1;
            playerControlView.t();
        }
        if (vd2Var.a(8, 13)) {
            float[] fArr3 = PlayerControlView.d1;
            playerControlView.u();
        }
        if (vd2Var.a(9, 13)) {
            float[] fArr4 = PlayerControlView.d1;
            playerControlView.w();
        }
        if (vd2Var.a(8, 9, 11, 0, 16, 17, 13)) {
            float[] fArr5 = PlayerControlView.d1;
            playerControlView.q();
        }
        if (vd2Var.a(11, 0, 13)) {
            float[] fArr6 = PlayerControlView.d1;
            playerControlView.x();
        }
        if (vd2Var.a(12, 13)) {
            float[] fArr7 = PlayerControlView.d1;
            playerControlView.s();
        }
        if (vd2Var.a(2, 13)) {
            float[] fArr8 = PlayerControlView.d1;
            playerControlView.y();
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void z(int i, boolean z) {
    }
}
