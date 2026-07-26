package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ye6 implements kj5 {
    public final p61 a;
    public final xc6 b;

    public ye6(p61 p61Var, xc6 xc6Var) {
        js3.p(xc6Var, "playerConfig");
        this.a = p61Var;
        this.b = xc6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye6)) {
            return false;
        }
        ye6 ye6Var = (ye6) obj;
        return js3.i(this.a, ye6Var.a) && js3.i(this.b, ye6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerErrorDetailBottomSheetNavKey(playerErrorDetail=" + this.a + ", playerConfig=" + this.b + ")";
    }
}
