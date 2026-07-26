package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class ox2 {
    public static final ByteString d;
    public static final ByteString e;
    public static final ByteString f;
    public static final ByteString g;
    public static final ByteString h;
    public static final ByteString i;
    public final ByteString a;
    public final ByteString b;
    public final int c;

    static {
        ByteString byteString = ByteString.d;
        d = fv.w(":");
        e = fv.w(":status");
        f = fv.w(":method");
        g = fv.w(":path");
        h = fv.w(":scheme");
        i = fv.w(":authority");
    }

    public ox2(ByteString byteString, ByteString byteString2) {
        js3.p(byteString, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(byteString2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.a = byteString;
        this.b = byteString2;
        this.c = byteString2.e() + byteString.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox2)) {
            return false;
        }
        ox2 ox2Var = (ox2) obj;
        return js3.i(this.a, ox2Var.a) && js3.i(this.b, ox2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.s() + ": " + this.b.s();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ox2(String str, String str2) {
        this(fv.w(str), fv.w(str2));
        ByteString byteString = ByteString.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ox2(ByteString byteString, String str) {
        this(byteString, fv.w(str));
        js3.p(byteString, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ByteString byteString2 = ByteString.d;
    }
}
