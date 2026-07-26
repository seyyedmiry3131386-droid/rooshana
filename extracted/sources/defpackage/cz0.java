package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cz0 extends ek5 {
    public final z45 h;
    public bp2 i;
    public bp2 j;
    public bp2 k;

    public cz0(ik5 ik5Var, z45 z45Var) {
        super(ik5Var, false, 0);
        this.h = z45Var;
        this.i = new v7(27);
        this.j = new v7(27);
        this.k = new v7(27);
    }

    @Override // defpackage.ek5
    public final void c() {
        this.h.invoke(this.d);
        this.j.invoke();
    }

    @Override // defpackage.ek5
    public final void d() {
        this.h.invoke(this.d);
        this.k.invoke();
    }

    @Override // defpackage.ek5
    public final void e(ck5 ck5Var) {
        this.h.invoke(this.d);
    }

    @Override // defpackage.ek5
    public final void f(ck5 ck5Var) {
        this.h.invoke(this.d);
    }

    @Override // defpackage.ek5
    public final void g() {
        this.h.invoke(this.d);
        this.i.invoke();
    }
}
