package defpackage;

import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z20 {
    public final wt0 a;
    public final HashMap b;

    public z20(wt0 wt0Var, HashMap map) {
        this.a = wt0Var;
        this.b = map;
    }

    public final long a(Priority priority, long j, int i) {
        long jA = j - this.a.a();
        a30 a30Var = (a30) this.b.get(priority);
        long j2 = a30Var.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) r12)))), jA), a30Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z20)) {
            return false;
        }
        z20 z20Var = (z20) obj;
        return this.a.equals(z20Var.a) && this.b.equals(z20Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
