package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class xl2 implements q79 {
    public static xl2 b;
    public final /* synthetic */ int a;

    public /* synthetic */ xl2(int i) {
        this.a = i;
    }

    @Override // defpackage.q79
    public k79 a(Class cls) {
        switch (this.a) {
            case 0:
                return new yl2(true);
            case 1:
                return new va4();
            case 2:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            default:
                return m91.k(cls);
        }
    }

    @Override // defpackage.q79
    public k79 b(Class cls, ta5 ta5Var) {
        switch (this.a) {
            case 0:
                return a(cls);
            case 1:
                return a(cls);
            case 2:
                a(cls);
                throw null;
            default:
                return a(cls);
        }
    }

    @Override // defpackage.q79
    public final k79 c(ps0 ps0Var, ta5 ta5Var) {
        switch (this.a) {
            case 0:
                return rm7.b(this, ps0Var, ta5Var);
            case 1:
                return rm7.b(this, ps0Var, ta5Var);
            case 2:
                return new nd7();
            default:
                return b(yh0.u(ps0Var), ta5Var);
        }
    }
}
