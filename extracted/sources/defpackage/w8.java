package defpackage;

import android.content.Context;
import androidx.compose.foundation.gestures.o;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.text.c;
import androidx.compose.foundation.text.selection.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.lifecycle.Lifecycle$Event;
import androidx.media3.exoplayer.ExoPlayer;
import ir.mservices.market.app.schedule.ui.ScheduleUpdateViewModel;
import ir.mservices.market.app.schedule.ui.recycler.ScheduleTimeData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.myket.player.ui.client.ad.b;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w8 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w8(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [ir.mservices.market.common.ui.recycler.MyketRecyclerData] */
    /* JADX WARN: Type inference failed for: r1v25, types: [ir.mservices.market.common.ui.recycler.MyketRecyclerData] */
    /* JADX WARN: Type inference failed for: r1v26, types: [ir.mservices.market.app.schedule.ui.recycler.ScheduleTimeData] */
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ex4 ex4Var = ex4.b;
        av avVar = jz0.a;
        int i2 = 2;
        byte b = 0;
        tx8 tx8Var = tx8.a;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                cb cbVar = (cb) obj5;
                dp2 dp2Var = (dp2) obj4;
                ExoPlayer exoPlayer = (ExoPlayer) obj3;
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                cb0 cb0Var = eq.g;
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z = cbVar.b;
                    ng0 ng0Var = ng0.a;
                    if (z) {
                        qz0Var.a0(-426931474);
                        hx4 hx4VarA = ng0Var.a(ex4Var, cb0Var);
                        boolean zF = qz0Var.f(dp2Var) | qz0Var.h(exoPlayer);
                        Object objM = qz0Var.M();
                        if (zF || objM == avVar) {
                            objM = new d(dp2Var, exoPlayer, 3);
                            qz0Var.l0(objM);
                        }
                        l87.a(hx4VarA, (bp2) objM, qz0Var, 0);
                        qz0Var.q(false);
                    } else {
                        if (cbVar.a) {
                            qz0Var.a0(-426640818);
                            rq4.b(ng0Var.a(ex4Var, cb0Var), qz0Var, 0);
                        } else {
                            qz0Var.a0(-435420917);
                        }
                        qz0Var.q(false);
                    }
                } else {
                    qz0Var.U();
                }
                return tx8Var;
            case 1:
                ((Integer) obj2).getClass();
                b.a((ub) obj5, (xc6) obj3, (dp2) obj4, (qz0) obj, hs9.W(1));
                return tx8Var;
            case 2:
                wb5 wb5Var = (wb5) obj5;
                Context context = (Context) obj4;
                String str = (String) obj3;
                qz0 qz0Var2 = (qz0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    FillElement fillElement = androidx.compose.foundation.layout.b.b;
                    cb7 cb7VarA = bb7.a(jv.a, eq.m, qz0Var2, 48);
                    long j = qz0Var2.T;
                    int i3 = (int) (j ^ (j >>> 32));
                    j56 j56VarL = qz0Var2.l();
                    hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, fillElement);
                    hz0.d0.getClass();
                    bp2 bp2Var = d.b;
                    qz0Var2.e0();
                    if (qz0Var2.S) {
                        qz0Var2.k(bp2Var);
                    } else {
                        qz0Var2.o0();
                    }
                    ia7.o(qz0Var2, d.f, cb7VarA);
                    ia7.o(qz0Var2, d.e, j56VarL);
                    ia7.g(qz0Var2, Integer.valueOf(i3), d.g);
                    ia7.n(qz0Var2, d.h);
                    ia7.o(qz0Var2, d.d, hx4VarC);
                    String strF = xa7.f(context, (String) wb5Var.getValue());
                    Object objJ = qz0Var2.j(uj8.a);
                    js3.m(objJ);
                    long j2 = ((tj8) objJ).j;
                    u58 u58Var = aw8.a;
                    mi8.b(strF, ix4.a(yh0.z(ex4Var, ml9.q(hq6.space_12, qz0Var2)), ((wf5) qz0Var2.j(u58Var)).i, ln2.g(vs6.player_placeholder_seconds, new Object[]{50}, qz0Var2), qz0Var2, 0), j2, 0L, 0L, new of8(3), 0L, 0, false, 0, 0, ((wf5) qz0Var2.j(u58Var)).i, qz0Var2, 0, 0, 130040);
                    cc7.a(str, ix4.c(qz0Var2, dy3.h(fillElement, d77.c(hq6.ad_skip_button_poster_ratio, qz0Var2))), p41.a, null, qz0Var2, 1572912, 1976);
                    qz0Var2.q(true);
                } else {
                    qz0Var2.U();
                }
                return tx8Var;
            case 3:
                hx4 hx4Var = (hx4) obj5;
                wb5 wb5Var2 = (wb5) obj4;
                a aVar = (a) obj3;
                qz0 qz0Var3 = (qz0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objM2 = qz0Var3.M();
                    if (objM2 == avVar) {
                        objM2 = new u8(wb5Var2, i2);
                        qz0Var3.l0(objM2);
                    }
                    hx4 hx4VarN = hs9.N(hx4Var, (dp2) objM2);
                    cl4 cl4VarD = bg0.d(eq.c, true);
                    long j3 = qz0Var3.T;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    j56 j56VarL2 = qz0Var3.l();
                    hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var3, hx4VarN);
                    hz0.d0.getClass();
                    bp2 bp2Var2 = d.b;
                    qz0Var3.e0();
                    if (qz0Var3.S) {
                        qz0Var3.k(bp2Var2);
                    } else {
                        qz0Var3.o0();
                    }
                    ia7.o(qz0Var3, d.f, cl4VarD);
                    ia7.o(qz0Var3, d.e, j56VarL2);
                    ia7.g(qz0Var3, Integer.valueOf(i4), d.g);
                    ia7.n(qz0Var3, d.h);
                    ia7.o(qz0Var3, d.d, hx4VarC2);
                    aVar.invoke(qz0Var3, 0);
                    qz0Var3.q(true);
                } else {
                    qz0Var3.U();
                }
                return tx8Var;
            case 4:
                ((Integer) obj2).getClass();
                c.b((hx4) obj5, (f) obj4, (a) obj3, (qz0) obj, hs9.W(385));
                return tx8Var;
            case 5:
                ((Integer) obj2).getClass();
                at2.F((Lifecycle$Event) obj5, (g64) obj4, (bp2) obj3, (qz0) obj, hs9.W(7));
                return tx8Var;
            case 6:
                tj8 tj8Var = (tj8) obj5;
                wf5 wf5Var = (wf5) obj4;
                a aVar2 = (a) obj3;
                qz0 qz0Var4 = (qz0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (qz0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    uj8.a(tj8Var, s7.X(701381772, new vf5(wf5Var, aVar2, b, b), qz0Var4), qz0Var4, 48);
                } else {
                    qz0Var4.U();
                }
                return tx8Var;
            case 7:
                ((Integer) obj2).getClass();
                ok4.a((hx4) obj5, (String) obj4, (String) obj3, (qz0) obj, hs9.W(7));
                return tx8Var;
            case 8:
                int iIntValue5 = ((Integer) obj).intValue();
                String str2 = (String) obj2;
                js3.p(str2, "key");
                ((l47) obj5).e(new k47((String) obj4, iIntValue5, (String) obj3, str2));
                return tx8Var;
            case 9:
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                ScheduleUpdateViewModel scheduleUpdateViewModel = (ScheduleUpdateViewModel) obj3;
                ((Integer) obj).getClass();
                RecyclerItem recyclerItem = (RecyclerItem) obj2;
                js3.p(recyclerItem, "recyclerItem");
                ?? scheduleTimeData = recyclerItem.c;
                ScheduleTimeData scheduleTimeData2 = scheduleTimeData instanceof ScheduleTimeData ? (ScheduleTimeData) scheduleTimeData : null;
                if (scheduleTimeData2 != null) {
                    scheduleTimeData = new ScheduleTimeData(str3, str4, scheduleUpdateViewModel.x);
                    String str5 = scheduleTimeData2.d;
                    js3.p(str5, "<set-?>");
                    scheduleTimeData.d = str5;
                }
                return new RecyclerItem(scheduleTimeData);
            default:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj5;
                o oVar = (o) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = oVar.h(oVar.d(fFloatValue - ref$FloatRef.a));
                o oVar2 = ((dh7) obj3).a;
                ref$FloatRef.a += oVar.d(oVar.g(oVar2.c(oVar2.k, jH, 1)));
                return tx8Var;
        }
    }

    public /* synthetic */ w8(ub ubVar, xc6 xc6Var, dp2 dp2Var, int i) {
        this.a = 1;
        this.c = ubVar;
        this.d = xc6Var;
        this.b = dp2Var;
    }

    public /* synthetic */ w8(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }
}
