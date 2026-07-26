package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ws {
    public static final ws e = new ws(0, 0, 0);
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ws(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j + j3 + j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws)) {
            return false;
        }
        ws wsVar = (ws) obj;
        return this.a == wsVar.a && this.b == wsVar.b && this.c == wsVar.c;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        return ((i + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) 0);
    }

    public final String toString() {
        StringBuilder sbS = rm7.s(this.a, "AppSize(codeBytes=", ", cacheBytes=");
        sbS.append(this.b);
        sbS.append(", dataBytes=");
        sbS.append(this.c);
        sbS.append(", externalStorageBytes=0)");
        return sbS.toString();
    }
}
