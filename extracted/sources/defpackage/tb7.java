package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tb7 extends y97 {
    public final i32 s = new i32(ss6.network_ssl_handshake_error_message, 52, -7, "SSLHandshake");

    @Override // defpackage.y97
    public final int C() {
        return 0;
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
        return (obj instanceof tb7) && js3.i(this.s, ((tb7) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode() * 31;
    }

    public final String toString() {
        return "SSLHandshake(errorData=" + this.s + ", errorWeight=0)";
    }
}
