package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ob6 implements qc6 {
    public final boolean a;

    public ob6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob6) && this.a == ((ob6) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("SetPlayerIsLoading(isLoading=", ")", this.a);
    }
}
