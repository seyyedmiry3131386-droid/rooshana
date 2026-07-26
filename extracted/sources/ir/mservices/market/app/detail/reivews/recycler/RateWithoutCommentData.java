package ir.mservices.market.app.detail.reivews.recycler;

import defpackage.ew;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class RateWithoutCommentData implements MyketRecyclerData, wo2, g32 {
    public static final int d = js6.rate_without_comment;
    public final boolean a;
    public final String b;
    public final int c;

    public RateWithoutCommentData(int[] iArr, Integer num, boolean z) {
        Integer numValueOf;
        this.a = z;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
        if (num == null) {
            numValueOf = Integer.valueOf(ew.U0(iArr));
        } else {
            int iIntValue = num.intValue() - 1;
            numValueOf = (iIntValue < 0 || iIntValue >= iArr.length) ? null : Integer.valueOf(iArr[iIntValue]);
        }
        this.c = numValueOf != null ? numValueOf.intValue() : 0;
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
        if (equals(obj)) {
            return true;
        }
        if (obj != null && RateWithoutCommentData.class.equals(obj.getClass())) {
            RateWithoutCommentData rateWithoutCommentData = (RateWithoutCommentData) obj;
            if (this.c == rateWithoutCommentData.c && this.a == rateWithoutCommentData.a && js3.i(this.b, rateWithoutCommentData.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.b;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.c) * 31) + (this.a ? 1231 : 1237);
    }
}
