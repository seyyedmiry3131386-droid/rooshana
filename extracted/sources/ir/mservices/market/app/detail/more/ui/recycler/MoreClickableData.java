package ir.mservices.market.app.detail.more.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreClickableData implements MyketRecyclerData, g32 {
    public static final int e = js6.holder_more_clickable;
    public final String a;
    public final int b;
    public final int c;
    public final String d;

    public MoreClickableData(int i, int i2, int i3, String str, String str2) {
        i2 = (i3 & 4) != 0 ? 0 : i2;
        str2 = (i3 & 8) != 0 ? null : str2;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
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
        if (!MoreClickableData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.detail.more.ui.recycler.MoreClickableData");
        MoreClickableData moreClickableData = (MoreClickableData) obj;
        return js3.i(this.a, moreClickableData.a) && this.b == moreClickableData.b && this.c == moreClickableData.c && js3.i(this.d, moreClickableData.d);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
