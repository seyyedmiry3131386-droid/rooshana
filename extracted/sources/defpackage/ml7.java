package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ml7 {
    public static final ml7 c = new ml7(0, 0);
    public final long a;
    public final long b;

    public ml7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ml7.class == obj.getClass()) {
            ml7 ml7Var = (ml7) obj;
            if (this.a == ml7Var.a && this.b == ml7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return bl4.s(this.b, "]", sb);
    }
}
