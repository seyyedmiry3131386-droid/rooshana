package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rq5 extends pa5 {
    public final Object a;
    public int b;
    public final /* synthetic */ sq5 c;

    public rq5(sq5 sq5Var, int i) {
        this.c = sq5Var;
        this.a = sq5Var.a[i];
        this.b = i;
    }

    @Override // defpackage.pa5
    public final int a() {
        int i = this.b;
        Object obj = this.a;
        sq5 sq5Var = this.c;
        if (i == -1 || i >= sq5Var.c || !s7.l(obj, sq5Var.a[i])) {
            this.b = sq5Var.e(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return sq5Var.b[i2];
    }

    @Override // defpackage.pa5
    public final Object b() {
        return this.a;
    }
}
