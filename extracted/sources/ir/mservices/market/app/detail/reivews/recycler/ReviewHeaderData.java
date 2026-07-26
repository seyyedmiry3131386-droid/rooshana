package ir.mservices.market.app.detail.reivews.recycler;

import defpackage.dw1;
import defpackage.ew;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewHeaderData implements MyketRecyclerData, wo2, g32 {
    public static final int i = js6.header_reviews;
    public static final int j = js6.header_reviews_info;
    public final int[] a;
    public final float b;
    public final List c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public ReviewHeaderData(int[] iArr, float f, List list, String str, boolean z, boolean z2, boolean z3) {
        js3.p(str, "packageName");
        this.a = iArr;
        this.b = f;
        this.c = list;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = ew.U0(iArr);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return this.e ? j : i;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ReviewHeaderData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.detail.reivews.recycler.ReviewHeaderData");
        ReviewHeaderData reviewHeaderData = (ReviewHeaderData) obj;
        return Arrays.equals(this.a, reviewHeaderData.a) && this.b == reviewHeaderData.b && js3.i(this.c, reviewHeaderData.c) && js3.i(this.d, reviewHeaderData.d) && this.e == reviewHeaderData.e && this.f == reviewHeaderData.f && this.g == reviewHeaderData.g && this.h == reviewHeaderData.h;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        int iG = dw1.g(this.b, Arrays.hashCode(this.a) * 31, 31);
        List list = this.c;
        return ((((((rm7.k(this.d, (iG + (list != null ? list.hashCode() : 0)) * 31, 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + this.h;
    }
}
