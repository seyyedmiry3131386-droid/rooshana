package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class v86 implements ai5 {
    public final DialogDataModel a;
    public final LoginData b;
    public final LoginData c;

    public v86(DialogDataModel dialogDataModel, LoginData loginData, LoginData loginData2) {
        this.a = dialogDataModel;
        this.b = loginData;
        this.c = loginData2;
    }

    public static final v86 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", v86.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("loginData")) {
            throw new IllegalArgumentException("Required argument \"loginData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(LoginData.class) && !Serializable.class.isAssignableFrom(LoginData.class)) {
            throw new UnsupportedOperationException(LoginData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        LoginData loginData = (LoginData) bundle.get("loginData");
        if (loginData == null) {
            throw new IllegalArgumentException("Argument \"loginData\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("backLoginData")) {
            throw new IllegalArgumentException("Required argument \"backLoginData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(LoginData.class) && !Serializable.class.isAssignableFrom(LoginData.class)) {
            throw new UnsupportedOperationException(LoginData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        LoginData loginData2 = (LoginData) bundle.get("backLoginData");
        if (loginData2 != null) {
            return new v86(dialogDataModel, loginData, loginData2);
        }
        throw new IllegalArgumentException("Argument \"backLoginData\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v86)) {
            return false;
        }
        v86 v86Var = (v86) obj;
        return js3.i(this.a, v86Var.a) && js3.i(this.b, v86Var.b) && js3.i(this.c, v86Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PinLoginDialogFragmentArgs(data=" + this.a + ", loginData=" + this.b + ", backLoginData=" + this.c + ")";
    }
}
