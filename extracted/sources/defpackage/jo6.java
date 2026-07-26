package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class jo6 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;

    public jo6(DialogDataModel dialogDataModel, String str, String str2, String str3) {
        js3.p(str, "url");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public static final jo6 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", jo6.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("url")) {
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("url");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("pageTitle")) {
            throw new IllegalArgumentException("Required argument \"pageTitle\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("pageTitle");
        if (bundle.containsKey("iconUrl")) {
            return new jo6(dialogDataModel, string, string2, bundle.getString("iconUrl"));
        }
        throw new IllegalArgumentException("Required argument \"iconUrl\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo6)) {
            return false;
        }
        jo6 jo6Var = (jo6) obj;
        return js3.i(this.a, jo6Var.a) && js3.i(this.b, jo6Var.b) && js3.i(this.c, jo6Var.c) && js3.i(this.d, jo6Var.d);
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return dw1.p(this.c, ", iconUrl=", this.d, ")", bl4.D("PushNotifDialogFragmentArgs(data=", this.a, ", url=", this.b, ", pageTitle="));
    }
}
