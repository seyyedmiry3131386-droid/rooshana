package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ow5 implements ai5 {
    public final String a;
    public final String b;

    public ow5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static final ow5 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", ow5.class, "title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (!bundle.containsKey("layoutKey")) {
            throw new IllegalArgumentException("Required argument \"layoutKey\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("layoutKey");
        if (string2 != null) {
            return new ow5(string, string2);
        }
        throw new IllegalArgumentException("Argument \"layoutKey\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow5)) {
            return false;
        }
        ow5 ow5Var = (ow5) obj;
        return js3.i(this.a, ow5Var.a) && js3.i(this.b, ow5Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return bl4.w("OtherHomeFragmentArgs(title=", this.a, ", layoutKey=", this.b, ")");
    }
}
