package ir.mservices.market.common.comment.data;

import defpackage.js3;
import defpackage.rm7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class LikeOrDislikeData implements Serializable {
    private final boolean liked;
    private final String packageName;
    private final String parentId;
    private final String reviewId;

    public LikeOrDislikeData(String str, String str2, String str3, boolean z) {
        js3.p(str, "packageName");
        js3.p(str2, "reviewId");
        this.packageName = str;
        this.reviewId = str2;
        this.parentId = str3;
        this.liked = z;
    }

    public static /* synthetic */ LikeOrDislikeData copy$default(LikeOrDislikeData likeOrDislikeData, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = likeOrDislikeData.packageName;
        }
        if ((i & 2) != 0) {
            str2 = likeOrDislikeData.reviewId;
        }
        if ((i & 4) != 0) {
            str3 = likeOrDislikeData.parentId;
        }
        if ((i & 8) != 0) {
            z = likeOrDislikeData.liked;
        }
        return likeOrDislikeData.copy(str, str2, str3, z);
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

    public final boolean component4() {
        return this.liked;
    }

    public final LikeOrDislikeData copy(String str, String str2, String str3, boolean z) {
        js3.p(str, "packageName");
        js3.p(str2, "reviewId");
        return new LikeOrDislikeData(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeOrDislikeData)) {
            return false;
        }
        LikeOrDislikeData likeOrDislikeData = (LikeOrDislikeData) obj;
        return js3.i(this.packageName, likeOrDislikeData.packageName) && js3.i(this.reviewId, likeOrDislikeData.reviewId) && js3.i(this.parentId, likeOrDislikeData.parentId) && this.liked == likeOrDislikeData.liked;
    }

    public final boolean getLiked() {
        return this.liked;
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
        return ((iK + (str == null ? 0 : str.hashCode())) * 31) + (this.liked ? 1231 : 1237);
    }

    public String toString() {
        String str = this.packageName;
        String str2 = this.reviewId;
        String str3 = this.parentId;
        boolean z = this.liked;
        StringBuilder sbT = rm7.t("LikeOrDislikeData(packageName=", str, ", reviewId=", str2, ", parentId=");
        sbT.append(str3);
        sbT.append(", liked=");
        sbT.append(z);
        sbT.append(")");
        return sbT.toString();
    }
}
