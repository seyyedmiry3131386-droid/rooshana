package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class la6 implements ai5 {
    public final String a;
    public final String b;
    public final DialogDataModel c;

    public la6(DialogDataModel dialogDataModel, String str, String str2) {
        js3.p(str, "packageName");
        js3.p(str2, "title");
        this.a = str;
        this.b = str2;
        this.c = dialogDataModel;
    }

    public static final la6 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", la6.class, "packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel != null) {
            return new la6(dialogDataModel, string, string2);
        }
        throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la6)) {
            return false;
        }
        la6 la6Var = (la6) obj;
        return js3.i(this.a, la6Var.a) && js3.i(this.b, la6Var.b) && js3.i(this.c, la6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("PlayDetailFragmentArgs(packageName=", this.a, ", title=", this.b, ", data=");
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
