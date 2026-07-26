package ir.mservices.market.pika.send;

import defpackage.bt2;
import defpackage.dp0;
import defpackage.dt2;
import defpackage.js3;
import defpackage.y97;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.viewModel.c;
import kotlinx.coroutines.channels.a;

/* JADX INFO: loaded from: classes3.dex */
public final class InstalledAppsViewModel extends c {
    public final NearbyRepository t;
    public final ir.mservices.market.pika.send.model.c u;
    public final a v;
    public final dp0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsViewModel(NearbyRepository nearbyRepository, ir.mservices.market.pika.send.model.c cVar) {
        super(true);
        js3.p(nearbyRepository, "nearbyRepository");
        this.t = nearbyRepository;
        this.u = cVar;
        a aVarB = dt2.b(0, 7, null);
        this.v = aVarB;
        this.w = new dp0(aVarB, false);
        bt2.G(y97.G(this), null, null, new InstalledAppsViewModel$initConnectionFlow$1(this, null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new InstalledAppsViewModel$doRequest$1(this, null));
    }

    public final void r(String str) {
        bt2.G(y97.G(this), null, null, new InstalledAppsViewModel$searchApp$1(this, str, null), 3);
    }
}
