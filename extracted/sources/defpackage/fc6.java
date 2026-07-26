package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fc6 implements qc6 {
    public final s00 a;

    public fc6(s00 s00Var) {
        this.a = s00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc6) && js3.i(this.a, ((fc6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateAudioTrack(audioTrack=" + this.a + ")";
    }
}
