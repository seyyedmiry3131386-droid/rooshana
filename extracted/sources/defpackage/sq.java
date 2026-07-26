package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class sq implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final int d;

    public sq(DialogDataModel dialogDataModel, String str, String str2, int i) {
        js3.p(str, "title");
        js3.p(str2, "iconPath");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public static final sq fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", sq.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("iconPath")) {
            throw new IllegalArgumentException("Required argument \"iconPath\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("iconPath");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"iconPath\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("installResult")) {
            return new sq(dialogDataModel, string, string2, bundle.getInt("installResult"));
        }
        throw new IllegalArgumentException("Required argument \"installResult\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq)) {
            return false;
        }
        sq sqVar = (sq) obj;
        return js3.i(this.a, sqVar.a) && js3.i(this.b, sqVar.b) && js3.i(this.c, sqVar.c) && this.d == sqVar.d;
    }

    public final int hashCode() {
        return rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("AppInstallUnSuccessDialogFragmentArgs(data=", this.a, ", title=", this.b, ", iconPath=");
        sbD.append(this.c);
        sbD.append(", installResult=");
        sbD.append(this.d);
        sbD.append(")");
        return sbD.toString();
    }
}
