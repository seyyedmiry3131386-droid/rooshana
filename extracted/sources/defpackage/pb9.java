package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pb9 extends tb9 {
    public final String a;
    public final long b;

    public pb9(long j, String str) {
        js3.p(str, "type");
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.tb9
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb9)) {
            return false;
        }
        pb9 pb9Var = (pb9) obj;
        return js3.i(this.a, pb9Var.a) && this.b == pb9Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Running(type=" + this.a + ", time=" + this.b + ")";
    }
}
