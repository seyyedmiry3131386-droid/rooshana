package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.securityShield.SecurityShieldViewModel;
import ir.mservices.market.securityShield.recycler.DeviceScanData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia0 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ia0(bp2 bp2Var, hx4 hx4Var, g34 g34Var, u34 u34Var, int i) {
        this.a = 1;
        this.c = bp2Var;
        this.b = hx4Var;
        this.d = g34Var;
        this.e = u34Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hx4 hx4Var = (hx4) this.b;
                wb5 wb5Var = (wb5) this.c;
                a aVar = (a) this.d;
                androidx.compose.foundation.text.contextmenu.provider.a aVar2 = (androidx.compose.foundation.text.contextmenu.provider.a) this.e;
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM = qz0Var.M();
                    av avVar = jz0.a;
                    if (objM == avVar) {
                        objM = new u8(wb5Var, 3);
                        qz0Var.l0(objM);
                    }
                    hx4 hx4VarN = hs9.N(hx4Var, (dp2) objM);
                    cl4 cl4VarD = bg0.d(eq.c, true);
                    long j = qz0Var.T;
                    int i = (int) (j ^ (j >>> 32));
                    j56 j56VarL = qz0Var.l();
                    hx4 hx4VarC = b.c(qz0Var, hx4VarN);
                    hz0.d0.getClass();
                    bp2 bp2Var = d.b;
                    qz0Var.e0();
                    if (qz0Var.S) {
                        qz0Var.k(bp2Var);
                    } else {
                        qz0Var.o0();
                    }
                    ia7.o(qz0Var, d.f, cl4VarD);
                    ia7.o(qz0Var, d.e, j56VarL);
                    ia7.g(qz0Var, Integer.valueOf(i), d.g);
                    ia7.n(qz0Var, d.h);
                    ia7.o(qz0Var, d.d, hx4VarC);
                    aVar.invoke(qz0Var, 0);
                    Object objM2 = qz0Var.M();
                    if (objM2 == avVar) {
                        objM2 = new v8(wb5Var, 3);
                        qz0Var.l0(objM2);
                    }
                    aVar2.b((bp2) objM2, qz0Var, 6);
                    qz0Var.q(true);
                } else {
                    qz0Var.U();
                }
                return tx8.a;
            case 1:
                ((Integer) obj2).getClass();
                hs9.m((bp2) this.c, (hx4) this.b, (g34) this.d, (u34) this.e, (qz0) obj, hs9.W(1));
                return tx8.a;
            default:
                SecurityShieldViewModel securityShieldViewModel = (SecurityShieldViewModel) this.b;
                String str = (String) this.c;
                Integer num = (Integer) this.d;
                Integer num2 = (Integer) this.e;
                ((Integer) obj).getClass();
                RecyclerItem recyclerItem = (RecyclerItem) obj2;
                js3.p(recyclerItem, "rvItem");
                MyketRecyclerData myketRecyclerData = recyclerItem.c;
                js3.n(myketRecyclerData, "null cannot be cast to non-null type ir.mservices.market.securityShield.recycler.DeviceScanData");
                DeviceScanData deviceScanData = new DeviceScanData(securityShieldViewModel.C, str, num, num2);
                String str2 = ((DeviceScanData) myketRecyclerData).e;
                js3.p(str2, "<set-?>");
                deviceScanData.e = str2;
                return new RecyclerItem(deviceScanData);
        }
    }

    public /* synthetic */ ia0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
