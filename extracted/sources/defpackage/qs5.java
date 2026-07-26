package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qs5 extends ek5 {
    public final rs5 h;
    public boolean i;

    public qs5(rs5 rs5Var, ss5 ss5Var) {
        super(ss5Var, rs5Var.b, 0);
        this.h = rs5Var;
        this.i = true;
    }

    @Override // defpackage.ek5
    public final void c() {
        this.h.a();
    }

    @Override // defpackage.ek5
    public final void d() {
        this.h.b();
    }

    @Override // defpackage.ek5
    public final void e(ck5 ck5Var) {
        this.h.c(new f40(ck5Var));
    }

    @Override // defpackage.ek5
    public final void f(ck5 ck5Var) {
        js3.p(ck5Var, "event");
        this.h.d(new f40(ck5Var));
    }

    public final void j(boolean z) {
        this.i = z;
        i(z && this.h.b);
    }
}
