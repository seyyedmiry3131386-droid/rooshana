package ir.mservices.market.viewModel;

import defpackage.bt2;
import defpackage.pv6;
import defpackage.r50;
import defpackage.vy2;
import defpackage.y97;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public class a extends c {
    public final i t;
    public final pv6 u;

    public a() {
        this(true);
    }

    public final void r(r50... r50VarArr) {
        bt2.G(y97.G(this), null, null, new BaseActionableViewModel$action$1(r50VarArr, this, null), 3);
    }

    public a(boolean z) {
        super(z);
        i iVarE = vy2.e(1, 6, null);
        this.t = iVarE;
        this.u = new pv6(iVarE);
    }
}
