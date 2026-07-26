package ir.myket.player.ui.client.ad;

import android.os.Build;
import androidx.compose.runtime.g;
import androidx.compose.runtime.i;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.at2;
import defpackage.av;
import defpackage.bp2;
import defpackage.br9;
import defpackage.ca;
import defpackage.cb;
import defpackage.ct2;
import defpackage.cx3;
import defpackage.d87;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.e87;
import defpackage.ey7;
import defpackage.f8;
import defpackage.g27;
import defpackage.hx4;
import defpackage.js3;
import defpackage.jz0;
import defpackage.k01;
import defpackage.lf7;
import defpackage.my6;
import defpackage.mz3;
import defpackage.o9;
import defpackage.oz3;
import defpackage.p9;
import defpackage.q9;
import defpackage.qh;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.qz4;
import defpackage.r9;
import defpackage.s08;
import defpackage.s7;
import defpackage.s9;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.u8;
import defpackage.ub;
import defpackage.vp7;
import defpackage.w8;
import defpackage.wb5;
import defpackage.wc6;
import defpackage.wr2;
import defpackage.xc6;
import defpackage.y8;
import defpackage.yu8;
import defpackage.z8;
import defpackage.zk8;
import defpackage.zy0;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final void a(ub ubVar, xc6 xc6Var, final dp2 dp2Var, qz0 qz0Var, int i) {
        mz3 mz3Var;
        Object d87Var;
        Object obj;
        js3.p(xc6Var, "playerConfig");
        qz0Var.c0(2046894486);
        int i2 = (qz0Var.h(dp2Var) ? 256 : 128) | (qz0Var.h(ubVar) ? 4 : 2) | i | (qz0Var.f(xc6Var) ? 32 : 16);
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            i iVar = oz3.a;
            qz0Var.a0(523578110);
            try {
                zy0 zy0Var = (zy0) qz0Var.j(iVar);
                if (zy0Var.b == null) {
                    zy0Var.b = zy0Var.a.invoke();
                }
                obj = zy0Var.b;
            } catch (Exception e) {
                zy0 zy0Var2 = (zy0) qz0Var.j(iVar);
                Object objInvoke = zy0Var2.a.invoke();
                zy0Var2.b = objInvoke;
                mz3 mz3Var2 = (mz3) objInvoke;
                if (mz3Var2 == null) {
                    throw new IllegalStateException(("Can't get Koin context due to error: " + e).toString());
                }
                mz3Var = mz3Var2;
            }
            if (obj == null) {
                throw new IllegalStateException("Can't retrieve value for ");
            }
            mz3Var = (mz3) obj;
            qz0Var.q(false);
            yu8 yu8Var = qh.b;
            js3.p(yu8Var, "qualifier");
            vp7 vp7Var = mz3Var.c;
            vp7Var.getClass();
            lf7 lf7VarC = (lf7) ((ConcurrentHashMap) vp7Var.d).get("playerScope");
            if (lf7VarC == null) {
                lf7VarC = mz3.c(mz3Var, "playerScope", yu8Var, null, null, 8);
            }
            qz0Var.a0(-424940701);
            qz0Var.a0(5004770);
            boolean zF = qz0Var.f(lf7VarC);
            Object objM = qz0Var.M();
            Object obj2 = jz0.a;
            if (zF || objM == obj2) {
                objM = new k01(lf7VarC);
                qz0Var.l0(objM);
            }
            qz0Var.q(false);
            lf7 lf7Var = ((k01) objM).a;
            qz0Var.q(false);
            qz0Var.a0(-1168520582);
            qz0Var.a0(-1633490746);
            boolean zF2 = qz0Var.f(null) | qz0Var.f(lf7Var);
            Object objM2 = qz0Var.M();
            if (zF2 || objM2 == obj2) {
                objM2 = lf7Var.b(g27.a(wc6.class), null, null);
                qz0Var.l0(objM2);
            }
            qz0Var.q(false);
            qz0Var.q(false);
            wc6 wc6Var = (wc6) objM2;
            Object objM3 = qz0Var.M();
            if (objM3 == obj2) {
                objM3 = g.h(null);
                qz0Var.l0(objM3);
            }
            final wb5 wb5Var = (wb5) objM3;
            boolean zH = qz0Var.h(wc6Var);
            Object objM4 = qz0Var.M();
            if (zH || objM4 == obj2) {
                objM4 = new AdContentScreenKt$AdContentScreen$2$1(wc6Var, wb5Var, null);
                qz0Var.l0(objM4);
            }
            tx8 tx8Var = tx8.a;
            zk8.h(qz0Var, (qp2) objM4, tx8Var);
            qz0Var.a0(-29403656);
            qz0Var.a0(-29403776);
            if (Build.VERSION.SDK_INT >= 24) {
                Object objM5 = qz0Var.M();
                if (objM5 == obj2) {
                    objM5 = new u8(wb5Var, 0);
                    qz0Var.l0(objM5);
                }
                at2.I(null, (dp2) objM5, qz0Var, 390);
                d87Var = new e87(tx8Var);
            } else {
                d87Var = new d87();
            }
            qz0Var.q(false);
            if (d87Var instanceof d87) {
                Object objM6 = qz0Var.M();
                if (objM6 == obj2) {
                    objM6 = new u8(wb5Var, 1);
                    qz0Var.l0(objM6);
                }
                at2.G(null, (dp2) objM6, qz0Var, 390);
            }
            qz0Var.q(false);
            final ExoPlayer exoPlayer = (ExoPlayer) wb5Var.getValue();
            if (exoPlayer == null) {
                qz0Var.a0(-911220602);
            } else {
                qz0Var.a0(-911220601);
                boolean zH2 = qz0Var.h(exoPlayer) | qz0Var.h(ubVar) | ((i2 & 112) == 32);
                Object objM7 = qz0Var.M();
                if (zH2 || objM7 == obj2) {
                    objM7 = new f8(exoPlayer, ubVar, xc6Var, 3);
                    qz0Var.l0(objM7);
                }
                wr2 wr2VarY = ct2.y(qz0Var);
                final ir.myket.player.viewmodel.b bVar = (ir.myket.player.viewmodel.b) dt2.y(g27.a(ir.myket.player.viewmodel.b.class), wr2VarY.a, tt3.u(wr2VarY), oz3.a(qz0Var), (bp2) objM7);
                final wb5 wb5VarA = androidx.lifecycle.compose.a.a(bVar.f, qz0Var);
                final wb5 wb5VarA2 = androidx.lifecycle.compose.a.a(bVar.g, qz0Var);
                final hx4 hx4VarM = br9.M((ey7) ((s08) androidx.media3.ui.compose.state.b.b(exoPlayer, qz0Var, 0).a).getValue(), qz0Var);
                final lf7 lf7Var2 = lf7VarC;
                zk8.b(l.n.a(LayoutDirection.a), s7.X(967764804, new qp2() { // from class: ir.myket.player.ui.client.ad.a
                    @Override // defpackage.qp2
                    public final Object invoke(Object obj3, Object obj4) {
                        qz0 qz0Var2 = (qz0) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if (qz0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ExoPlayer exoPlayer2 = exoPlayer;
                            androidx.media3.ui.compose.a.a(exoPlayer2, hx4VarM, 0, qz0Var2, 0, 4);
                            s9 s9Var = (s9) wb5VarA.getValue();
                            cb cbVar = (cb) wb5VarA2.getValue();
                            dp2 dp2Var2 = dp2Var;
                            boolean zF3 = qz0Var2.f(dp2Var2);
                            Object objM8 = qz0Var2.M();
                            av avVar = jz0.a;
                            if (zF3 || objM8 == avVar) {
                                objM8 = new y8(0, dp2Var2);
                                qz0Var2.l0(objM8);
                            }
                            dp2 dp2Var3 = (dp2) objM8;
                            boolean zF4 = qz0Var2.f(dp2Var2);
                            lf7 lf7Var3 = lf7Var2;
                            boolean zH3 = zF4 | qz0Var2.h(lf7Var3);
                            Object objM9 = qz0Var2.M();
                            if (zH3 || objM9 == avVar) {
                                objM9 = new f8(dp2Var2, lf7Var3, wb5Var, 4);
                                qz0Var2.l0(objM9);
                            }
                            bp2 bp2Var = (bp2) objM9;
                            ir.myket.player.viewmodel.b bVar2 = bVar;
                            boolean zH4 = qz0Var2.h(bVar2);
                            Object objM10 = qz0Var2.M();
                            if (zH4 || objM10 == avVar) {
                                objM10 = new AdContentScreenKt$AdContentScreen$5$1$3$1(1, bVar2, ir.myket.player.viewmodel.b.class, PackageListMetaDataDTO.KEY_ACTION, "action(Lir/myket/common/viewmodels/ViewModelAction;)V", 0);
                                qz0Var2.l0(objM10);
                            }
                            b.c(exoPlayer2, s9Var, cbVar, dp2Var3, bp2Var, (dp2) ((cx3) objM10), qz0Var2, 0);
                        } else {
                            qz0Var2.U();
                        }
                        return tx8.a;
                    }
                }, qz0Var), qz0Var, 56);
            }
            qz0Var.q(false);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new w8(ubVar, xc6Var, dp2Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARN: Type inference failed for: r10v1, types: [qz0] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [qz0] */
    /* JADX WARN: Type inference failed for: r10v4, types: [qz0] */
    /* JADX WARN: Type inference failed for: r10v5, types: [qz0] */
    /* JADX WARN: Type inference failed for: r10v6, types: [qz0] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.media3.exoplayer.ExoPlayer r49, defpackage.o9 r50, defpackage.cb r51, defpackage.dp2 r52, defpackage.dp2 r53, defpackage.qz0 r54, int r55) {
        /*
            Method dump skipped, instruction units count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.ui.client.ad.b.b(androidx.media3.exoplayer.ExoPlayer, o9, cb, dp2, dp2, qz0, int):void");
    }

    public static final void c(ExoPlayer exoPlayer, s9 s9Var, cb cbVar, dp2 dp2Var, bp2 bp2Var, dp2 dp2Var2, qz0 qz0Var, int i) {
        qz0Var.c0(1929146405);
        int i2 = i | (qz0Var.h(exoPlayer) ? 4 : 2) | (qz0Var.h(s9Var) ? 32 : 16) | (qz0Var.h(cbVar) ? 256 : 128) | (qz0Var.h(dp2Var) ? 2048 : 1024) | (qz0Var.h(bp2Var) ? 16384 : 8192) | (qz0Var.h(dp2Var2) ? 131072 : 65536);
        if (!qz0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            qz0Var.U();
        } else if (s9Var instanceof o9) {
            qz0Var.a0(243509138);
            b(exoPlayer, (o9) s9Var, cbVar, dp2Var, dp2Var2, qz0Var, (i2 & 8190) | ((i2 >> 3) & 57344));
            qz0Var.q(false);
        } else if (s9Var instanceof p9) {
            qz0Var.a0(243783178);
            br9.c((p9) s9Var, null, dp2Var2, qz0Var, ((i2 >> 9) & 896) | ((i2 >> 3) & 14));
            qz0Var.q(false);
        } else if (s9Var instanceof r9) {
            qz0Var.a0(243933280);
            qz0Var.q(false);
            bp2Var.invoke();
        } else {
            if (!(s9Var instanceof q9)) {
                qz0Var.a0(-1516167485);
                qz0Var.q(false);
                throw new NoWhenBranchMatchedException();
            }
            qz0Var.a0(243994939);
            qz0Var.q(false);
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new z8(exoPlayer, s9Var, cbVar, dp2Var, bp2Var, dp2Var2, i);
        }
    }

    public static final void d(ExoPlayer exoPlayer, qz4 qz4Var, dp2 dp2Var, qz0 qz0Var, int i) {
        int i2;
        qz0Var.c0(-1176645971);
        if ((i & 6) == 0) {
            i2 = (qz0Var.h(exoPlayer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(qz4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = qz0Var.h(qz4Var) | qz0Var.h(exoPlayer) | ((i2 & 896) == 256);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new AdPlaybackCallbackHandlerKt$AdPlaybackCallbackHandler$2$1(qz4Var, exoPlayer, dp2Var, null);
                qz0Var.l0(objM);
            }
            zk8.i(exoPlayer, qz4Var, (qp2) objM, qz0Var);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ca(exoPlayer, qz4Var, dp2Var, i, 1);
        }
    }
}
