package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class fw5 implements ai5 {
    public final String a;

    public fw5(String str) {
        js3.p(str, "accountKey");
        this.a = str;
    }

    public static final fw5 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", fw5.class, "accountKey")) {
            throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("accountKey");
        if (string != null) {
            return new fw5(string);
        }
        throw new IllegalArgumentException("Argument \"accountKey\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fw5) && js3.i(this.a, ((fw5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("OtherAccountFollowingFragmentArgs(accountKey=", this.a, ")");
    }
}
