package ir.mservices.market.common.comment.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.yd1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class DeveloperSubmitReview implements Serializable {
    private final String comment;
    private final String commentSource;
    private final boolean isShowEditConfirm;
    private final String launchSource;
    private String packageName;
    private final float rating;

    public DeveloperSubmitReview(String str, float f, String str2, boolean z, String str3, String str4) {
        js3.p(str, "packageName");
        js3.p(str3, "launchSource");
        js3.p(str4, "commentSource");
        this.packageName = str;
        this.rating = f;
        this.comment = str2;
        this.isShowEditConfirm = z;
        this.launchSource = str3;
        this.commentSource = str4;
    }

    public static /* synthetic */ DeveloperSubmitReview copy$default(DeveloperSubmitReview developerSubmitReview, String str, float f, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = developerSubmitReview.packageName;
        }
        if ((i & 2) != 0) {
            f = developerSubmitReview.rating;
        }
        if ((i & 4) != 0) {
            str2 = developerSubmitReview.comment;
        }
        if ((i & 8) != 0) {
            z = developerSubmitReview.isShowEditConfirm;
        }
        if ((i & 16) != 0) {
            str3 = developerSubmitReview.launchSource;
        }
        if ((i & 32) != 0) {
            str4 = developerSubmitReview.commentSource;
        }
        String str5 = str3;
        String str6 = str4;
        return developerSubmitReview.copy(str, f, str2, z, str5, str6);
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

    public final String component5() {
        return this.launchSource;
    }

    public final String component6() {
        return this.commentSource;
    }

    public final DeveloperSubmitReview copy(String str, float f, String str2, boolean z, String str3, String str4) {
        js3.p(str, "packageName");
        js3.p(str3, "launchSource");
        js3.p(str4, "commentSource");
        return new DeveloperSubmitReview(str, f, str2, z, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeveloperSubmitReview)) {
            return false;
        }
        DeveloperSubmitReview developerSubmitReview = (DeveloperSubmitReview) obj;
        return js3.i(this.packageName, developerSubmitReview.packageName) && Float.compare(this.rating, developerSubmitReview.rating) == 0 && js3.i(this.comment, developerSubmitReview.comment) && this.isShowEditConfirm == developerSubmitReview.isShowEditConfirm && js3.i(this.launchSource, developerSubmitReview.launchSource) && js3.i(this.commentSource, developerSubmitReview.commentSource);
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

    public int hashCode() {
        int iG = dw1.g(this.rating, this.packageName.hashCode() * 31, 31);
        String str = this.comment;
        return this.commentSource.hashCode() + rm7.k(this.launchSource, (((iG + (str == null ? 0 : str.hashCode())) * 31) + (this.isShowEditConfirm ? 1231 : 1237)) * 31, 31);
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
        String str3 = this.launchSource;
        String str4 = this.commentSource;
        StringBuilder sb = new StringBuilder("DeveloperSubmitReview(packageName=");
        sb.append(str);
        sb.append(", rating=");
        sb.append(f);
        sb.append(", comment=");
        sb.append(str2);
        sb.append(", isShowEditConfirm=");
        sb.append(z);
        sb.append(", launchSource=");
        return dw1.p(str3, ", commentSource=", str4, ")", sb);
    }

    public /* synthetic */ DeveloperSubmitReview(String str, float f, String str2, boolean z, String str3, String str4, int i, yd1 yd1Var) {
        this(str, f, (i & 4) != 0 ? null : str2, z, str3, str4);
    }
}
