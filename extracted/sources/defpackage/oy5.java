package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class oy5 implements ai5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public oy5(String str, String str2, String str3, String str4) {
        js3.p(str2, "packageKey");
        js3.p(str3, "launchSource");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static final oy5 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", oy5.class, "title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (!bundle.containsKey("packageKey")) {
            throw new IllegalArgumentException("Required argument \"packageKey\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("packageKey");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"packageKey\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("launchSource")) {
            throw new IllegalArgumentException("Required argument \"launchSource\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("launchSource");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"launchSource\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("refId")) {
            return new oy5(string, string2, string3, bundle.getString("refId"));
        }
        throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy5)) {
            return false;
        }
        oy5 oy5Var = (oy5) obj;
        return js3.i(this.a, oy5Var.a) && js3.i(this.b, oy5Var.b) && js3.i(this.c, oy5Var.c) && js3.i(this.d, oy5Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iK = rm7.k(this.c, rm7.k(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.d;
        return iK + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return dw1.p(this.c, ", refId=", this.d, ")", rm7.t("PackageRecyclerListFragmentArgs(title=", this.a, ", packageKey=", this.b, ", launchSource="));
    }
}
