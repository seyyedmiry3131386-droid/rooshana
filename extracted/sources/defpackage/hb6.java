package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hb6 implements qc6 {
    public final String a;

    public hb6(String str) {
        js3.p(str, "playId");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb6) && js3.i(this.a, ((hb6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return o40.y("ChangeEpisode(playId=", this.a, ")");
    }
}
