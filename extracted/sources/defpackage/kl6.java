package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class kl6 implements ai5 {
    public final String a;
    public final DialogDataModel b;

    public kl6(DialogDataModel dialogDataModel, String str) {
        this.a = str;
        this.b = dialogDataModel;
    }

    public static final kl6 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", kl6.class, "title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (!bundle.containsKey("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel != null) {
            return new kl6(dialogDataModel, string);
        }
        throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl6)) {
            return false;
        }
        kl6 kl6Var = (kl6) obj;
        return js3.i(this.a, kl6Var.a) && js3.i(this.b, kl6Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ProfileListTitleDialogFragmentArgs(title=" + this.a + ", data=" + this.b + ")";
    }
}
