package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r48 implements x39 {
    public final x39 a;
    public final long b;

    public r48(x39 x39Var, long j) {
        this.a = x39Var;
        this.b = j;
    }

    @Override // defpackage.x39
    public final boolean a() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r48)) {
            return false;
        }
        r48 r48Var = (r48) obj;
        return r48Var.b == this.b && js3.i(r48Var.a, this.a);
    }

    @Override // defpackage.x39
    public final dl h(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        long j2 = this.b;
        return j < j2 ? dlVar3 : this.a.h(j - j2, dlVar, dlVar2, dlVar3);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.x39
    public final dl q(long j, dl dlVar, dl dlVar2, dl dlVar3) {
        long j2 = this.b;
        return j < j2 ? dlVar : this.a.q(j - j2, dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.x39
    public final dl r(dl dlVar, dl dlVar2, dl dlVar3) {
        return h(s(dlVar, dlVar2, dlVar3), dlVar, dlVar2, dlVar3);
    }

    @Override // defpackage.x39
    public final long s(dl dlVar, dl dlVar2, dl dlVar3) {
        return this.a.s(dlVar, dlVar2, dlVar3) + this.b;
    }
}
