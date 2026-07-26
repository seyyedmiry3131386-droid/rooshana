package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class tn5 implements ai5 {
    public final DialogDataModel a;
    public final String b;

    public tn5(DialogDataModel dialogDataModel, String str) {
        this.a = dialogDataModel;
        this.b = str;
    }

    public static final tn5 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", tn5.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey(PackageListMetaDataDTO.KEY_DESCRIPTION)) {
            return new tn5(dialogDataModel, bundle.getString(PackageListMetaDataDTO.KEY_DESCRIPTION));
        }
        throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn5)) {
            return false;
        }
        tn5 tn5Var = (tn5) obj;
        return js3.i(this.a, tn5Var.a) && js3.i(this.b, tn5Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NicknameDialogFragmentArgs(data=" + this.a + ", description=" + this.b + ")";
    }
}
