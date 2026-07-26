package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class wh7 implements ai5 {
    public final String a;
    public final String b;

    public wh7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static final wh7 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", wh7.class, "queryString")) {
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
            return new wh7(string, string2);
        }
        throw new IllegalArgumentException("Argument \"querySource\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh7)) {
            return false;
        }
        wh7 wh7Var = (wh7) obj;
        return js3.i(this.a, wh7Var.a) && js3.i(this.b, wh7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bl4.w("SearchContentFragmentArgs(queryString=", this.a, ", querySource=", this.b, ")");
    }
}
