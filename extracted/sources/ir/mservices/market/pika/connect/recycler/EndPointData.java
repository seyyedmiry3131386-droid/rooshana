package ir.mservices.market.pika.connect.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class EndPointData implements MyketRecyclerData, g32 {
    public static final int c = js6.pika_end_point_holder;
    public final String a;
    public final String b;

    public EndPointData(String str, String str2) {
        js3.p(str, "endPointId");
        js3.p(str2, "deviceName");
        this.a = str;
        this.b = str2;
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
        if (!EndPointData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.pika.connect.recycler.EndPointData");
        return js3.i(this.a, ((EndPointData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
