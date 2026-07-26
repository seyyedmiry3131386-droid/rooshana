package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h20 extends ta0 {
    public final ArrayList a;

    public h20(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ta0)) {
            return false;
        }
        return this.a.equals(((h20) ((ta0) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
