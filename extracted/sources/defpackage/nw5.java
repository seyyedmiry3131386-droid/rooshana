package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class nw5 implements ai5 {
    public final String a;
    public final String b;
    public final boolean c;

    public nw5(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static final nw5 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", nw5.class, "id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("id");
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (bundle.containsKey("search")) {
            return new nw5(string, string2, bundle.getBoolean("search"));
        }
        throw new IllegalArgumentException("Required argument \"search\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw5)) {
            return false;
        }
        nw5 nw5Var = (nw5) obj;
        return js3.i(this.a, nw5Var.a) && js3.i(this.b, nw5Var.b) && this.c == nw5Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return t61.l(rm7.t("OtherHomeFragmentArgs(id=", this.a, ", title=", this.b, ", search="), this.c, ")");
    }
}
