package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ao7 implements ai5 {
    public final String a;
    public final String b;
    public final String c;
    public final ReviewDto d;
    public final DialogDataModel e;

    public ao7(String str, String str2, String str3, ReviewDto reviewDto, DialogDataModel dialogDataModel) {
        js3.p(str, "launchSource");
        js3.p(str2, "packageName");
        js3.p(str3, "reviewId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = reviewDto;
        this.e = dialogDataModel;
    }

    public static final ao7 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", ao7.class, "launchSource")) {
            throw new IllegalArgumentException("Required argument \"launchSource\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("launchSource");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"launchSource\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("packageName");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("reviewId")) {
            throw new IllegalArgumentException("Required argument \"reviewId\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("reviewId");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"reviewId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("reviewDTO")) {
            throw new IllegalArgumentException("Required argument \"reviewDTO\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ReviewDto.class) && !Serializable.class.isAssignableFrom(ReviewDto.class)) {
            throw new UnsupportedOperationException(ReviewDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ReviewDto reviewDto = (ReviewDto) bundle.get("reviewDTO");
        if (!bundle.containsKey("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel != null) {
            return new ao7(string, string2, string3, reviewDto, dialogDataModel);
        }
        throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao7)) {
            return false;
        }
        ao7 ao7Var = (ao7) obj;
        return js3.i(this.a, ao7Var.a) && js3.i(this.b, ao7Var.b) && js3.i(this.c, ao7Var.c) && js3.i(this.d, ao7Var.d) && js3.i(this.e, ao7Var.e);
    }

    public final int hashCode() {
        int iK = rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31);
        ReviewDto reviewDto = this.d;
        return this.e.hashCode() + ((iK + (reviewDto == null ? 0 : reviewDto.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SendReplyBottomDialogFragmentArgs(launchSource=", this.a, ", packageName=", this.b, ", reviewId=");
        sbT.append(this.c);
        sbT.append(", reviewDTO=");
        sbT.append(this.d);
        sbT.append(", data=");
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
