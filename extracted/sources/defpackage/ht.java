package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ht implements ai5 {
    public final String a;
    public final ReviewDto b;
    public final ToolbarData c;
    public final String d;
    public final String e;
    public final String f;

    public ht(String str, ReviewDto reviewDto, ToolbarData toolbarData, String str2, String str3, String str4) {
        js3.p(str, "packageName");
        this.a = str;
        this.b = reviewDto;
        this.c = toolbarData;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public static final ht fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", ht.class, "packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey(ReviewResultDto.REVIEW_POST_ACTION_REVIEW)) {
            throw new IllegalArgumentException("Required argument \"review\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ReviewDto.class) && !Serializable.class.isAssignableFrom(ReviewDto.class)) {
            throw new UnsupportedOperationException(ReviewDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ReviewDto reviewDto = (ReviewDto) bundle.get(ReviewResultDto.REVIEW_POST_ACTION_REVIEW);
        if (!bundle.containsKey("application")) {
            throw new IllegalArgumentException("Required argument \"application\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ToolbarData.class) && !Serializable.class.isAssignableFrom(ToolbarData.class)) {
            throw new UnsupportedOperationException(ToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ToolbarData toolbarData = (ToolbarData) bundle.get("application");
        if (!bundle.containsKey("launchSource")) {
            throw new IllegalArgumentException("Required argument \"launchSource\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("launchSource");
        if (!bundle.containsKey("detailSubscriberId")) {
            throw new IllegalArgumentException("Required argument \"detailSubscriberId\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("detailSubscriberId");
        if (bundle.containsKey("reviewId")) {
            return new ht(string, reviewDto, toolbarData, string2, string3, bundle.getString("reviewId"));
        }
        throw new IllegalArgumentException("Required argument \"reviewId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        return js3.i(this.a, htVar.a) && js3.i(this.b, htVar.b) && js3.i(this.c, htVar.c) && js3.i(this.d, htVar.d) && js3.i(this.e, htVar.e) && js3.i(this.f, htVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ReviewDto reviewDto = this.b;
        int iHashCode2 = (iHashCode + (reviewDto == null ? 0 : reviewDto.hashCode())) * 31;
        ToolbarData toolbarData = this.c;
        int iHashCode3 = (iHashCode2 + (toolbarData == null ? 0 : toolbarData.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppSubReviewsFragmentArgs(packageName=");
        sb.append(this.a);
        sb.append(", review=");
        sb.append(this.b);
        sb.append(", application=");
        sb.append(this.c);
        sb.append(", launchSource=");
        sb.append(this.d);
        sb.append(", detailSubscriberId=");
        return dw1.p(this.e, ", reviewId=", this.f, ")", sb);
    }
}
