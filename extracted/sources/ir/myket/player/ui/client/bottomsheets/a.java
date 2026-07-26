package ir.myket.player.ui.client.bottomsheets;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material3.k;
import androidx.compose.material3.n;
import androidx.compose.runtime.g;
import androidx.compose.runtime.i;
import androidx.compose.ui.platform.e;
import defpackage.bp2;
import defpackage.ct2;
import defpackage.cx3;
import defpackage.df0;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.e71;
import defpackage.ea;
import defpackage.ex4;
import defpackage.g27;
import defpackage.hx4;
import defpackage.js3;
import defpackage.jz0;
import defpackage.l47;
import defpackage.ln2;
import defpackage.m99;
import defpackage.ml9;
import defpackage.mq3;
import defpackage.my6;
import defpackage.oz3;
import defpackage.p61;
import defpackage.pj3;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.s7;
import defpackage.tq3;
import defpackage.tt3;
import defpackage.tu6;
import defpackage.uq3;
import defpackage.vs6;
import defpackage.w8;
import defpackage.wb5;
import defpackage.wr2;
import defpackage.wu0;
import defpackage.xc6;
import defpackage.xq2;
import defpackage.ye6;
import defpackage.z24;
import defpackage.ze6;
import defpackage.zk8;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.myket.player.ui.client.bottomsheets.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(hx4 hx4Var, final ye6 ye6Var, n nVar, final bp2 bp2Var, qz0 qz0Var, int i) {
        hx4 hx4Var2;
        n nVar2;
        int i2;
        n nVarF;
        hx4 hx4Var3;
        Object playerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1;
        Object obj;
        Object obj2;
        wb5 wb5Var;
        js3.p(ye6Var, "playerErrorDetailBottomSheetNavKey");
        p61 p61Var = ye6Var.a;
        qz0Var.c0(-705352789);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= qz0Var.f(ye6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if ((i & 3072) == 0) {
            i3 |= qz0Var.h(bp2Var) ? 2048 : 1024;
        }
        if (qz0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            qz0Var.W();
            if ((i & 1) == 0 || qz0Var.z()) {
                i2 = i3 & (-897);
                nVarF = k.f(6, 2, qz0Var);
                hx4Var3 = ex4.b;
            } else {
                qz0Var.U();
                i2 = i3 & (-897);
                hx4Var3 = hx4Var;
                nVarF = nVar;
            }
            qz0Var.r();
            wr2 wr2VarY = ct2.y(qz0Var);
            l47 l47Var = (l47) dt2.y(g27.a(l47.class), wr2VarY.a, tt3.u(wr2VarY), oz3.a(qz0Var), null);
            Object objM = qz0Var.M();
            Object obj3 = jz0.a;
            if (objM == obj3) {
                objM = zk8.x(EmptyCoroutineContext.a, qz0Var);
                qz0Var.l0(objM);
            }
            final e71 e71Var = (e71) objM;
            Context context = (Context) qz0Var.j(e.b);
            xc6 xc6Var = ye6Var.b;
            Object obj4 = xc6Var.b;
            Object obj5 = xc6Var.c;
            wb5 wb5VarA = androidx.lifecycle.compose.a.a(l47Var.d, qz0Var);
            m99 m99Var = (m99) wb5VarA.getValue();
            int i4 = i2 & 7168;
            boolean zF = qz0Var.f(wb5VarA) | qz0Var.h(context) | qz0Var.f(nVarF) | qz0Var.h(e71Var) | (i4 == 2048);
            Object objM2 = qz0Var.M();
            if (zF || objM2 == obj3) {
                obj = obj3;
                obj2 = obj4;
                wb5Var = wb5VarA;
                playerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1 = new PlayerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1(context, nVarF, e71Var, bp2Var, wb5Var, null);
                qz0Var.l0(playerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1);
            } else {
                obj = obj3;
                playerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1 = objM2;
                obj2 = obj4;
                wb5Var = wb5VarA;
            }
            zk8.h(qz0Var, (qp2) playerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1, m99Var);
            int i5 = p61Var.b;
            i iVar = e.c;
            String[] stringArray = ((Resources) qz0Var.j(iVar)).getStringArray(i5);
            String[] stringArray2 = ((Resources) qz0Var.j(iVar)).getStringArray(p61Var.c);
            int[] intArray = ((Resources) qz0Var.j(iVar)).getIntArray(p61Var.d);
            js3.p(stringArray, "<this>");
            int i6 = i2;
            uq3 uq3Var = new uq3(0, stringArray.length - 1, 1);
            ArrayList arrayList = new ArrayList(wu0.V(uq3Var, 10));
            Iterator it = uq3Var.iterator();
            while (((tq3) it).c) {
                int iNextInt = ((mq3) it).nextInt();
                arrayList.add(new tu6(stringArray[iNextInt], intArray[iNextInt], stringArray2[iNextInt]));
                it = it;
                intArray = intArray;
            }
            final pj3 pj3VarZ = ml9.z(arrayList);
            boolean zH = qz0Var.h(l47Var) | qz0Var.f(obj2) | qz0Var.f(obj5);
            Object objM3 = qz0Var.M();
            if (zH || objM3 == obj) {
                objM3 = new w8(l47Var, obj2, obj5, 8);
                qz0Var.l0(objM3);
            }
            final qp2 qp2Var = (qp2) objM3;
            final n nVar3 = nVarF;
            final wb5 wb5Var2 = wb5Var;
            hx4 hx4Var4 = hx4Var3;
            js3.d(hx4Var4, ln2.f(p61Var.a, qz0Var), pj3VarZ, bp2Var, nVarF, s7.X(1892687232, new rp2() { // from class: be6
                @Override // defpackage.rp2
                public final Object a(Object obj6, Object obj7, Object obj8) {
                    int iIntValue = ((Integer) obj6).intValue();
                    qz0 qz0Var2 = (qz0) obj7;
                    int iIntValue2 = ((Integer) obj8).intValue();
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= qz0Var2.d(iIntValue) ? 4 : 2;
                    }
                    if (qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                        boolean z = iIntValue != -1;
                        boolean z2 = ((m99) wb5Var2.getValue()) instanceof i99;
                        String strF = ln2.f(vs6.player_report_error, qz0Var2);
                        String strF2 = ln2.f(vs6.player_cancel, qz0Var2);
                        ye6 ye6Var2 = ye6Var;
                        boolean zF2 = qz0Var2.f(ye6Var2);
                        n nVar4 = nVar3;
                        boolean zF3 = zF2 | qz0Var2.f(nVar4);
                        e71 e71Var2 = e71Var;
                        boolean zH2 = zF3 | qz0Var2.h(e71Var2);
                        bp2 bp2Var2 = bp2Var;
                        boolean zF4 = zH2 | qz0Var2.f(bp2Var2);
                        Object objM4 = qz0Var2.M();
                        av avVar = jz0.a;
                        if (zF4 || objM4 == avVar) {
                            pp ppVar = new pp(ye6Var2, nVar4, e71Var2, bp2Var2, 7);
                            qz0Var2.l0(ppVar);
                            objM4 = ppVar;
                        }
                        bp2 bp2Var3 = (bp2) objM4;
                        pj3 pj3Var = pj3VarZ;
                        boolean zH3 = ((iIntValue2 & 14) == 4) | qz0Var2.h(pj3Var) | qz0Var2.f(ye6Var2);
                        qp2 qp2Var2 = qp2Var;
                        boolean zF5 = zH3 | qz0Var2.f(qp2Var2);
                        Object objM5 = qz0Var2.M();
                        if (zF5 || objM5 == avVar) {
                            objM5 = new tq2(pj3Var, iIntValue, ye6Var2, qp2Var2);
                            qz0Var2.l0(objM5);
                        }
                        ub1.a(null, strF, strF2, z, z2, bp2Var3, (bp2) objM5, qz0Var2, 0);
                    } else {
                        qz0Var2.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, (i6 & 14) | 196608 | i4, 0);
            hx4Var2 = hx4Var4;
            nVar2 = nVarF;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
            nVar2 = nVar;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(hx4Var2, ye6Var, nVar2, bp2Var, i, 8);
        }
    }

    public static final void b(hx4 hx4Var, ze6 ze6Var, bp2 bp2Var, n nVar, qz0 qz0Var, int i) {
        hx4 hx4Var2;
        n nVar2;
        int i2;
        n nVarF;
        hx4 hx4Var3;
        js3.p(ze6Var, "playerOtherErrorBottomSheetNavKey");
        qz0Var.c0(-1398769690);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= qz0Var.f(ze6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= qz0Var.h(bp2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if (qz0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            qz0Var.W();
            if ((i & 1) == 0 || qz0Var.z()) {
                i2 = i3 & (-7169);
                nVarF = k.f(6, 2, qz0Var);
                hx4Var3 = ex4.b;
            } else {
                qz0Var.U();
                i2 = i3 & (-7169);
                hx4Var3 = hx4Var;
                nVarF = nVar;
            }
            qz0Var.r();
            wr2 wr2VarY = ct2.y(qz0Var);
            l47 l47Var = (l47) dt2.y(g27.a(l47.class), wr2VarY.a, tt3.u(wr2VarY), oz3.a(qz0Var), null);
            wb5 wb5VarA = androidx.lifecycle.compose.a.a(l47Var.d, qz0Var);
            String strF = ln2.f(vs6.player_other_error, qz0Var);
            String strF2 = ln2.f(vs6.player_title_other_reason_dialog, qz0Var);
            xc6 xc6Var = ze6Var.a;
            String str = xc6Var.b;
            String str2 = xc6Var.c;
            boolean zH = qz0Var.h(l47Var);
            Object objM = qz0Var.M();
            if (zH || objM == jz0.a) {
                objM = new PlayerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheet$2$1(1, l47Var, l47.class, PackageListMetaDataDTO.KEY_ACTION, "action(Lir/myket/common/viewmodels/ViewModelAction;)V", 0);
                qz0Var.l0(objM);
            }
            c(hx4Var3, strF, strF2, str, str2, (dp2) ((cx3) objM), (m99) wb5VarA.getValue(), bp2Var, nVarF, qz0Var, ((i2 << 15) & 29360128) | (i2 & 14));
            hx4Var2 = hx4Var3;
            nVar2 = nVarF;
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
            nVar2 = nVar;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ea(hx4Var2, ze6Var, bp2Var, nVar2, i, 9);
        }
    }

    public static final void c(final hx4 hx4Var, final String str, final String str2, final String str3, final String str4, final dp2 dp2Var, final m99 m99Var, final bp2 bp2Var, final n nVar, qz0 qz0Var, final int i) {
        int i2;
        bp2 bp2Var2;
        Context context;
        e71 e71Var;
        js3.p(str, "bottomSheetTitle");
        qz0Var.c0(-14771259);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(hx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qz0Var.f(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= qz0Var.f(str4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= qz0Var.h(dp2Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= qz0Var.f(m99Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            bp2Var2 = bp2Var;
            i2 |= qz0Var.h(bp2Var2) ? 8388608 : 4194304;
        } else {
            bp2Var2 = bp2Var;
        }
        if ((i & 100663296) == 0) {
            i2 |= qz0Var.f(nVar) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (qz0Var.R(i3 & 1, (38347923 & i3) != 38347922)) {
            qz0Var.W();
            if ((i & 1) != 0 && !qz0Var.z()) {
                qz0Var.U();
            }
            qz0Var.r();
            Context context2 = (Context) qz0Var.j(e.b);
            Object objM = qz0Var.M();
            Object obj = jz0.a;
            if (objM == obj) {
                objM = zk8.x(EmptyCoroutineContext.a, qz0Var);
                qz0Var.l0(objM);
            }
            e71 e71Var2 = (e71) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == obj) {
                objM2 = g.h("");
                qz0Var.l0(objM2);
            }
            final wb5 wb5Var = (wb5) objM2;
            boolean zH = ((3670016 & i3) == 1048576) | qz0Var.h(context2) | ((((234881024 & i3) ^ 100663296) > 67108864 && qz0Var.f(nVar)) || (i3 & 100663296) == 67108864) | qz0Var.h(e71Var2) | ((29360128 & i3) == 8388608);
            Object objM3 = qz0Var.M();
            if (zH || objM3 == obj) {
                context = context2;
                Object playerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1 = new PlayerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1(m99Var, context, nVar, e71Var2, bp2Var2, null);
                e71Var = e71Var2;
                qz0Var.l0(playerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1);
                objM3 = playerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1;
            } else {
                context = context2;
                e71Var = e71Var2;
            }
            int i4 = i3 >> 18;
            zk8.h(qz0Var, (qp2) objM3, m99Var);
            final e71 e71Var3 = e71Var;
            xq2.c(hx4Var, bp2Var, nVar, true, s7.X(58332378, new df0(str, 2), qz0Var), s7.X(234660635, new z24(str2, m99Var, context, wb5Var, 2), qz0Var), s7.X(410988892, new rp2() { // from class: ef6
                @Override // defpackage.rp2
                public final Object a(Object obj2, Object obj3, Object obj4) {
                    qz0 qz0Var2 = (qz0) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    js3.p((wv0) obj2, "$this$BottomSheetScaffold");
                    if (qz0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        wb5 wb5Var2 = wb5Var;
                        boolean z = !f88.n0((String) wb5Var2.getValue());
                        String strF = ln2.f(vs6.player_report_error, qz0Var2);
                        String strF2 = ln2.f(vs6.player_cancel, qz0Var2);
                        boolean z2 = m99Var instanceof i99;
                        n nVar2 = nVar;
                        boolean zF = qz0Var2.f(nVar2);
                        e71 e71Var4 = e71Var3;
                        boolean zH2 = zF | qz0Var2.h(e71Var4);
                        bp2 bp2Var3 = bp2Var;
                        boolean zF2 = zH2 | qz0Var2.f(bp2Var3);
                        Object objM4 = qz0Var2.M();
                        av avVar = jz0.a;
                        if (zF2 || objM4 == avVar) {
                            objM4 = new f8(nVar2, e71Var4, bp2Var3, 16);
                            qz0Var2.l0(objM4);
                        }
                        bp2 bp2Var4 = (bp2) objM4;
                        dp2 dp2Var2 = dp2Var;
                        boolean zF3 = qz0Var2.f(dp2Var2);
                        String str5 = str3;
                        boolean zF4 = zF3 | qz0Var2.f(str5);
                        String str6 = str4;
                        boolean zF5 = zF4 | qz0Var2.f(str6);
                        Object objM5 = qz0Var2.M();
                        if (zF5 || objM5 == avVar) {
                            objM5 = new pp(dp2Var2, str5, str6, wb5Var2);
                            qz0Var2.l0(objM5);
                        }
                        ub1.a(null, strF, strF2, z, z2, bp2Var4, (bp2) objM5, qz0Var2, 0);
                    } else {
                        qz0Var2.U();
                    }
                    return tx8.a;
                }
            }, qz0Var), qz0Var, (i3 & 14) | 1797120 | (i4 & 112) | (i4 & 896), 0);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: ff6
                @Override // defpackage.qp2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    a.c(hx4Var, str, str2, str3, str4, dp2Var, m99Var, bp2Var, nVar, (qz0) obj2, hs9.W(i | 1));
                    return tx8.a;
                }
            };
        }
    }
}
