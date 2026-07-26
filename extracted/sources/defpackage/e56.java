package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.data.permission.PermissionReason;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class e56 implements ai5 {
    public final DialogDataModel a;
    public final boolean b;
    public final PermissionReason c;

    public e56(DialogDataModel dialogDataModel, boolean z, PermissionReason permissionReason) {
        this.a = dialogDataModel;
        this.b = z;
        this.c = permissionReason;
    }

    public static final e56 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", e56.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("lastWord")) {
            throw new IllegalArgumentException("Required argument \"lastWord\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("lastWord");
        if (!bundle.containsKey("permissionReason")) {
            throw new IllegalArgumentException("Required argument \"permissionReason\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(PermissionReason.class) && !Serializable.class.isAssignableFrom(PermissionReason.class)) {
            throw new UnsupportedOperationException(PermissionReason.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        PermissionReason permissionReason = (PermissionReason) bundle.get("permissionReason");
        if (permissionReason != null) {
            return new e56(dialogDataModel, z, permissionReason);
        }
        throw new IllegalArgumentException("Argument \"permissionReason\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e56)) {
            return false;
        }
        e56 e56Var = (e56) obj;
        return js3.i(this.a, e56Var.a) && this.b == e56Var.b && js3.i(this.c, e56Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "PermissionReasonDialogFragmentArgs(data=" + this.a + ", lastWord=" + this.b + ", permissionReason=" + this.c + ")";
    }
}
