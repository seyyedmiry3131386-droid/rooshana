package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class wi7 implements ai5 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public wi7(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public static final wi7 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", wi7.class, "queryString")) {
            throw new IllegalArgumentException("Required argument \"queryString\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("queryString");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"queryString\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("querySource")) {
            throw new IllegalArgumentException("Required argument \"querySource\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("querySource");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"querySource\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("tab")) {
            throw new IllegalArgumentException("Required argument \"tab\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("tab");
        if (bundle.containsKey("index")) {
            return new wi7(string, string2, string3, bundle.getInt("index"));
        }
        throw new IllegalArgumentException("Required argument \"index\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi7)) {
            return false;
        }
        wi7 wi7Var = (wi7) obj;
        return js3.i(this.a, wi7Var.a) && js3.i(this.b, wi7Var.b) && js3.i(this.c, wi7Var.c) && this.d == wi7Var.d;
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return ((iK + (str == null ? 0 : str.hashCode())) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SearchMovieFragmentArgs(queryString=", this.a, ", querySource=", this.b, ", tab=");
        sbT.append(this.c);
        sbT.append(", index=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
