package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class p4 implements ai5 {
    public final String a;

    public p4(String str) {
        js3.p(str, "accountKey");
        this.a = str;
    }

    public static final p4 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", p4.class, "accountKey")) {
            throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("accountKey");
        if (string != null) {
            return new p4(string);
        }
        throw new IllegalArgumentException("Argument \"accountKey\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4) && js3.i(this.a, ((p4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("AccountFollowingFragmentArgs(accountKey=", this.a, ")");
    }
}
