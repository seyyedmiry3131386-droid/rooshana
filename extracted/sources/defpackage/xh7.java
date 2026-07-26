package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class xh7 implements ai5 {
    public final String a;
    public final String b;

    public xh7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static final xh7 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", xh7.class, "queryString")) {
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
        if (string2 != null) {
            return new xh7(string, string2);
        }
        throw new IllegalArgumentException("Argument \"querySource\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh7)) {
            return false;
        }
        xh7 xh7Var = (xh7) obj;
        return js3.i(this.a, xh7Var.a) && js3.i(this.b, xh7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bl4.w("SearchContentFragmentArgs(queryString=", this.a, ", querySource=", this.b, ")");
    }
}
