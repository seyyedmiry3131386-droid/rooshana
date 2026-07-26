package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewsMoreTitleRowData implements MyketRecyclerData, wo2, g32 {
    public static final int e = js6.reviews_more_title_view;
    public final int a;
    public final List b;
    public final String c;
    public final float d;

    public ReviewsMoreTitleRowData(int i, List list, String str, float f) {
        js3.p(str, "packageName");
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = f;
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
        if (!(obj instanceof ReviewsMoreTitleRowData)) {
            return false;
        }
        ReviewsMoreTitleRowData reviewsMoreTitleRowData = (ReviewsMoreTitleRowData) obj;
        return this.a == reviewsMoreTitleRowData.a && js3.i(this.b, reviewsMoreTitleRowData.b) && js3.i(this.c, reviewsMoreTitleRowData.c) && this.d == reviewsMoreTitleRowData.d;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        int i = this.a * 31;
        List list = this.b;
        return Float.floatToIntBits(this.d) + rm7.k(this.c, (i + (list != null ? list.hashCode() : 0)) * 31, 31);
    }
}
