package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class sb0 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;

    public sb0(DialogDataModel dialogDataModel, String str, String str2) {
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
    }

    public static final sb0 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", sb0.class, "data")) {
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
        if (string == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("input")) {
            throw new IllegalArgumentException("Required argument \"input\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("input");
        if (string2 != null) {
            return new sb0(dialogDataModel, string, string2);
        }
        throw new IllegalArgumentException("Argument \"input\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb0)) {
            return false;
        }
        sb0 sb0Var = (sb0) obj;
        return js3.i(this.a, sb0Var.a) && js3.i(this.b, sb0Var.b) && js3.i(this.c, sb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw1.s(bl4.D("BioBottomDialogFragmentArgs(data=", this.a, ", title=", this.b, ", input="), this.c, ")");
    }
}
