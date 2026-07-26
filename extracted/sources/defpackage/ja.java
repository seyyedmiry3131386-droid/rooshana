package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ja implements ai5 {
    public final boolean a;

    public ja(boolean z) {
        this.a = z;
    }

    public static final ja fromBundle(Bundle bundle) {
        return new ja(t61.B(bundle, "bundle", ja.class, "stopVpn") ? bundle.getBoolean("stopVpn") : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja) && this.a == ((ja) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("AdGuardFragmentArgs(stopVpn=", ")", this.a);
    }
}
