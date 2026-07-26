package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class yf5 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;

    public yf5(DialogDataModel dialogDataModel, String str, String str2) {
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
    }

    public static final yf5 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", yf5.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (bundle.containsKey("message")) {
            return new yf5(dialogDataModel, string, bundle.getString("message"));
        }
        throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf5)) {
            return false;
        }
        yf5 yf5Var = (yf5) obj;
        return js3.i(this.a, yf5Var.a) && js3.i(this.b, yf5Var.b) && js3.i(this.c, yf5Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return dw1.s(bl4.D("MyketUpdateBottomDialogFragmentArgs(data=", this.a, ", title=", this.b, ", message="), this.c, ")");
    }
}
