package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ve7 implements ai5 {
    public final DialogDataModel a;
    public final boolean b;

    public ve7(DialogDataModel dialogDataModel, boolean z) {
        this.a = dialogDataModel;
        this.b = z;
    }

    public static final ve7 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", ve7.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("isGprsEnable")) {
            return new ve7(dialogDataModel, bundle.getBoolean("isGprsEnable"));
        }
        throw new IllegalArgumentException("Required argument \"isGprsEnable\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve7)) {
            return false;
        }
        ve7 ve7Var = (ve7) obj;
        return js3.i(this.a, ve7Var.a) && this.b == ve7Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "ScheduleTypeBottomDialogFragmentArgs(data=" + this.a + ", isGprsEnable=" + this.b + ")";
    }
}
