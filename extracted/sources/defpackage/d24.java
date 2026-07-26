package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d24 implements qn6 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile qn6 b;

    public d24(qn6 qn6Var) {
        this.b = qn6Var;
    }

    @Override // defpackage.qn6
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.a = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
