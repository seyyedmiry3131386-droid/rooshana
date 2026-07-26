package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class n76 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;

    public n76(DialogDataModel dialogDataModel, String str, String str2, String str3) {
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public static final n76 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", n76.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("desc")) {
            throw new IllegalArgumentException("Required argument \"desc\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("desc");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"desc\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("code")) {
            throw new IllegalArgumentException("Required argument \"code\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("code");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"code\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("confirm_title")) {
            throw new IllegalArgumentException("Required argument \"confirm_title\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("confirm_title");
        if (string3 != null) {
            return new n76(dialogDataModel, string, string2, string3);
        }
        throw new IllegalArgumentException("Argument \"confirm_title\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n76)) {
            return false;
        }
        n76 n76Var = (n76) obj;
        return js3.i(this.a, n76Var.a) && js3.i(this.b, n76Var.b) && js3.i(this.c, n76Var.c) && js3.i(this.d, n76Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return dw1.p(this.c, ", confirmTitle=", this.d, ")", bl4.D("PikaConfirmDialogFragmentArgs(data=", this.a, ", desc=", this.b, ", code="));
    }
}
