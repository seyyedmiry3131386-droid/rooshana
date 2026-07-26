package defpackage;

import com.google.android.datatransport.runtime.backends.BackendResponse$Status;

/* JADX INFO: loaded from: classes.dex */
public final class g20 {
    public final BackendResponse$Status a;
    public final long b;

    public g20(BackendResponse$Status backendResponse$Status, long j) {
        this.a = backendResponse$Status;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g20) {
            g20 g20Var = (g20) obj;
            if (this.a.equals(g20Var.a) && this.b == g20Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.a);
        sb.append(", nextRequestWaitMillis=");
        return bl4.s(this.b, "}", sb);
    }
}
