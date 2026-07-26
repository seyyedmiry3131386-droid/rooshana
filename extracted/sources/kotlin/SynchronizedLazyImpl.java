package kotlin;

import defpackage.bp2;
import defpackage.c24;
import defpackage.eq;
import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class SynchronizedLazyImpl<T> implements c24, Serializable {
    public bp2 a;
    public volatile Object b;
    public final Object c;

    public SynchronizedLazyImpl(bp2 bp2Var) {
        js3.p(bp2Var, "initializer");
        this.a = bp2Var;
        this.b = eq.L;
        this.c = this;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // defpackage.c24
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        eq eqVar = eq.L;
        if (obj != eqVar) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == eqVar) {
                bp2 bp2Var = this.a;
                js3.m(bp2Var);
                objInvoke = bp2Var.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    @Override // defpackage.c24
    public final boolean isInitialized() {
        return this.b != eq.L;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
