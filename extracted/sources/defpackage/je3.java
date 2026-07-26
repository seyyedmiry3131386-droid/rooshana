package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class je3 extends y97 {
    public final ke3 s;
    public final int t;

    public je3(ke3 ke3Var) {
        this.s = ke3Var;
        Integer num = ke3Var.b;
        int i = 10;
        if (num != null) {
            int iIntValue = num.intValue();
            if (300 <= iIntValue && iIntValue < 400) {
                i = 5;
            } else if (400 <= iIntValue && iIntValue < 500) {
                i = 0;
            }
        }
        this.t = i;
    }

    @Override // defpackage.y97
    public final int C() {
        return this.t;
    }

    @Override // defpackage.jf3
    public final Integer a() {
        return this.s.g;
    }

    @Override // defpackage.jf3
    public final int b() {
        return this.s.f;
    }

    @Override // defpackage.jf3
    public final String c() {
        return this.s.d;
    }

    @Override // defpackage.y97
    public final l32 d0() {
        ke3 ke3Var = this.s;
        ke3Var.getClass();
        return dw1.c(ke3Var);
    }

    @Override // defpackage.jf3
    public final int e() {
        return this.s.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je3) && js3.i(this.s, ((je3) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return "HttpError(errorData=" + this.s + ")";
    }
}
