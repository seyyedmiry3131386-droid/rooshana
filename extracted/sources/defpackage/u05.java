package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class u05 {
    public static final t05 Companion = new t05();
    public final int a;
    public final int b;

    public /* synthetic */ u05(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, s05.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u05)) {
            return false;
        }
        u05 u05Var = (u05) obj;
        return this.a == u05Var.a && this.b == u05Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "MovieCreditDto(startTime=" + this.a + ", endTime=" + this.b + ")";
    }
}
