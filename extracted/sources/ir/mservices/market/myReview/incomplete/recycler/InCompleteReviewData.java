package ir.mservices.market.myReview.incomplete.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.vb7;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;

/* JADX INFO: loaded from: classes3.dex */
public final class InCompleteReviewData implements MyketRecyclerData, g32 {
    public static final int d = js6.holder_incomplete_review;
    public final InCompleteReviewDto a;
    public final vb7 b;
    public final String c;

    public InCompleteReviewData(InCompleteReviewDto inCompleteReviewDto, vb7 vb7Var) {
        this.a = inCompleteReviewDto;
        this.b = vb7Var;
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
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InCompleteReviewData) {
            return js3.i(this.a, ((InCompleteReviewData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.c;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
