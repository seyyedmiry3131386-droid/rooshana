package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sb6 implements qc6 {
    public final boolean a;

    public sb6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb6) && this.a == ((sb6) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("UpdateNextEpisodeLoadingState(isLoading=", ")", this.a);
    }
}
