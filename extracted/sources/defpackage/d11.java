package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class d11 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final ThemeData g;

    public d11(DialogDataModel dialogDataModel, String str, String str2, String str3, int i, int i2, ThemeData themeData) {
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = themeData;
    }

    public static final d11 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", d11.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("message")) {
            throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("message");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"message\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("rejectString")) {
            throw new IllegalArgumentException("Required argument \"rejectString\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("rejectString");
        if (!bundle.containsKey("confirmString")) {
            throw new IllegalArgumentException("Required argument \"confirmString\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("confirmString");
        if (!bundle.containsKey("color")) {
            throw new IllegalArgumentException("Required argument \"color\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("color");
        if (!bundle.containsKey("textColor")) {
            throw new IllegalArgumentException("Required argument \"textColor\" is missing and does not have an android:defaultValue");
        }
        int i2 = bundle.getInt("textColor");
        if (!bundle.containsKey("theme")) {
            throw new IllegalArgumentException("Required argument \"theme\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ThemeData.class) && !Serializable.class.isAssignableFrom(ThemeData.class)) {
            throw new UnsupportedOperationException(ThemeData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ThemeData themeData = (ThemeData) bundle.get("theme");
        if (themeData != null) {
            return new d11(dialogDataModel, string, string2, string3, i, i2, themeData);
        }
        throw new IllegalArgumentException("Argument \"theme\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d11)) {
            return false;
        }
        d11 d11Var = (d11) obj;
        return js3.i(this.a, d11Var.a) && js3.i(this.b, d11Var.b) && js3.i(this.c, d11Var.c) && js3.i(this.d, d11Var.d) && this.e == d11Var.e && this.f == d11Var.f && js3.i(this.g, d11Var.g);
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.g.hashCode() + ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31);
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("ConfirmBottomDialogFragmentArgs(data=", this.a, ", message=", this.b, ", rejectString=");
        o40.I(this.c, ", confirmString=", this.d, ", color=", sbD);
        o40.J(sbD, this.e, ", textColor=", this.f, ", theme=");
        sbD.append(this.g);
        sbD.append(")");
        return sbD.toString();
    }
}
