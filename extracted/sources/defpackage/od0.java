package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class od0 implements ai5 {
    public final int a;

    public od0(int i) {
        this.a = i;
    }

    public static final od0 fromBundle(Bundle bundle) {
        if (t61.B(bundle, "bundle", od0.class, "selectedPage")) {
            return new od0(bundle.getInt("selectedPage"));
        }
        throw new IllegalArgumentException("Required argument \"selectedPage\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od0) && this.a == ((od0) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return bl4.q(this.a, "BookmarkContentFragmentArgs(selectedPage=", ")");
    }
}
