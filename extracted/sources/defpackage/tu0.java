package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tu0 extends p {
    public final px3 a;

    public tu0(px3 px3Var) {
        this.a = px3Var;
    }

    @Override // defpackage.p
    public void f(tz0 tz0Var, int i, Object obj) {
        i(i, obj, tz0Var.s(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // defpackage.px3
    public void serialize(q12 q12Var, Object obj) {
        int iD = d(obj);
        no7 descriptor = getDescriptor();
        uz0 uz0VarD = q12Var.D(descriptor, iD);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            uz0VarD.o(getDescriptor(), i, this.a, itC.next());
        }
        uz0VarD.a(descriptor);
    }
}
