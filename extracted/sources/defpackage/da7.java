package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class da7 implements ai5 {
    public final boolean a;

    public da7(boolean z) {
        this.a = z;
    }

    public static final da7 fromBundle(Bundle bundle) {
        return new da7(t61.B(bundle, "bundle", da7.class, "updateAll") ? bundle.getBoolean("updateAll") : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da7) && this.a == ((da7) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("RootUpdateFragmentArgs(updateAll=", ")", this.a);
    }
}
