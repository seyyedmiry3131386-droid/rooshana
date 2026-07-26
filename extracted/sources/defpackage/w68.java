package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class w68 implements ai5 {
    public final String a;

    public w68(String str) {
        js3.p(str, "streamerKey");
        this.a = str;
    }

    public static final w68 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", w68.class, "streamerKey")) {
            throw new IllegalArgumentException("Required argument \"streamerKey\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("streamerKey");
        if (string != null) {
            return new w68(string);
        }
        throw new IllegalArgumentException("Argument \"streamerKey\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w68) && js3.i(this.a, ((w68) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("StreamerMoviesFragmentArgs(streamerKey=", this.a, ")");
    }
}
