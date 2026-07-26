package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ij7 implements ai5 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public ij7(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public static final ij7 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", ij7.class, "query")) {
            throw new IllegalArgumentException("Required argument \"query\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("query");
        if (!bundle.containsKey("querySource")) {
            throw new IllegalArgumentException("Required argument \"querySource\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("querySource");
        if (!bundle.containsKey("tab")) {
            throw new IllegalArgumentException("Required argument \"tab\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("tab");
        if (bundle.containsKey("index")) {
            return new ij7(string, string2, string3, bundle.getInt("index"));
        }
        throw new IllegalArgumentException("Required argument \"index\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij7)) {
            return false;
        }
        ij7 ij7Var = (ij7) obj;
        return js3.i(this.a, ij7Var.a) && js3.i(this.b, ij7Var.b) && js3.i(this.c, ij7Var.c) && this.d == ij7Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SearchResultFragmentArgs(query=", this.a, ", querySource=", this.b, ", tab=");
        sbT.append(this.c);
        sbT.append(", index=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
