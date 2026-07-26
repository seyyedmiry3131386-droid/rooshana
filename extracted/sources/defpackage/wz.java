package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.e;
import androidx.media3.exoplayer.ExoPlayer;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.theme.common.colors.models.UiMode;

/* JADX INFO: loaded from: classes3.dex */
public final class wz implements of6 {
    @Override // defpackage.of6
    public final void a(hx4 hx4Var, dl5 dl5Var, ExoPlayer exoPlayer, PlayerMovieData playerMovieData, qz0 qz0Var, int i) {
        int i2;
        js3.p(hx4Var, "modifier");
        js3.p(dl5Var, "navigationStateManager");
        js3.p(exoPlayer, "player");
        qz0Var.c0(801294588);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(hx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? qz0Var.f(dl5Var) : qz0Var.h(dl5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(exoPlayer) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qz0Var.h(playerMovieData) ? 2048 : 1024;
        }
        if (qz0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) qz0Var.j(e.b);
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (objM == obj) {
                objM = vy2.e(1, 6, null);
                qz0Var.l0(objM);
            }
            ub5 ub5Var = (ub5) objM;
            boolean zH = qz0Var.h(context) | qz0Var.h(ub5Var);
            Object objM2 = qz0Var.M();
            if (zH || objM2 == obj) {
                objM2 = new m(context, ub5Var, 4);
                qz0Var.l0(objM2);
            }
            ct2.a(0, qz0Var);
            tv8.c(UiMode.a, s7.X(-1681381390, new qz(context, dl5Var, hx4Var, exoPlayer, playerMovieData, (dp2) objM2, ub5Var, 0), qz0Var), qz0Var, 432);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new y5((Object) this, hx4Var, (Object) dl5Var, (Object) exoPlayer, (Object) playerMovieData, i, 2);
        }
    }
}
