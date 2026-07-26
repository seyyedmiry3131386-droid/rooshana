package defpackage;

import com.google.android.datatransport.cct.internal.ClientInfo$ClientType;

/* JADX INFO: loaded from: classes.dex */
public final class i20 extends kt0 {
    public final f20 a;

    public i20(f20 f20Var) {
        this.a = f20Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kt0)) {
            return false;
        }
        kt0 kt0Var = (kt0) obj;
        Object obj2 = ClientInfo$ClientType.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((i20) kt0Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return ((ClientInfo$ClientType.a.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + ClientInfo$ClientType.a + ", androidClientInfo=" + this.a + "}";
    }
}
