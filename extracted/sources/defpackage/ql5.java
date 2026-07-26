package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ql5 implements ai5 {
    public final DialogDataModel a;

    public ql5(DialogDataModel dialogDataModel) {
        this.a = dialogDataModel;
    }

    public static final ql5 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", ql5.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel != null) {
            return new ql5(dialogDataModel);
        }
        throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql5) && js3.i(this.a, ((ql5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NeedPermissionDialogArgs(data=" + this.a + ")";
    }
}
