package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements b8 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public b0(boolean z, w6 w6Var, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : v6.r) | v6.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.b8
    public final int w() {
        return this.a;
    }

    @Override // j$.util.stream.b8
    public final Object f(a aVar, Spliterator spliterator) {
        c8 c8Var = (c8) this.d.get();
        aVar.E0(spliterator, c8Var);
        Object obj = c8Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.b8
    public final Object j(t3 t3Var, Spliterator spliterator) {
        a aVar = (a) t3Var;
        return new i0(this, v6.ORDERED.l(aVar.m), aVar, spliterator).invoke();
    }
}
