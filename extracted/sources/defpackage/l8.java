package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class l8 {
    public static final k8 Companion = new k8();
    public final Integer a;
    public final p8 b;

    public /* synthetic */ l8(int i, Integer num, p8 p8Var) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, j8.a.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = p8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return js3.i(this.a, l8Var.a) && js3.i(this.b, l8Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "AdAppInfoDto(collapseDelay=" + this.a + ", application=" + this.b + ")";
    }
}
