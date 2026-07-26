package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class uc5 implements ai5 {
    public final DialogDataModel a;

    public uc5(DialogDataModel dialogDataModel) {
        this.a = dialogDataModel;
    }

    public static final uc5 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", uc5.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(DialogDataModel.class) || Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            return new uc5((DialogDataModel) bundle.get("data"));
        }
        throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc5) && js3.i(this.a, ((uc5) obj).a);
    }

    public final int hashCode() {
        DialogDataModel dialogDataModel = this.a;
        if (dialogDataModel == null) {
            return 0;
        }
        return dialogDataModel.hashCode();
    }

    public final String toString() {
        return "MyAccountRecyclerListFragmentArgs(data=" + this.a + ")";
    }
}
