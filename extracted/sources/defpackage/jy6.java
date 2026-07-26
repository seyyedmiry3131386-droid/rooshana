package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.app.detail.ui.Tracker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class jy6 implements ai5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Tracker e;

    public jy6(String str, String str2, String str3, String str4, Tracker tracker) {
        js3.p(str2, "packageName");
        js3.p(str3, "title");
        js3.p(str4, "recommendedType");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = tracker;
    }

    public static final jy6 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", jy6.class, "accountId")) {
            throw new IllegalArgumentException("Required argument \"accountId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("accountId");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"accountId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("packageName");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("title");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("recommendedType")) {
            throw new IllegalArgumentException("Required argument \"recommendedType\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("recommendedType");
        if (string4 == null) {
            throw new IllegalArgumentException("Argument \"recommendedType\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("launchSource")) {
            throw new IllegalArgumentException("Required argument \"launchSource\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Tracker.class) && !Serializable.class.isAssignableFrom(Tracker.class)) {
            throw new UnsupportedOperationException(Tracker.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Tracker tracker = (Tracker) bundle.get("launchSource");
        if (tracker != null) {
            return new jy6(string, string2, string3, string4, tracker);
        }
        throw new IllegalArgumentException("Argument \"launchSource\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy6)) {
            return false;
        }
        jy6 jy6Var = (jy6) obj;
        return js3.i(this.a, jy6Var.a) && js3.i(this.b, jy6Var.b) && js3.i(this.c, jy6Var.c) && js3.i(this.d, jy6Var.d) && js3.i(this.e, jy6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("RecommendedRecyclerListFragmentArgs(accountId=", this.a, ", packageName=", this.b, ", title=");
        o40.I(this.c, ", recommendedType=", this.d, ", launchSource=", sbT);
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
