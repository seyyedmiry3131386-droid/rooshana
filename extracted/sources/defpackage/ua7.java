package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ua7 {
    public final va7 a;
    public final va7 b;
    public final Throwable c;

    public /* synthetic */ ua7(va7 va7Var, j11 j11Var, Throwable th, int i) {
        this(va7Var, (i & 2) != 0 ? null : j11Var, (i & 4) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua7)) {
            return false;
        }
        ua7 ua7Var = (ua7) obj;
        return js3.i(this.a, ua7Var.a) && js3.i(this.b, ua7Var.b) && js3.i(this.c, ua7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        va7 va7Var = this.b;
        int iHashCode2 = (iHashCode + (va7Var == null ? 0 : va7Var.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public ua7(va7 va7Var, va7 va7Var2, Throwable th) {
        this.a = va7Var;
        this.b = va7Var2;
        this.c = th;
    }
}
