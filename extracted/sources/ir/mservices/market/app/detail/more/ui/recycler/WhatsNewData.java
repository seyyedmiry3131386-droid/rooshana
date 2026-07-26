package ir.mservices.market.app.detail.more.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class WhatsNewData implements MyketRecyclerData, g32 {
    public static final int d = js6.holder_whats_new;
    public final String a;
    public final Boolean b;
    public final String c;

    public WhatsNewData(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
        long j = is3.p + 1;
        is3.p = j;
        this.c = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WhatsNewData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.detail.more.ui.recycler.WhatsNewData");
        return js3.i(this.a, ((WhatsNewData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.c;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
