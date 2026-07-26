package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class es5 extends j77 {
    public final dt4 b;
    public final long c;

    public es5(dt4 dt4Var, long j) {
        this.b = dt4Var;
        this.c = j;
    }

    @Override // defpackage.j77
    public final long d() {
        return this.c;
    }

    @Override // defpackage.j77
    public final ph0 d1() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // defpackage.j77
    public final dt4 g() {
        return this.b;
    }
}
