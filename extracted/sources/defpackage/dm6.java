package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class dm6 {
    public static final cm6 Companion = new cm6();
    public final String a;
    public final int b;

    public /* synthetic */ dm6(String str, int i, int i2) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, bm6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm6)) {
            return false;
        }
        dm6 dm6Var = (dm6) obj;
        return js3.i(this.a, dm6Var.a) && this.b == dm6Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ProgressCallbackDto(url=" + this.a + ", second=" + this.b + ")";
    }
}
