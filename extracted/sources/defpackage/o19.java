package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class o19 implements ai5 {
    public final String a;
    public final String b;
    public final String c;

    public o19(String str, String str2, String str3) {
        js3.p(str, "accountKey");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final o19 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", o19.class, "accountKey")) {
            throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("accountKey");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"accountKey\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("nickname")) {
            throw new IllegalArgumentException("Required argument \"nickname\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("nickname");
        if (bundle.containsKey("refId")) {
            return new o19(string, string2, bundle.getString("refId"));
        }
        throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o19)) {
            return false;
        }
        o19 o19Var = (o19) obj;
        return js3.i(this.a, o19Var.a) && js3.i(this.b, o19Var.b) && js3.i(this.c, o19Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return dw1.s(rm7.t("UserProfileFragmentArgs(accountKey=", this.a, ", nickname=", this.b, ", refId="), this.c, ")");
    }
}
