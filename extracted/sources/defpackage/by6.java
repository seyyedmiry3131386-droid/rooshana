package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class by6 {
    public static final ay6 Companion = new ay6();
    public final int a;

    public /* synthetic */ by6(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            wq2.S(i, 1, zx6.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by6) && this.a == ((by6) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return bl4.q(this.a, "RecommendationTimeDto(second=", ")");
    }
}
