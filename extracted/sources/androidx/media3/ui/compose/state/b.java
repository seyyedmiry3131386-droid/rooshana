package androidx.media3.ui.compose.state;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.js3;
import defpackage.jz0;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.zk8;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final a a(ExoPlayer exoPlayer, qz0 qz0Var, int i) {
        js3.p(exoPlayer, "player");
        qz0Var.a0(1585922024);
        qz0Var.a0(-1936578636);
        boolean zF = qz0Var.f(exoPlayer);
        Object objM = qz0Var.M();
        Object obj = jz0.a;
        if (zF || objM == obj) {
            objM = new a(exoPlayer);
            qz0Var.l0(objM);
        }
        a aVar = (a) objM;
        qz0Var.q(false);
        qz0Var.a0(-1936576251);
        boolean zH = qz0Var.h(aVar);
        Object objM2 = qz0Var.M();
        if (zH || objM2 == obj) {
            objM2 = new PlayPauseButtonStateKt$rememberPlayPauseButtonState$1$1(aVar, null);
            qz0Var.l0(objM2);
        }
        qz0Var.q(false);
        zk8.h(qz0Var, (qp2) objM2, exoPlayer);
        qz0Var.q(false);
        return aVar;
    }

    public static final c b(ExoPlayer exoPlayer, qz0 qz0Var, int i) {
        qz0Var.a0(-1006141136);
        qz0Var.a0(2097651011);
        Object objM = qz0Var.M();
        Object obj = jz0.a;
        if (objM == obj) {
            objM = new c();
            qz0Var.l0(objM);
        }
        c cVar = (c) objM;
        qz0Var.q(false);
        qz0Var.a0(2097653430);
        boolean zH = qz0Var.h(cVar) | qz0Var.h(exoPlayer);
        Object objM2 = qz0Var.M();
        if (zH || objM2 == obj) {
            objM2 = new PresentationStateKt$rememberPresentationState$1$1(cVar, exoPlayer, null);
            qz0Var.l0(objM2);
        }
        qz0Var.q(false);
        zk8.h(qz0Var, (qp2) objM2, exoPlayer);
        qz0Var.q(false);
        return cVar;
    }
}
