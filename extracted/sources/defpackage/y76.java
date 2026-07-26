package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class y76 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final Bitmap c;

    public y76(DialogDataModel dialogDataModel, String str, Bitmap bitmap) {
        js3.p(str, "title");
        this.a = dialogDataModel;
        this.b = str;
        this.c = bitmap;
    }

    public static final y76 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", y76.class, "data")) {
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
        if (!bundle.containsKey("icon")) {
            throw new IllegalArgumentException("Required argument \"icon\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Bitmap.class) && !Serializable.class.isAssignableFrom(Bitmap.class)) {
            throw new UnsupportedOperationException(Bitmap.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Bitmap bitmap = (Bitmap) bundle.get("icon");
        if (bitmap != null) {
            return new y76(dialogDataModel, string, bitmap);
        }
        throw new IllegalArgumentException("Argument \"icon\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y76)) {
            return false;
        }
        y76 y76Var = (y76) obj;
        return js3.i(this.a, y76Var.a) && js3.i(this.b, y76Var.b) && js3.i(this.c, y76Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("PikaInstallFailedDialogFragmentArgs(data=", this.a, ", title=", this.b, ", icon=");
        sbD.append(this.c);
        sbD.append(")");
        return sbD.toString();
    }
}
