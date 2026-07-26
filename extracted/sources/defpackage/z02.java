package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z02 extends y97 {
    public final i32 s = new i32(0, 60, -3, "EmptyBody");
    public final int t = 10;

    @Override // defpackage.y97
    public final int C() {
        return this.t;
    }

    @Override // defpackage.jf3
    public final Integer a() {
        return this.s.e;
    }

    @Override // defpackage.jf3
    public final int b() {
        return this.s.d;
    }

    @Override // defpackage.jf3
    public final String c() {
        this.s.getClass();
        return null;
    }

    @Override // defpackage.y97
    public final l32 d0() {
        i32 i32Var = this.s;
        i32Var.getClass();
        return dw1.c(i32Var);
    }

    @Override // defpackage.jf3
    public final int e() {
        return this.s.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z02)) {
            return false;
        }
        z02 z02Var = (z02) obj;
        return js3.i(this.s, z02Var.s) && this.t == z02Var.t;
    }

    public final int hashCode() {
        return (this.s.hashCode() * 31) + this.t;
    }

    public final String toString() {
        return "EmptyBody(errorData=" + this.s + ", errorWeight=" + this.t + ")";
    }
}
