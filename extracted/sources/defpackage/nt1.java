package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nt1 {
    public final String a;
    public final int b;

    public nt1(String str, int i) {
        js3.p(str, "packageName");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt1)) {
            return false;
        }
        nt1 nt1Var = (nt1) obj;
        return js3.i(this.a, nt1Var.a) && this.b == nt1Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "DownloadUriKey(packageName=" + this.a + ", versionCode=" + this.b + ")";
    }
}
