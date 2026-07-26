package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class eq0 implements ai5 {
    public final String a;
    public final String b;
    public final boolean c;

    public eq0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static final eq0 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", eq0.class, "packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (bundle.containsKey("appIcon")) {
            return new eq0(string, bundle.getString("appIcon"), bundle.containsKey("stopVpn") ? bundle.getBoolean("stopVpn") : false);
        }
        throw new IllegalArgumentException("Required argument \"appIcon\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq0)) {
            return false;
        }
        eq0 eq0Var = (eq0) obj;
        return js3.i(this.a, eq0Var.a) && js3.i(this.b, eq0Var.b) && this.c == eq0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return t61.l(rm7.t("CheetahFragmentArgs(packageName=", this.a, ", appIcon=", this.b, ", stopVpn="), this.c, ")");
    }
}
