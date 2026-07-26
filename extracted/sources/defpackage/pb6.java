package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pb6 implements qc6 {
    public final boolean a;

    public pb6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pb6) && this.a == ((pb6) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("SetPlayerIsReady(isReady=", ")", this.a);
    }
}
