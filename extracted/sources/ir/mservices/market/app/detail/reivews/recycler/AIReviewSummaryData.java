package ir.mservices.market.app.detail.reivews.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.wo2;
import defpackage.xe2;
import ir.mservices.market.app.detail.data.AIReviewDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AIReviewSummaryData implements MyketRecyclerData, wo2, g32 {
    public static final int d = js6.ai_review;
    public final AIReviewDto a;
    public final xe2 b;
    public final v48 c;

    public AIReviewSummaryData(AIReviewDto aIReviewDto, l lVar, l lVar2) {
        js3.p(lVar, "likeFlow");
        js3.p(lVar2, "isOpenFlow");
        this.a = aIReviewDto;
        this.b = lVar;
        this.c = lVar2;
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
        if (obj instanceof AIReviewSummaryData) {
            return js3.i(this.a, ((AIReviewSummaryData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.a.hashCode());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
