package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rb6 implements qc6 {
    public final boolean a;

    public rb6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb6) && this.a == ((rb6) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("UpdateLockState(isLocked=", ")", this.a);
    }
}
