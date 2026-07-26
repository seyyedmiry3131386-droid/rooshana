package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j61 extends p61 {
    public final int e;

    public j61(int i) {
        super(i, i, i, i);
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j61) && this.e == ((j61) obj).e;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return bl4.q(this.e, "All(radius=", ")");
    }
}
