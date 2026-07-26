package ir.mservices.market.app.detail.more.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreVersionData implements MyketRecyclerData, g32 {
    public static final int e = js6.holder_more_version;
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public MoreVersionData(String str, String str2, int i) {
        js3.p(str, "version");
        this.a = str;
        this.b = str2;
        this.c = i;
        long j = is3.p + 1;
        is3.p = j;
        this.d = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MoreVersionData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.detail.more.ui.recycler.MoreVersionData");
        MoreVersionData moreVersionData = (MoreVersionData) obj;
        return js3.i(this.a, moreVersionData.a) && js3.i(this.b, moreVersionData.b) && this.c == moreVersionData.c;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c;
    }
}
