package ir.myket.player.viewmodel;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.as2;
import defpackage.bs2;
import defpackage.bt2;
import defpackage.c9;
import defpackage.d9;
import defpackage.dc6;
import defpackage.dp2;
import defpackage.ds2;
import defpackage.e62;
import defpackage.ec6;
import defpackage.f9;
import defpackage.fc6;
import defpackage.fs2;
import defpackage.fu0;
import defpackage.g27;
import defpackage.g66;
import defpackage.g9;
import defpackage.gc6;
import defpackage.gf2;
import defpackage.gs2;
import defpackage.gy6;
import defpackage.hb6;
import defpackage.hc6;
import defpackage.hs2;
import defpackage.ib6;
import defpackage.ic6;
import defpackage.ja1;
import defpackage.ja8;
import defpackage.jb6;
import defpackage.jc6;
import defpackage.js3;
import defpackage.k21;
import defpackage.kb6;
import defpackage.kc6;
import defpackage.lb6;
import defpackage.lc6;
import defpackage.lo3;
import defpackage.m6;
import defpackage.mb6;
import defpackage.mc6;
import defpackage.nb6;
import defpackage.nc6;
import defpackage.nf2;
import defpackage.ng6;
import defpackage.nn5;
import defpackage.no6;
import defpackage.o4;
import defpackage.ob6;
import defpackage.oc6;
import defpackage.pb6;
import defpackage.pc6;
import defpackage.pv6;
import defpackage.qb6;
import defpackage.rb6;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.sb6;
import defpackage.tb;
import defpackage.tb6;
import defpackage.tc6;
import defpackage.tx8;
import defpackage.ub6;
import defpackage.uc6;
import defpackage.vb6;
import defpackage.vb7;
import defpackage.wb6;
import defpackage.wd6;
import defpackage.ws0;
import defpackage.xb6;
import defpackage.xc6;
import defpackage.xe2;
import defpackage.xp;
import defpackage.y97;
import defpackage.yb6;
import defpackage.yr2;
import defpackage.zb6;
import defpackage.zl6;
import ir.myket.player.domain.models.PlayerMovieData;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends m6 {
    public final rv6 A;
    public final rv6 B;
    public final rv6 C;
    public final pv6 D;
    public final pv6 E;
    public final pv6 F;
    public c9 G;
    public uc6 H;
    public final rv6 I;
    public final ExoPlayer d;
    public final gs2 e;
    public final as2 f;
    public final ds2 g;
    public final no6 h;
    public final ws0 i;
    public final bs2 j;
    public final lo3 k;
    public final ir.myket.callback.manager.a l;
    public int m;
    public boolean n;
    public final LinkedHashSet o;
    public final l p;
    public final rv6 q;
    public final l r;
    public final l s;
    public final rv6 t;
    public final rv6 u;
    public final rv6 v;
    public final rv6 w;
    public final rv6 x;
    public final rv6 y;
    public final rv6 z;

    public e(ExoPlayer exoPlayer, PlayerMovieData playerMovieData, final ir.myket.analytics.spix.domain.usecase.a aVar, hs2 hs2Var, gs2 gs2Var, as2 as2Var, fs2 fs2Var, yr2 yr2Var, k21 k21Var, ds2 ds2Var, no6 no6Var, ws0 ws0Var, bs2 bs2Var, lo3 lo3Var, ir.myket.callback.manager.a aVar2) {
        js3.p(exoPlayer, "player");
        js3.p(playerMovieData, "initialPlayerMovieData");
        this.d = exoPlayer;
        this.e = gs2Var;
        this.f = as2Var;
        this.g = ds2Var;
        this.h = no6Var;
        this.i = ws0Var;
        this.j = bs2Var;
        this.k = lo3Var;
        this.l = aVar2;
        this.n = true;
        this.o = new LinkedHashSet();
        l lVarB = ja1.b(playerMovieData);
        this.p = lVarB;
        rv6 rv6Var = new rv6(lVarB);
        this.q = rv6Var;
        e62 e62Var = (e62) exoPlayer;
        long jD0 = e62Var.d0();
        l lVarB2 = ja1.b(Long.valueOf(jD0 < 0 ? 0L : jD0));
        this.r = lVarB2;
        long jC0 = e62Var.C0();
        l lVarB3 = ja1.b(Long.valueOf(jC0 < 0 ? 0L : jC0));
        this.s = lVarB3;
        gf2 gf2Var = new gf2(new f9(lVarB, this, fs2Var, 8), new PlayerViewModel$watchedPlaybackPositionState$2(null, this), 4);
        fu0 fu0VarG = y97.G(this);
        j jVar = ru7.b;
        rv6 rv6VarA = kotlinx.coroutines.flow.d.A(gf2Var, fu0VarG, jVar, null);
        int i = 9;
        rv6 rv6VarA2 = kotlinx.coroutines.flow.d.A(new xp(new xp(this.c, g27.a(dc6.class), i), this, 15), y97.G(this), ru7.a(2), 0L);
        this.t = kotlinx.coroutines.flow.d.A(new g9(new xp(this.c, g27.a(wb6.class), i), 12), y97.G(this), ru7.a(2), ja8.a);
        rv6 rv6VarA3 = kotlinx.coroutines.flow.d.A(kotlinx.coroutines.flow.d.g(kotlinx.coroutines.flow.d.x(lVarB2, rv6VarA2), lVarB3, new gf2(new g9(new xp(this.c, g27.a(pc6.class), i), 13), new PlayerViewModel$totalDurationTimeState$2(null, this)), new PlayerViewModel$progressBarTimeStateState$1(null, this)), y97.G(this), ru7.a(2), new zl6(0L, 0.0f, 0L, ""));
        this.u = rv6VarA3;
        gf2 gf2Var2 = new gf2(new g9(new xp(this.c, g27.a(tb6.class), i), 14), new PlayerViewModel$isDraggingProgressBar$2(2, null));
        gf2 gf2Var3 = new gf2(new g9(new xp(this.c, g27.a(ub6.class), i), 15), new PlayerViewModel$isControllerVisibleState$2(2, null));
        rv6 rv6VarA4 = kotlinx.coroutines.flow.d.A(new gf2(new g9(new xp(this.c, g27.a(pb6.class), 9), 16), new PlayerViewModel$isReadyState$2(null, this)), y97.G(this), ru7.a(2), Boolean.valueOf(e62Var.e() == 3));
        this.v = rv6VarA4;
        gf2 gf2Var4 = new gf2(new g9(new xp(this.c, g27.a(ob6.class), 9), 17), new PlayerViewModel$isLoadingState$2(null, this));
        gf2 gf2Var5 = new gf2(new g9(new xp(this.c, g27.a(nb6.class), 9), 18), new PlayerViewModel$isErrorOccurred$2(2, null));
        gf2 gf2Var6 = new gf2(new g9(new xp(this.c, g27.a(lb6.class), 9), 2), new PlayerViewModel$canShowHintState$2(2, null));
        gf2 gf2Var7 = new gf2(new g9(new xp(this.c, g27.a(rb6.class), 9), 3), new PlayerViewModel$isLockedState$2(2, null));
        gf2 gf2Var8 = new gf2(new g9(new xp(this.c, g27.a(kb6.class), 9), 4), new PlayerViewModel$shouldPlayFromBeginningHideState$2(2, null));
        gf2 gf2Var9 = new gf2(new g9(new xp(this.c, g27.a(mb6.class), 9), 5), new PlayerViewModel$playPauseButtonState$2(null, this));
        xe2 xe2VarK = kotlinx.coroutines.flow.d.k(new gf2(new g9(new xp(this.c, g27.a(nc6.class), 9), 6), new PlayerViewModel$isPreviewPosterVisibleState$2(2, null)));
        xe2 xe2VarK2 = kotlinx.coroutines.flow.d.k(new gf2(new h(kotlinx.coroutines.flow.d.y(rv6VarA3), rv6Var, new PlayerViewModel$showSkipCreditsState$1(3, null)), new PlayerViewModel$showSkipCreditsState$2(2, null)));
        gf2 gf2Var10 = new gf2(kotlinx.coroutines.flow.d.C(kotlinx.coroutines.flow.d.k(new gf2(new nf2(new xe2[]{new o4(rv6VarA, 9), xe2VarK2, gf2Var8, new ng6(0, rv6VarA4)}, new PlayerViewModel$showPlayFromBeginningState$2(5, null)), new PlayerViewModel$showPlayFromBeginningState$3(3, null), 5)), new PlayerViewModel$showPlayFromBeginningState$4(3, null)), new PlayerViewModel$showPlayFromBeginningState$5(2, null));
        xe2 xe2VarK3 = kotlinx.coroutines.flow.d.k(new gf2(new xp(rv6Var, this, 13), new PlayerViewModel$currentEpisodeState$2(2, null)));
        this.w = kotlinx.coroutines.flow.d.A(new h(xe2VarK3, rv6Var, new PlayerViewModel$videoTitleState$1(3, null)), y97.G(this), ru7.a(2), "");
        xe2 xe2VarK4 = kotlinx.coroutines.flow.d.k(new gf2(new o4(xe2VarK3, 25), new PlayerViewModel$lastEpisodeIdState$2(2, null)));
        rv6 rv6VarA5 = kotlinx.coroutines.flow.d.A(new vb7(new PlayerViewModel$special$$inlined$transform$1(rv6Var, null, fs2Var)), y97.G(this), ru7.a(2), null);
        this.x = rv6VarA5;
        int i2 = 7;
        xe2 xe2VarK5 = kotlinx.coroutines.flow.d.k(new gf2(new g9(new xp(this.c, g27.a(sb6.class), 9), i2), new PlayerViewModel$nextEpisodeLoadingState$2(2, null)));
        gf2 gf2Var11 = new gf2(kotlinx.coroutines.flow.d.g(lVarB2, rv6Var, rv6VarA5, new PlayerViewModel$showNextEpisodeState$1(null, this)), new PlayerViewModel$showNextEpisodeState$2(2, null));
        g9 g9Var = new g9(new xp(this.c, g27.a(mc6.class), 9), 8);
        fu0 fu0VarG2 = y97.G(this);
        k kVarA = ru7.a(2);
        Boolean bool = Boolean.TRUE;
        rv6 rv6VarA6 = kotlinx.coroutines.flow.d.A(new nf2(new xe2[]{kotlinx.coroutines.flow.d.A(g9Var, fu0VarG2, kVarA, bool), gf2Var11, new o4(rv6VarA5, 9), xe2VarK5}, new PlayerViewModel$nextEpisodeViewStateState$1(5, null)), y97.G(this), ru7.a(2), nn5.a);
        this.y = rv6VarA6;
        xe2 xe2VarK6 = kotlinx.coroutines.flow.d.k(new gf2(kotlinx.coroutines.flow.d.g(kotlinx.coroutines.flow.d.y(rv6VarA3), rv6Var, xe2VarK4, new PlayerViewModel$recommendationStateState$1(4, null)), new PlayerViewModel$recommendationStateState$2(2, null)));
        int i3 = 9;
        rv6 rv6VarA7 = kotlinx.coroutines.flow.d.A(kotlinx.coroutines.flow.d.g(kotlinx.coroutines.flow.d.A(new g9(new xp(this.c, g27.a(oc6.class), i3), i3), y97.G(this), ru7.a(2), bool), xe2VarK6, kotlinx.coroutines.flow.d.A(kotlinx.coroutines.flow.d.C(kotlinx.coroutines.flow.d.j(new o4(xe2VarK6, 24), new g66(17)), new PlayerViewModel$special$$inlined$flatMapLatest$1(null, hs2Var)), y97.G(this), ru7.a(2), null), new PlayerViewModel$recommendationViewStateState$1(null, this)), y97.G(this), ru7.a(2), gy6.a);
        this.z = rv6VarA7;
        this.A = kotlinx.coroutines.flow.d.A(new xp(new xe2[]{gf2Var3, rv6VarA4, gf2Var4, gf2Var5, gf2Var6, gf2Var7, rv6VarA7, gf2Var9, xe2VarK2, gf2Var10, xe2VarK}, new PlayerViewModel$playerControllerStateState$1(null), i2), y97.G(this), ru7.a(2), new wd6(true, false, true, false, false, false, false, new androidx.media3.ui.compose.state.a(exoPlayer), false, false, true));
        rv6 rv6VarA8 = kotlinx.coroutines.flow.d.A(new xp(lVarB, this, 14), y97.G(this), ru7.a(2), new xc6(null, null, null, 2047));
        this.B = rv6VarA8;
        rv6 rv6VarA9 = kotlinx.coroutines.flow.d.A(kotlinx.coroutines.flow.d.C(kotlinx.coroutines.flow.d.j(rv6VarA8, new g66(18)), new PlayerViewModel$special$$inlined$flatMapLatest$2(null, this)), y97.G(this), ru7.a(2), null);
        this.C = kotlinx.coroutines.flow.d.A(kotlinx.coroutines.flow.d.C(new vb7(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new xe2[]{kotlinx.coroutines.flow.d.y(rv6VarA3), lVarB}, null, new PlayerViewModel$adViewStateState$1(null, this))), new PlayerViewModel$special$$inlined$flatMapLatest$3(null, this, yr2Var)), y97.G(this), jVar, tb.a);
        int i4 = 9;
        this.D = kotlinx.coroutines.flow.d.z(new g9(new xp(this.c, g27.a(kc6.class), i4), 10), y97.G(this), ru7.a(2), 0);
        this.E = kotlinx.coroutines.flow.d.z(new g9(new xp(this.c, g27.a(jc6.class), i4), 11), y97.G(this), ru7.a(2), 0);
        this.F = kotlinx.coroutines.flow.d.z(new xp(this.c, g27.a(ib6.class), i4), y97.G(this), ru7.a(2), 0);
        c9 c9Var = new c9(this, k21Var, 2);
        e62Var.m.a(c9Var);
        this.G = c9Var;
        uc6 uc6Var = new uc6(new dp2() { // from class: ir.myket.player.viewmodel.d
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                tc6 tc6Var = (tc6) obj;
                js3.p(tc6Var, "<destruct>");
                String str = tc6Var.a;
                String str2 = tc6Var.b;
                int i5 = tc6Var.c;
                String str3 = tc6Var.d;
                e eVar = this.a;
                bt2.G(y97.G(eVar), null, null, new PlayerViewModel$playerAnalyticsListener$1$1(eVar, aVar, str, str2, i5, str3, null), 3);
                return tx8.a;
            }
        });
        e62Var.u0(uc6Var);
        this.H = uc6Var;
        this.I = kotlinx.coroutines.flow.d.A(new d9(9, new gf2(rv6VarA4, new PlayerViewModel$isReadyStateForService$1(3, null), 5)), y97.G(this), ru7.a(2), Boolean.FALSE);
        bt2.G(y97.G(this), null, null, new PlayerViewModel$startProgressUpdates$1(null, this), 3);
        kotlinx.coroutines.flow.d.v(kotlinx.coroutines.flow.d.w(new xp(new xe2[]{gf2Var3, rv6VarA2, gf2Var7, rv6VarA4, rv6VarA7, gf2Var2}, new PlayerViewModel$autoHideController$$inlined$combineLatest$1(null), 8), new PlayerViewModel$autoHideController$$inlined$combineLatest$2(null, this)), y97.G(this));
        int i5 = 9;
        kotlinx.coroutines.flow.d.v(kotlinx.coroutines.flow.d.C(new xp(this.c, g27.a(yb6.class), i5), new PlayerViewModel$subscribePlayerRequester$$inlined$flatMapLatest$1(null, this)), y97.G(this));
        kotlinx.coroutines.flow.d.v(new h(new xp(this.c, g27.a(hc6.class), i5), new o4(rv6VarA9, 9), new PlayerViewModel$subscribeQualityTrackSelector$1(null, this)), y97.G(this));
        kotlinx.coroutines.flow.d.v(new h(new xp(this.c, g27.a(fc6.class), i5), new o4(rv6VarA9, 9), new PlayerViewModel$subscribeAudioTrackSelector$1(null, this)), y97.G(this));
        kotlinx.coroutines.flow.d.v(new h(new xp(this.c, g27.a(ic6.class), i5), new o4(rv6VarA9, 9), new PlayerViewModel$subscribeSubtitleTrackSelector$1(null, this)), y97.G(this));
        kotlinx.coroutines.flow.d.v(new h(new xp(this.c, g27.a(gc6.class), i5), new o4(rv6VarA9, 9), new PlayerViewModel$subscribePlaybackSpeedSelector$1(null, this)), y97.G(this));
        kotlinx.coroutines.flow.d.v(new gf2(new xp(this.c, g27.a(qb6.class), i5), new PlayerViewModel$subscribeTapGestureAction$1(null, this), 4), y97.G(this));
        kotlinx.coroutines.flow.d.v(new gf2(new xp(this.c, g27.a(jb6.class), i5), new PlayerViewModel$subscribeShareInvoker$1(null, this), 4), y97.G(this));
        kotlinx.coroutines.flow.d.v(new gf2(new xp(this.c, g27.a(xb6.class), i5), new PlayerViewModel$subscribePlayerPreparer$1(null, this), 4), y97.G(this));
        kotlinx.coroutines.flow.d.v(new gf2(new xp(this.c, g27.a(lc6.class), i5), new PlayerViewModel$catchRecommendationSeasons$1(null, this), 4), y97.G(this));
        kotlinx.coroutines.flow.d.v(new gf2(new xp(this.c, g27.a(hb6.class), i5), new PlayerViewModel$subscribeChangeEpisode$1(null, this), 4), y97.G(this));
        kotlinx.coroutines.flow.d.v(kotlinx.coroutines.flow.d.g(rv6VarA3, rv6Var, rv6VarA6, new PlayerViewModel$subscribeAutoPlayNextEpisode$1(null, this)), y97.G(this));
        int i6 = 9;
        kotlinx.coroutines.flow.d.v(new gf2(new xp(this.c, g27.a(zb6.class), i6), new PlayerViewModel$subscribeMovieWatchProgressSaver$1(null, this), 4), y97.G(this));
        kotlinx.coroutines.flow.d.v(new gf2(kotlinx.coroutines.flow.d.k(new g9(new xp(this.c, g27.a(ec6.class), i6), 19)), new PlayerViewModel$subscribeCallbackUrlSender$2(null, this), 4), y97.G(this));
        kotlinx.coroutines.flow.d.v(new gf2(new xp(this.c, g27.a(vb6.class), 9), new PlayerViewModel$subscribeAdFinisher$1(null, this), 4), y97.G(this));
        kotlinx.coroutines.flow.d.v(new nf2(new xe2[]{rv6Var, xe2VarK3, rv6VarA8, rv6VarA}, new PlayerViewModel$subscribeUpdateMediaItem$1(null, this)), y97.G(this));
        if (((PlayerMovieData) lVarB.getValue()).a.k != null) {
            kotlinx.coroutines.flow.d.v(new gf2(kotlinx.coroutines.flow.d.y(rv6VarA3), new PlayerViewModel$checkSampleWatchLimitation$1(null, this), 4), y97.G(this));
        }
        e(new gc6(e62Var.g().a));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(ir.myket.player.viewmodel.e r19, java.lang.String r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.viewmodel.e.f(ir.myket.player.viewmodel.e, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.k79
    public final void d() {
        c9 c9Var = this.G;
        ExoPlayer exoPlayer = this.d;
        if (c9Var != null) {
            ((e62) exoPlayer).O(c9Var);
        }
        uc6 uc6Var = this.H;
        if (uc6Var != null) {
            e62 e62Var = (e62) exoPlayer;
            e62Var.c1();
            e62Var.s.f.e(uc6Var);
        }
        this.G = null;
        this.H = null;
        bt2.G(y97.G(this), null, null, new PlayerViewModel$onCleared$3(null, this), 3);
    }
}
