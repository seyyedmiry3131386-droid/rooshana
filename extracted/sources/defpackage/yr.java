package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class yr implements ai5 {
    public final String a;
    public final String b;
    public final float c;
    public final int[] d;
    public final int[] e;
    public final ReviewDto f;
    public final ToolbarData g;

    public yr(String str, String str2, float f, int[] iArr, int[] iArr2, ReviewDto reviewDto, ToolbarData toolbarData) {
        js3.p(str, "packageName");
        js3.p(str2, "detailSubscriberId");
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = iArr;
        this.e = iArr2;
        this.f = reviewDto;
        this.g = toolbarData;
    }

    public static final yr fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", yr.class, "packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("detailSubscriberId")) {
            throw new IllegalArgumentException("Required argument \"detailSubscriberId\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("detailSubscriberId");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"detailSubscriberId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("averageRate")) {
            throw new IllegalArgumentException("Required argument \"averageRate\" is missing and does not have an android:defaultValue");
        }
        float f = bundle.getFloat("averageRate");
        if (!bundle.containsKey("rates")) {
            throw new IllegalArgumentException("Required argument \"rates\" is missing and does not have an android:defaultValue");
        }
        int[] intArray = bundle.getIntArray("rates");
        if (intArray == null) {
            throw new IllegalArgumentException("Argument \"rates\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("ratesOnly")) {
            throw new IllegalArgumentException("Required argument \"ratesOnly\" is missing and does not have an android:defaultValue");
        }
        int[] intArray2 = bundle.getIntArray("ratesOnly");
        if (intArray2 == null) {
            throw new IllegalArgumentException("Argument \"ratesOnly\" is marked as non-null but was passed a null value.");
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
        if (toolbarData != null) {
            return new yr(string, string2, f, intArray, intArray2, reviewDto, toolbarData);
        }
        throw new IllegalArgumentException("Argument \"application\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr)) {
            return false;
        }
        yr yrVar = (yr) obj;
        return js3.i(this.a, yrVar.a) && js3.i(this.b, yrVar.b) && Float.compare(this.c, yrVar.c) == 0 && js3.i(this.d, yrVar.d) && js3.i(this.e, yrVar.e) && js3.i(this.f, yrVar.f) && js3.i(this.g, yrVar.g);
    }

    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + dw1.g(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31;
        ReviewDto reviewDto = this.f;
        return this.g.hashCode() + ((iHashCode + (reviewDto == null ? 0 : reviewDto.hashCode())) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.d);
        String string2 = Arrays.toString(this.e);
        StringBuilder sbT = rm7.t("AppReviewsFragmentArgs(packageName=", this.a, ", detailSubscriberId=", this.b, ", averageRate=");
        sbT.append(this.c);
        sbT.append(", rates=");
        sbT.append(string);
        sbT.append(", ratesOnly=");
        sbT.append(string2);
        sbT.append(", review=");
        sbT.append(this.f);
        sbT.append(", application=");
        sbT.append(this.g);
        sbT.append(")");
        return sbT.toString();
    }
}
