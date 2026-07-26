package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf implements rp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ yf(int i) {
        this.a = i;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        ex4 ex4Var = ex4.b;
        tx8 tx8Var = tx8.a;
        switch (i) {
            case 0:
                hx4 hx4Var = (hx4) obj;
                qz0 qz0Var = (qz0) obj2;
                ((Integer) obj3).getClass();
                qz0Var.a0(-2126899193);
                long j = ((bj8) qz0Var.j(cj8.a)).a;
                boolean zE = qz0Var.e(j);
                Object objM = qz0Var.M();
                if (zE || objM == jz0.a) {
                    objM = new zf(z ? 1 : 0, j);
                    qz0Var.l0(objM);
                }
                hx4 hx4VarD = hx4Var.d(wn5.D(ex4Var, (dp2) objM));
                qz0Var.q(false);
                break;
            case 1:
                qz0 qz0Var2 = (qz0) obj2;
                ((Integer) obj3).getClass();
                js3.p((ik) obj, "$this$AnimatedVisibility");
                g16 g16VarG = rf0.G(br6.player_ic_chevron, qz0Var2);
                u58 u58Var = uj8.a;
                Object objJ = qz0Var2.j(u58Var);
                js3.m(objJ);
                long j2 = ((tj8) objJ).k;
                hx4 hx4VarJ = b.j(ex4Var, ml9.q(hq6.size_26, qz0Var2), ml9.q(hq6.size_28, qz0Var2));
                Object objJ2 = qz0Var2.j(u58Var);
                js3.m(objJ2);
                long j3 = ((tj8) objJ2).E;
                ka7 ka7Var = la7.a;
                kh3.a(g16VarG, yh0.D(rq4.f(hx4VarJ, j3, new ka7(yq2.H(0), yq2.H(50), yq2.H(50), yq2.H(0))), ml9.q(hq6.space_4, qz0Var2), 0.0f, ml9.q(hq6.space_8, qz0Var2), 0.0f, 10), j2, qz0Var2, 56, 0);
                break;
            case 2:
                qz0 qz0Var3 = (qz0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (!qz0Var3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qz0Var3.U();
                } else {
                    mi8.b(ln2.f(vs6.player_ad_install_button, qz0Var3), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((wf5) qz0Var3.j(aw8.a)).d, qz0Var3, 0, 0, 131070);
                }
                break;
            case 3:
                qz0 qz0Var4 = (qz0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                js3.p((wv0) obj, "<this>");
                if (!qz0Var4.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    qz0Var4.U();
                }
                break;
            case 4:
                qz0 qz0Var5 = (qz0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                js3.p((wv0) obj, "<this>");
                if (!qz0Var5.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    qz0Var5.U();
                }
                break;
            case 5:
                qz0 qz0Var6 = (qz0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                js3.p((wv0) obj, "$this$BottomSheetScaffold");
                if (!qz0Var6.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    qz0Var6.U();
                }
                break;
            case 6:
                a51 a51Var = (a51) obj;
                qz0 qz0Var7 = (qz0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= qz0Var7.f(a51Var) ? 4 : 2;
                }
                if (!qz0Var7.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    qz0Var7.U();
                } else {
                    bg0.a(rq4.f(b.d(b.c(yh0.B(ex4Var, 0.0f, c51.l, 1), 1.0f), c51.k), a51Var.c, tt3.d), qz0Var7, 0);
                }
                break;
            case 7:
                ih3 ih3Var = (ih3) obj;
                qz0 qz0Var8 = (qz0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                js3.p(ih3Var, "item");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? qz0Var8.f(ih3Var) : qz0Var8.h(ih3Var) ? 4 : 2;
                }
                if (!qz0Var8.R(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    qz0Var8.U();
                } else {
                    ct2.c(null, ih3Var, ih3Var.e, qz0Var8, (iIntValue6 << 3) & 112);
                }
                break;
            case 8:
                qz0 qz0Var9 = (qz0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (!qz0Var9.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    qz0Var9.U();
                } else {
                    kh3.a(rf0.G(br6.player_ic_chevron, qz0Var9), b.i(ex4Var, ml9.q(hq6.size_12, qz0Var9)), 0L, qz0Var9, 56, 8);
                }
                break;
            case 9:
                ih3 ih3Var2 = (ih3) obj;
                qz0 qz0Var10 = (qz0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                js3.p(ih3Var2, "item");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= (iIntValue8 & 8) == 0 ? qz0Var10.f(ih3Var2) : qz0Var10.h(ih3Var2) ? 4 : 2;
                }
                if (!qz0Var10.R(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    qz0Var10.U();
                } else {
                    ct2.c(null, ih3Var2, ih3Var2.e, qz0Var10, (iIntValue8 << 3) & 112);
                }
                break;
            case 10:
                qz0 qz0Var11 = (qz0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (!qz0Var11.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    qz0Var11.U();
                } else {
                    kh3.a(rf0.G(br6.player_ic_change_orientation, qz0Var11), b.i(ex4Var, ml9.q(hq6.icon_size_medium, qz0Var11)), 0L, qz0Var11, 56, 8);
                }
                break;
            case 11:
                ((Integer) obj).intValue();
                qz0 qz0Var12 = (qz0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (!qz0Var12.R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    qz0Var12.U();
                }
                break;
            case 12:
                qp2 qp2Var = (qp2) obj;
                qz0 qz0Var13 = (qz0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= qz0Var13.h(qp2Var) ? 4 : 2;
                }
                if (!qz0Var13.R(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    qz0Var13.U();
                } else {
                    qp2Var.invoke(qz0Var13, Integer.valueOf(iIntValue11 & 14));
                }
                break;
            case 13:
                ih3 ih3Var3 = (ih3) obj;
                qz0 qz0Var14 = (qz0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                js3.p(ih3Var3, "item");
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= (iIntValue12 & 8) == 0 ? qz0Var14.f(ih3Var3) : qz0Var14.h(ih3Var3) ? 4 : 2;
                }
                if (!qz0Var14.R(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    qz0Var14.U();
                } else {
                    ct2.c(null, ih3Var3, ih3Var3.e, qz0Var14, (iIntValue12 << 3) & 112);
                }
                break;
            default:
                qz0 qz0Var15 = (qz0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (!qz0Var15.R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    qz0Var15.U();
                } else {
                    kh3.a(rf0.G(br6.player_ic_arrow, qz0Var15), b.i(ex4Var, ml9.q(hq6.icon_size_medium, qz0Var15)), 0L, qz0Var15, 56, 8);
                }
                break;
        }
        return tx8Var;
    }
}
