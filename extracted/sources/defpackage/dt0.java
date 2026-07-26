package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dt0 {
    public final fe0 a;
    public final fe0 b;
    public final fe0 c;
    public final fe0 d;
    public final fe0 e;

    public dt0(fe0 fe0Var, fe0 fe0Var2, fe0 fe0Var3, fe0 fe0Var4, fe0 fe0Var5) {
        this.a = fe0Var;
        this.b = fe0Var2;
        this.c = fe0Var3;
        this.d = fe0Var4;
        this.e = fe0Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dt0.class != obj.getClass()) {
            return false;
        }
        dt0 dt0Var = (dt0) obj;
        return js3.i(this.a, dt0Var.a) && js3.i(this.b, dt0Var.b) && js3.i(this.c, dt0Var.c) && js3.i(this.d, dt0Var.d) && js3.i(this.e, dt0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + o40.q(this.d, o40.q(this.c, o40.q(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ClickableSurfaceBorder(border=" + this.a + ", focusedBorder=" + this.b + ", pressedBorder=" + this.c + ", disabledBorder=" + this.d + ", focusedDisabledBorder=" + this.e + ')';
    }
}
