package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sm0 implements u61, v61 {
    public static final gv b = new gv(6);
    public static final sm0 c = new sm0(1);
    public static final sm0 d = new sm0(2);
    public final /* synthetic */ int a;

    public /* synthetic */ sm0(int i) {
        this.a = i;
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        switch (this.a) {
        }
        return qp2Var.invoke(obj, this);
    }

    @Override // defpackage.w61
    public final w61 P(v61 v61Var) {
        switch (this.a) {
        }
        return bt2.H(this, v61Var);
    }

    @Override // defpackage.u61
    public final v61 getKey() {
        switch (this.a) {
            case 0:
                return b;
            case 1:
                return c;
            default:
                return this;
        }
    }

    @Override // defpackage.w61
    public final w61 l0(w61 w61Var) {
        switch (this.a) {
        }
        return bt2.L(this, w61Var);
    }

    @Override // defpackage.w61
    public final u61 r0(v61 v61Var) {
        switch (this.a) {
        }
        return bt2.x(this, v61Var);
    }
}
