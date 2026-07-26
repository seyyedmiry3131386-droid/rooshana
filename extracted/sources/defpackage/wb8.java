package defpackage;

import com.j256.ormlite.stmt.query.SimpleComparison;

/* JADX INFO: loaded from: classes.dex */
public final class wb8 implements vb8 {
    public static final ya1 d = new ya1(4);
    public final Object a = new Object();
    public volatile vb8 b;
    public Object c;

    public wb8(vb8 vb8Var) {
        this.b = vb8Var;
    }

    @Override // defpackage.vb8
    public final Object get() {
        vb8 vb8Var = this.b;
        ya1 ya1Var = d;
        if (vb8Var != ya1Var) {
            synchronized (this.a) {
                try {
                    if (this.b != ya1Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = ya1Var;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + SimpleComparison.GREATER_THAN_OPERATION;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
