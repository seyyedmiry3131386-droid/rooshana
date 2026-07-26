package ir.mservices.market.app.detail.update;

import defpackage.dp3;
import defpackage.gv;
import defpackage.jd7;
import defpackage.js3;
import defpackage.ps1;
import defpackage.pv6;
import defpackage.vy2;
import defpackage.yl5;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import ir.mservices.market.viewModel.c;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppUpdateViewModel extends c {
    public final ir.mservices.market.version2.manager.a t;
    public final gv u;
    public final ps1 v;
    public final dp3 w;
    public final InAppUpdateData x;
    public final i y;
    public final pv6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateViewModel(jd7 jd7Var, ir.mservices.market.version2.manager.a aVar, gv gvVar, ps1 ps1Var, dp3 dp3Var, yl5 yl5Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(aVar, "appManager");
        js3.p(ps1Var, "downloadManager");
        js3.p(dp3Var, "installManager");
        js3.p(yl5Var, "neneDownloadRepository");
        this.t = aVar;
        this.u = gvVar;
        this.v = ps1Var;
        this.w = dp3Var;
        this.x = (InAppUpdateData) jd7Var.b("BUNDLE_KEY_DATA");
        i iVarE = vy2.e(0, 7, null);
        this.y = iVarE;
        this.z = new pv6(iVarE);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        if (this.x != null) {
            p(new InAppUpdateViewModel$doRequest$1(this, null));
        }
    }
}
