package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rp3 {
    public final String a;
    public final int b;
    public final boolean c;
    public final long d;

    public rp3(String str, int i, boolean z, long j) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp3)) {
            return false;
        }
        rp3 rp3Var = (rp3) obj;
        return js3.i(this.a, rp3Var.a) && this.b == rp3Var.b && this.c == rp3Var.c && this.d == rp3Var.d;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        int i = this.c ? 1231 : 1237;
        long j = this.d;
        return ((iHashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbB = o40.B(this.b, "InstalledAppModel(packageName=", this.a, ", versionCode=", ", isDisabled=");
        sbB.append(this.c);
        sbB.append(", installTime=");
        sbB.append(this.d);
        sbB.append(")");
        return sbB.toString();
    }
}
