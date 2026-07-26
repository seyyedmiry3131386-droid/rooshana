package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class h78 implements ai5 {
    public final String a;
    public final String b;

    public h78(String str, String str2) {
        js3.p(str, "streamerKey");
        this.a = str;
        this.b = str2;
    }

    public static final h78 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", h78.class, "streamerKey")) {
            throw new IllegalArgumentException("Required argument \"streamerKey\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("streamerKey");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"streamerKey\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("refId")) {
            return new h78(string, bundle.getString("refId"));
        }
        throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h78)) {
            return false;
        }
        h78 h78Var = (h78) obj;
        return js3.i(this.a, h78Var.a) && js3.i(this.b, h78Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return bl4.w("StreamerProfileFragmentArgs(streamerKey=", this.a, ", refId=", this.b, ")");
    }
}
