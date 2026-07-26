package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class em6 implements ai5 {
    public final DialogDataModel a;
    public final boolean b;

    public em6(DialogDataModel dialogDataModel, boolean z) {
        this.a = dialogDataModel;
        this.b = z;
    }

    public static final em6 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", em6.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel != null) {
            return new em6(dialogDataModel, bundle.containsKey("canceledOnTouchOutside") ? bundle.getBoolean("canceledOnTouchOutside") : true);
        }
        throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em6)) {
            return false;
        }
        em6 em6Var = (em6) obj;
        return js3.i(this.a, em6Var.a) && this.b == em6Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "ProgressDialogFragmentArgs(data=" + this.a + ", canceledOnTouchOutside=" + this.b + ")";
    }
}
