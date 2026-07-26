package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v28 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public v28(String str, String str2, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v28)) {
            return false;
        }
        v28 v28Var = (v28) obj;
        return js3.i(this.a, v28Var.a) && js3.i(this.b, v28Var.b) && this.c == v28Var.c && this.d == v28Var.d;
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        long j = this.c;
        long j2 = this.d;
        return ((iK + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SpeedControlData(status=", this.a, ", detailStatus=", this.b, ", timestamp=");
        sbT.append(this.c);
        sbT.append(", localSize=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
