package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class lp8 implements ai5 {
    public final DialogDataModel a;
    public final String b;

    public lp8(DialogDataModel dialogDataModel, String str) {
        this.a = dialogDataModel;
        this.b = str;
    }

    public static final lp8 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", lp8.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("trackingNumber")) {
            return new lp8(dialogDataModel, bundle.getString("trackingNumber"));
        }
        throw new IllegalArgumentException("Required argument \"trackingNumber\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp8)) {
            return false;
        }
        lp8 lp8Var = (lp8) obj;
        return js3.i(this.a, lp8Var.a) && js3.i(this.b, lp8Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrackingAppPaymentBottomDialogFragmentArgs(data=" + this.a + ", trackingNumber=" + this.b + ")";
    }
}
