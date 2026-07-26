package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.l;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.ExoPlayer;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.ui.client.c;
import ir.myket.player.ui.client.state.a;
import ir.myket.player.viewmodel.e;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qz implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl5 b;
    public final /* synthetic */ hx4 c;
    public final /* synthetic */ ExoPlayer d;
    public final /* synthetic */ PlayerMovieData e;
    public final /* synthetic */ dp2 f;
    public final /* synthetic */ ub5 g;
    public final /* synthetic */ Context h;

    public /* synthetic */ qz(dl5 dl5Var, hx4 hx4Var, ExoPlayer exoPlayer, PlayerMovieData playerMovieData, dp2 dp2Var, ub5 ub5Var, Context context, int i) {
        this.a = i;
        this.b = dl5Var;
        this.c = hx4Var;
        this.d = exoPlayer;
        this.e = playerMovieData;
        this.f = dp2Var;
        this.g = ub5Var;
        this.h = context;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.a;
        av avVar = jz0.a;
        final Context context = this.h;
        tx8 tx8Var = tx8.a;
        switch (i) {
            case 0:
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qz0Var.U();
                } else {
                    u58 u58Var = l.n;
                    Context context2 = this.h;
                    js3.p(context2, "context");
                    zk8.b(u58Var.a(jr9.t(context2) ? LayoutDirection.b : LayoutDirection.a), s7.X(-1172960462, new qz(this.b, this.c, this.d, this.e, this.f, this.g, context2, 1), qz0Var), qz0Var, 56);
                }
                break;
            case 1:
                qz0 qz0Var2 = (qz0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qz0Var2.U();
                } else {
                    df6 df6Var = df6.INSTANCE;
                    final dl5 dl5Var = this.b;
                    dl5Var.getClass();
                    js3.p(df6Var, "homeScreen");
                    SnapshotStateList snapshotStateList = dl5Var.a;
                    if (snapshotStateList.isEmpty()) {
                        snapshotStateList.add(df6Var);
                    }
                    List listC = br9.C(s17.d(qz0Var2), t17.h(qz0Var2));
                    fv fvVar = new fv(14);
                    SnapshotStateList snapshotStateList2 = dl5Var.a;
                    qz0Var2.a0(-1933556136);
                    wv8 wv8Var = new wv8(vz.b);
                    final int i2 = 0;
                    final ExoPlayer exoPlayer = this.d;
                    final PlayerMovieData playerMovieData = this.e;
                    final dp2 dp2Var = this.f;
                    final ub5 ub5Var = this.g;
                    wv8Var.i(g27.a(df6.class), vz.f, b.I(), s7.X(-921490625, new rp2() { // from class: rz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            int i3 = i2;
                            df6 df6Var2 = (df6) obj3;
                            qz0 qz0Var3 = (qz0) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            switch (i3) {
                                case 0:
                                    js3.p(df6Var2, "it");
                                    if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        FillElement fillElement = androidx.compose.foundation.layout.b.c;
                                        Object objM = qz0Var3.M();
                                        av avVar2 = jz0.a;
                                        if (objM == avVar2) {
                                            objM = new a(ub5Var);
                                            qz0Var3.l0(objM);
                                        }
                                        a aVar = (a) objM;
                                        final ExoPlayer exoPlayer2 = exoPlayer;
                                        boolean zH = qz0Var3.h(exoPlayer2);
                                        final PlayerMovieData playerMovieData2 = playerMovieData;
                                        boolean zH2 = zH | qz0Var3.h(playerMovieData2);
                                        Object objM2 = qz0Var3.M();
                                        if (zH2 || objM2 == avVar2) {
                                            final int i4 = 0;
                                            objM2 = new bp2() { // from class: oz
                                                @Override // defpackage.bp2
                                                public final Object invoke() {
                                                    int i5 = i4;
                                                    PlayerMovieData playerMovieData3 = playerMovieData2;
                                                    ExoPlayer exoPlayer3 = exoPlayer2;
                                                    switch (i5) {
                                                    }
                                                    return ja1.B(exoPlayer3, playerMovieData3);
                                                }
                                            };
                                            qz0Var3.l0(objM2);
                                        }
                                        bp2 bp2Var = (bp2) objM2;
                                        qz0Var3.a0(-924953623);
                                        x79 x79VarA = uc4.a(qz0Var3);
                                        if (x79VarA == null) {
                                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        }
                                        k79 k79VarY = dt2.y(g27.a(e.class), x79VarA.m(), tt3.u(x79VarA), oz3.a(qz0Var3), bp2Var);
                                        qz0Var3.q(false);
                                        ir.myket.player.ui.audio.b.a(fillElement, dl5Var, aVar, exoPlayer2, (e) k79VarY, dp2Var, qz0Var3, 390);
                                    } else {
                                        qz0Var3.U();
                                    }
                                    return tx8.a;
                                default:
                                    js3.p(df6Var2, "it");
                                    if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        FillElement fillElement2 = androidx.compose.foundation.layout.b.c;
                                        Object objM3 = qz0Var3.M();
                                        av avVar3 = jz0.a;
                                        if (objM3 == avVar3) {
                                            objM3 = new a(ub5Var);
                                            qz0Var3.l0(objM3);
                                        }
                                        a aVar2 = (a) objM3;
                                        final ExoPlayer exoPlayer3 = exoPlayer;
                                        boolean zH3 = qz0Var3.h(exoPlayer3);
                                        final PlayerMovieData playerMovieData3 = playerMovieData;
                                        boolean zH4 = zH3 | qz0Var3.h(playerMovieData3);
                                        Object objM4 = qz0Var3.M();
                                        if (zH4 || objM4 == avVar3) {
                                            final int i5 = 1;
                                            objM4 = new bp2() { // from class: oz
                                                @Override // defpackage.bp2
                                                public final Object invoke() {
                                                    int i52 = i5;
                                                    PlayerMovieData playerMovieData32 = playerMovieData3;
                                                    ExoPlayer exoPlayer32 = exoPlayer3;
                                                    switch (i52) {
                                                    }
                                                    return ja1.B(exoPlayer32, playerMovieData32);
                                                }
                                            };
                                            qz0Var3.l0(objM4);
                                        }
                                        bp2 bp2Var2 = (bp2) objM4;
                                        qz0Var3.a0(-924953623);
                                        x79 x79VarA2 = uc4.a(qz0Var3);
                                        if (x79VarA2 == null) {
                                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        }
                                        k79 k79VarY2 = dt2.y(g27.a(e.class), x79VarA2.m(), tt3.u(x79VarA2), oz3.a(qz0Var3), bp2Var2);
                                        qz0Var3.q(false);
                                        c.a(fillElement2, dl5Var, aVar2, exoPlayer3, (e) k79VarY2, dp2Var, qz0Var3, 390);
                                    } else {
                                        qz0Var3.U();
                                    }
                                    return tx8.a;
                            }
                        }
                    }, qz0Var2));
                    final int i3 = 0;
                    androidx.compose.runtime.internal.a aVarX = s7.X(286947704, new rp2() { // from class: sz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            switch (i3) {
                                case 0:
                                    bf6 bf6Var = (bf6) obj3;
                                    qz0 qz0Var3 = (qz0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    js3.p(bf6Var, "it");
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= (iIntValue3 & 8) == 0 ? qz0Var3.f(bf6Var) : qz0Var3.h(bf6Var) ? 4 : 2;
                                    }
                                    if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        dl5 dl5Var2 = dl5Var;
                                        boolean zH = qz0Var3.h(dl5Var2);
                                        Object objM = qz0Var3.M();
                                        if (zH || objM == jz0.a) {
                                            objM = new pz(dl5Var2, 2);
                                            qz0Var3.l0(objM);
                                        }
                                        sb7.b(null, bf6Var, null, (bp2) objM, qz0Var3, (iIntValue3 << 3) & 112);
                                    } else {
                                        qz0Var3.U();
                                    }
                                    break;
                                case 1:
                                    ze6 ze6Var = (ze6) obj3;
                                    qz0 qz0Var4 = (qz0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    js3.p(ze6Var, "it");
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= qz0Var4.f(ze6Var) ? 4 : 2;
                                    }
                                    if (qz0Var4.R(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        dl5 dl5Var3 = dl5Var;
                                        boolean zH2 = qz0Var4.h(dl5Var3);
                                        Object objM2 = qz0Var4.M();
                                        if (zH2 || objM2 == jz0.a) {
                                            objM2 = new pz(dl5Var3, 7);
                                            qz0Var4.l0(objM2);
                                        }
                                        ir.myket.player.ui.client.bottomsheets.a.b(null, ze6Var, (bp2) objM2, null, qz0Var4, (iIntValue4 << 3) & 112);
                                    } else {
                                        qz0Var4.U();
                                    }
                                    break;
                                case 2:
                                    bf6 bf6Var2 = (bf6) obj3;
                                    qz0 qz0Var5 = (qz0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    js3.p(bf6Var2, "it");
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= (iIntValue5 & 8) == 0 ? qz0Var5.f(bf6Var2) : qz0Var5.h(bf6Var2) ? 4 : 2;
                                    }
                                    if (qz0Var5.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        dl5 dl5Var4 = dl5Var;
                                        boolean zH3 = qz0Var5.h(dl5Var4);
                                        Object objM3 = qz0Var5.M();
                                        if (zH3 || objM3 == jz0.a) {
                                            objM3 = new pz(dl5Var4, 5);
                                            qz0Var5.l0(objM3);
                                        }
                                        sb7.b(null, bf6Var2, null, (bp2) objM3, qz0Var5, (iIntValue5 << 3) & 112);
                                    } else {
                                        qz0Var5.U();
                                    }
                                    break;
                                case 3:
                                    xe6 xe6Var = (xe6) obj3;
                                    qz0 qz0Var6 = (qz0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    js3.p(xe6Var, "it");
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= qz0Var6.f(xe6Var) ? 4 : 2;
                                    }
                                    if (qz0Var6.R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        dl5 dl5Var5 = dl5Var;
                                        boolean zH4 = qz0Var6.h(dl5Var5);
                                        Object objM4 = qz0Var6.M();
                                        if (zH4 || objM4 == jz0.a) {
                                            objM4 = new pz(dl5Var5, 10);
                                            qz0Var6.l0(objM4);
                                        }
                                        br9.k(null, xe6Var, null, (bp2) objM4, dl5Var5, qz0Var6, (iIntValue6 << 3) & 112, 5);
                                    } else {
                                        qz0Var6.U();
                                    }
                                    break;
                                default:
                                    ye6 ye6Var = (ye6) obj3;
                                    qz0 qz0Var7 = (qz0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    js3.p(ye6Var, "it");
                                    if ((iIntValue7 & 6) == 0) {
                                        iIntValue7 |= qz0Var7.f(ye6Var) ? 4 : 2;
                                    }
                                    if (qz0Var7.R(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                        dl5 dl5Var6 = dl5Var;
                                        boolean zH5 = qz0Var7.h(dl5Var6);
                                        Object objM5 = qz0Var7.M();
                                        if (zH5 || objM5 == jz0.a) {
                                            objM5 = new pz(dl5Var6, 9);
                                            qz0Var7.l0(objM5);
                                        }
                                        ir.myket.player.ui.client.bottomsheets.a.a(null, ye6Var, null, (bp2) objM5, qz0Var7, (iIntValue7 << 3) & 112);
                                    } else {
                                        qz0Var7.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var2);
                    Map map = zm1.a;
                    wv8Var.i(g27.a(bf6.class), vz.c, map, aVarX);
                    wv8Var.i(g27.a(we6.class), vz.d, map, s7.X(-656997358, new rp2() { // from class: tz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            switch (i3) {
                                case 0:
                                    we6 we6Var = (we6) obj3;
                                    qz0 qz0Var3 = (qz0) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    js3.p(we6Var, "it");
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= qz0Var3.f(we6Var) ? 4 : 2;
                                    }
                                    if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        String strF = ln2.f(vs6.player_audio_watching, qz0Var3);
                                        dp2 dp2Var2 = dp2Var;
                                        boolean zF = qz0Var3.f(dp2Var2);
                                        Object objM = qz0Var3.M();
                                        av avVar2 = jz0.a;
                                        if (zF || objM == avVar2) {
                                            objM = new y8(1, dp2Var2);
                                            qz0Var3.l0(objM);
                                        }
                                        dp2 dp2Var3 = (dp2) objM;
                                        dl5 dl5Var2 = dl5Var;
                                        boolean zH = qz0Var3.h(dl5Var2);
                                        Object objM2 = qz0Var3.M();
                                        if (zH || objM2 == avVar2) {
                                            objM2 = new pz(dl5Var2, 0);
                                            qz0Var3.l0(objM2);
                                        }
                                        ok4.f(null, we6Var, null, dl5Var2, dp2Var3, null, (bp2) objM2, strF, qz0Var3, (iIntValue3 << 3) & 112);
                                    } else {
                                        qz0Var3.U();
                                    }
                                    break;
                                case 1:
                                    we6 we6Var2 = (we6) obj3;
                                    qz0 qz0Var4 = (qz0) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    js3.p(we6Var2, "it");
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= qz0Var4.f(we6Var2) ? 4 : 2;
                                    }
                                    if (qz0Var4.R(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        String strF2 = ln2.f(vs6.player_movie_watching, qz0Var4);
                                        dp2 dp2Var4 = dp2Var;
                                        boolean zF2 = qz0Var4.f(dp2Var4);
                                        Object objM3 = qz0Var4.M();
                                        av avVar3 = jz0.a;
                                        if (zF2 || objM3 == avVar3) {
                                            objM3 = new y8(2, dp2Var4);
                                            qz0Var4.l0(objM3);
                                        }
                                        dp2 dp2Var5 = (dp2) objM3;
                                        dl5 dl5Var3 = dl5Var;
                                        boolean zH2 = qz0Var4.h(dl5Var3);
                                        Object objM4 = qz0Var4.M();
                                        if (zH2 || objM4 == avVar3) {
                                            objM4 = new pz(dl5Var3, 4);
                                            qz0Var4.l0(objM4);
                                        }
                                        ok4.f(null, we6Var2, null, dl5Var3, dp2Var5, null, (bp2) objM4, strF2, qz0Var4, (iIntValue4 << 3) & 112);
                                    } else {
                                        qz0Var4.U();
                                    }
                                    break;
                                case 2:
                                    ve6 ve6Var = (ve6) obj3;
                                    qz0 qz0Var5 = (qz0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    js3.p(ve6Var, "it");
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= qz0Var5.f(ve6Var) ? 4 : 2;
                                    }
                                    if (qz0Var5.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        dl5 dl5Var4 = dl5Var;
                                        boolean zH3 = qz0Var5.h(dl5Var4);
                                        Object objM5 = qz0Var5.M();
                                        if (zH3 || objM5 == jz0.a) {
                                            objM5 = new pz(dl5Var4, 6);
                                            qz0Var5.l0(objM5);
                                        }
                                        y40.e(null, ve6Var, null, dl5Var4, dp2Var, (bp2) objM5, qz0Var5, (iIntValue5 << 3) & 112, 5);
                                    } else {
                                        qz0Var5.U();
                                    }
                                    break;
                                default:
                                    af6 af6Var = (af6) obj3;
                                    qz0 qz0Var6 = (qz0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    js3.p(af6Var, "it");
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= qz0Var6.f(af6Var) ? 4 : 2;
                                    }
                                    if (qz0Var6.R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        dl5 dl5Var5 = dl5Var;
                                        boolean zH4 = qz0Var6.h(dl5Var5);
                                        Object objM6 = qz0Var6.M();
                                        if (zH4 || objM6 == jz0.a) {
                                            objM6 = new pz(dl5Var5, 8);
                                            qz0Var6.l0(objM6);
                                        }
                                        l87.b(null, af6Var, null, dl5Var5, (bp2) objM6, dp2Var, qz0Var6, (iIntValue6 << 3) & 112, 5);
                                    } else {
                                        qz0Var6.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var2));
                    wv8Var.i(g27.a(cf6.class), vz.e, map, s7.X(-292918139, new rp2() { // from class: uz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            int i4 = i3;
                            cf6 cf6Var = (cf6) obj3;
                            qz0 qz0Var3 = (qz0) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            switch (i4) {
                                case 0:
                                    js3.p(cf6Var, "it");
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= (iIntValue3 & 8) == 0 ? qz0Var3.f(cf6Var) : qz0Var3.h(cf6Var) ? 4 : 2;
                                    }
                                    if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        final dl5 dl5Var2 = dl5Var;
                                        boolean zH = qz0Var3.h(dl5Var2);
                                        final Context context3 = context;
                                        boolean zH2 = zH | qz0Var3.h(context3);
                                        Object objM = qz0Var3.M();
                                        if (zH2 || objM == jz0.a) {
                                            final int i5 = 0;
                                            objM = new bp2() { // from class: nz
                                                @Override // defpackage.bp2
                                                public final Object invoke() {
                                                    ws5 ws5VarC;
                                                    ws5 ws5VarC2;
                                                    switch (i5) {
                                                        case 0:
                                                            dl5Var2.a(dr.a);
                                                            FragmentActivity fragmentActivityQ = y40.q(context3);
                                                            if (fragmentActivityQ != null && (ws5VarC = fragmentActivityQ.c()) != null) {
                                                                ws5VarC.b();
                                                            }
                                                            break;
                                                        default:
                                                            dl5Var2.a(dr.a);
                                                            FragmentActivity fragmentActivityQ2 = y40.q(context3);
                                                            if (fragmentActivityQ2 != null && (ws5VarC2 = fragmentActivityQ2.c()) != null) {
                                                                ws5VarC2.b();
                                                            }
                                                            break;
                                                    }
                                                    return tx8.a;
                                                }
                                            };
                                            qz0Var3.l0(objM);
                                        }
                                        ir.myket.player.ui.client.dialog.a.a(null, cf6Var, (bp2) objM, qz0Var3, (iIntValue3 << 3) & 112);
                                    } else {
                                        qz0Var3.U();
                                    }
                                    break;
                                default:
                                    js3.p(cf6Var, "it");
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= (iIntValue3 & 8) == 0 ? qz0Var3.f(cf6Var) : qz0Var3.h(cf6Var) ? 4 : 2;
                                    }
                                    if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        final dl5 dl5Var3 = dl5Var;
                                        boolean zH3 = qz0Var3.h(dl5Var3);
                                        final Context context4 = context;
                                        boolean zH4 = zH3 | qz0Var3.h(context4);
                                        Object objM2 = qz0Var3.M();
                                        if (zH4 || objM2 == jz0.a) {
                                            final int i6 = 1;
                                            objM2 = new bp2() { // from class: nz
                                                @Override // defpackage.bp2
                                                public final Object invoke() {
                                                    ws5 ws5VarC;
                                                    ws5 ws5VarC2;
                                                    switch (i6) {
                                                        case 0:
                                                            dl5Var3.a(dr.a);
                                                            FragmentActivity fragmentActivityQ = y40.q(context4);
                                                            if (fragmentActivityQ != null && (ws5VarC = fragmentActivityQ.c()) != null) {
                                                                ws5VarC.b();
                                                            }
                                                            break;
                                                        default:
                                                            dl5Var3.a(dr.a);
                                                            FragmentActivity fragmentActivityQ2 = y40.q(context4);
                                                            if (fragmentActivityQ2 != null && (ws5VarC2 = fragmentActivityQ2.c()) != null) {
                                                                ws5VarC2.b();
                                                            }
                                                            break;
                                                    }
                                                    return tx8.a;
                                                }
                                            };
                                            qz0Var3.l0(objM2);
                                        }
                                        ir.myket.player.ui.client.dialog.a.a(null, cf6Var, (bp2) objM2, qz0Var3, (iIntValue3 << 3) & 112);
                                    } else {
                                        qz0Var3.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var2));
                    m22 m22Var = new m22(0, wv8Var);
                    qz0Var2.q(false);
                    boolean zH = qz0Var2.h(dl5Var);
                    Object objM = qz0Var2.M();
                    if (zH || objM == avVar) {
                        objM = new pz(dl5Var, 1);
                        qz0Var2.l0(objM);
                    }
                    androidx.navigation3.ui.a.c(snapshotStateList2, this.c, null, (bp2) objM, listC, fvVar, null, null, null, m22Var, qz0Var2, 0);
                }
                break;
            case 2:
                qz0 qz0Var3 = (qz0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qz0Var3.U();
                } else {
                    u58 u58Var2 = l.n;
                    Context context3 = this.h;
                    js3.p(context3, "context");
                    zk8.b(u58Var2.a(jr9.t(context3) ? LayoutDirection.b : LayoutDirection.a), s7.X(314695161, new qz(this.b, this.c, this.d, this.e, this.f, this.g, context3, 3), qz0Var3), qz0Var3, 56);
                }
                break;
            default:
                qz0 qz0Var4 = (qz0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!qz0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qz0Var4.U();
                } else {
                    df6 df6Var2 = df6.INSTANCE;
                    final dl5 dl5Var2 = this.b;
                    dl5Var2.getClass();
                    js3.p(df6Var2, "homeScreen");
                    SnapshotStateList snapshotStateList3 = dl5Var2.a;
                    if (snapshotStateList3.isEmpty()) {
                        snapshotStateList3.add(df6Var2);
                    }
                    List listC2 = br9.C(s17.d(qz0Var4), t17.h(qz0Var4));
                    fv fvVar2 = new fv(14);
                    SnapshotStateList snapshotStateList4 = dl5Var2.a;
                    qz0Var4.a0(1774356840);
                    wv8 wv8Var2 = new wv8(vz.g);
                    final int i4 = 1;
                    final ExoPlayer exoPlayer2 = this.d;
                    final PlayerMovieData playerMovieData2 = this.e;
                    final dp2 dp2Var2 = this.f;
                    final ub5 ub5Var2 = this.g;
                    wv8Var2.i(g27.a(df6.class), vz.p, b.I(), s7.X(1429645004, new rp2() { // from class: rz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            int i32 = i4;
                            df6 df6Var22 = (df6) obj3;
                            qz0 qz0Var32 = (qz0) obj4;
                            int iIntValue32 = ((Integer) obj5).intValue();
                            switch (i32) {
                                case 0:
                                    js3.p(df6Var22, "it");
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 17) != 16)) {
                                        FillElement fillElement = androidx.compose.foundation.layout.b.c;
                                        Object objM2 = qz0Var32.M();
                                        av avVar2 = jz0.a;
                                        if (objM2 == avVar2) {
                                            objM2 = new a(ub5Var2);
                                            qz0Var32.l0(objM2);
                                        }
                                        a aVar = (a) objM2;
                                        final ExoPlayer exoPlayer22 = exoPlayer2;
                                        boolean zH2 = qz0Var32.h(exoPlayer22);
                                        final PlayerMovieData playerMovieData22 = playerMovieData2;
                                        boolean zH22 = zH2 | qz0Var32.h(playerMovieData22);
                                        Object objM22 = qz0Var32.M();
                                        if (zH22 || objM22 == avVar2) {
                                            final int i42 = 0;
                                            objM22 = new bp2() { // from class: oz
                                                @Override // defpackage.bp2
                                                public final Object invoke() {
                                                    int i52 = i42;
                                                    PlayerMovieData playerMovieData32 = playerMovieData22;
                                                    ExoPlayer exoPlayer32 = exoPlayer22;
                                                    switch (i52) {
                                                    }
                                                    return ja1.B(exoPlayer32, playerMovieData32);
                                                }
                                            };
                                            qz0Var32.l0(objM22);
                                        }
                                        bp2 bp2Var = (bp2) objM22;
                                        qz0Var32.a0(-924953623);
                                        x79 x79VarA = uc4.a(qz0Var32);
                                        if (x79VarA == null) {
                                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        }
                                        k79 k79VarY = dt2.y(g27.a(e.class), x79VarA.m(), tt3.u(x79VarA), oz3.a(qz0Var32), bp2Var);
                                        qz0Var32.q(false);
                                        ir.myket.player.ui.audio.b.a(fillElement, dl5Var2, aVar, exoPlayer22, (e) k79VarY, dp2Var2, qz0Var32, 390);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    return tx8.a;
                                default:
                                    js3.p(df6Var22, "it");
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 17) != 16)) {
                                        FillElement fillElement2 = androidx.compose.foundation.layout.b.c;
                                        Object objM3 = qz0Var32.M();
                                        av avVar3 = jz0.a;
                                        if (objM3 == avVar3) {
                                            objM3 = new a(ub5Var2);
                                            qz0Var32.l0(objM3);
                                        }
                                        a aVar2 = (a) objM3;
                                        final ExoPlayer exoPlayer3 = exoPlayer2;
                                        boolean zH3 = qz0Var32.h(exoPlayer3);
                                        final PlayerMovieData playerMovieData3 = playerMovieData2;
                                        boolean zH4 = zH3 | qz0Var32.h(playerMovieData3);
                                        Object objM4 = qz0Var32.M();
                                        if (zH4 || objM4 == avVar3) {
                                            final int i5 = 1;
                                            objM4 = new bp2() { // from class: oz
                                                @Override // defpackage.bp2
                                                public final Object invoke() {
                                                    int i52 = i5;
                                                    PlayerMovieData playerMovieData32 = playerMovieData3;
                                                    ExoPlayer exoPlayer32 = exoPlayer3;
                                                    switch (i52) {
                                                    }
                                                    return ja1.B(exoPlayer32, playerMovieData32);
                                                }
                                            };
                                            qz0Var32.l0(objM4);
                                        }
                                        bp2 bp2Var2 = (bp2) objM4;
                                        qz0Var32.a0(-924953623);
                                        x79 x79VarA2 = uc4.a(qz0Var32);
                                        if (x79VarA2 == null) {
                                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                        }
                                        k79 k79VarY2 = dt2.y(g27.a(e.class), x79VarA2.m(), tt3.u(x79VarA2), oz3.a(qz0Var32), bp2Var2);
                                        qz0Var32.q(false);
                                        c.a(fillElement2, dl5Var2, aVar2, exoPlayer3, (e) k79VarY2, dp2Var2, qz0Var32, 390);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    return tx8.a;
                            }
                        }
                    }, qz0Var4));
                    final int i5 = 2;
                    androidx.compose.runtime.internal.a aVarX2 = s7.X(-254104040, new rp2() { // from class: tz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            switch (i5) {
                                case 0:
                                    we6 we6Var = (we6) obj3;
                                    qz0 qz0Var32 = (qz0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    js3.p(we6Var, "it");
                                    if ((iIntValue32 & 6) == 0) {
                                        iIntValue32 |= qz0Var32.f(we6Var) ? 4 : 2;
                                    }
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 19) != 18)) {
                                        String strF = ln2.f(vs6.player_audio_watching, qz0Var32);
                                        dp2 dp2Var22 = dp2Var2;
                                        boolean zF = qz0Var32.f(dp2Var22);
                                        Object objM2 = qz0Var32.M();
                                        av avVar2 = jz0.a;
                                        if (zF || objM2 == avVar2) {
                                            objM2 = new y8(1, dp2Var22);
                                            qz0Var32.l0(objM2);
                                        }
                                        dp2 dp2Var3 = (dp2) objM2;
                                        dl5 dl5Var22 = dl5Var2;
                                        boolean zH2 = qz0Var32.h(dl5Var22);
                                        Object objM22 = qz0Var32.M();
                                        if (zH2 || objM22 == avVar2) {
                                            objM22 = new pz(dl5Var22, 0);
                                            qz0Var32.l0(objM22);
                                        }
                                        ok4.f(null, we6Var, null, dl5Var22, dp2Var3, null, (bp2) objM22, strF, qz0Var32, (iIntValue32 << 3) & 112);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    break;
                                case 1:
                                    we6 we6Var2 = (we6) obj3;
                                    qz0 qz0Var42 = (qz0) obj4;
                                    int iIntValue42 = ((Integer) obj5).intValue();
                                    js3.p(we6Var2, "it");
                                    if ((iIntValue42 & 6) == 0) {
                                        iIntValue42 |= qz0Var42.f(we6Var2) ? 4 : 2;
                                    }
                                    if (qz0Var42.R(iIntValue42 & 1, (iIntValue42 & 19) != 18)) {
                                        String strF2 = ln2.f(vs6.player_movie_watching, qz0Var42);
                                        dp2 dp2Var4 = dp2Var2;
                                        boolean zF2 = qz0Var42.f(dp2Var4);
                                        Object objM3 = qz0Var42.M();
                                        av avVar3 = jz0.a;
                                        if (zF2 || objM3 == avVar3) {
                                            objM3 = new y8(2, dp2Var4);
                                            qz0Var42.l0(objM3);
                                        }
                                        dp2 dp2Var5 = (dp2) objM3;
                                        dl5 dl5Var3 = dl5Var2;
                                        boolean zH22 = qz0Var42.h(dl5Var3);
                                        Object objM4 = qz0Var42.M();
                                        if (zH22 || objM4 == avVar3) {
                                            objM4 = new pz(dl5Var3, 4);
                                            qz0Var42.l0(objM4);
                                        }
                                        ok4.f(null, we6Var2, null, dl5Var3, dp2Var5, null, (bp2) objM4, strF2, qz0Var42, (iIntValue42 << 3) & 112);
                                    } else {
                                        qz0Var42.U();
                                    }
                                    break;
                                case 2:
                                    ve6 ve6Var = (ve6) obj3;
                                    qz0 qz0Var5 = (qz0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    js3.p(ve6Var, "it");
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= qz0Var5.f(ve6Var) ? 4 : 2;
                                    }
                                    if (qz0Var5.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        dl5 dl5Var4 = dl5Var2;
                                        boolean zH3 = qz0Var5.h(dl5Var4);
                                        Object objM5 = qz0Var5.M();
                                        if (zH3 || objM5 == jz0.a) {
                                            objM5 = new pz(dl5Var4, 6);
                                            qz0Var5.l0(objM5);
                                        }
                                        y40.e(null, ve6Var, null, dl5Var4, dp2Var2, (bp2) objM5, qz0Var5, (iIntValue5 << 3) & 112, 5);
                                    } else {
                                        qz0Var5.U();
                                    }
                                    break;
                                default:
                                    af6 af6Var = (af6) obj3;
                                    qz0 qz0Var6 = (qz0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    js3.p(af6Var, "it");
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= qz0Var6.f(af6Var) ? 4 : 2;
                                    }
                                    if (qz0Var6.R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        dl5 dl5Var5 = dl5Var2;
                                        boolean zH4 = qz0Var6.h(dl5Var5);
                                        Object objM6 = qz0Var6.M();
                                        if (zH4 || objM6 == jz0.a) {
                                            objM6 = new pz(dl5Var5, 8);
                                            qz0Var6.l0(objM6);
                                        }
                                        l87.b(null, af6Var, null, dl5Var5, (bp2) objM6, dp2Var2, qz0Var6, (iIntValue6 << 3) & 112, 5);
                                    } else {
                                        qz0Var6.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var4);
                    Map map2 = zm1.a;
                    wv8Var2.i(g27.a(ve6.class), vz.h, map2, aVarX2);
                    final int i6 = 3;
                    wv8Var2.i(g27.a(af6.class), vz.i, map2, s7.X(-1156153871, new rp2() { // from class: tz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            switch (i6) {
                                case 0:
                                    we6 we6Var = (we6) obj3;
                                    qz0 qz0Var32 = (qz0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    js3.p(we6Var, "it");
                                    if ((iIntValue32 & 6) == 0) {
                                        iIntValue32 |= qz0Var32.f(we6Var) ? 4 : 2;
                                    }
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 19) != 18)) {
                                        String strF = ln2.f(vs6.player_audio_watching, qz0Var32);
                                        dp2 dp2Var22 = dp2Var2;
                                        boolean zF = qz0Var32.f(dp2Var22);
                                        Object objM2 = qz0Var32.M();
                                        av avVar2 = jz0.a;
                                        if (zF || objM2 == avVar2) {
                                            objM2 = new y8(1, dp2Var22);
                                            qz0Var32.l0(objM2);
                                        }
                                        dp2 dp2Var3 = (dp2) objM2;
                                        dl5 dl5Var22 = dl5Var2;
                                        boolean zH2 = qz0Var32.h(dl5Var22);
                                        Object objM22 = qz0Var32.M();
                                        if (zH2 || objM22 == avVar2) {
                                            objM22 = new pz(dl5Var22, 0);
                                            qz0Var32.l0(objM22);
                                        }
                                        ok4.f(null, we6Var, null, dl5Var22, dp2Var3, null, (bp2) objM22, strF, qz0Var32, (iIntValue32 << 3) & 112);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    break;
                                case 1:
                                    we6 we6Var2 = (we6) obj3;
                                    qz0 qz0Var42 = (qz0) obj4;
                                    int iIntValue42 = ((Integer) obj5).intValue();
                                    js3.p(we6Var2, "it");
                                    if ((iIntValue42 & 6) == 0) {
                                        iIntValue42 |= qz0Var42.f(we6Var2) ? 4 : 2;
                                    }
                                    if (qz0Var42.R(iIntValue42 & 1, (iIntValue42 & 19) != 18)) {
                                        String strF2 = ln2.f(vs6.player_movie_watching, qz0Var42);
                                        dp2 dp2Var4 = dp2Var2;
                                        boolean zF2 = qz0Var42.f(dp2Var4);
                                        Object objM3 = qz0Var42.M();
                                        av avVar3 = jz0.a;
                                        if (zF2 || objM3 == avVar3) {
                                            objM3 = new y8(2, dp2Var4);
                                            qz0Var42.l0(objM3);
                                        }
                                        dp2 dp2Var5 = (dp2) objM3;
                                        dl5 dl5Var3 = dl5Var2;
                                        boolean zH22 = qz0Var42.h(dl5Var3);
                                        Object objM4 = qz0Var42.M();
                                        if (zH22 || objM4 == avVar3) {
                                            objM4 = new pz(dl5Var3, 4);
                                            qz0Var42.l0(objM4);
                                        }
                                        ok4.f(null, we6Var2, null, dl5Var3, dp2Var5, null, (bp2) objM4, strF2, qz0Var42, (iIntValue42 << 3) & 112);
                                    } else {
                                        qz0Var42.U();
                                    }
                                    break;
                                case 2:
                                    ve6 ve6Var = (ve6) obj3;
                                    qz0 qz0Var5 = (qz0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    js3.p(ve6Var, "it");
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= qz0Var5.f(ve6Var) ? 4 : 2;
                                    }
                                    if (qz0Var5.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        dl5 dl5Var4 = dl5Var2;
                                        boolean zH3 = qz0Var5.h(dl5Var4);
                                        Object objM5 = qz0Var5.M();
                                        if (zH3 || objM5 == jz0.a) {
                                            objM5 = new pz(dl5Var4, 6);
                                            qz0Var5.l0(objM5);
                                        }
                                        y40.e(null, ve6Var, null, dl5Var4, dp2Var2, (bp2) objM5, qz0Var5, (iIntValue5 << 3) & 112, 5);
                                    } else {
                                        qz0Var5.U();
                                    }
                                    break;
                                default:
                                    af6 af6Var = (af6) obj3;
                                    qz0 qz0Var6 = (qz0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    js3.p(af6Var, "it");
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= qz0Var6.f(af6Var) ? 4 : 2;
                                    }
                                    if (qz0Var6.R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        dl5 dl5Var5 = dl5Var2;
                                        boolean zH4 = qz0Var6.h(dl5Var5);
                                        Object objM6 = qz0Var6.M();
                                        if (zH4 || objM6 == jz0.a) {
                                            objM6 = new pz(dl5Var5, 8);
                                            qz0Var6.l0(objM6);
                                        }
                                        l87.b(null, af6Var, null, dl5Var5, (bp2) objM6, dp2Var2, qz0Var6, (iIntValue6 << 3) & 112, 5);
                                    } else {
                                        qz0Var6.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var4));
                    final int i7 = 2;
                    wv8Var2.i(g27.a(bf6.class), vz.j, map2, s7.X(1083781179, new rp2() { // from class: sz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            switch (i7) {
                                case 0:
                                    bf6 bf6Var = (bf6) obj3;
                                    qz0 qz0Var32 = (qz0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    js3.p(bf6Var, "it");
                                    if ((iIntValue32 & 6) == 0) {
                                        iIntValue32 |= (iIntValue32 & 8) == 0 ? qz0Var32.f(bf6Var) : qz0Var32.h(bf6Var) ? 4 : 2;
                                    }
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 19) != 18)) {
                                        dl5 dl5Var22 = dl5Var2;
                                        boolean zH2 = qz0Var32.h(dl5Var22);
                                        Object objM2 = qz0Var32.M();
                                        if (zH2 || objM2 == jz0.a) {
                                            objM2 = new pz(dl5Var22, 2);
                                            qz0Var32.l0(objM2);
                                        }
                                        sb7.b(null, bf6Var, null, (bp2) objM2, qz0Var32, (iIntValue32 << 3) & 112);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    break;
                                case 1:
                                    ze6 ze6Var = (ze6) obj3;
                                    qz0 qz0Var42 = (qz0) obj4;
                                    int iIntValue42 = ((Integer) obj5).intValue();
                                    js3.p(ze6Var, "it");
                                    if ((iIntValue42 & 6) == 0) {
                                        iIntValue42 |= qz0Var42.f(ze6Var) ? 4 : 2;
                                    }
                                    if (qz0Var42.R(iIntValue42 & 1, (iIntValue42 & 19) != 18)) {
                                        dl5 dl5Var3 = dl5Var2;
                                        boolean zH22 = qz0Var42.h(dl5Var3);
                                        Object objM22 = qz0Var42.M();
                                        if (zH22 || objM22 == jz0.a) {
                                            objM22 = new pz(dl5Var3, 7);
                                            qz0Var42.l0(objM22);
                                        }
                                        ir.myket.player.ui.client.bottomsheets.a.b(null, ze6Var, (bp2) objM22, null, qz0Var42, (iIntValue42 << 3) & 112);
                                    } else {
                                        qz0Var42.U();
                                    }
                                    break;
                                case 2:
                                    bf6 bf6Var2 = (bf6) obj3;
                                    qz0 qz0Var5 = (qz0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    js3.p(bf6Var2, "it");
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= (iIntValue5 & 8) == 0 ? qz0Var5.f(bf6Var2) : qz0Var5.h(bf6Var2) ? 4 : 2;
                                    }
                                    if (qz0Var5.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        dl5 dl5Var4 = dl5Var2;
                                        boolean zH3 = qz0Var5.h(dl5Var4);
                                        Object objM3 = qz0Var5.M();
                                        if (zH3 || objM3 == jz0.a) {
                                            objM3 = new pz(dl5Var4, 5);
                                            qz0Var5.l0(objM3);
                                        }
                                        sb7.b(null, bf6Var2, null, (bp2) objM3, qz0Var5, (iIntValue5 << 3) & 112);
                                    } else {
                                        qz0Var5.U();
                                    }
                                    break;
                                case 3:
                                    xe6 xe6Var = (xe6) obj3;
                                    qz0 qz0Var6 = (qz0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    js3.p(xe6Var, "it");
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= qz0Var6.f(xe6Var) ? 4 : 2;
                                    }
                                    if (qz0Var6.R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        dl5 dl5Var5 = dl5Var2;
                                        boolean zH4 = qz0Var6.h(dl5Var5);
                                        Object objM4 = qz0Var6.M();
                                        if (zH4 || objM4 == jz0.a) {
                                            objM4 = new pz(dl5Var5, 10);
                                            qz0Var6.l0(objM4);
                                        }
                                        br9.k(null, xe6Var, null, (bp2) objM4, dl5Var5, qz0Var6, (iIntValue6 << 3) & 112, 5);
                                    } else {
                                        qz0Var6.U();
                                    }
                                    break;
                                default:
                                    ye6 ye6Var = (ye6) obj3;
                                    qz0 qz0Var7 = (qz0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    js3.p(ye6Var, "it");
                                    if ((iIntValue7 & 6) == 0) {
                                        iIntValue7 |= qz0Var7.f(ye6Var) ? 4 : 2;
                                    }
                                    if (qz0Var7.R(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                        dl5 dl5Var6 = dl5Var2;
                                        boolean zH5 = qz0Var7.h(dl5Var6);
                                        Object objM5 = qz0Var7.M();
                                        if (zH5 || objM5 == jz0.a) {
                                            objM5 = new pz(dl5Var6, 9);
                                            qz0Var7.l0(objM5);
                                        }
                                        ir.myket.player.ui.client.bottomsheets.a.a(null, ye6Var, null, (bp2) objM5, qz0Var7, (iIntValue7 << 3) & 112);
                                    } else {
                                        qz0Var7.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var4));
                    final int i8 = 3;
                    wv8Var2.i(g27.a(xe6.class), vz.k, map2, s7.X(-1054840965, new rp2() { // from class: sz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            switch (i8) {
                                case 0:
                                    bf6 bf6Var = (bf6) obj3;
                                    qz0 qz0Var32 = (qz0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    js3.p(bf6Var, "it");
                                    if ((iIntValue32 & 6) == 0) {
                                        iIntValue32 |= (iIntValue32 & 8) == 0 ? qz0Var32.f(bf6Var) : qz0Var32.h(bf6Var) ? 4 : 2;
                                    }
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 19) != 18)) {
                                        dl5 dl5Var22 = dl5Var2;
                                        boolean zH2 = qz0Var32.h(dl5Var22);
                                        Object objM2 = qz0Var32.M();
                                        if (zH2 || objM2 == jz0.a) {
                                            objM2 = new pz(dl5Var22, 2);
                                            qz0Var32.l0(objM2);
                                        }
                                        sb7.b(null, bf6Var, null, (bp2) objM2, qz0Var32, (iIntValue32 << 3) & 112);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    break;
                                case 1:
                                    ze6 ze6Var = (ze6) obj3;
                                    qz0 qz0Var42 = (qz0) obj4;
                                    int iIntValue42 = ((Integer) obj5).intValue();
                                    js3.p(ze6Var, "it");
                                    if ((iIntValue42 & 6) == 0) {
                                        iIntValue42 |= qz0Var42.f(ze6Var) ? 4 : 2;
                                    }
                                    if (qz0Var42.R(iIntValue42 & 1, (iIntValue42 & 19) != 18)) {
                                        dl5 dl5Var3 = dl5Var2;
                                        boolean zH22 = qz0Var42.h(dl5Var3);
                                        Object objM22 = qz0Var42.M();
                                        if (zH22 || objM22 == jz0.a) {
                                            objM22 = new pz(dl5Var3, 7);
                                            qz0Var42.l0(objM22);
                                        }
                                        ir.myket.player.ui.client.bottomsheets.a.b(null, ze6Var, (bp2) objM22, null, qz0Var42, (iIntValue42 << 3) & 112);
                                    } else {
                                        qz0Var42.U();
                                    }
                                    break;
                                case 2:
                                    bf6 bf6Var2 = (bf6) obj3;
                                    qz0 qz0Var5 = (qz0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    js3.p(bf6Var2, "it");
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= (iIntValue5 & 8) == 0 ? qz0Var5.f(bf6Var2) : qz0Var5.h(bf6Var2) ? 4 : 2;
                                    }
                                    if (qz0Var5.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        dl5 dl5Var4 = dl5Var2;
                                        boolean zH3 = qz0Var5.h(dl5Var4);
                                        Object objM3 = qz0Var5.M();
                                        if (zH3 || objM3 == jz0.a) {
                                            objM3 = new pz(dl5Var4, 5);
                                            qz0Var5.l0(objM3);
                                        }
                                        sb7.b(null, bf6Var2, null, (bp2) objM3, qz0Var5, (iIntValue5 << 3) & 112);
                                    } else {
                                        qz0Var5.U();
                                    }
                                    break;
                                case 3:
                                    xe6 xe6Var = (xe6) obj3;
                                    qz0 qz0Var6 = (qz0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    js3.p(xe6Var, "it");
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= qz0Var6.f(xe6Var) ? 4 : 2;
                                    }
                                    if (qz0Var6.R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        dl5 dl5Var5 = dl5Var2;
                                        boolean zH4 = qz0Var6.h(dl5Var5);
                                        Object objM4 = qz0Var6.M();
                                        if (zH4 || objM4 == jz0.a) {
                                            objM4 = new pz(dl5Var5, 10);
                                            qz0Var6.l0(objM4);
                                        }
                                        br9.k(null, xe6Var, null, (bp2) objM4, dl5Var5, qz0Var6, (iIntValue6 << 3) & 112, 5);
                                    } else {
                                        qz0Var6.U();
                                    }
                                    break;
                                default:
                                    ye6 ye6Var = (ye6) obj3;
                                    qz0 qz0Var7 = (qz0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    js3.p(ye6Var, "it");
                                    if ((iIntValue7 & 6) == 0) {
                                        iIntValue7 |= qz0Var7.f(ye6Var) ? 4 : 2;
                                    }
                                    if (qz0Var7.R(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                        dl5 dl5Var6 = dl5Var2;
                                        boolean zH5 = qz0Var7.h(dl5Var6);
                                        Object objM5 = qz0Var7.M();
                                        if (zH5 || objM5 == jz0.a) {
                                            objM5 = new pz(dl5Var6, 9);
                                            qz0Var7.l0(objM5);
                                        }
                                        ir.myket.player.ui.client.bottomsheets.a.a(null, ye6Var, null, (bp2) objM5, qz0Var7, (iIntValue7 << 3) & 112);
                                    } else {
                                        qz0Var7.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var4));
                    final int i9 = 4;
                    wv8Var2.i(g27.a(ye6.class), vz.l, map2, s7.X(540680685, new rp2() { // from class: sz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            switch (i9) {
                                case 0:
                                    bf6 bf6Var = (bf6) obj3;
                                    qz0 qz0Var32 = (qz0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    js3.p(bf6Var, "it");
                                    if ((iIntValue32 & 6) == 0) {
                                        iIntValue32 |= (iIntValue32 & 8) == 0 ? qz0Var32.f(bf6Var) : qz0Var32.h(bf6Var) ? 4 : 2;
                                    }
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 19) != 18)) {
                                        dl5 dl5Var22 = dl5Var2;
                                        boolean zH2 = qz0Var32.h(dl5Var22);
                                        Object objM2 = qz0Var32.M();
                                        if (zH2 || objM2 == jz0.a) {
                                            objM2 = new pz(dl5Var22, 2);
                                            qz0Var32.l0(objM2);
                                        }
                                        sb7.b(null, bf6Var, null, (bp2) objM2, qz0Var32, (iIntValue32 << 3) & 112);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    break;
                                case 1:
                                    ze6 ze6Var = (ze6) obj3;
                                    qz0 qz0Var42 = (qz0) obj4;
                                    int iIntValue42 = ((Integer) obj5).intValue();
                                    js3.p(ze6Var, "it");
                                    if ((iIntValue42 & 6) == 0) {
                                        iIntValue42 |= qz0Var42.f(ze6Var) ? 4 : 2;
                                    }
                                    if (qz0Var42.R(iIntValue42 & 1, (iIntValue42 & 19) != 18)) {
                                        dl5 dl5Var3 = dl5Var2;
                                        boolean zH22 = qz0Var42.h(dl5Var3);
                                        Object objM22 = qz0Var42.M();
                                        if (zH22 || objM22 == jz0.a) {
                                            objM22 = new pz(dl5Var3, 7);
                                            qz0Var42.l0(objM22);
                                        }
                                        ir.myket.player.ui.client.bottomsheets.a.b(null, ze6Var, (bp2) objM22, null, qz0Var42, (iIntValue42 << 3) & 112);
                                    } else {
                                        qz0Var42.U();
                                    }
                                    break;
                                case 2:
                                    bf6 bf6Var2 = (bf6) obj3;
                                    qz0 qz0Var5 = (qz0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    js3.p(bf6Var2, "it");
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= (iIntValue5 & 8) == 0 ? qz0Var5.f(bf6Var2) : qz0Var5.h(bf6Var2) ? 4 : 2;
                                    }
                                    if (qz0Var5.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        dl5 dl5Var4 = dl5Var2;
                                        boolean zH3 = qz0Var5.h(dl5Var4);
                                        Object objM3 = qz0Var5.M();
                                        if (zH3 || objM3 == jz0.a) {
                                            objM3 = new pz(dl5Var4, 5);
                                            qz0Var5.l0(objM3);
                                        }
                                        sb7.b(null, bf6Var2, null, (bp2) objM3, qz0Var5, (iIntValue5 << 3) & 112);
                                    } else {
                                        qz0Var5.U();
                                    }
                                    break;
                                case 3:
                                    xe6 xe6Var = (xe6) obj3;
                                    qz0 qz0Var6 = (qz0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    js3.p(xe6Var, "it");
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= qz0Var6.f(xe6Var) ? 4 : 2;
                                    }
                                    if (qz0Var6.R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        dl5 dl5Var5 = dl5Var2;
                                        boolean zH4 = qz0Var6.h(dl5Var5);
                                        Object objM4 = qz0Var6.M();
                                        if (zH4 || objM4 == jz0.a) {
                                            objM4 = new pz(dl5Var5, 10);
                                            qz0Var6.l0(objM4);
                                        }
                                        br9.k(null, xe6Var, null, (bp2) objM4, dl5Var5, qz0Var6, (iIntValue6 << 3) & 112, 5);
                                    } else {
                                        qz0Var6.U();
                                    }
                                    break;
                                default:
                                    ye6 ye6Var = (ye6) obj3;
                                    qz0 qz0Var7 = (qz0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    js3.p(ye6Var, "it");
                                    if ((iIntValue7 & 6) == 0) {
                                        iIntValue7 |= qz0Var7.f(ye6Var) ? 4 : 2;
                                    }
                                    if (qz0Var7.R(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                        dl5 dl5Var6 = dl5Var2;
                                        boolean zH5 = qz0Var7.h(dl5Var6);
                                        Object objM5 = qz0Var7.M();
                                        if (zH5 || objM5 == jz0.a) {
                                            objM5 = new pz(dl5Var6, 9);
                                            qz0Var7.l0(objM5);
                                        }
                                        ir.myket.player.ui.client.bottomsheets.a.a(null, ye6Var, null, (bp2) objM5, qz0Var7, (iIntValue7 << 3) & 112);
                                    } else {
                                        qz0Var7.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var4));
                    final int i10 = 1;
                    wv8Var2.i(g27.a(ze6.class), vz.m, map2, s7.X(1110902755, new rp2() { // from class: sz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            switch (i10) {
                                case 0:
                                    bf6 bf6Var = (bf6) obj3;
                                    qz0 qz0Var32 = (qz0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    js3.p(bf6Var, "it");
                                    if ((iIntValue32 & 6) == 0) {
                                        iIntValue32 |= (iIntValue32 & 8) == 0 ? qz0Var32.f(bf6Var) : qz0Var32.h(bf6Var) ? 4 : 2;
                                    }
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 19) != 18)) {
                                        dl5 dl5Var22 = dl5Var2;
                                        boolean zH2 = qz0Var32.h(dl5Var22);
                                        Object objM2 = qz0Var32.M();
                                        if (zH2 || objM2 == jz0.a) {
                                            objM2 = new pz(dl5Var22, 2);
                                            qz0Var32.l0(objM2);
                                        }
                                        sb7.b(null, bf6Var, null, (bp2) objM2, qz0Var32, (iIntValue32 << 3) & 112);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    break;
                                case 1:
                                    ze6 ze6Var = (ze6) obj3;
                                    qz0 qz0Var42 = (qz0) obj4;
                                    int iIntValue42 = ((Integer) obj5).intValue();
                                    js3.p(ze6Var, "it");
                                    if ((iIntValue42 & 6) == 0) {
                                        iIntValue42 |= qz0Var42.f(ze6Var) ? 4 : 2;
                                    }
                                    if (qz0Var42.R(iIntValue42 & 1, (iIntValue42 & 19) != 18)) {
                                        dl5 dl5Var3 = dl5Var2;
                                        boolean zH22 = qz0Var42.h(dl5Var3);
                                        Object objM22 = qz0Var42.M();
                                        if (zH22 || objM22 == jz0.a) {
                                            objM22 = new pz(dl5Var3, 7);
                                            qz0Var42.l0(objM22);
                                        }
                                        ir.myket.player.ui.client.bottomsheets.a.b(null, ze6Var, (bp2) objM22, null, qz0Var42, (iIntValue42 << 3) & 112);
                                    } else {
                                        qz0Var42.U();
                                    }
                                    break;
                                case 2:
                                    bf6 bf6Var2 = (bf6) obj3;
                                    qz0 qz0Var5 = (qz0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    js3.p(bf6Var2, "it");
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= (iIntValue5 & 8) == 0 ? qz0Var5.f(bf6Var2) : qz0Var5.h(bf6Var2) ? 4 : 2;
                                    }
                                    if (qz0Var5.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        dl5 dl5Var4 = dl5Var2;
                                        boolean zH3 = qz0Var5.h(dl5Var4);
                                        Object objM3 = qz0Var5.M();
                                        if (zH3 || objM3 == jz0.a) {
                                            objM3 = new pz(dl5Var4, 5);
                                            qz0Var5.l0(objM3);
                                        }
                                        sb7.b(null, bf6Var2, null, (bp2) objM3, qz0Var5, (iIntValue5 << 3) & 112);
                                    } else {
                                        qz0Var5.U();
                                    }
                                    break;
                                case 3:
                                    xe6 xe6Var = (xe6) obj3;
                                    qz0 qz0Var6 = (qz0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    js3.p(xe6Var, "it");
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= qz0Var6.f(xe6Var) ? 4 : 2;
                                    }
                                    if (qz0Var6.R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        dl5 dl5Var5 = dl5Var2;
                                        boolean zH4 = qz0Var6.h(dl5Var5);
                                        Object objM4 = qz0Var6.M();
                                        if (zH4 || objM4 == jz0.a) {
                                            objM4 = new pz(dl5Var5, 10);
                                            qz0Var6.l0(objM4);
                                        }
                                        br9.k(null, xe6Var, null, (bp2) objM4, dl5Var5, qz0Var6, (iIntValue6 << 3) & 112, 5);
                                    } else {
                                        qz0Var6.U();
                                    }
                                    break;
                                default:
                                    ye6 ye6Var = (ye6) obj3;
                                    qz0 qz0Var7 = (qz0) obj4;
                                    int iIntValue7 = ((Integer) obj5).intValue();
                                    js3.p(ye6Var, "it");
                                    if ((iIntValue7 & 6) == 0) {
                                        iIntValue7 |= qz0Var7.f(ye6Var) ? 4 : 2;
                                    }
                                    if (qz0Var7.R(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                                        dl5 dl5Var6 = dl5Var2;
                                        boolean zH5 = qz0Var7.h(dl5Var6);
                                        Object objM5 = qz0Var7.M();
                                        if (zH5 || objM5 == jz0.a) {
                                            objM5 = new pz(dl5Var6, 9);
                                            qz0Var7.l0(objM5);
                                        }
                                        ir.myket.player.ui.client.bottomsheets.a.a(null, ye6Var, null, (bp2) objM5, qz0Var7, (iIntValue7 << 3) & 112);
                                    } else {
                                        qz0Var7.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var4));
                    wv8Var2.i(g27.a(we6.class), vz.n, map2, s7.X(-61207884, new rp2() { // from class: tz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            switch (i10) {
                                case 0:
                                    we6 we6Var = (we6) obj3;
                                    qz0 qz0Var32 = (qz0) obj4;
                                    int iIntValue32 = ((Integer) obj5).intValue();
                                    js3.p(we6Var, "it");
                                    if ((iIntValue32 & 6) == 0) {
                                        iIntValue32 |= qz0Var32.f(we6Var) ? 4 : 2;
                                    }
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 19) != 18)) {
                                        String strF = ln2.f(vs6.player_audio_watching, qz0Var32);
                                        dp2 dp2Var22 = dp2Var2;
                                        boolean zF = qz0Var32.f(dp2Var22);
                                        Object objM2 = qz0Var32.M();
                                        av avVar2 = jz0.a;
                                        if (zF || objM2 == avVar2) {
                                            objM2 = new y8(1, dp2Var22);
                                            qz0Var32.l0(objM2);
                                        }
                                        dp2 dp2Var3 = (dp2) objM2;
                                        dl5 dl5Var22 = dl5Var2;
                                        boolean zH2 = qz0Var32.h(dl5Var22);
                                        Object objM22 = qz0Var32.M();
                                        if (zH2 || objM22 == avVar2) {
                                            objM22 = new pz(dl5Var22, 0);
                                            qz0Var32.l0(objM22);
                                        }
                                        ok4.f(null, we6Var, null, dl5Var22, dp2Var3, null, (bp2) objM22, strF, qz0Var32, (iIntValue32 << 3) & 112);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    break;
                                case 1:
                                    we6 we6Var2 = (we6) obj3;
                                    qz0 qz0Var42 = (qz0) obj4;
                                    int iIntValue42 = ((Integer) obj5).intValue();
                                    js3.p(we6Var2, "it");
                                    if ((iIntValue42 & 6) == 0) {
                                        iIntValue42 |= qz0Var42.f(we6Var2) ? 4 : 2;
                                    }
                                    if (qz0Var42.R(iIntValue42 & 1, (iIntValue42 & 19) != 18)) {
                                        String strF2 = ln2.f(vs6.player_movie_watching, qz0Var42);
                                        dp2 dp2Var4 = dp2Var2;
                                        boolean zF2 = qz0Var42.f(dp2Var4);
                                        Object objM3 = qz0Var42.M();
                                        av avVar3 = jz0.a;
                                        if (zF2 || objM3 == avVar3) {
                                            objM3 = new y8(2, dp2Var4);
                                            qz0Var42.l0(objM3);
                                        }
                                        dp2 dp2Var5 = (dp2) objM3;
                                        dl5 dl5Var3 = dl5Var2;
                                        boolean zH22 = qz0Var42.h(dl5Var3);
                                        Object objM4 = qz0Var42.M();
                                        if (zH22 || objM4 == avVar3) {
                                            objM4 = new pz(dl5Var3, 4);
                                            qz0Var42.l0(objM4);
                                        }
                                        ok4.f(null, we6Var2, null, dl5Var3, dp2Var5, null, (bp2) objM4, strF2, qz0Var42, (iIntValue42 << 3) & 112);
                                    } else {
                                        qz0Var42.U();
                                    }
                                    break;
                                case 2:
                                    ve6 ve6Var = (ve6) obj3;
                                    qz0 qz0Var5 = (qz0) obj4;
                                    int iIntValue5 = ((Integer) obj5).intValue();
                                    js3.p(ve6Var, "it");
                                    if ((iIntValue5 & 6) == 0) {
                                        iIntValue5 |= qz0Var5.f(ve6Var) ? 4 : 2;
                                    }
                                    if (qz0Var5.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                        dl5 dl5Var4 = dl5Var2;
                                        boolean zH3 = qz0Var5.h(dl5Var4);
                                        Object objM5 = qz0Var5.M();
                                        if (zH3 || objM5 == jz0.a) {
                                            objM5 = new pz(dl5Var4, 6);
                                            qz0Var5.l0(objM5);
                                        }
                                        y40.e(null, ve6Var, null, dl5Var4, dp2Var2, (bp2) objM5, qz0Var5, (iIntValue5 << 3) & 112, 5);
                                    } else {
                                        qz0Var5.U();
                                    }
                                    break;
                                default:
                                    af6 af6Var = (af6) obj3;
                                    qz0 qz0Var6 = (qz0) obj4;
                                    int iIntValue6 = ((Integer) obj5).intValue();
                                    js3.p(af6Var, "it");
                                    if ((iIntValue6 & 6) == 0) {
                                        iIntValue6 |= qz0Var6.f(af6Var) ? 4 : 2;
                                    }
                                    if (qz0Var6.R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                                        dl5 dl5Var5 = dl5Var2;
                                        boolean zH4 = qz0Var6.h(dl5Var5);
                                        Object objM6 = qz0Var6.M();
                                        if (zH4 || objM6 == jz0.a) {
                                            objM6 = new pz(dl5Var5, 8);
                                            qz0Var6.l0(objM6);
                                        }
                                        l87.b(null, af6Var, null, dl5Var5, (bp2) objM6, dp2Var2, qz0Var6, (iIntValue6 << 3) & 112, 5);
                                    } else {
                                        qz0Var6.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var4));
                    wv8Var2.i(g27.a(cf6.class), vz.o, map2, s7.X(1430382945, new rp2() { // from class: uz
                        @Override // defpackage.rp2
                        public final Object a(Object obj3, Object obj4, Object obj5) {
                            int i42 = i10;
                            cf6 cf6Var = (cf6) obj3;
                            qz0 qz0Var32 = (qz0) obj4;
                            int iIntValue32 = ((Integer) obj5).intValue();
                            switch (i42) {
                                case 0:
                                    js3.p(cf6Var, "it");
                                    if ((iIntValue32 & 6) == 0) {
                                        iIntValue32 |= (iIntValue32 & 8) == 0 ? qz0Var32.f(cf6Var) : qz0Var32.h(cf6Var) ? 4 : 2;
                                    }
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 19) != 18)) {
                                        final dl5 dl5Var22 = dl5Var2;
                                        boolean zH2 = qz0Var32.h(dl5Var22);
                                        final Context context32 = context;
                                        boolean zH22 = zH2 | qz0Var32.h(context32);
                                        Object objM2 = qz0Var32.M();
                                        if (zH22 || objM2 == jz0.a) {
                                            final int i52 = 0;
                                            objM2 = new bp2() { // from class: nz
                                                @Override // defpackage.bp2
                                                public final Object invoke() {
                                                    ws5 ws5VarC;
                                                    ws5 ws5VarC2;
                                                    switch (i52) {
                                                        case 0:
                                                            dl5Var22.a(dr.a);
                                                            FragmentActivity fragmentActivityQ = y40.q(context32);
                                                            if (fragmentActivityQ != null && (ws5VarC = fragmentActivityQ.c()) != null) {
                                                                ws5VarC.b();
                                                            }
                                                            break;
                                                        default:
                                                            dl5Var22.a(dr.a);
                                                            FragmentActivity fragmentActivityQ2 = y40.q(context32);
                                                            if (fragmentActivityQ2 != null && (ws5VarC2 = fragmentActivityQ2.c()) != null) {
                                                                ws5VarC2.b();
                                                            }
                                                            break;
                                                    }
                                                    return tx8.a;
                                                }
                                            };
                                            qz0Var32.l0(objM2);
                                        }
                                        ir.myket.player.ui.client.dialog.a.a(null, cf6Var, (bp2) objM2, qz0Var32, (iIntValue32 << 3) & 112);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    break;
                                default:
                                    js3.p(cf6Var, "it");
                                    if ((iIntValue32 & 6) == 0) {
                                        iIntValue32 |= (iIntValue32 & 8) == 0 ? qz0Var32.f(cf6Var) : qz0Var32.h(cf6Var) ? 4 : 2;
                                    }
                                    if (qz0Var32.R(iIntValue32 & 1, (iIntValue32 & 19) != 18)) {
                                        final dl5 dl5Var3 = dl5Var2;
                                        boolean zH3 = qz0Var32.h(dl5Var3);
                                        final Context context4 = context;
                                        boolean zH4 = zH3 | qz0Var32.h(context4);
                                        Object objM22 = qz0Var32.M();
                                        if (zH4 || objM22 == jz0.a) {
                                            final int i62 = 1;
                                            objM22 = new bp2() { // from class: nz
                                                @Override // defpackage.bp2
                                                public final Object invoke() {
                                                    ws5 ws5VarC;
                                                    ws5 ws5VarC2;
                                                    switch (i62) {
                                                        case 0:
                                                            dl5Var3.a(dr.a);
                                                            FragmentActivity fragmentActivityQ = y40.q(context4);
                                                            if (fragmentActivityQ != null && (ws5VarC = fragmentActivityQ.c()) != null) {
                                                                ws5VarC.b();
                                                            }
                                                            break;
                                                        default:
                                                            dl5Var3.a(dr.a);
                                                            FragmentActivity fragmentActivityQ2 = y40.q(context4);
                                                            if (fragmentActivityQ2 != null && (ws5VarC2 = fragmentActivityQ2.c()) != null) {
                                                                ws5VarC2.b();
                                                            }
                                                            break;
                                                    }
                                                    return tx8.a;
                                                }
                                            };
                                            qz0Var32.l0(objM22);
                                        }
                                        ir.myket.player.ui.client.dialog.a.a(null, cf6Var, (bp2) objM22, qz0Var32, (iIntValue32 << 3) & 112);
                                    } else {
                                        qz0Var32.U();
                                    }
                                    break;
                            }
                            return tx8.a;
                        }
                    }, qz0Var4));
                    m22 m22Var2 = new m22(0, wv8Var2);
                    qz0Var4.q(false);
                    boolean zH2 = qz0Var4.h(dl5Var2);
                    Object objM2 = qz0Var4.M();
                    if (zH2 || objM2 == avVar) {
                        objM2 = new pz(dl5Var2, 3);
                        qz0Var4.l0(objM2);
                    }
                    androidx.navigation3.ui.a.c(snapshotStateList4, this.c, null, (bp2) objM2, listC2, fvVar2, null, null, null, m22Var2, qz0Var4, 0);
                }
                break;
        }
        return tx8Var;
    }

    public /* synthetic */ qz(Context context, dl5 dl5Var, hx4 hx4Var, ExoPlayer exoPlayer, PlayerMovieData playerMovieData, dp2 dp2Var, ub5 ub5Var, int i) {
        this.a = i;
        this.h = context;
        this.b = dl5Var;
        this.c = hx4Var;
        this.d = exoPlayer;
        this.e = playerMovieData;
        this.f = dp2Var;
        this.g = ub5Var;
    }
}
