package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class t71 implements ai5 {
    public final Uri a;
    public final String b;
    public final String c;

    public t71(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public static final t71 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", t71.class, "uri")) {
            throw new IllegalArgumentException("Required argument \"uri\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Uri.class) && !Serializable.class.isAssignableFrom(Uri.class)) {
            throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Uri uri = (Uri) bundle.get("uri");
        if (!bundle.containsKey("cropMode")) {
            throw new IllegalArgumentException("Required argument \"cropMode\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("cropMode");
        if (bundle.containsKey("subscriberId")) {
            return new t71(uri, string, bundle.getString("subscriberId"));
        }
        throw new IllegalArgumentException("Required argument \"subscriberId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t71)) {
            return false;
        }
        t71 t71Var = (t71) obj;
        return js3.i(this.a, t71Var.a) && js3.i(this.b, t71Var.b) && js3.i(this.c, t71Var.c);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CropContentFragmentArgs(uri=");
        sb.append(this.a);
        sb.append(", cropMode=");
        sb.append(this.b);
        sb.append(", subscriberId=");
        return dw1.s(sb, this.c, ")");
    }
}
