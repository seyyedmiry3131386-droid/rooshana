package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class ad6 {
    public static final zc6 Companion = new zc6();
    public final Integer a;
    public final Integer b;

    public /* synthetic */ ad6(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, yc6.a.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad6)) {
            return false;
        }
        ad6 ad6Var = (ad6) obj;
        return js3.i(this.a, ad6Var.a) && js3.i(this.b, ad6Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerConfigDto(minHeight=" + this.a + ", minBitrate=" + this.b + ")";
    }
}
