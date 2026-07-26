package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.pika.connect.ConnectionType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class p76 implements ai5 {
    public final ConnectionType a;

    public p76(ConnectionType connectionType) {
        js3.p(connectionType, "connectionType");
        this.a = connectionType;
    }

    public static final p76 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", p76.class, "connectionType")) {
            throw new IllegalArgumentException("Required argument \"connectionType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ConnectionType.class) && !Serializable.class.isAssignableFrom(ConnectionType.class)) {
            throw new UnsupportedOperationException(ConnectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ConnectionType connectionType = (ConnectionType) bundle.get("connectionType");
        if (connectionType != null) {
            return new p76(connectionType);
        }
        throw new IllegalArgumentException("Argument \"connectionType\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p76) && js3.i(this.a, ((p76) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PikaConnectFragmentArgs(connectionType=" + this.a + ")";
    }
}
