package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ub6 implements qc6 {
    public final boolean a;

    public ub6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ub6) && this.a == ((ub6) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("UpdateVisibility(isVisible=", ")", this.a);
    }
}
