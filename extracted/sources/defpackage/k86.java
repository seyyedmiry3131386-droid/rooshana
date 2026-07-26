package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class k86 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;

    public k86(DialogDataModel dialogDataModel, String str, String str2) {
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
    }

    public static final k86 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", k86.class, "data")) {
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
        if (!bundle.containsKey("confirm_title")) {
            throw new IllegalArgumentException("Required argument \"confirm_title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("confirm_title");
        if (string2 != null) {
            return new k86(dialogDataModel, string, string2);
        }
        throw new IllegalArgumentException("Argument \"confirm_title\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k86)) {
            return false;
        }
        k86 k86Var = (k86) obj;
        return js3.i(this.a, k86Var.a) && js3.i(this.b, k86Var.b) && js3.i(this.c, k86Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw1.s(bl4.D("PikaUpdateDialogFragmentArgs(data=", this.a, ", desc=", this.b, ", confirmTitle="), this.c, ")");
    }
}
