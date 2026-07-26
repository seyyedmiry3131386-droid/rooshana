package ir.mservices.market.app.search.result.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.RestrictedAppDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class RestrictedApplicationData implements MyketRecyclerData, g32, wo2 {
    public static final int c = js6.restricted_app;
    public final RestrictedAppDTO a;
    public final String b;

    public RestrictedApplicationData(RestrictedAppDTO restrictedAppDTO, String str) {
        js3.p(restrictedAppDTO, "applicationDTO");
        js3.p(str, "itemType");
        this.a = restrictedAppDTO;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RestrictedApplicationData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.search.result.ui.recycler.RestrictedApplicationData");
        return js3.i(this.a, ((RestrictedApplicationData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
