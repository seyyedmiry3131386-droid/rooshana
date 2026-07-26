package ir.mservices.market.app.detail.reivews.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.pq6;
import defpackage.v48;
import defpackage.wo2;
import defpackage.xe2;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class OwnReviewData implements MyketRecyclerData, wo2, g32 {
    public static final int i = js6.holder_own_review;
    public final String a;
    public final transient v48 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final transient xe2 g;
    public final int h;

    public OwnReviewData(String str, v48 v48Var, boolean z, boolean z2, boolean z3, int i2, xe2 xe2Var, int i3) {
        js3.p(v48Var, ReviewResultDto.REVIEW_POST_ACTION_REVIEW);
        js3.p(xe2Var, "commentStateFlow");
        this.a = str;
        this.b = v48Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i2;
        this.g = xe2Var;
        this.h = i3;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return i;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !OwnReviewData.class.equals(obj.getClass())) {
            return false;
        }
        OwnReviewData ownReviewData = (OwnReviewData) obj;
        return this.c == ownReviewData.c && js3.i(this.a, ownReviewData.a) && js3.i(this.b.getValue(), ownReviewData.b.getValue()) && this.d == ownReviewData.d;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ReviewDto reviewDto = (ReviewDto) this.b.getValue();
        return ((((iHashCode + (reviewDto != null ? reviewDto.hashCode() : 0)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237);
    }

    public /* synthetic */ OwnReviewData(String str, l lVar, int i2, xe2 xe2Var, int i3) {
        this(str, lVar, true, (i3 & 8) == 0, false, (i3 & 32) != 0 ? pq6.space_4 : i2, xe2Var, -1);
    }
}
