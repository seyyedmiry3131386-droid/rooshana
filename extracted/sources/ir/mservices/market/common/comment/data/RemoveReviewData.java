package ir.mservices.market.common.comment.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoveReviewData implements Serializable {
    private final String packageName;
    private final String parentId;
    private final String reviewId;

    public RemoveReviewData(String str, String str2, String str3) {
        js3.p(str, "packageName");
        js3.p(str2, "reviewId");
        this.packageName = str;
        this.reviewId = str2;
        this.parentId = str3;
    }

    public static /* synthetic */ RemoveReviewData copy$default(RemoveReviewData removeReviewData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = removeReviewData.packageName;
        }
        if ((i & 2) != 0) {
            str2 = removeReviewData.reviewId;
        }
        if ((i & 4) != 0) {
            str3 = removeReviewData.parentId;
        }
        return removeReviewData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.reviewId;
    }

    public final String component3() {
        return this.parentId;
    }

    public final RemoveReviewData copy(String str, String str2, String str3) {
        js3.p(str, "packageName");
        js3.p(str2, "reviewId");
        return new RemoveReviewData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveReviewData)) {
            return false;
        }
        RemoveReviewData removeReviewData = (RemoveReviewData) obj;
        return js3.i(this.packageName, removeReviewData.packageName) && js3.i(this.reviewId, removeReviewData.reviewId) && js3.i(this.parentId, removeReviewData.parentId);
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getReviewId() {
        return this.reviewId;
    }

    public int hashCode() {
        int iK = rm7.k(this.reviewId, this.packageName.hashCode() * 31, 31);
        String str = this.parentId;
        return iK + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.packageName;
        String str2 = this.reviewId;
        return dw1.s(rm7.t("RemoveReviewData(packageName=", str, ", reviewId=", str2, ", parentId="), this.parentId, ")");
    }
}
