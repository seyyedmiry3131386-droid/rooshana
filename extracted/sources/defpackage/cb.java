package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cb {
    public final boolean a;
    public final boolean b;

    public cb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return this.a == cbVar.a && this.b == cbVar.b;
    }

    public final int hashCode() {
        return ((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "AdPlayerControllerState(isLoading=" + this.a + ", isErrorOccurred=" + this.b + ")";
    }
}
