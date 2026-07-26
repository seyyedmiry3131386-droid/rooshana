package ir.mservices.market.app.detail.update;

import defpackage.dp3;
import defpackage.ja1;
import defpackage.js3;
import defpackage.on;
import defpackage.pv6;
import defpackage.rv6;
import defpackage.vy2;
import defpackage.wt;
import ir.mservices.market.viewModel.c;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppUpdateActivityViewModel extends c {
    public final pv6 A;
    public final wt t;
    public final ir.mservices.market.app.update.common.modal.a u;
    public final dp3 v;
    public final on w;
    public final l x;
    public final rv6 y;
    public final i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateActivityViewModel(wt wtVar, ir.mservices.market.app.update.common.modal.a aVar, dp3 dp3Var, on onVar) {
        super(false);
        js3.p(wtVar, "appUpdateRepository");
        js3.p(aVar, "updateRefreshRepository");
        js3.p(dp3Var, "installManager");
        this.t = wtVar;
        this.u = aVar;
        this.v = dp3Var;
        this.w = onVar;
        l lVarB = ja1.b(null);
        this.x = lVarB;
        this.y = new rv6(lVarB);
        i iVarE = vy2.e(0, 7, null);
        this.z = iVarE;
        this.A = new pv6(iVarE);
    }
}
