package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class g19 implements ai5 {
    public final String a;
    public final String b;

    public g19(String str, String str2) {
        js3.p(str, "id");
        this.a = str;
        this.b = str2;
    }

    public static final g19 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", g19.class, "id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("id");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("title")) {
            return new g19(string, bundle.getString("title"));
        }
        throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g19)) {
            return false;
        }
        g19 g19Var = (g19) obj;
        return js3.i(this.a, g19Var.a) && js3.i(this.b, g19Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return bl4.w("UserListRecyclerListFragmentArgs(id=", this.a, ", title=", this.b, ")");
    }
}
