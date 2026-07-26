package ir.mservices.market.securityShield.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class HarmFulAppViewData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_harmful_app;
    public final String a;
    public final String b;

    public HarmFulAppViewData(String str) {
        js3.p(str, "packageName");
        this.a = str;
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
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!HarmFulAppViewData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.securityShield.recycler.HarmFulAppViewData");
        HarmFulAppViewData harmFulAppViewData = (HarmFulAppViewData) obj;
        return js3.i(this.a, harmFulAppViewData.a) && js3.i(this.b, harmFulAppViewData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
