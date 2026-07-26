package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class od implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public od(DialogDataModel dialogDataModel, String str, String str2, String str3, int i) {
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public static final od fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", od.class, "data")) {
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
        if (!bundle.containsKey("message")) {
            throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("message");
        if (!bundle.containsKey("textButton")) {
            throw new IllegalArgumentException("Required argument \"textButton\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("textButton");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"textButton\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("policy")) {
            return new od(dialogDataModel, string, string2, string3, bundle.getInt("policy"));
        }
        throw new IllegalArgumentException("Required argument \"policy\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return js3.i(this.a, odVar.a) && js3.i(this.b, odVar.b) && js3.i(this.c, odVar.c) && js3.i(this.d, odVar.d) && this.e == odVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return rm7.k(this.d, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31) + this.e;
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("AlertDialogFragmentArgs(data=", this.a, ", title=", this.b, ", message=");
        o40.I(this.c, ", textButton=", this.d, ", policy=", sbD);
        return dw1.k(this.e, ")", sbD);
    }
}
