package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ht0 {
    public final xr7 a;
    public final xr7 b;
    public final xr7 c;
    public final xr7 d;
    public final xr7 e;

    public ht0(xr7 xr7Var, xr7 xr7Var2, xr7 xr7Var3, xr7 xr7Var4, xr7 xr7Var5) {
        this.a = xr7Var;
        this.b = xr7Var2;
        this.c = xr7Var3;
        this.d = xr7Var4;
        this.e = xr7Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ht0.class != obj.getClass()) {
            return false;
        }
        ht0 ht0Var = (ht0) obj;
        return js3.i(this.a, ht0Var.a) && js3.i(this.b, ht0Var.b) && js3.i(this.c, ht0Var.c) && js3.i(this.d, ht0Var.d) && js3.i(this.e, ht0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rm7.j(this.d, rm7.j(this.c, rm7.j(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ClickableSurfaceShape(shape=" + this.a + ", focusedShape=" + this.b + ", pressedShape=" + this.c + ", disabledShape=" + this.d + ", focusedDisabledShape=" + this.e + ')';
    }
}
