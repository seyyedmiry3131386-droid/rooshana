package ir.myket.player.viewmodel;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.bt2;
import defpackage.c9;
import defpackage.cb;
import defpackage.d9;
import defpackage.dp2;
import defpackage.e62;
import defpackage.f9;
import defpackage.g27;
import defpackage.g9;
import defpackage.gf2;
import defpackage.h9;
import defpackage.js3;
import defpackage.k21;
import defpackage.k9;
import defpackage.l9;
import defpackage.m6;
import defpackage.m9;
import defpackage.q9;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.tc6;
import defpackage.tx8;
import defpackage.ub;
import defpackage.uc6;
import defpackage.xc6;
import defpackage.xp;
import defpackage.y97;
import kotlinx.coroutines.flow.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends m6 {
    public final ExoPlayer d;
    public int e;
    public final rv6 f;
    public final rv6 g;
    public c9 h;
    public uc6 i;

    public b(ExoPlayer exoPlayer, ub ubVar, final xc6 xc6Var, final ir.myket.analytics.spix.domain.usecase.a aVar, k21 k21Var) {
        js3.p(exoPlayer, "player");
        js3.p(ubVar, "adViewState");
        js3.p(xc6Var, "playerConfig");
        this.d = exoPlayer;
        this.f = kotlinx.coroutines.flow.d.A(new d9(0, new f9(new xp(this.c, g27.a(k9.class), 9), ubVar, this, 0)), y97.G(this), ru7.b, q9.a);
        this.g = kotlinx.coroutines.flow.d.A(new h(new gf2(new g9(new xp(this.c, g27.a(m9.class), 9), 0), new AdContentViewModel$isLoadingState$2(2, null)), new gf2(new g9(new xp(this.c, g27.a(l9.class), 9), 1), new AdContentViewModel$isErrorOccurred$2(2, null)), new AdContentViewModel$adPlayerControllerStateState$1(3, null)), y97.G(this), ru7.a(2), new cb(true, false));
        c9 c9Var = new c9(this, k21Var, 0);
        e62 e62Var = (e62) exoPlayer;
        e62Var.m.a(c9Var);
        this.h = c9Var;
        uc6 uc6Var = new uc6(new dp2() { // from class: ir.myket.player.viewmodel.a
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                tc6 tc6Var = (tc6) obj;
                js3.p(tc6Var, "<destruct>");
                String str = tc6Var.a;
                String str2 = tc6Var.b;
                int i = tc6Var.c;
                String str3 = tc6Var.d;
                b bVar = this.a;
                bt2.G(y97.G(bVar), null, null, new AdContentViewModel$playerAnalyticsListener$1$1(xc6Var, aVar, bVar, str, str2, i, str3, null), 3);
                return tx8.a;
            }
        });
        e62Var.u0(uc6Var);
        this.i = uc6Var;
        e(h9.a);
    }

    @Override // defpackage.k79
    public final void d() {
        c9 c9Var = this.h;
        ExoPlayer exoPlayer = this.d;
        if (c9Var != null) {
            ((e62) exoPlayer).O(c9Var);
        }
        uc6 uc6Var = this.i;
        if (uc6Var != null) {
            e62 e62Var = (e62) exoPlayer;
            e62Var.c1();
            e62Var.s.f.e(uc6Var);
        }
        this.h = null;
        this.i = null;
        e62 e62Var2 = (e62) exoPlayer;
        e62Var2.stop();
        e62Var2.a();
    }
}
