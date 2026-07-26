package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.feedback.data.TransactionData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class r92 implements ai5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final TransactionData f;

    public r92(String str, String str2, String str3, String str4, boolean z, TransactionData transactionData) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = transactionData;
    }

    public static final r92 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", r92.class, "packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (!bundle.containsKey("scenario")) {
            throw new IllegalArgumentException("Required argument \"scenario\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("scenario");
        if (!bundle.containsKey("select")) {
            throw new IllegalArgumentException("Required argument \"select\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("select");
        if (!bundle.containsKey("focus")) {
            throw new IllegalArgumentException("Required argument \"focus\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("focus");
        if (!bundle.containsKey("transactionData")) {
            throw new IllegalArgumentException("Required argument \"transactionData\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(TransactionData.class) || Serializable.class.isAssignableFrom(TransactionData.class)) {
            return new r92(string, string2, string3, string4, z, (TransactionData) bundle.get("transactionData"));
        }
        throw new UnsupportedOperationException(TransactionData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r92)) {
            return false;
        }
        r92 r92Var = (r92) obj;
        return js3.i(this.a, r92Var.a) && js3.i(this.b, r92Var.b) && js3.i(this.c, r92Var.c) && js3.i(this.d, r92Var.d) && this.e == r92Var.e && js3.i(this.f, r92Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        TransactionData transactionData = this.f;
        return iHashCode4 + (transactionData != null ? transactionData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("FeedbackFragmentArgs(packageName=", this.a, ", title=", this.b, ", scenario=");
        o40.I(this.c, ", select=", this.d, ", focus=", sbT);
        sbT.append(this.e);
        sbT.append(", transactionData=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
