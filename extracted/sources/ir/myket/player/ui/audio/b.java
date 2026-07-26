package ir.myket.player.ui.audio;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.g;
import androidx.lifecycle.Lifecycle$Event;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.a00;
import defpackage.at2;
import defpackage.av;
import defpackage.bp2;
import defpackage.c20;
import defpackage.cb0;
import defpackage.cc7;
import defpackage.cx3;
import defpackage.dl5;
import defpackage.dp2;
import defpackage.eq;
import defpackage.ex4;
import defpackage.ey6;
import defpackage.fy6;
import defpackage.gy6;
import defpackage.hb;
import defpackage.hx4;
import defpackage.iy6;
import defpackage.js3;
import defpackage.jz0;
import defpackage.mb6;
import defpackage.mi3;
import defpackage.my6;
import defpackage.n08;
import defpackage.ng0;
import defpackage.p41;
import defpackage.pg0;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rf0;
import defpackage.rn5;
import defpackage.rp2;
import defpackage.rq4;
import defpackage.s7;
import defpackage.tj8;
import defpackage.tt3;
import defpackage.tv8;
import defpackage.tx8;
import defpackage.u48;
import defpackage.u58;
import defpackage.ub;
import defpackage.uj8;
import defpackage.vb;
import defpackage.vs6;
import defpackage.wb5;
import defpackage.wd6;
import defpackage.xc6;
import defpackage.xz;
import defpackage.yh0;
import defpackage.yq2;
import defpackage.yz;
import defpackage.za0;
import defpackage.zk8;
import defpackage.zl6;
import defpackage.zz;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.viewmodel.e;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final void a(hx4 hx4Var, final dl5 dl5Var, ir.myket.player.ui.client.state.a aVar, ExoPlayer exoPlayer, final e eVar, final dp2 dp2Var, qz0 qz0Var, int i) {
        Object obj;
        js3.p(dl5Var, "navigationStateManager");
        js3.p(aVar, "playerActionFlow");
        js3.p(exoPlayer, "player");
        js3.p(eVar, "playerViewModel");
        qz0Var.c0(407598417);
        int i2 = i | (qz0Var.f(dl5Var) ? 32 : 16) | (qz0Var.h(exoPlayer) ? 2048 : 1024) | (qz0Var.h(eVar) ? 16384 : 8192) | (qz0Var.h(dp2Var) ? 131072 : 65536);
        if (qz0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            Context context = (Context) qz0Var.j(androidx.compose.ui.platform.e.b);
            wb5 wb5VarK = g.k(aVar, qz0Var);
            final wb5 wb5VarA = androidx.lifecycle.compose.a.a(eVar.q, qz0Var);
            final wb5 wb5VarA2 = androidx.lifecycle.compose.a.a(eVar.A, qz0Var);
            final wb5 wb5VarA3 = androidx.lifecycle.compose.a.a(eVar.B, qz0Var);
            final wb5 wb5VarA4 = androidx.lifecycle.compose.a.a(eVar.u, qz0Var);
            final wb5 wb5VarA5 = androidx.lifecycle.compose.a.a(eVar.z, qz0Var);
            final wb5 wb5VarA6 = androidx.lifecycle.compose.a.a(eVar.y, qz0Var);
            final wb5 wb5VarA7 = androidx.lifecycle.compose.a.a(eVar.w, qz0Var);
            final wb5 wb5VarA8 = androidx.lifecycle.compose.a.a(eVar.C, qz0Var);
            eVar.e(new mb6(androidx.media3.ui.compose.state.b.a(exoPlayer, qz0Var, (i2 >> 9) & 14)));
            boolean zF = qz0Var.f(wb5VarK) | qz0Var.h(eVar) | qz0Var.h(context) | ((i2 & 458752) == 131072);
            Object objM = qz0Var.M();
            Object obj2 = jz0.a;
            if (zF || objM == obj2) {
                obj = obj2;
                objM = new AudioPlayerScreenKt$AudioPlayerScreen$2$1(wb5VarK, eVar, context, dp2Var, null);
                qz0Var.l0(objM);
            } else {
                obj = obj2;
            }
            zk8.h(qz0Var, (qp2) objM, tx8.a);
            Lifecycle$Event lifecycle$Event = Lifecycle$Event.ON_PAUSE;
            boolean zH = qz0Var.h(eVar);
            Object objM2 = qz0Var.M();
            if (zH || objM2 == obj) {
                objM2 = new zz(eVar, 0);
                qz0Var.l0(objM2);
            }
            at2.F(lifecycle$Event, null, (bp2) objM2, qz0Var, 6);
            Object objJ = qz0Var.j(uj8.a);
            js3.m(objJ);
            yq2.G(rq4.f(hx4Var, ((tj8) objJ).J.a, tt3.d), null, s7.X(1272115643, new rp2() { // from class: ir.myket.player.ui.audio.a
                @Override // defpackage.rp2
                public final Object a(Object obj3, Object obj4, Object obj5) {
                    u48 u48Var;
                    u48 u48Var2;
                    u48 u48Var3;
                    av avVar;
                    int i3;
                    av avVar2;
                    e eVar2;
                    boolean z;
                    pg0 pg0Var = (pg0) obj3;
                    qz0 qz0Var2 = (qz0) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    js3.p(pg0Var, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= qz0Var2.f(pg0Var) ? 4 : 2;
                    }
                    int i4 = iIntValue;
                    if (qz0Var2.R(i4 & 1, (i4 & 19) != 18)) {
                        u48 u48Var4 = wb5VarA8;
                        boolean z2 = ((vb) u48Var4.getValue()) instanceof ub;
                        e eVar3 = eVar;
                        u48 u48Var5 = wb5VarA3;
                        av avVar3 = jz0.a;
                        if (z2) {
                            qz0Var2.a0(-1194250402);
                            vb vbVar = (vb) u48Var4.getValue();
                            js3.n(vbVar, "null cannot be cast to non-null type ir.myket.player.viewmodel.states.AdViewState.ShowAd");
                            ub ubVar = (ub) vbVar;
                            xc6 xc6Var = (xc6) u48Var5.getValue();
                            boolean zH2 = qz0Var2.h(eVar3);
                            Object objM3 = qz0Var2.M();
                            if (zH2 || objM3 == avVar3) {
                                objM3 = new AudioPlayerScreenKt$AudioPlayerScreen$4$1$1(1, eVar3, e.class, PackageListMetaDataDTO.KEY_ACTION, "action(Lir/myket/common/viewmodels/ViewModelAction;)V", 0);
                                qz0Var2.l0(objM3);
                            }
                            ir.myket.player.ui.client.ad.b.a(ubVar, xc6Var, (dp2) ((cx3) objM3), qz0Var2, 0);
                            qz0Var2.q(false);
                        } else {
                            qz0Var2.a0(-1194034363);
                            u48 u48Var6 = wb5VarA5;
                            boolean zC = ((iy6) u48Var6.getValue()).c();
                            u48 u48Var7 = wb5VarA2;
                            u48 u48Var8 = wb5VarA;
                            if (zC) {
                                u48Var = u48Var6;
                                u48Var2 = u48Var7;
                                u48Var3 = u48Var8;
                                avVar = avVar3;
                                qz0Var2.a0(-1199158105);
                                qz0Var2.q(false);
                                i3 = -1199158105;
                            } else {
                                qz0Var2.a0(-1193973851);
                                String str = ((PlayerMovieData) u48Var8.getValue()).a.m;
                                if (str == null) {
                                    qz0Var2.a0(-1193927879);
                                } else {
                                    qz0Var2.a0(-1193927878);
                                    b.b(androidx.compose.foundation.layout.b.c, str, qz0Var2, 54);
                                }
                                qz0Var2.q(false);
                                boolean zF2 = qz0Var2.f(u48Var7) | qz0Var2.f(u48Var8);
                                Object objM4 = qz0Var2.M();
                                if (zF2 || objM4 == avVar3) {
                                    objM4 = new xz(u48Var7, u48Var8, 0);
                                    qz0Var2.l0(objM4);
                                }
                                bp2 bp2Var = (bp2) objM4;
                                boolean zH3 = qz0Var2.h(eVar3);
                                Object objM5 = qz0Var2.M();
                                if (zH3 || objM5 == avVar3) {
                                    u48Var3 = u48Var8;
                                    u48Var2 = u48Var7;
                                    AudioPlayerScreenKt$AudioPlayerScreen$4$4$1 audioPlayerScreenKt$AudioPlayerScreen$4$4$1 = new AudioPlayerScreenKt$AudioPlayerScreen$4$4$1(1, eVar3, e.class, PackageListMetaDataDTO.KEY_ACTION, "action(Lir/myket/common/viewmodels/ViewModelAction;)V", 0);
                                    qz0Var2.l0(audioPlayerScreenKt$AudioPlayerScreen$4$4$1);
                                    objM5 = audioPlayerScreenKt$AudioPlayerScreen$4$4$1;
                                } else {
                                    u48Var2 = u48Var7;
                                    u48Var3 = u48Var8;
                                }
                                avVar = avVar3;
                                u48Var = u48Var6;
                                ir.myket.player.ui.client.controllers.common.a.d(pg0Var, bp2Var, (dp2) ((cx3) objM5), false, qz0Var2, (i4 & 14) | 3072);
                                qz0Var2.q(false);
                                i3 = -1199158105;
                            }
                            FillElement fillElement = androidx.compose.foundation.layout.b.c;
                            PlayerMovieData playerMovieData = (PlayerMovieData) u48Var3.getValue();
                            wd6 wd6Var = (wd6) u48Var2.getValue();
                            xc6 xc6Var2 = (xc6) u48Var5.getValue();
                            String str2 = (String) wb5VarA7.getValue();
                            boolean zH4 = qz0Var2.h(eVar3);
                            Object objM6 = qz0Var2.M();
                            if (zH4 || objM6 == avVar) {
                                avVar2 = avVar;
                                AudioPlayerScreenKt$AudioPlayerScreen$4$5$1 audioPlayerScreenKt$AudioPlayerScreen$4$5$1 = new AudioPlayerScreenKt$AudioPlayerScreen$4$5$1(1, eVar3, e.class, PackageListMetaDataDTO.KEY_ACTION, "action(Lir/myket/common/viewmodels/ViewModelAction;)V", 0);
                                qz0Var2.l0(audioPlayerScreenKt$AudioPlayerScreen$4$5$1);
                                objM6 = audioPlayerScreenKt$AudioPlayerScreen$4$5$1;
                            } else {
                                avVar2 = avVar;
                            }
                            cx3 cx3Var = (cx3) objM6;
                            u48 u48Var9 = wb5VarA4;
                            boolean zF3 = qz0Var2.f(u48Var9);
                            Object objM7 = qz0Var2.M();
                            if (zF3 || objM7 == avVar2) {
                                objM7 = new hb(u48Var9, 1);
                                qz0Var2.l0(objM7);
                            }
                            int i5 = i3;
                            yh0.a(fillElement, playerMovieData, wd6Var, xc6Var2, dl5Var, str2, (bp2) objM7, dp2Var, (dp2) cx3Var, qz0Var2, 6);
                            qz0 qz0Var3 = qz0Var2;
                            iy6 iy6Var = (iy6) u48Var.getValue();
                            boolean zH5 = qz0Var3.h(eVar3);
                            Object objM8 = qz0Var3.M();
                            if (zH5 || objM8 == avVar2) {
                                eVar2 = eVar3;
                                objM8 = new AudioPlayerScreenKt$AudioPlayerScreen$4$7$1(1, eVar2, e.class, PackageListMetaDataDTO.KEY_ACTION, "action(Lir/myket/common/viewmodels/ViewModelAction;)V", 0);
                                qz0Var3.l0(objM8);
                            } else {
                                eVar2 = eVar3;
                            }
                            b.c(pg0Var, iy6Var, (dp2) ((cx3) objM8), qz0Var3, i4 & 14);
                            if (((iy6) u48Var.getValue()).c()) {
                                z = false;
                                qz0Var3.a0(i5);
                            } else {
                                qz0Var3.a0(-1192876637);
                                wd6 wd6Var2 = (wd6) u48Var2.getValue();
                                PlayerMovieData playerMovieData2 = (PlayerMovieData) u48Var3.getValue();
                                rn5 rn5Var = (rn5) wb5VarA6.getValue();
                                zl6 zl6Var = (zl6) u48Var9.getValue();
                                boolean zH6 = qz0Var3.h(eVar2);
                                Object objM9 = qz0Var3.M();
                                if (zH6 || objM9 == avVar2) {
                                    AudioPlayerScreenKt$AudioPlayerScreen$4$8$1 audioPlayerScreenKt$AudioPlayerScreen$4$8$1 = new AudioPlayerScreenKt$AudioPlayerScreen$4$8$1(1, eVar2, e.class, PackageListMetaDataDTO.KEY_ACTION, "action(Lir/myket/common/viewmodels/ViewModelAction;)V", 0);
                                    qz0Var3.l0(audioPlayerScreenKt$AudioPlayerScreen$4$8$1);
                                    objM9 = audioPlayerScreenKt$AudioPlayerScreen$4$8$1;
                                }
                                rf0.b(fillElement, wd6Var2, zl6Var, playerMovieData2, rn5Var, (dp2) ((cx3) objM9), qz0Var3, 6);
                                qz0Var3 = qz0Var3;
                                z = false;
                            }
                            qz0Var3.q(z);
                            qz0Var3.q(z);
                        }
                    } else {
                        qz0Var2.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, 3072, 6);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new a00(hx4Var, dl5Var, aVar, exoPlayer, eVar, dp2Var, i, 0);
        }
    }

    public static final void b(hx4 hx4Var, String str, qz0 qz0Var, int i) {
        hx4 hx4Var2;
        qz0 qz0Var2;
        NetworkCapabilities networkCapabilities;
        js3.p(str, "url");
        qz0Var.c0(310739869);
        int i2 = (qz0Var.f(str) ? 256 : 128) | i;
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            u58 u58Var = androidx.compose.ui.platform.e.b;
            Context context = (Context) qz0Var.j(u58Var);
            Object systemService = ((Context) qz0Var.j(u58Var)).getSystemService("connectivity");
            js3.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            Boolean boolValueOf = Boolean.valueOf((activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasCapability(12));
            boolean zH = qz0Var.h(connectivityManager);
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (zH || objM == avVar) {
                objM = new AutoRetryAsyncImageKt$rememberConnectivityState$1$1(connectivityManager, null);
                qz0Var.l0(objM);
            }
            wb5 wb5VarI = g.i(qz0Var, (qp2) objM, boolValueOf);
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                objM2 = g.e(0);
                qz0Var.l0(objM2);
            }
            n08 n08Var = (n08) objM2;
            Boolean bool = (Boolean) wb5VarI.getValue();
            bool.booleanValue();
            boolean zF = qz0Var.f(wb5VarI);
            Object objM3 = qz0Var.M();
            if (zF || objM3 == avVar) {
                objM3 = new AutoRetryAsyncImageKt$AutoRetryAsyncImage$1$1(wb5VarI, n08Var, null);
                qz0Var.l0(objM3);
            }
            zk8.h(qz0Var, (qp2) objM3, bool);
            mi3 mi3Var = new mi3(context);
            mi3Var.c = str;
            mi3Var.e = str + "-" + n08Var.h();
            hx4Var2 = hx4Var;
            qz0Var2 = qz0Var;
            cc7.a(mi3Var.a(), hx4Var2, p41.b, null, qz0Var2, 1573296, 1976);
        } else {
            hx4Var2 = hx4Var;
            qz0Var2 = qz0Var;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new c20(hx4Var2, str, i, 0);
        }
    }

    public static final void c(pg0 pg0Var, iy6 iy6Var, dp2 dp2Var, qz0 qz0Var, int i) {
        int i2;
        qz0Var.c0(-1239424460);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(pg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(iy6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            boolean z = iy6Var instanceof ey6;
            ng0 ng0Var = ng0.a;
            ex4 ex4Var = ex4.b;
            if (z) {
                qz0Var.a0(139988602);
                za0 za0Var = yh0.b;
                pg0Var.getClass();
                int i3 = i2 & 14;
                int i4 = i2 << 3;
                tv8.e(pg0Var, ng0Var.a(ex4Var, za0Var), (ey6) iy6Var, dp2Var, vs6.player_audio_recommendation_title, qz0Var, i3 | (i4 & 896) | (i4 & 7168));
                qz0Var.q(false);
            } else if (iy6Var instanceof fy6) {
                qz0Var.a0(140270981);
                cb0 cb0Var = eq.g;
                pg0Var.getClass();
                ir.myket.player.ui.client.recommendation.ending.a.a(ng0Var.a(ex4Var, cb0Var), (fy6) iy6Var, dp2Var, vs6.player_audio_recommendation_title, qz0Var, i2 & 1008);
                qz0Var.q(false);
            } else {
                if (!js3.i(iy6Var, gy6.a)) {
                    qz0Var.a0(-1380959508);
                    qz0Var.q(false);
                    throw new NoWhenBranchMatchedException();
                }
                qz0Var.a0(140530668);
                qz0Var.q(false);
            }
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new yz(pg0Var, iy6Var, dp2Var, i, 0);
        }
    }
}
