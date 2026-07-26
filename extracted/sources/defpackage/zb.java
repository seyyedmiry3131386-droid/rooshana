package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zb {
    public final long a;
    public final long b;

    public zb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj;
        return this.a == zbVar.a && this.b == zbVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
