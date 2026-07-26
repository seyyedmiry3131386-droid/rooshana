package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class yk3 implements ai5 {
    public final DialogDataModel a;
    public final InAppUpdateData b;

    public yk3(DialogDataModel dialogDataModel, InAppUpdateData inAppUpdateData) {
        this.a = dialogDataModel;
        this.b = inAppUpdateData;
    }

    public static final yk3 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", yk3.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("inAppUpdateData")) {
            throw new IllegalArgumentException("Required argument \"inAppUpdateData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(InAppUpdateData.class) && !Serializable.class.isAssignableFrom(InAppUpdateData.class)) {
            throw new UnsupportedOperationException(InAppUpdateData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        InAppUpdateData inAppUpdateData = (InAppUpdateData) bundle.get("inAppUpdateData");
        if (inAppUpdateData != null) {
            return new yk3(dialogDataModel, inAppUpdateData);
        }
        throw new IllegalArgumentException("Argument \"inAppUpdateData\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk3)) {
            return false;
        }
        yk3 yk3Var = (yk3) obj;
        return js3.i(this.a, yk3Var.a) && js3.i(this.b, yk3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InAppUpdateBottomDialogFragmentArgs(data=" + this.a + ", inAppUpdateData=" + this.b + ")";
    }
}
