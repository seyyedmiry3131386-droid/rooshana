package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dr1 implements on6 {
    public static final Object c = new Object();
    public volatile on6 a;
    public volatile Object b = c;

    public dr1(on6 on6Var) {
        this.a = on6Var;
    }

    public static dr1 a(on6 on6Var) {
        if (on6Var instanceof dr1) {
            return (dr1) on6Var;
        }
        on6Var.getClass();
        return new dr1(on6Var);
    }

    public static on6 b(on6 on6Var) {
        return on6Var instanceof dr1 ? on6Var : new dr1(on6Var);
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
        }
        return obj;
    }
}
