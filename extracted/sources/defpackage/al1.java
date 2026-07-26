package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class al1 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final float f;
    public final boolean g;

    public al1(DialogDataModel dialogDataModel, String str, String str2, String str3, String str4, float f, boolean z) {
        js3.p(str, "packageName");
        js3.p(str4, "commentSource");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = f;
        this.g = z;
    }

    public static final al1 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", al1.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("comment")) {
            throw new IllegalArgumentException("Required argument \"comment\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("comment");
        if (!bundle.containsKey("appName")) {
            throw new IllegalArgumentException("Required argument \"appName\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("appName");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"appName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("commentSource")) {
            throw new IllegalArgumentException("Required argument \"commentSource\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("commentSource");
        if (string4 == null) {
            throw new IllegalArgumentException("Argument \"commentSource\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("rating")) {
            throw new IllegalArgumentException("Required argument \"rating\" is missing and does not have an android:defaultValue");
        }
        float f = bundle.getFloat("rating");
        if (bundle.containsKey("isShowEditConfirm")) {
            return new al1(dialogDataModel, string, string2, string3, string4, f, bundle.getBoolean("isShowEditConfirm"));
        }
        throw new IllegalArgumentException("Required argument \"isShowEditConfirm\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al1)) {
            return false;
        }
        al1 al1Var = (al1) obj;
        return js3.i(this.a, al1Var.a) && js3.i(this.b, al1Var.b) && js3.i(this.c, al1Var.c) && js3.i(this.d, al1Var.d) && js3.i(this.e, al1Var.e) && Float.compare(this.f, al1Var.f) == 0 && this.g == al1Var.g;
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return dw1.g(this.f, rm7.k(this.e, rm7.k(this.d, (iK + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("DeveloperCommentBottomDialogFragmentArgs(data=", this.a, ", packageName=", this.b, ", comment=");
        o40.I(this.c, ", appName=", this.d, ", commentSource=", sbD);
        sbD.append(this.e);
        sbD.append(", rating=");
        sbD.append(this.f);
        sbD.append(", isShowEditConfirm=");
        return t61.l(sbD, this.g, ")");
    }
}
