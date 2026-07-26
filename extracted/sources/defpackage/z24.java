package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.platform.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z24 implements rp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z24(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        char c;
        m mVar;
        x24 x24Var;
        hx4 hx4VarD;
        int i = this.a;
        av avVar = jz0.a;
        tx8 tx8Var = tx8.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                g34 g34Var = (g34) obj7;
                hx4 hx4Var = (hx4) obj6;
                u34 u34Var = (u34) obj5;
                wb5 wb5Var = (wb5) obj4;
                bd7 bd7Var = (bd7) obj;
                qz0 qz0Var = (qz0) obj2;
                ((Integer) obj3).getClass();
                Object objM = qz0Var.M();
                if (objM == avVar) {
                    c = 2;
                    objM = new x24(bd7Var, new v8(wb5Var, 5));
                    qz0Var.l0(objM);
                } else {
                    c = 2;
                }
                x24 x24Var2 = (x24) objM;
                Object objM2 = qz0Var.M();
                if (objM2 == avVar) {
                    objM2 = new m(new nc2(x24Var2));
                    qz0Var.l0(objM2);
                }
                m mVar2 = (m) objM2;
                if (g34Var != null) {
                    qz0Var.a0(1743490539);
                    qz0Var.a0(887527095);
                    Object obj8 = pj6.a;
                    if (obj8 != null) {
                        qz0Var.a0(1345554384);
                        qz0Var.q(false);
                    } else {
                        qz0Var.a0(1345603457);
                        View view = (View) qz0Var.j(e.f);
                        boolean zF = qz0Var.f(view);
                        Object objM3 = qz0Var.M();
                        if (zF || objM3 == avVar) {
                            Object tag = view.getTag(tr6.compose_prefetch_scheduler);
                            obj = tag instanceof nj6 ? (nj6) tag : null;
                            if (obj == null) {
                                nh nhVar = new nh(view);
                                view.setTag(tr6.compose_prefetch_scheduler, nhVar);
                                objM3 = nhVar;
                            } else {
                                objM3 = obj;
                            }
                            qz0Var.l0(objM3);
                        }
                        obj8 = (nj6) objM3;
                        qz0Var.q(false);
                    }
                    qz0Var.q(false);
                    Object[] objArr = new Object[4];
                    objArr[0] = g34Var;
                    objArr[1] = x24Var2;
                    objArr[c] = mVar2;
                    objArr[3] = obj8;
                    boolean zF2 = qz0Var.f(g34Var) | qz0Var.h(x24Var2) | qz0Var.h(mVar2) | qz0Var.h(obj8);
                    Object objM4 = qz0Var.M();
                    if (zF2 || objM4 == avVar) {
                        zi ziVar = new zi(g34Var, x24Var2, mVar2, obj8, 6);
                        x24Var = x24Var2;
                        mVar = mVar2;
                        qz0Var.l0(ziVar);
                        objM4 = ziVar;
                    } else {
                        mVar = mVar2;
                        x24Var = x24Var2;
                    }
                    zk8.f(objArr, (dp2) objM4, qz0Var);
                } else {
                    mVar = mVar2;
                    x24Var = x24Var2;
                    qz0Var.a0(1737291469);
                }
                qz0Var.q(false);
                int i2 = h34.a;
                if (g34Var != null && (hx4VarD = hx4Var.d(new gs8(g34Var))) != null) {
                    hx4Var = hx4VarD;
                }
                boolean zF3 = qz0Var.f(x24Var) | qz0Var.f(u34Var);
                Object objM5 = qz0Var.M();
                if (zF3 || objM5 == avVar) {
                    objM5 = new iz(x24Var, u34Var, 10);
                    qz0Var.l0(objM5);
                }
                androidx.compose.ui.layout.e.c(mVar, hx4Var, (qp2) objM5, qz0Var, 8);
                break;
            case 1:
                qp2 qp2Var = (qp2) obj7;
                b51 b51Var = (b51) obj6;
                rp2 rp2Var = (rp2) obj5;
                bp2 bp2Var = (bp2) obj4;
                a51 a51Var = (a51) obj;
                qz0 qz0Var2 = (qz0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= qz0Var2.f(a51Var) ? 4 : 2;
                }
                if (!qz0Var2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    qz0Var2.U();
                } else {
                    String str = (String) qp2Var.invoke(qz0Var2, 0);
                    if (f88.n0(str)) {
                        un3.c("Label must not be blank");
                    }
                    b51Var.getClass();
                    br9.b.i(str, Boolean.TRUE, a51Var, rp2Var, bp2Var, qz0Var2, Integer.valueOf((iIntValue << 9) & 7168));
                }
                break;
            default:
                String str2 = (String) obj7;
                m99 m99Var = (m99) obj6;
                Context context = (Context) obj5;
                wb5 wb5Var2 = (wb5) obj4;
                qz0 qz0Var3 = (qz0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                js3.p((wv0) obj, "$this$BottomSheetScaffold");
                if (!qz0Var3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    qz0Var3.U();
                } else {
                    ex4 ex4Var = ex4.b;
                    hx4 hx4VarD2 = yh0.D(b.c(ex4Var, 1.0f), ml9.q(hq6.space_16, qz0Var3), ml9.q(hq6.space_16, qz0Var3), ml9.q(hq6.space_16, qz0Var3), 0.0f, 8);
                    gj8 gj8Var = ((wf5) qz0Var3.j(aw8.a)).g;
                    Object objJ = qz0Var3.j(uj8.a);
                    js3.m(objJ);
                    mi8.b(str2, hx4VarD2, ((tj8) objJ).j, 0L, 0L, null, 0L, 0, false, 0, 0, gj8Var, qz0Var3, 0, 0, 131064);
                    hx4 hx4VarD3 = yh0.D(ex4Var, ml9.q(hq6.space_16, qz0Var3), 0.0f, ml9.q(hq6.space_16, qz0Var3), ml9.q(hq6.space_8, qz0Var3), 2);
                    g99 g99Var = m99Var instanceof g99 ? (g99) m99Var : null;
                    if (g99Var != null) {
                        js3.p(context, "context");
                        l32 l32Var = g99Var.a;
                        String str3 = l32Var.a;
                        if (str3 == null) {
                            String string = context.getString(l32Var.b);
                            js3.o(string, "getString(...)");
                            obj = string;
                        } else {
                            obj = str3;
                        }
                    }
                    String str4 = obj;
                    String str5 = (String) wb5Var2.getValue();
                    String strF = ln2.f(vs6.player_write_your_error, qz0Var3);
                    Object objM6 = qz0Var3.M();
                    if (objM6 == avVar) {
                        objM6 = new u8(wb5Var2, 5);
                        qz0Var3.l0(objM6);
                    }
                    c26.c(hx4VarD3, str5, strF, str4, (dp2) objM6, qz0Var3, 24576);
                }
                break;
        }
        return tx8Var;
    }
}
