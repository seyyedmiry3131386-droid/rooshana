package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class yw7 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String[] d;
    public final int e;
    public final String f;
    public final boolean g;

    public yw7(DialogDataModel dialogDataModel, String str, String str2, String[] strArr, int i, String str3, boolean z) {
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = strArr;
        this.e = i;
        this.f = str3;
        this.g = z;
    }

    public static final yw7 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", yw7.class, "data")) {
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
        if (!bundle.containsKey("titleButton")) {
            throw new IllegalArgumentException("Required argument \"titleButton\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("titleButton");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"titleButton\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("items")) {
            throw new IllegalArgumentException("Required argument \"items\" is missing and does not have an android:defaultValue");
        }
        String[] stringArray = bundle.getStringArray("items");
        if (stringArray == null) {
            throw new IllegalArgumentException("Argument \"items\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("selectIndex")) {
            throw new IllegalArgumentException("Required argument \"selectIndex\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("selectIndex");
        boolean z = bundle.containsKey("isDismissOnAction") ? bundle.getBoolean("isDismissOnAction") : true;
        if (bundle.containsKey("hintMessage")) {
            return new yw7(dialogDataModel, string, string2, stringArray, i, bundle.getString("hintMessage"), z);
        }
        throw new IllegalArgumentException("Required argument \"hintMessage\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw7)) {
            return false;
        }
        yw7 yw7Var = (yw7) obj;
        return js3.i(this.a, yw7Var.a) && js3.i(this.b, yw7Var.b) && js3.i(this.c, yw7Var.c) && js3.i(this.d, yw7Var.d) && this.e == yw7Var.e && js3.i(this.f, yw7Var.f) && this.g == yw7Var.g;
    }

    public final int hashCode() {
        int iK = (((rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31) + Arrays.hashCode(this.d)) * 31) + this.e) * 31;
        String str = this.f;
        return ((iK + (str == null ? 0 : str.hashCode())) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        String string = Arrays.toString(this.d);
        StringBuilder sbD = bl4.D("SingleChoiceDialogFragmentArgs(data=", this.a, ", title=", this.b, ", titleButton=");
        o40.I(this.c, ", items=", string, ", selectIndex=", sbD);
        sbD.append(this.e);
        sbD.append(", hintMessage=");
        sbD.append(this.f);
        sbD.append(", isDismissOnAction=");
        return t61.l(sbD, this.g, ")");
    }
}
