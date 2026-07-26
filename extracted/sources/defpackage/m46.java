package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class m46 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;

    public m46(DialogDataModel dialogDataModel, String str, String str2, String str3) {
        js3.p(str2, "title");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public static final m46 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", m46.class, "data")) {
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
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("scenario")) {
            throw new IllegalArgumentException("Required argument \"scenario\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("scenario");
        if (string3 != null) {
            return new m46(dialogDataModel, string, string2, string3);
        }
        throw new IllegalArgumentException("Argument \"scenario\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m46)) {
            return false;
        }
        m46 m46Var = (m46) obj;
        return js3.i(this.a, m46Var.a) && js3.i(this.b, m46Var.b) && js3.i(this.c, m46Var.c) && js3.i(this.d, m46Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + rm7.k(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return dw1.p(this.c, ", scenario=", this.d, ")", bl4.D("PaymentRetryBottomDialogFragmentArgs(data=", this.a, ", packageName=", this.b, ", title="));
    }
}
