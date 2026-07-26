package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rv0 implements bi8 {
    public final long a;

    public rv0(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        sn3.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.bi8
    public final float a() {
        return zu0.d(this.a);
    }

    @Override // defpackage.bi8
    public final long b() {
        return this.a;
    }

    @Override // defpackage.bi8
    public final /* synthetic */ bi8 c(bi8 bi8Var) {
        return rm7.d(this, bi8Var);
    }

    @Override // defpackage.bi8
    public final bi8 d(bp2 bp2Var) {
        return !equals(ai8.a) ? this : (bi8) bp2Var.invoke();
    }

    @Override // defpackage.bi8
    public final ch0 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv0) && zu0.c(this.a, ((rv0) obj).a);
    }

    public final int hashCode() {
        int i = zu0.i;
        return tw8.a(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) zu0.i(this.a)) + ')';
    }
}
