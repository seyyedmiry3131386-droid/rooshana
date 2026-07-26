package ir.mservices.market.app.detail.more.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.xb5;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreSizeData implements MyketRecyclerData, g32 {
    public static final int e = js6.holder_more_size;
    public final String a;
    public final String b;
    public final xb5 c;
    public final String d;

    public MoreSizeData(String str, String str2, xb5 xb5Var) {
        js3.p(str, "actualSize");
        js3.p(xb5Var, "diffStatusFlow");
        this.a = str;
        this.b = str2;
        this.c = xb5Var;
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
        if (!MoreSizeData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.detail.more.ui.recycler.MoreSizeData");
        MoreSizeData moreSizeData = (MoreSizeData) obj;
        return js3.i(this.a, moreSizeData.a) && js3.i(this.b, moreSizeData.b) && ((Boolean) ((l) this.c).getValue()).booleanValue() == ((Boolean) ((l) moreSizeData.c).getValue()).booleanValue();
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (((Boolean) ((l) this.c).getValue()).booleanValue() ? 1231 : 1237);
    }
}
