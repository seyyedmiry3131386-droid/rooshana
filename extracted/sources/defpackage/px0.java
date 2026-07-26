package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class px0 {
    public final Object a;
    public final jm0 b;
    public final rp2 c;
    public final Object d;
    public final Throwable e;

    public px0(Object obj, jm0 jm0Var, rp2 rp2Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = jm0Var;
        this.c = rp2Var;
        this.d = obj2;
        this.e = th;
    }

    public static px0 a(px0 px0Var, jm0 jm0Var, Throwable th, int i) {
        Object obj = px0Var.a;
        if ((i & 2) != 0) {
            jm0Var = px0Var.b;
        }
        jm0 jm0Var2 = jm0Var;
        rp2 rp2Var = px0Var.c;
        Object obj2 = px0Var.d;
        if ((i & 16) != 0) {
            th = px0Var.e;
        }
        return new px0(obj, jm0Var2, rp2Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px0)) {
            return false;
        }
        px0 px0Var = (px0) obj;
        return js3.i(this.a, px0Var.a) && js3.i(this.b, px0Var.b) && js3.i(this.c, px0Var.c) && js3.i(this.d, px0Var.d) && js3.i(this.e, px0Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        jm0 jm0Var = this.b;
        int iHashCode2 = (iHashCode + (jm0Var == null ? 0 : jm0Var.hashCode())) * 31;
        rp2 rp2Var = this.c;
        int iHashCode3 = (iHashCode2 + (rp2Var == null ? 0 : rp2Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ px0(Object obj, jm0 jm0Var, rp2 rp2Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : jm0Var, (i & 4) != 0 ? null : rp2Var, (Object) null, (i & 16) != 0 ? null : th);
    }
}
