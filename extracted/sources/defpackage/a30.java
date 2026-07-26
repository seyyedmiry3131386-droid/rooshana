package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a30 {
    public final long a;
    public final long b;
    public final Set c;

    public a30(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a30) {
            a30 a30Var = (a30) obj;
            if (this.a == a30Var.a && this.b == a30Var.b && this.c.equals(a30Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
