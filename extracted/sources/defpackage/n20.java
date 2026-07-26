package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n20 {
    public final String a;
    public final ArrayList b;

    public n20(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n20)) {
            return false;
        }
        n20 n20Var = (n20) obj;
        return this.a.equals(n20Var.a) && this.b.equals(n20Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
