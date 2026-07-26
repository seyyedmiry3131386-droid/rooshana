package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class er1 implements pn6 {
    public static final Object c = new Object();
    public volatile d82 a;
    public volatile Object b;

    public static pn6 a(d82 d82Var) {
        if (d82Var instanceof er1) {
            return d82Var;
        }
        er1 er1Var = new er1();
        er1Var.b = c;
        er1Var.a = d82Var;
        return er1Var;
    }

    @Override // defpackage.pn6
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
