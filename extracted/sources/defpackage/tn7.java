package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class tn7 implements ai5 {
    public final String a;
    public final String b;

    public tn7(String str, String str2) {
        js3.p(str2, "deviceName");
        this.a = str;
        this.b = str2;
    }

    public static final tn7 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", tn7.class, "packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("deviceName")) {
            throw new IllegalArgumentException("Required argument \"deviceName\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("deviceName");
        if (string2 != null) {
            return new tn7(string, string2);
        }
        throw new IllegalArgumentException("Argument \"deviceName\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn7)) {
            return false;
        }
        tn7 tn7Var = (tn7) obj;
        return js3.i(this.a, tn7Var.a) && js3.i(this.b, tn7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bl4.w("SendAppDetailFragmentArgs(packageName=", this.a, ", deviceName=", this.b, ")");
    }
}
