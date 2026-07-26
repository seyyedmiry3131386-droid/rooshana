package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.activity.IbexData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class f45 implements ai5 {
    public final IbexData a;

    public f45(IbexData ibexData) {
        this.a = ibexData;
    }

    public static final f45 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", f45.class, "ibexData")) {
            throw new IllegalArgumentException("Required argument \"ibexData\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(IbexData.class) || Serializable.class.isAssignableFrom(IbexData.class)) {
            return new f45((IbexData) bundle.get("ibexData"));
        }
        throw new UnsupportedOperationException(IbexData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f45) && js3.i(this.a, ((f45) obj).a);
    }

    public final int hashCode() {
        IbexData ibexData = this.a;
        if (ibexData == null) {
            return 0;
        }
        return ibexData.hashCode();
    }

    public final String toString() {
        return "MovieIbexFragmentArgs(ibexData=" + this.a + ")";
    }
}
