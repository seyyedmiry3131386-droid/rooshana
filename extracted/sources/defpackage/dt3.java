package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dt3 implements ft3 {
    public final boolean a;

    public dt3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dt3) && this.a == ((dt3) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return bl4.x("InRecommendationTime(isEnding=", ")", this.a);
    }
}
