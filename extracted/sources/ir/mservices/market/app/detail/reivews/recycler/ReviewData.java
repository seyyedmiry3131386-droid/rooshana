package ir.mservices.market.app.detail.reivews.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import defpackage.v48;
import defpackage.wo2;
import defpackage.ys5;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewData implements MyketRecyclerData, g32, wo2 {
    public static final int j = js6.review_item;
    public final ReviewDto a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Boolean g;
    public final int h;
    public final v48 i;

    public ReviewData(ReviewDto reviewDto, String str, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, int i, v48 v48Var) {
        js3.p(str, "packageName");
        this.a = reviewDto;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = bool;
        this.h = i;
        this.i = v48Var;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return j;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return this.f ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ReviewData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.detail.reivews.recycler.ReviewData");
        ReviewData reviewData = (ReviewData) obj;
        if (!js3.i(this.a, reviewData.a) || !js3.i(this.b, reviewData.b) || this.c != reviewData.c || this.d != reviewData.d || this.e != reviewData.e || this.f != reviewData.f || !js3.i(this.g, reviewData.g) || this.h != reviewData.h) {
            return false;
        }
        v48 v48Var = this.i;
        ys5 ys5Var = v48Var != null ? (ys5) v48Var.getValue() : null;
        v48 v48Var2 = reviewData.i;
        return js3.i(ys5Var, v48Var2 != null ? (ys5) v48Var2.getValue() : null);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getId();
    }

    public final int hashCode() {
        ys5 ys5Var;
        int i = 1237;
        int iK = (((((((rm7.k(this.b, this.a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31;
        int iHashCode = 0;
        Boolean bool = this.g;
        if (bool == null) {
            i = 0;
        } else if (bool.booleanValue()) {
            i = 1231;
        }
        int i2 = (((iK + i) * 31) + this.h) * 31;
        v48 v48Var = this.i;
        if (v48Var != null && (ys5Var = (ys5) v48Var.getValue()) != null) {
            iHashCode = ys5Var.hashCode();
        }
        return i2 + iHashCode;
    }

    public /* synthetic */ ReviewData(ReviewDto reviewDto, String str, boolean z, l lVar, int i) {
        this(reviewDto, str, (i & 4) == 0, (i & 8) != 0 ? false : z, false, false, (i & 64) != 0 ? Boolean.FALSE : null, -1, (i & 256) != 0 ? null : lVar);
    }
}
