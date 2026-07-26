package defpackage;

import com.google.android.datatransport.Priority;

/* JADX INFO: loaded from: classes.dex */
public final class k20 {
    public final hv4 a;
    public final y20 b;

    public k20(hv4 hv4Var, y20 y20Var) {
        this.a = hv4Var;
        this.b = y20Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k20)) {
            return false;
        }
        k20 k20Var = (k20) obj;
        y20 y20Var = k20Var.b;
        if (!this.a.equals(k20Var.a)) {
            return false;
        }
        Object obj2 = Priority.a;
        return obj2.equals(obj2) && this.b.equals(y20Var);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ Priority.a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + Priority.a + ", productData=" + this.b + "}";
    }
}
