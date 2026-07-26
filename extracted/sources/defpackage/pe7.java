package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class pe7 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;

    public pe7(DialogDataModel dialogDataModel, String str, String str2) {
        js3.p(str, "clock");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
    }

    public static final pe7 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", pe7.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("clock")) {
            throw new IllegalArgumentException("Required argument \"clock\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("clock");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"clock\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("title")) {
            return new pe7(dialogDataModel, string, bundle.getString("title"));
        }
        throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe7)) {
            return false;
        }
        pe7 pe7Var = (pe7) obj;
        return js3.i(this.a, pe7Var.a) && js3.i(this.b, pe7Var.b) && js3.i(this.c, pe7Var.c);
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iK + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return dw1.s(bl4.D("ScheduleTimeBottomDialogFragmentArgs(data=", this.a, ", clock=", this.b, ", title="), this.c, ")");
    }
}
