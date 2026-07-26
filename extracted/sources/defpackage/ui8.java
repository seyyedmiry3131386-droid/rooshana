package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ui8 {
    public final c28 a;
    public final c28 b;
    public final c28 c;
    public final c28 d;

    public ui8(c28 c28Var, c28 c28Var2, c28 c28Var3, c28 c28Var4) {
        this.a = c28Var;
        this.b = c28Var2;
        this.c = c28Var3;
        this.d = c28Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ui8)) {
            return false;
        }
        ui8 ui8Var = (ui8) obj;
        return js3.i(this.a, ui8Var.a) && js3.i(this.b, ui8Var.b) && js3.i(this.c, ui8Var.c) && js3.i(this.d, ui8Var.d);
    }

    public final int hashCode() {
        c28 c28Var = this.a;
        int iHashCode = (c28Var != null ? c28Var.hashCode() : 0) * 31;
        c28 c28Var2 = this.b;
        int iHashCode2 = (iHashCode + (c28Var2 != null ? c28Var2.hashCode() : 0)) * 31;
        c28 c28Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (c28Var3 != null ? c28Var3.hashCode() : 0)) * 31;
        c28 c28Var4 = this.d;
        return iHashCode3 + (c28Var4 != null ? c28Var4.hashCode() : 0);
    }
}
