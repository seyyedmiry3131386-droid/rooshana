package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class re4 extends pe4 {
    public static final re4 d = new re4(1, 0);

    public re4(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // defpackage.pe4
    public final boolean equals(Object obj) {
        if (!(obj instanceof re4)) {
            return false;
        }
        if (isEmpty() && ((re4) obj).isEmpty()) {
            return true;
        }
        re4 re4Var = (re4) obj;
        return this.a == re4Var.a && this.b == re4Var.b;
    }

    @Override // defpackage.pe4
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // defpackage.pe4
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.pe4
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
