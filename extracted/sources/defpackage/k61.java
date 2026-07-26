package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k61 extends p61 {
    public final int e;

    public k61(int i) {
        super(i, i, 0, 0);
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k61) && this.e == ((k61) obj).e;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return bl4.q(this.e, "Bottom(radius=", ")");
    }
}
