package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ft0 {
    public final xt2 a;
    public final xt2 b;
    public final xt2 c;

    public ft0(xt2 xt2Var, xt2 xt2Var2, xt2 xt2Var3) {
        this.a = xt2Var;
        this.b = xt2Var2;
        this.c = xt2Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ft0.class != obj.getClass()) {
            return false;
        }
        ft0 ft0Var = (ft0) obj;
        return js3.i(this.a, ft0Var.a) && js3.i(this.b, ft0Var.b) && js3.i(this.c, ft0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ClickableSurfaceGlow(glow=" + this.a + ", focusedGlow=" + this.b + ", pressedGlow=" + this.c + ')';
    }
}
