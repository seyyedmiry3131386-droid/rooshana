package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p32 implements ti3 {
    public final wh3 a;
    public final pi3 b;
    public final Throwable c;

    public p32(wh3 wh3Var, pi3 pi3Var, Throwable th) {
        this.a = wh3Var;
        this.b = pi3Var;
        this.c = th;
    }

    @Override // defpackage.ti3
    public final pi3 a() {
        return this.b;
    }

    @Override // defpackage.ti3
    public final wh3 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p32)) {
            return false;
        }
        p32 p32Var = (p32) obj;
        return js3.i(this.a, p32Var.a) && js3.i(this.b, p32Var.b) && js3.i(this.c, p32Var.c);
    }

    public final int hashCode() {
        wh3 wh3Var = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((wh3Var == null ? 0 : wh3Var.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ')';
    }
}
