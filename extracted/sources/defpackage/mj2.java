package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class mj2 implements ai5 {
    public final DialogDataModel a;
    public final int b;

    public mj2(DialogDataModel dialogDataModel, int i) {
        this.a = dialogDataModel;
        this.b = i;
    }

    public static final mj2 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", mj2.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("myketLatestVersionCode")) {
            return new mj2(dialogDataModel, bundle.getInt("myketLatestVersionCode"));
        }
        throw new IllegalArgumentException("Required argument \"myketLatestVersionCode\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj2)) {
            return false;
        }
        mj2 mj2Var = (mj2) obj;
        return js3.i(this.a, mj2Var.a) && this.b == mj2Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ForceUpdateDialogFragmentArgs(data=" + this.a + ", myketLatestVersionCode=" + this.b + ")";
    }
}
