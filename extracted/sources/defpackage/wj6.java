package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wj6 extends tu0 {
    public final vj6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj6(px3 px3Var) {
        super(px3Var);
        js3.p(px3Var, "primitiveSerializer");
        this.b = new vj6(px3Var.getDescriptor());
    }

    @Override // defpackage.p
    public final Object a() {
        return (uj6) g(j());
    }

    @Override // defpackage.p
    public final int b(Object obj) {
        uj6 uj6Var = (uj6) obj;
        js3.p(uj6Var, "<this>");
        return uj6Var.d();
    }

    @Override // defpackage.p
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.p, defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return e(cc1Var);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.p
    public final Object h(Object obj) {
        uj6 uj6Var = (uj6) obj;
        js3.p(uj6Var, "<this>");
        return uj6Var.a();
    }

    @Override // defpackage.tu0
    public final void i(int i, Object obj, Object obj2) {
        js3.p((uj6) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(uz0 uz0Var, Object obj, int i);

    @Override // defpackage.tu0, defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        int iD = d(obj);
        vj6 vj6Var = this.b;
        uz0 uz0VarD = q12Var.D(vj6Var, iD);
        k(uz0VarD, obj, iD);
        uz0VarD.a(vj6Var);
    }
}
