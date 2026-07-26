package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class wd4 implements ai5 {
    public final DialogDataModel a;
    public final LoginData b;

    public wd4(DialogDataModel dialogDataModel, LoginData loginData) {
        this.a = dialogDataModel;
        this.b = loginData;
    }

    public static final wd4 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", wd4.class, "data")) {
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
        if (loginData != null) {
            return new wd4(dialogDataModel, loginData);
        }
        throw new IllegalArgumentException("Argument \"loginData\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd4)) {
            return false;
        }
        wd4 wd4Var = (wd4) obj;
        return js3.i(this.a, wd4Var.a) && js3.i(this.b, wd4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LoginDialogFragmentArgs(data=" + this.a + ", loginData=" + this.b + ")";
    }
}
