package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oj1 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj1) && this.a == ((oj1) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return dw1.q(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
