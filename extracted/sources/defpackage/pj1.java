package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pj1 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj1) && this.a == ((pj1) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return dw1.q(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
