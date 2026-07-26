package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class sk8 implements u61 {
    public final Object a;
    public final ThreadLocal b;
    public final uk8 c;

    public sk8(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new uk8(threadLocal);
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    @Override // defpackage.w61
    public final w61 P(v61 v61Var) {
        return this.c.equals(v61Var) ? EmptyCoroutineContext.a : this;
    }

    public final void a(Object obj) {
        this.b.set(obj);
    }

    public final Object c(w61 w61Var) {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.a);
        return obj;
    }

    @Override // defpackage.u61
    public final v61 getKey() {
        return this.c;
    }

    @Override // defpackage.w61
    public final w61 l0(w61 w61Var) {
        return bt2.L(this, w61Var);
    }

    @Override // defpackage.w61
    public final u61 r0(v61 v61Var) {
        if (this.c.equals(v61Var)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
