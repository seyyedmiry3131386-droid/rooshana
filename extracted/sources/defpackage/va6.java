package defpackage;

import android.app.PendingIntent;
import android.os.Build;
import androidx.media3.common.PlaybackException;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.provider.service.PlaybackService;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class va6 implements eb6 {
    public final /* synthetic */ PlaybackService a;

    public va6(PlaybackService playbackService) {
        this.a = playbackService;
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
    public final void o(int i, jp4 jp4Var) {
        qp4 qp4Var;
        PlayerMovieData playerMovieDataT = gu9.t((jp4Var == null || (qp4Var = jp4Var.d) == null) ? null : qp4Var.I);
        int i2 = PlaybackService.k;
        PlaybackService playbackService = this.a;
        PendingIntent pendingIntentJ = playbackService.j(playerMovieDataT);
        jq4 jq4Var = playbackService.i;
        if (jq4Var != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                vy2.j(zc.m(pendingIntentJ));
            }
            jq4Var.a.v(pendingIntentJ);
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
    public final /* synthetic */ void y(gb6 gb6Var, db6 db6Var) {
    }

    @Override // defpackage.eb6
    public final /* synthetic */ void z(int i, boolean z) {
    }
}
