package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wd7 implements td7 {
    public final /* synthetic */ qp2 a;
    public final /* synthetic */ dp2 b;

    public wd7(dp2 dp2Var, qp2 qp2Var) {
        this.a = qp2Var;
        this.b = dp2Var;
    }

    @Override // defpackage.td7
    public final Object c(Object obj) {
        return this.b.invoke(obj);
    }

    @Override // defpackage.td7
    public final Object h(ad7 ad7Var, Object obj) {
        return this.a.invoke(ad7Var, obj);
    }
}
