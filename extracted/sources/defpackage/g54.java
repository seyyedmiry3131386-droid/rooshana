package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class g54 implements ai5 {
    public final String a;
    public final String b;
    public final String c;

    public g54(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final g54 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", g54.class, "accountKey")) {
            throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("accountKey");
        if (!bundle.containsKey("avatarUrl")) {
            throw new IllegalArgumentException("Required argument \"avatarUrl\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("avatarUrl");
        if (bundle.containsKey("nickName")) {
            return new g54(string, string2, bundle.getString("nickName"));
        }
        throw new IllegalArgumentException("Required argument \"nickName\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g54)) {
            return false;
        }
        g54 g54Var = (g54) obj;
        return js3.i(this.a, g54Var.a) && js3.i(this.b, g54Var.b) && js3.i(this.c, g54Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return dw1.s(rm7.t("LevelFragmentArgs(accountKey=", this.a, ", avatarUrl=", this.b, ", nickName="), this.c, ")");
    }
}
