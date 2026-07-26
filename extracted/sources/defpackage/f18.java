package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f18 extends y97 {
    public final i32 s = new i32(0, 60, -5, "TimeOut");
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
        if (!(obj instanceof f18)) {
            return false;
        }
        f18 f18Var = (f18) obj;
        return js3.i(this.s, f18Var.s) && this.t == f18Var.t;
    }

    public final int hashCode() {
        return (this.s.hashCode() * 31) + this.t;
    }

    public final String toString() {
        return "SocketTimeOut(errorData=" + this.s + ", errorWeight=" + this.t + ")";
    }
}
