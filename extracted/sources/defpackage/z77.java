package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class z77 {
    public static final y77 Companion = new y77();
    public final String a;
    public final String b;

    public /* synthetic */ z77(int i, String str, String str2) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, x77.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z77)) {
            return false;
        }
        z77 z77Var = (z77) obj;
        return js3.i(this.a, z77Var.a) && js3.i(this.b, z77Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return bl4.w("RestrictionInfoButtonDto(actionText=", this.a, ", action=", this.b, ")");
    }
}
