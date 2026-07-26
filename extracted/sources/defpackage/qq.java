package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class qq implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final boolean d;

    public qq(DialogDataModel dialogDataModel, String str, String str2, boolean z) {
        js3.p(str, "title");
        js3.p(str2, "iconPath");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public static final qq fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", qq.class, "data")) {
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
        if (!bundle.containsKey("iconPath")) {
            throw new IllegalArgumentException("Required argument \"iconPath\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("iconPath");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"iconPath\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("executable")) {
            return new qq(dialogDataModel, string, string2, bundle.getBoolean("executable"));
        }
        throw new IllegalArgumentException("Required argument \"executable\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq)) {
            return false;
        }
        qq qqVar = (qq) obj;
        return js3.i(this.a, qqVar.a) && js3.i(this.b, qqVar.b) && js3.i(this.c, qqVar.c) && this.d == qqVar.d;
    }

    public final int hashCode() {
        return rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("AppInstallSuccessDialogFragmentArgs(data=", this.a, ", title=", this.b, ", iconPath=");
        sbD.append(this.c);
        sbD.append(", executable=");
        sbD.append(this.d);
        sbD.append(")");
        return sbD.toString();
    }
}
