package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class wp3 implements ai5 {
    public final String a;

    public wp3(String str) {
        js3.p(str, "deviceName");
        this.a = str;
    }

    public static final wp3 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", wp3.class, "deviceName")) {
            throw new IllegalArgumentException("Required argument \"deviceName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("deviceName");
        if (string != null) {
            return new wp3(string);
        }
        throw new IllegalArgumentException("Argument \"deviceName\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp3) && js3.i(this.a, ((wp3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("InstalledAppsRecyclerListFragmentArgs(deviceName=", this.a, ")");
    }
}
