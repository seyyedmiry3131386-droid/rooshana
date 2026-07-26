package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class s37 implements ai5 {
    public final DialogDataModel a;
    public final String b;

    public s37(DialogDataModel dialogDataModel, String str) {
        this.a = dialogDataModel;
        this.b = str;
    }

    public static final s37 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", s37.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey(PackageListMetaDataDTO.KEY_DESCRIPTION)) {
            throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(PackageListMetaDataDTO.KEY_DESCRIPTION);
        if (string != null) {
            return new s37(dialogDataModel, string);
        }
        throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s37)) {
            return false;
        }
        s37 s37Var = (s37) obj;
        return js3.i(this.a, s37Var.a) && js3.i(this.b, s37Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoveDownloadDialogFragmentArgs(data=" + this.a + ", description=" + this.b + ")";
    }
}
