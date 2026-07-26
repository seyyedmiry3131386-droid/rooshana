package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class hq implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public hq(DialogDataModel dialogDataModel, String str, String str2, String str3, boolean z) {
        js3.p(str, "title");
        js3.p(str2, "message");
        js3.p(str3, "iconPath");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public static final hq fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", hq.class, "data")) {
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
        if (!bundle.containsKey("message")) {
            throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("message");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("iconPath")) {
            throw new IllegalArgumentException("Required argument \"iconPath\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("iconPath");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"iconPath\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("hasButton")) {
            return new hq(dialogDataModel, string, string2, string3, bundle.getBoolean("hasButton"));
        }
        throw new IllegalArgumentException("Required argument \"hasButton\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq)) {
            return false;
        }
        hq hqVar = (hq) obj;
        return js3.i(this.a, hqVar.a) && js3.i(this.b, hqVar.b) && js3.i(this.c, hqVar.c) && js3.i(this.d, hqVar.d) && this.e == hqVar.e;
    }

    public final int hashCode() {
        return rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31), 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("AppFailedStorageDialogFragmentArgs(data=", this.a, ", title=", this.b, ", message=");
        o40.I(this.c, ", iconPath=", this.d, ", hasButton=", sbD);
        return t61.l(sbD, this.e, ")");
    }
}
