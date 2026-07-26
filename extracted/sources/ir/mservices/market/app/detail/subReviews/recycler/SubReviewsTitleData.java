package ir.mservices.market.app.detail.subReviews.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SubReviewsTitleData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_subreview_title;
    public final v48 a;

    public SubReviewsTitleData(l lVar) {
        js3.p(lVar, "count");
        this.a = lVar;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && SubReviewsTitleData.class.equals(obj.getClass()) && ((Number) this.a.getValue()).intValue() == ((Number) ((SubReviewsTitleData) obj).a.getValue()).intValue();
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "SubReviewsTitle";
    }

    public final int hashCode() {
        return ((Number) this.a.getValue()).intValue();
    }
}
