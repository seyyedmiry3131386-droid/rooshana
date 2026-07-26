package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bu1 implements s61 {
    public final float a;

    public bu1(float f) {
        this.a = f;
    }

    @Override // defpackage.s61
    public final float a(long j, qj1 qj1Var) {
        return qj1Var.S(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu1) && au1.b(this.a, ((bu1) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
