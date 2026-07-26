package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class yd5 implements ai5 {
    public final int a;

    public yd5(int i) {
        this.a = i;
    }

    public static final yd5 fromBundle(Bundle bundle) {
        if (t61.B(bundle, "bundle", yd5.class, "selectedPage")) {
            return new yd5(bundle.getInt("selectedPage"));
        }
        throw new IllegalArgumentException("Required argument \"selectedPage\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd5) && this.a == ((yd5) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return bl4.q(this.a, "MyReviewsContentFragmentArgs(selectedPage=", ")");
    }
}
