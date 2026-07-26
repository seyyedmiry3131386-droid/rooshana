package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ic6 implements qc6 {
    public final db8 a;

    public ic6(db8 db8Var) {
        this.a = db8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic6) && js3.i(this.a, ((ic6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateSubtitleTrack(subtitleTrack=" + this.a + ")";
    }
}
