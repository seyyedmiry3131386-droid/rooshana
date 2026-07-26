package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p implements px3 {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // defpackage.px3
    public Object deserialize(cc1 cc1Var) {
        return e(cc1Var);
    }

    public final Object e(cc1 cc1Var) {
        Object objA = a();
        int iB = b(objA);
        tz0 tz0VarC = cc1Var.c(getDescriptor());
        while (true) {
            int i = tz0VarC.i(getDescriptor());
            if (i == -1) {
                tz0VarC.a(getDescriptor());
                return h(objA);
            }
            f(tz0VarC, i + iB, objA);
        }
    }

    public abstract void f(tz0 tz0Var, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
