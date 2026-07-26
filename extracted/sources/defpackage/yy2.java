package defpackage;

import org.koin.core.option.KoinOption;

/* JADX INFO: loaded from: classes3.dex */
public final class yy2 implements q79 {
    public static final av e = new av(26);
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public yy2(ps0 ps0Var, lf7 lf7Var, bp2 bp2Var) {
        this.b = ps0Var;
        this.c = lf7Var;
        this.d = bp2Var;
    }

    @Override // defpackage.q79
    public final k79 a(Class cls) {
        switch (this.a) {
            case 0:
                if (((f24) this.b).containsKey(cls)) {
                    throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
                }
                return ((q79) this.c).a(cls);
            default:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
    }

    @Override // defpackage.q79
    public final k79 b(Class cls, ta5 ta5Var) {
        switch (this.a) {
            case 0:
                return ((f24) this.b).containsKey(cls) ? ((z7) this.d).b(cls, ta5Var) : ((q79) this.c).b(cls, ta5Var);
            default:
                a(cls);
                throw null;
        }
    }

    @Override // defpackage.q79
    public final k79 c(ps0 ps0Var, ta5 ta5Var) {
        switch (this.a) {
            case 0:
                return rm7.b(this, ps0Var, ta5Var);
            default:
                ps0 ps0Var2 = (ps0) this.b;
                dh dhVar = new dh((bp2) this.d, ta5Var);
                lf7 lf7Var = (lf7) this.c;
                mz3 mz3Var = lf7Var.e;
                jt2 jt2Var = mz3Var.e;
                js3.p(jt2Var, "<this>");
                Object obj = jt2Var.a.get(KoinOption.a);
                if (obj == null) {
                    obj = null;
                }
                if (!js3.i(obj, Boolean.TRUE)) {
                    return (k79) lf7Var.b(ps0Var2, dhVar, null);
                }
                String str = ps0Var.d() + '-' + ct2.k();
                k79 k79Var = (k79) mz3Var.b(str, new yu8(ps0Var), null, s79.a).b(ps0Var2, dhVar, null);
                t79 t79Var = new t79(str, mz3Var);
                m79 m79Var = k79Var.a;
                if (m79Var == null) {
                    return k79Var;
                }
                m79Var.a(t79Var);
                return k79Var;
        }
    }

    public yy2(f24 f24Var, q79 q79Var, qq4 qq4Var) {
        this.b = f24Var;
        this.c = q79Var;
        this.d = new z7(1, qq4Var);
    }
}
