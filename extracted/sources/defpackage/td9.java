package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.social.welcome.data.Step;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class td9 implements ai5 {
    public final Step a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final DialogDataModel f;

    public td9(Step step, String str, String str2, String str3, String str4, DialogDataModel dialogDataModel) {
        this.a = step;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = dialogDataModel;
    }

    public static final td9 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", td9.class, "step")) {
            throw new IllegalArgumentException("Required argument \"step\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Step.class) && !Serializable.class.isAssignableFrom(Step.class)) {
            throw new UnsupportedOperationException(Step.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Step step = (Step) bundle.get("step");
        if (step == null) {
            throw new IllegalArgumentException("Argument \"step\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
            throw new IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (!bundle.containsKey("birthday")) {
            throw new IllegalArgumentException("Required argument \"birthday\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("birthday");
        if (!bundle.containsKey("gender")) {
            throw new IllegalArgumentException("Required argument \"gender\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("gender");
        if (!bundle.containsKey("avatar")) {
            throw new IllegalArgumentException("Required argument \"avatar\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("avatar");
        if (!bundle.containsKey("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel != null) {
            return new td9(step, string, string2, string3, string4, dialogDataModel);
        }
        throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td9)) {
            return false;
        }
        td9 td9Var = (td9) obj;
        return this.a == td9Var.a && js3.i(this.b, td9Var.b) && js3.i(this.c, td9Var.c) && js3.i(this.d, td9Var.d) && js3.i(this.e, td9Var.e) && js3.i(this.f, td9Var.f);
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
        return this.f.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WelcomeFragmentArgs(step=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", birthday=");
        o40.I(this.c, ", gender=", this.d, ", avatar=", sb);
        sb.append(this.e);
        sb.append(", data=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
