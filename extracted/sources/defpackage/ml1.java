package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.app.detail.ui.Tracker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ml1 implements ai5 {
    public final String a;
    public final String b;
    public final String c;
    public final Tracker d;

    public ml1(String str, String str2, String str3, Tracker tracker) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tracker;
    }

    public static final ml1 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", ml1.class, "developerId")) {
            throw new IllegalArgumentException("Required argument \"developerId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("developerId");
        if (!bundle.containsKey("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("packageName");
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("title");
        if (!bundle.containsKey("launcherSource")) {
            throw new IllegalArgumentException("Required argument \"launcherSource\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Tracker.class) && !Serializable.class.isAssignableFrom(Tracker.class)) {
            throw new UnsupportedOperationException(Tracker.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Tracker tracker = (Tracker) bundle.get("launcherSource");
        if (tracker != null) {
            return new ml1(string, string2, string3, tracker);
        }
        throw new IllegalArgumentException("Argument \"launcherSource\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml1)) {
            return false;
        }
        ml1 ml1Var = (ml1) obj;
        return js3.i(this.a, ml1Var.a) && js3.i(this.b, ml1Var.b) && js3.i(this.c, ml1Var.c) && js3.i(this.d, ml1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("DeveloperRecyclerListFragmentArgs(developerId=", this.a, ", packageName=", this.b, ", title=");
        sbT.append(this.c);
        sbT.append(", launcherSource=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
