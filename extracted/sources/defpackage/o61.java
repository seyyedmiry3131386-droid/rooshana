package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o61 extends p61 {
    public final int e;

    public o61(int i) {
        super(0, 0, i, i);
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o61) && this.e == ((o61) obj).e;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return bl4.q(this.e, "Top(radius=", ")");
    }
}
