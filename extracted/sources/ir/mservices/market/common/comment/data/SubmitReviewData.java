package ir.mservices.market.common.comment.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.yd1;
import ir.mservices.market.appDetail.ToolbarData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SubmitReviewData implements Serializable {
    private final String comment;
    private final String commentSource;
    private final boolean isNewRate;
    private final boolean isShowEditConfirm;
    private final String launchSource;
    private String packageName;
    private final float rating;
    private final ToolbarData toolbarData;

    public SubmitReviewData(String str, float f, String str2, boolean z, boolean z2, ToolbarData toolbarData, String str3, String str4) {
        js3.p(str, "packageName");
        js3.p(str3, "launchSource");
        js3.p(str4, "commentSource");
        this.packageName = str;
        this.rating = f;
        this.comment = str2;
        this.isShowEditConfirm = z;
        this.isNewRate = z2;
        this.toolbarData = toolbarData;
        this.launchSource = str3;
        this.commentSource = str4;
    }

    public static /* synthetic */ SubmitReviewData copy$default(SubmitReviewData submitReviewData, String str, float f, String str2, boolean z, boolean z2, ToolbarData toolbarData, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitReviewData.packageName;
        }
        if ((i & 2) != 0) {
            f = submitReviewData.rating;
        }
        if ((i & 4) != 0) {
            str2 = submitReviewData.comment;
        }
        if ((i & 8) != 0) {
            z = submitReviewData.isShowEditConfirm;
        }
        if ((i & 16) != 0) {
            z2 = submitReviewData.isNewRate;
        }
        if ((i & 32) != 0) {
            toolbarData = submitReviewData.toolbarData;
        }
        if ((i & 64) != 0) {
            str3 = submitReviewData.launchSource;
        }
        if ((i & 128) != 0) {
            str4 = submitReviewData.commentSource;
        }
        String str5 = str3;
        String str6 = str4;
        boolean z3 = z2;
        ToolbarData toolbarData2 = toolbarData;
        return submitReviewData.copy(str, f, str2, z, z3, toolbarData2, str5, str6);
    }

    public final String component1() {
        return this.packageName;
    }

    public final float component2() {
        return this.rating;
    }

    public final String component3() {
        return this.comment;
    }

    public final boolean component4() {
        return this.isShowEditConfirm;
    }

    public final boolean component5() {
        return this.isNewRate;
    }

    public final ToolbarData component6() {
        return this.toolbarData;
    }

    public final String component7() {
        return this.launchSource;
    }

    public final String component8() {
        return this.commentSource;
    }

    public final SubmitReviewData copy(String str, float f, String str2, boolean z, boolean z2, ToolbarData toolbarData, String str3, String str4) {
        js3.p(str, "packageName");
        js3.p(str3, "launchSource");
        js3.p(str4, "commentSource");
        return new SubmitReviewData(str, f, str2, z, z2, toolbarData, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitReviewData)) {
            return false;
        }
        SubmitReviewData submitReviewData = (SubmitReviewData) obj;
        return js3.i(this.packageName, submitReviewData.packageName) && Float.compare(this.rating, submitReviewData.rating) == 0 && js3.i(this.comment, submitReviewData.comment) && this.isShowEditConfirm == submitReviewData.isShowEditConfirm && this.isNewRate == submitReviewData.isNewRate && js3.i(this.toolbarData, submitReviewData.toolbarData) && js3.i(this.launchSource, submitReviewData.launchSource) && js3.i(this.commentSource, submitReviewData.commentSource);
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getCommentSource() {
        return this.commentSource;
    }

    public final String getLaunchSource() {
        return this.launchSource;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final float getRating() {
        return this.rating;
    }

    public final ToolbarData getToolbarData() {
        return this.toolbarData;
    }

    public int hashCode() {
        int iG = dw1.g(this.rating, this.packageName.hashCode() * 31, 31);
        String str = this.comment;
        int iHashCode = (((((iG + (str == null ? 0 : str.hashCode())) * 31) + (this.isShowEditConfirm ? 1231 : 1237)) * 31) + (this.isNewRate ? 1231 : 1237)) * 31;
        ToolbarData toolbarData = this.toolbarData;
        return this.commentSource.hashCode() + rm7.k(this.launchSource, (iHashCode + (toolbarData != null ? toolbarData.hashCode() : 0)) * 31, 31);
    }

    public final boolean isNewRate() {
        return this.isNewRate;
    }

    public final boolean isShowEditConfirm() {
        return this.isShowEditConfirm;
    }

    public final void setPackageName(String str) {
        js3.p(str, "<set-?>");
        this.packageName = str;
    }

    public String toString() {
        String str = this.packageName;
        float f = this.rating;
        String str2 = this.comment;
        boolean z = this.isShowEditConfirm;
        boolean z2 = this.isNewRate;
        ToolbarData toolbarData = this.toolbarData;
        String str3 = this.launchSource;
        String str4 = this.commentSource;
        StringBuilder sb = new StringBuilder("SubmitReviewData(packageName=");
        sb.append(str);
        sb.append(", rating=");
        sb.append(f);
        sb.append(", comment=");
        sb.append(str2);
        sb.append(", isShowEditConfirm=");
        sb.append(z);
        sb.append(", isNewRate=");
        sb.append(z2);
        sb.append(", toolbarData=");
        sb.append(toolbarData);
        sb.append(", launchSource=");
        return dw1.p(str3, ", commentSource=", str4, ")", sb);
    }

    public /* synthetic */ SubmitReviewData(String str, float f, String str2, boolean z, boolean z2, ToolbarData toolbarData, String str3, String str4, int i, yd1 yd1Var) {
        this(str, f, (i & 4) != 0 ? null : str2, z, z2, toolbarData, str3, str4);
    }
}
