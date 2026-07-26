package defpackage;

import android.view.View;
import ir.mservices.market.app.home.ui.recycler.HomeSingleAppData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class cc3 extends d90 {
    public final /* synthetic */ int O;
    public final s82 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc3(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, s82 s82Var, og5 og5Var, og5 og5Var2, og5 og5Var3, int i) {
        super(view, graphicUtils$Dimension, z, og5Var, og5Var2, og5Var3);
        this.O = i;
        this.P = s82Var;
    }

    @Override // defpackage.d90, ir.mservices.market.version2.ui.recycler.a
    /* JADX INFO: renamed from: F */
    public final /* bridge */ /* synthetic */ void s(NestedRecyclerData nestedRecyclerData) {
        switch (this.O) {
            case 0:
                s((HomeSingleAppData) nestedRecyclerData);
                break;
            default:
                s((HomeSingleAppData) nestedRecyclerData);
                break;
        }
    }

    @Override // defpackage.d90
    /* JADX INFO: renamed from: J */
    public final void s(HomeSingleAppData homeSingleAppData) {
        switch (this.O) {
            case 0:
                js3.p(homeSingleAppData, "data");
                super.s(homeSingleAppData);
                l06 l06Var = this.C;
                js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.app.home.ui.recycler.HomeSingleAppDataAdapter");
                s82 s82Var = this.P;
                js3.p(s82Var, "<set-?>");
                ((ac3) l06Var).r = s82Var;
                break;
            default:
                js3.p(homeSingleAppData, "data");
                super.s(homeSingleAppData);
                l06 l06Var2 = this.C;
                js3.n(l06Var2, "null cannot be cast to non-null type ir.mservices.market.app.home.ui.recycler.HomeSingleAppDataAdapter");
                s82 s82Var2 = this.P;
                js3.p(s82Var2, "<set-?>");
                ((ac3) l06Var2).r = s82Var2;
                break;
        }
    }

    @Override // defpackage.d90, ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    public final /* bridge */ /* synthetic */ void s(MyketRecyclerData myketRecyclerData) {
        switch (this.O) {
            case 0:
                s((HomeSingleAppData) myketRecyclerData);
                break;
            default:
                s((HomeSingleAppData) myketRecyclerData);
                break;
        }
    }
}
