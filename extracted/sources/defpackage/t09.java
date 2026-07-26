package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class t09 implements ai5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public t09(String str, String str2, String str3, String str4) {
        js3.p(str, "url");
        js3.p(str2, "launchSource");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static final t09 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", t09.class, "url")) {
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("url");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("launchSource")) {
            throw new IllegalArgumentException("Required argument \"launchSource\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("launchSource");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"launchSource\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("title");
        if (!bundle.containsKey("type")) {
            throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("type");
        if (string4 != null) {
            return new t09(string, string2, string3, string4);
        }
        throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t09)) {
            return false;
        }
        t09 t09Var = (t09) obj;
        return js3.i(this.a, t09Var.a) && js3.i(this.b, t09Var.b) && js3.i(this.c, t09Var.c) && js3.i(this.d, t09Var.d);
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iK + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return dw1.p(this.c, ", type=", this.d, ")", rm7.t("UrlRecyclerListFragmentArgs(url=", this.a, ", launchSource=", this.b, ", title="));
    }
}
