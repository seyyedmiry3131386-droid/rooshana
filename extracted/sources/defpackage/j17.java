package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class j17 implements ai5 {
    public final String a;

    public j17(String str) {
        js3.p(str, "refId");
        this.a = str;
    }

    public static final j17 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", j17.class, "refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("refId");
        if (string != null) {
            return new j17(string);
        }
        throw new IllegalArgumentException("Argument \"refId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j17) && js3.i(this.a, ((j17) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("ReelsHomeFragmentArgs(refId=", this.a, ")");
    }
}
