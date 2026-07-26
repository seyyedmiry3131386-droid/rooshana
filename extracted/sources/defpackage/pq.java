package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class pq implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;

    public pq(DialogDataModel dialogDataModel, String str, String str2) {
        js3.p(str, "title");
        js3.p(str2, "iconPath");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
    }

    public static final pq fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", pq.class, "data")) {
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
        if (string2 != null) {
            return new pq(dialogDataModel, string, string2);
        }
        throw new IllegalArgumentException("Argument \"iconPath\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        return js3.i(this.a, pqVar.a) && js3.i(this.b, pqVar.b) && js3.i(this.c, pqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw1.s(bl4.D("AppInstallRetryDialogFragmentArgs(data=", this.a, ", title=", this.b, ", iconPath="), this.c, ")");
    }
}
