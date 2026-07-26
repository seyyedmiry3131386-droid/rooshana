package defpackage;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType;

/* JADX INFO: loaded from: classes.dex */
public final class u20 extends om5 {
    public final NetworkConnectionInfo$NetworkType a;
    public final NetworkConnectionInfo$MobileSubtype b;

    public u20(NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType, NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype) {
        this.a = networkConnectionInfo$NetworkType;
        this.b = networkConnectionInfo$MobileSubtype;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof om5) {
            om5 om5Var = (om5) obj;
            NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = this.a;
            if (networkConnectionInfo$NetworkType != null ? networkConnectionInfo$NetworkType.equals(((u20) om5Var).a) : ((u20) om5Var).a == null) {
                NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = this.b;
                if (networkConnectionInfo$MobileSubtype != null ? networkConnectionInfo$MobileSubtype.equals(((u20) om5Var).b) : ((u20) om5Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = this.a;
        int iHashCode = ((networkConnectionInfo$NetworkType == null ? 0 : networkConnectionInfo$NetworkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = this.b;
        return (networkConnectionInfo$MobileSubtype != null ? networkConnectionInfo$MobileSubtype.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
