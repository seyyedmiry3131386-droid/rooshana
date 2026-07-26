package defpackage;

import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.common.PlaybackException;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hg6 implements eb6, View.OnClickListener, ld6, dd6 {
    public final yl8 a = new yl8();
    public Object b;
    public final /* synthetic */ PlayerView c;

    public hg6(PlayerView playerView) {
        this.c = playerView;
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void A(long j) {
    }

    @Override // defpackage.eb6
    public final void B(int i, fb6 fb6Var, fb6 fb6Var2) {
        PlayerControlView playerControlView;
        int i2 = PlayerView.G;
        PlayerView playerView = this.c;
        if (playerView.d() && playerView.D && (playerControlView = playerView.l) != null) {
            playerControlView.g();
        }
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
    public final void H() {
        PlayerView playerView = this.c;
        View view = playerView.c;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.b()) {
                playerView.c();
                return;
            }
            ImageView imageView = playerView.g;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
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
    public final void T(int i, int i2) {
        PlayerView playerView = this.c;
        View view = playerView.d;
        if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.F) {
            kg6 kg6Var = playerView.f;
            kg6Var.getClass();
            playerView.o.post(new ii(kg6Var, (SurfaceView) view, new u03(17, playerView), 16));
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void V(boolean z) {
    }

    @Override // defpackage.eb6
    public final void a(w59 w59Var) {
        PlayerView playerView;
        gb6 gb6Var;
        if (w59Var.equals(w59.d) || (gb6Var = (playerView = this.c).s) == null || gb6Var.e() == 1) {
            return;
        }
        playerView.i();
    }

    @Override // defpackage.ld6
    public final void b(int i) {
        int i2 = PlayerView.G;
        PlayerView playerView = this.c;
        playerView.k();
        playerView.getClass();
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
    public final void m(int i, boolean z) {
        int i2 = PlayerView.G;
        PlayerView playerView = this.c;
        playerView.j();
        if (!playerView.d() || !playerView.D) {
            playerView.e(false);
            return;
        }
        PlayerControlView playerControlView = playerView.l;
        if (playerControlView != null) {
            playerControlView.g();
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void n(float f) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void o(int i, jp4 jp4Var) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.G;
        this.c.h();
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void q(int i) {
    }

    @Override // defpackage.eb6
    public final void r(int i) {
        int i2 = PlayerView.G;
        PlayerView playerView = this.c;
        playerView.j();
        playerView.l();
        if (!playerView.d() || !playerView.D) {
            playerView.e(false);
            return;
        }
        PlayerControlView playerControlView = playerView.l;
        if (playerControlView != null) {
            playerControlView.g();
        }
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.eb6
    public final void v(m81 m81Var) {
        SubtitleView subtitleView = this.c.i;
        if (subtitleView != null) {
            subtitleView.setCues(m81Var.a);
        }
    }

    @Override // defpackage.eb6
    public final void x(rp8 rp8Var) {
        PlayerView playerView = this.c;
        gb6 gb6Var = playerView.s;
        gb6Var.getClass();
        bm8 bm8VarS = gb6Var.f0(17) ? gb6Var.S() : bm8.a;
        if (bm8VarS.p()) {
            this.b = null;
        } else {
            boolean zF0 = gb6Var.f0(30);
            yl8 yl8Var = this.a;
            if (!zF0 || gb6Var.G().a.isEmpty()) {
                Object obj = this.b;
                if (obj != null) {
                    int iB = bm8VarS.b(obj);
                    if (iB != -1) {
                        if (gb6Var.M() == bm8VarS.f(iB, yl8Var, false).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            } else {
                this.b = bm8VarS.f(gb6Var.p(), yl8Var, true).b;
            }
        }
        playerView.m(false);
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void y(gb6 gb6Var, db6 db6Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void z(int i, boolean z) {
    }
}
