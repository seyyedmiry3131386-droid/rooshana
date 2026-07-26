package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class bd implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public bd(DialogDataModel dialogDataModel, String str, String str2, String str3, String str4, boolean z) {
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public static final bd fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", bd.class, "data")) {
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
        if (!bundle.containsKey("commitTextButton")) {
            throw new IllegalArgumentException("Required argument \"commitTextButton\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("commitTextButton");
        if (bundle.containsKey("cancelTextButton")) {
            return new bd(dialogDataModel, string, string2, string3, bundle.getString("cancelTextButton"), bundle.containsKey("isDismissOnAction") ? bundle.getBoolean("isDismissOnAction") : true);
        }
        throw new IllegalArgumentException("Required argument \"cancelTextButton\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return js3.i(this.a, bdVar.a) && js3.i(this.b, bdVar.b) && js3.i(this.c, bdVar.c) && js3.i(this.d, bdVar.d) && js3.i(this.e, bdVar.e) && this.f == bdVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("AlertBottomDialogFragmentArgs(data=", this.a, ", title=", this.b, ", message=");
        o40.I(this.c, ", commitTextButton=", this.d, ", cancelTextButton=", sbD);
        sbD.append(this.e);
        sbD.append(", isDismissOnAction=");
        sbD.append(this.f);
        sbD.append(")");
        return sbD.toString();
    }
}
