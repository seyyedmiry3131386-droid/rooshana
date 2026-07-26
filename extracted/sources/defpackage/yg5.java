package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class yg5 implements ai5 {
    public final String a;
    public final String b;
    public final int c;

    public yg5(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public static final yg5 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", yg5.class, "queryString")) {
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
        if (bundle.containsKey("index")) {
            return new yg5(string, string2, bundle.getInt("index"));
        }
        throw new IllegalArgumentException("Required argument \"index\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg5)) {
            return false;
        }
        yg5 yg5Var = (yg5) obj;
        return js3.i(this.a, yg5Var.a) && js3.i(this.b, yg5Var.b) && this.c == yg5Var.c;
    }

    public final int hashCode() {
        return rm7.k(this.b, this.a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        return dw1.k(this.c, ")", rm7.t("MynetSearchFragmentArgs(queryString=", this.a, ", querySource=", this.b, ", index="));
    }
}
