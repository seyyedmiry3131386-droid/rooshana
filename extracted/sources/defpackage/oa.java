package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oa {
    public final String a;
    public final boolean b;

    public oa(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        return js3.i(this.a, oaVar.a) && this.b == oaVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "AdId: adId=" + this.a + ", isLimitAdTrackingEnabled=" + this.b;
    }
}
