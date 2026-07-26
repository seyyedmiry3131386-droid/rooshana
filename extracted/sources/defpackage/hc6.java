package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hc6 implements qc6 {
    public final uo6 a;

    public hc6(uo6 uo6Var) {
        this.a = uo6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc6) && js3.i(this.a, ((hc6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateQualityTrack(qualityTrack=" + this.a + ")";
    }
}
