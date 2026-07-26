package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class lo6 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;

    public lo6(DialogDataModel dialogDataModel, String str, String str2, String str3) {
        js3.p(str, "title");
        js3.p(str3, "message");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public static final lo6 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", lo6.class, "data")) {
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
        if (!bundle.containsKey("message")) {
            throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("message");
        if (string3 != null) {
            return new lo6(dialogDataModel, string, string2, string3);
        }
        throw new IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo6)) {
            return false;
        }
        lo6 lo6Var = (lo6) obj;
        return js3.i(this.a, lo6Var.a) && js3.i(this.b, lo6Var.b) && js3.i(this.c, lo6Var.c) && js3.i(this.d, lo6Var.d);
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iK + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return dw1.p(this.c, ", message=", this.d, ")", bl4.D("PushNotifTextDialogFragmentArgs(data=", this.a, ", title=", this.b, ", iconPath="));
    }
}
